/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aforcado.model;

import java.util.ArrayList;

/**
 * 
 *
 */
public class HangMan {

    public static int MAX_FAILS = 6;
    private HiddenWord hiddenWord;
    private ArrayList<Character> fails = new ArrayList<Character>();

    /**
     * Constructor
     *
     * @param word
     */
    public HangMan(String word) {
        hiddenWord = new HiddenWord(word);
    }

    /**
     * Devuelve el valor de los fallos
     *
     * @return fails
     */
    public ArrayList<Character> getFails() {
        return fails;
    }
    
    /**
     * Devuelve la palabra oculta
     *
     * @return hiddenWord
     */
	public HiddenWord getHiddenWord() {
		return hiddenWord;
	}

    /**
     * Devuelve los fallos
     *
     * @return strFails
     */
    public String getStringFails() {
        String strFails = "";
        for (int i = 0; i < fails.size(); i++) {
            strFails += String.valueOf(fails.get(i)) + " ";
        }
        return strFails;
    }

    /**
     * Muestra la palabra oculta
     *
     * @return hiddenWord
     */
    public String showHiddenWord() {

        return hiddenWord.show();
    }

    /**
     * Muestra la palabra completa
     *
     * @return hiddenWord
     */
    public String showFullWord() {
        return hiddenWord.showFullWord();
    }

    /**
     * Comprueba si la letra está en la palabra y si no lo está añade un fallo
     *
     * @param 
     */
    public void tryChar(char c) {
        if (!hiddenWord.checkChar(c)) {
             fails.add(c);
        }
    }

    /**
     * Comprueba por el numero de fallos si se acabó el juego
     *
     * @return true si se acaba el juego, si no, false
     */
    public boolean isGameOver() {
        if (fails.size() == MAX_FAILS || hiddenWord.isVisible()) {
            return true;
        }
        return false;
    }

    /**
     * Comprueba si el número de fallos supera el máximo
     *
     * @return true/false
     */
    public boolean maxFailsExceeded() {
        if(fails.size() == MAX_FAILS){
        return true;
        } else{
       return false; 
       }
    }

}
