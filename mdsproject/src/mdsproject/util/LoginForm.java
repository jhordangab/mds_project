package mdsproject.util;

import mdsproject.dao.UsuarioDao;
import mdsproject.user.Usuario;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.FileNotFoundException;

/**
 *
 * @author jhordangabriel
 */
public class LoginForm {
    
    boolean login = false;
    Usuario usuarioLogado;
    
    public LoginForm(){
    }
    
    public boolean autentica(String username, String password) throws FileNotFoundException, Base64DecodingException{

        if (!UsuarioDao.getSenha(username).isEmpty() && UsuarioDao.getSenha(username).equals(password)){
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
