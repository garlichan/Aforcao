package aforcado.model;

/**
 *
 */
public class HiddenWord {

    private char characters[];
    private boolean hits[];
    

    /**
     * Apela una nueva palabra
     *
     * @param word
     */
    public HiddenWord(String word) {
        characters=word.toCharArray();
        hits = new boolean[characters.length];
        for (int i = 0; i < characters.length; i++) {
            hits[i] = false;
        }
    }
    
    /**
     * Recorre el array para comprobar si la letra 
     *
     * @param 
     * @return true/false
     */
    public boolean checkChar(char c){
    	boolean hitted = false;
    	 for (int i = 0; i < characters.length; i++) {
    		if(c==characters[i]) {
    			hits[i] = true;
    			hitted = true;
    		}
    	}
        return hitted;
        
    }
    
    /**
     * Método que muestra _ en vez de la letra
     *
     * @return la palabra
     */
    public String show(){
        
        char[] dividited = characters.clone();
        for (int i = 0; i < characters.length; i++) {
            if(!hits[i]){
                dividited[i]='_';
            }
        }
        
        return String.valueOf(dividited);
        
    }
    
    /**
     * Método que muestra la palabra completa
     *
     * @return la palabra
     */
    public String showFullWord(){
        return String.copyValueOf(characters);
        
    }
    
    /**
     * Comprueba si se ha acertado la palabra
     *
     * @return true/false
     */
    public boolean isVisible(){
    	for(boolean b : hits) {
    		if(!b) {
    			return false;
    		}
    	}
        return true;
        
    }
}
