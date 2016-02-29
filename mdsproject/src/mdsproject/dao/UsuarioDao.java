package mdsproject.dao;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import mdsproject.util.ConvertBase64;

/**
 *
 * @author jhordangabriel
 */
public class UsuarioDao {
   
    static final String FILENAME = "usuarios.txt";
    
    static final String MESSAGE_LIST = "Lista de Usuários cadastrados no sistema: ";
    
    static final String MESSAGE_ERROR = "Erro na leitura dos dados: %s.\n";
    
    static final String FORMAT_STRING = "UTF-8";
    
    public UsuarioDao(){
    }
    
    public static void cadastrar(String nome, String senha, int type) throws IOException 
    { 
        FileWriter file = new FileWriter(FILENAME, true); 
        PrintWriter writer = new PrintWriter(file); 
        String base64 = ConvertBase64.codificar(nome + "[:]" + senha + "[::]" + type + "[:::]");
        writer.println(base64);
        file.close();
    }
    
    public static String listar() throws FileNotFoundException, Base64DecodingException
    { 
        String lista = "";
        try { 
            FileReader file = new FileReader(FILENAME);
            BufferedReader lerArq = new BufferedReader(file); 
            String linha = lerArq.readLine(); 
            
            while (linha != null) { 
                String dados = new String(Base64.decode(linha),FORMAT_STRING); 
                String nome = dados.substring(0, dados.indexOf("[:]"));
                String tipo = (dados.substring(dados.indexOf("[::]") + 4, dados.indexOf("[:::]")).equals("1")) ? "Aluno" : "Professor";
                lista += "\n Nome: " + nome + " - " + tipo; 
                linha = lerArq.readLine();
            } 
            file.close(); 
        } 
        catch (IOException e) { 
            System.err.printf(MESSAGE_ERROR, e.getMessage()); 
        }
        
        return lista;
    }
    
    public static String getSenha(String username) throws FileNotFoundException, Base64DecodingException
    { 
        try { 
            FileReader file = new FileReader(FILENAME);
            BufferedReader lerArq = new BufferedReader(file); 
            String linha = lerArq.readLine(); 
            String senha;
            
            while (linha != null) { 
                String dados = new String(Base64.decode(linha), FORMAT_STRING); 
                String nome = dados.substring(0, dados.indexOf("[:]"));
                if(nome.equals(username)){
                    senha = dados.substring(dados.indexOf("[:]") + 3, dados.indexOf("[::]"));
                    return senha;
                }
                
                linha = lerArq.readLine();
            } 
            file.close(); 
        } 
        catch (IOException e) { 
            System.err.printf(MESSAGE_ERROR, e.getMessage()); 
        }
        
        return "";
    }
}
