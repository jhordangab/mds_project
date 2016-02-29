package mdsproject.user;

/**
 *
 * @author jhordangabriel
 */
public class Professor extends Usuario {
    
    private String salaAtendimento;
    
    public Professor(){
    }

    /**
     * @return the salaAtendimento
     */
    public String getSalaAtendimento() {
        return salaAtendimento;
    }

    /**
     * @param salaAtendimento the salaAtendimento to set
     */
    public void setSalaAtendimento(String salaAtendimento) {
        this.salaAtendimento = salaAtendimento;
    }
}
