package mdsproject;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author jhordangabriel
 */
public class UsuarioHelper {
    
    public static String filename = "usuarios.txt";
    
    public static void cadastrar(String nome, String senha, int type) throws IOException 
    { 
        FileWriter file = new FileWriter(filename, true); 
        PrintWriter writer = new PrintWriter(file); 
        String base64 = ConvertBase64.codificar(nome + "[:]" + senha + "[::]" + type + "[:::]");
        writer.println(base64);
        file.close();
    }
    
    public static void listar() throws FileNotFoundException, Base64DecodingException
    { 
        try { 
            FileReader file = new FileReader(filename);
            BufferedReader lerArq = new BufferedReader(file); 
            String linha = lerArq.readLine(); 
            
            while (linha != null) { 
                String dados = new String(Base64.decode(linha), "UTF-8"); 
                String nome = dados.substring(0, dados.indexOf("[:]"));
                String tipo = (dados.substring(dados.indexOf("[::]") + 4, dados.indexOf("[:::]")).equals("1")) ? "Aluno" : "Professor";
                System.out.printf("%s\n", "Nome: " + nome + " - " + tipo); 
                linha = lerArq.readLine();
            } 
            file.close(); 
        } 
        catch (IOException e) { 
            System.err.printf("Erro na leitura dos dados: %s.\n", e.getMessage()); 
        }
    }
    
    public static String getSenha(String username) throws FileNotFoundException, Base64DecodingException
    { 
        try { 
            FileReader file = new FileReader(filename);
            BufferedReader lerArq = new BufferedReader(file); 
            String linha = lerArq.readLine(); 
            String senha;
            
            while (linha != null) { 
                String dados = new String(Base64.decode(linha), "UTF-8"); 
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
            System.err.printf("Erro na leitura dos dados: %s.\n", e.getMessage()); 
        }
        
        return "";
    }
}
