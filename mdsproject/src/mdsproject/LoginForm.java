package mdsproject;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.FileNotFoundException;

/**
 *
 * @author jhordangabriel
 */
public class LoginForm {
    
    boolean login = false;
    Usuario usuarioLogado;
    
    public boolean autentica(String username, String password) throws FileNotFoundException, Base64DecodingException{

        if (!UsuarioHelper.getSenha(username).isEmpty() && UsuarioHelper.getSenha(username).equals(password)){
            if(!this.login){
                this.usuarioLogado = new Usuario();
                this.usuarioLogado.setNome(username);
                this.usuarioLogado.setSenha(password);
                this.login = true;
            }
        }
        
        return this.login;
    }
    
    public Usuario getUsuarioLogado(){
        return this.usuarioLogado;
    }
    
}
