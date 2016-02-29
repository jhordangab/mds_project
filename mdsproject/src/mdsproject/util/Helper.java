package mdsproject.util;

import mdsproject.user.Usuario;

/**
 *
 * @author jhordangabriel
 */
public class Helper {
    
    private boolean logado = false;
    private Usuario usuarioLogado;
    
    public Helper(){
    }
    
    public void deslogar(){
        this.setLogado(false);
    }
    
    public void logar(){
        this.setLogado(true);
    }

    /**
     * @return the logado
     */
    public boolean isLogado() {
        return logado;
    }

    /**
     * @param logado the logado to set
     */
    private void setLogado(boolean logado) {
        this.logado = logado;
    }

    /**
     * @return the usuarioLogado
     */
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    /**
     * @param usuarioLogado the usuarioLogado to set
     */
    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
}
