package mdsproject;

/**
 *
 * @author jhordangabriel
 */
public class AreaDb {
    
    public Area[] areas;
    
    public void start(){
        
        for (int indice = 0; indice < 3; indice++) {
            areas[indice] = new Area();
            areas[indice].setId(indice);
        }
        
        areas[0].setNome("Humanas");
        
        areas[1].setNome("Exatas");
        
        areas[2].setNome("Biologicas");
        
    }
    
    public Area[] getAreas(){
        return this.areas;
    }
}
