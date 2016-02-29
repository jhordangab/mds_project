package mdsproject.dao;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.io.BufferedReader;
import java.io.File;
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
public class ArtefatoDao {

    static final String FOLDER = "Artefatos";

    static final String FORMAT_STRING = "UTF-8";

    public ArtefatoDao() {
    }

    public static void cadastrar(String filename, String content) throws IOException {
        FileWriter file = new FileWriter(FOLDER + "/" + filename, true);
        PrintWriter writer = new PrintWriter(file);
        writer.println(content);
        file.close();
    }

    public static String listar() throws FileNotFoundException, Base64DecodingException {
        String lista = "";
        
        File diretorio = new File(FOLDER);
        File list[] = diretorio.listFiles();

        for (int i = 0; i < list.length; i++) {
            File arq = list[i];
            lista += "\n Nome: " + arq.getName();
        }
        
        return lista;
    }
    
    public static String localizar(String string){
        
        String lista = "";
        
        File diretorio = new File(FOLDER);
        File list[] = diretorio.listFiles();

        for (int i = 0; i < list.length; i++) {
            File arq = list[i];
            if(arq.getName().toLowerCase().contains(string.toLowerCase())){
                lista += "\n Nome: " + arq.getName() + ".txt";
            }
        }
        
        return lista;
        
    }
}
