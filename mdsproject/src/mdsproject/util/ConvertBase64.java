package mdsproject.util;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 *
 * @author jhordangabriel
 */
public class ConvertBase64 
{
    public static String codificar(String string){
        return Base64.encode(string.getBytes());
    }
    
    public static byte[] decodificar(String base64) throws Base64DecodingException{
        return Base64.decode(base64);
    }
}
