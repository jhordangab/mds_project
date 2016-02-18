package mdsproject;

/**
 *
 * @author jhordangabriel
 */
public class DisciplinaDb {
    
    public Disciplina[] disciplinas;
    
    public void start(){
        
        for (int indice = 0; indice < 3; indice++) {
            disciplinas[indice] = new Disciplina();
            disciplinas[indice].setId(indice);
        }
        
        disciplinas[0].setNome("Engenharia de Software");
        
        disciplinas[1].setNome("Ciencias da Computacao");
        
        disciplinas[2].setNome("Analise de Sistemas");
        
    }
    
    public Disciplina[] getDisciplinas(){
        return this.disciplinas;
    }
    
}