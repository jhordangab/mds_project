package mdsproject;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jhordangabriel
 */
public class Main {
        
    public static void main(String[] args) throws IOException{
        
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            while(!helper.isLogado()){

                System.out.println("Digite seu usuario: ");
                String usuario = scanner.next();

                System.out.println("Digite sua senha: ");
                String senha = scanner.next();

                System.out.println("Digite 1 para aluno e 0 para professor: ");
                int type = scanner.nextInt();

                LoginForm login = new LoginForm();

                if(login.autentica(usuario, senha, type)){
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
        
            while(helper.isLogado()){
                System.out.println("********MENU********");
                System.out.println("1: Gravar arquivo");
                System.out.println("2: Excluir arquivo");
                System.out.println("3: Listar arquivos do diretório unificado");
                System.out.println("");
                System.out.println("Digite a opção desejada!");

                int numero = scanner.nextInt();
                switch(numero)
                {
                    case 1:
                        GravarArquivo.main(args);
                        break;
                }

                ManipuladorArquivos.leitor("file.txt");
            }
        }
    }
    
}
