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
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            while(!helper.isLogado()){

                System.out.println("Digite seu usuario: ");
                String usuario = scanner.next();

                System.out.println("Digite sua senha: ");
                String senha = scanner.next();
                
                LoginForm login = new LoginForm();

                if(login.autentica(usuario, senha)){
                    System.out.println("Usuario logado com sucesso.");
                    System.out.println("");
                    helper.logar();
                    helper.setUsuarioLogado(login.getUsuarioLogado());
                }else{
                    System.out.println("Dados nao confirmados no sistema,"
                            + " tente novamente!");
                    System.out.println("");
                }
            }
        
            if(helper.isLogado()){
                UsuarioHelper.listar();
                break;
            }
        }
    }
    
}
