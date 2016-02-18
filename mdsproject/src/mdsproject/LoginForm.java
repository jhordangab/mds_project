package mdsproject;

/**
 *
 * @author jhordangabriel
 */
public class LoginForm {
    
    boolean login = false;
    Usuario usuarioLogado;
    
    public boolean autentica(String username, String password, int type){
        
        UsuarioDb db = new UsuarioDb();
        db.start();
        
        if(type == 1){
    
            for (Aluno aluno : db.getAlunos()){
                if(!this.login){
                    if(aluno.getLogin().equals(username) && aluno.getSenha().equals(password)){
                        this.usuarioLogado = aluno;
                        this.login = true;
                    }
                }
            }
            
        }else{
         
            for (Professor professor : db.getProfessores()){
                if(!this.login){
                    if(professor.getLogin().equals(username) && professor.getSenha().equals(password)){
                        this.usuarioLogado = professor;
                        this.login = true;
                    }
                }
            }
            
        }
        
        return this.login;
    }
    
    public Usuario getUsuarioLogado(){
        return this.usuarioLogado;
    }
    
}
