package mdsproject;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import mdsproject.front.PrincipalFrame;

/**
 *
 * @author jhordangabriel
 */
public class Main {
        
    public static void main(String[] args) throws IOException, FileNotFoundException, Base64DecodingException{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }
}
