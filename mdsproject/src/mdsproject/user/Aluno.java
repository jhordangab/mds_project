package mdsproject.user;

/**
 *
 * @author jhordangabriel
 */
public class Aluno extends Usuario{
    
    private int anoEntrada;
    private String curso;
    private char horario;
    
    public Aluno(){
    }

    /**
     * @return the anoEntrada
     */
    public int getAnoEntrada() {
        return anoEntrada;
    }

    /**
     * @param anoEntrada the anoEntrada to set
     */
    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the horario
     */
    public char getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(char horario) {
        this.horario = horario;
    }
    
}
