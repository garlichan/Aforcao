package aforcado.ui;

import java.util.Scanner;

/**
 * 
 */
public class KeyboardWordGenerator implements WordGenerator {

	/**
	 * Método que recoge la palabra que introduce el usuario y la devuelve
	 *
	 * @return choosenWord
	 * @throws la excepción GenerateWordException
	 */
	@Override
	public String generateWord() throws GenerateWordException {
		System.out.println("Dime una palabra");
		Scanner scanner = new Scanner(System.in);
		String choosenWord = scanner.nextLine();
		
		return choosenWord;
	}
	

}
