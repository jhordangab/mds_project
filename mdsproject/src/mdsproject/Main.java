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
        
            System.out.println("");
            System.out.println("Bem vindo " + helper.getUsuarioLogado().getNome() + "!");
            
            while(helper.isLogado()){
                
                System.out.println("Digite a opção desejada: ");
                
                System.out.println("1 - Cadastrar Usuários");
                System.out.println("2 - Listar Usuários");

                int opcao = scanner.nextInt();
                
                switch(opcao){
                    case 1:
                        
                        System.out.println("Digite o nome do usuário: ");
                        String us_cadastro = scanner.next();

                        System.out.println("Digite a senha do usuário: ");
                        String ps_cadastro = scanner.next();
                        
                        System.out.println("Digite o tipo do usuário: ");
                        int ty_cadastro = scanner.nextInt();
                        
                        UsuarioHelper.cadastrar(us_cadastro, ps_cadastro, ty_cadastro);
                        
                        break;
                    case 2:
                        UsuarioHelper.listar();
                        break;
                }
                
                break;
            }
        }
    }
    
}
