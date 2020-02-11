package aforcado.ui;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import aforcado.model.HangMan;

/**
 * Clase Main
 *
 * 
 */
public class MenuGenerator {

	
	private HangMan hangMan;

	/**
	 * Método Main
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		MenuGenerator menuGenerator = new MenuGenerator();
		ArrayWordGenerator game1 = new ArrayWordGenerator();
		KeyboardWordGenerator game2 = new KeyboardWordGenerator();
		
		do {
			try {
				menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
			} catch (GenerateWordException e) {
				e.printStackTrace();
			}
			menuGenerator.showGameMenu();
			menuGenerator.hangMan.getHiddenWord().showFullWord();
		} while (!menuGenerator.showExitMenu());
	}

	/**
	 * Devuelve el parámetro hangMan
	 *
	 * @return hangMan
	 */
	public HangMan getHangMan() {
		return hangMan;
	}

	/**
	 * Muestra por pantalla el menú del juego, según la opción que escoja el usuario
	 * el juego es de una forma u otra
	 *
	 * @return the string
	 * @throws GenerateWordException the generate word exception
	 */
	public String showInitMenu() throws GenerateWordException {
		String wordtogenerate=null;
		System.out.println("Escoge modo de juego");
		System.out.println("Un jugador>>>>> 1");
		System.out.println("Multijugador>>>>> 2");
		int gameMode = retrieveGameMode();
		
		if(gameMode==1) {
			ArrayWordGenerator arrayWordGenerator=new ArrayWordGenerator();
			wordtogenerate=arrayWordGenerator.generateWord();
		}
		
		if(gameMode==2) {
			KeyboardWordGenerator keyboardWordGenerator=new KeyboardWordGenerator();
			wordtogenerate=keyboardWordGenerator.generateWord();
		}
		return wordtogenerate;
	}
	

	/**
	 * Método que impide que en showInitMenu() el usuario escoja una opción que no es válida
	 *
	 * @return the int
	 */
	private int retrieveGameMode() {
		int gameMode = 0;
		try {
			gameMode = new Scanner(System.in).nextInt();
		} catch (InputMismatchException e) {
			System.out.println("dime lo que te pregunte:");
			gameMode = retrieveGameMode();
		}
		return gameMode;
	}

	/**
	 * Muestra el funcionamiento del juego: pide una letra, almacena los fallos, te dice
	 * si ganaste o perdiste y muestra la palabra que había que adivinar
	 * 
	 */
	private void showGameMenu() {
		do {
			System.out.println("Número de fallos: " + hangMan.getFails().size());
			System.out.println("Fallos:");
			System.out.println(hangMan.getStringFails());
			System.out.println(hangMan.showHiddenWord());
			System.out.println("Dime una letra: ");
			hangMan.tryChar(new Scanner(System.in).nextLine().toLowerCase().charAt(0));
			if (hangMan.isGameOver()) {
				if (hangMan.getHiddenWord().isVisible()) {
					System.out.println("YOU WIN");
					System.out.println("La palabra es " + hangMan.showFullWord());
				} else {
					System.out.println("GAME OVER");
					System.out.println("La palabra correcta era " + hangMan.showFullWord());
				}
			}
		} while (!hangMan.isGameOver());
	}

	/**
	 * Muestra un mensaje por pantalla preguntando si se quiere acabar o contiunuar el juego
	 *
	 * @return true/false
	 */
	private boolean showExitMenu() {
		System.out.println("¿Quieres salir?\n Enter para continuar\n S para salir");
		return new Scanner(System.in).nextLine().toUpperCase().equals("S");
	}
}
