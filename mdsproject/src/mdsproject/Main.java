package mdsproject;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jhordangabriel
 */
public class Main {
        
    public static void main(String[] args) throws IOException, FileNotFoundException, Base64DecodingException{
        
        Helper helper = new Helper();
        
        if(!helper.isLogado()){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
        }
    }
}
