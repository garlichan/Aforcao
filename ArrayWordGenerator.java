/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aforcado.ui;

import java.util.Random;

/**
 * The Class ArrayWordGenerator.
 *
 * @author a19carmengr
 */
public class ArrayWordGenerator implements WordGenerator {

	
	/** The Constant WORDLIST. */
	public final static String WORDLIST[] = new String[] { "pepinillo", 
			"bicicleta", "sistema", "isla","bomba","infierno","patata",
			"cuaderno","personaje","libreto","sol","ordenador", "membrillo",
			"videojuego","aspecto","americana","tablero","prohibido","serie",
			"coche","caja","suldo","herida","romper", "electricidad", 
			"otakuculiau","oxigeno","tabla","baloncesto","musica", "perchero",
			"hambre","cafeteria","f","vivienda","rusia", "guerra", "frio", 
			"piña", "cable", "animal", "auriculares", "tabaco", "virtual", 
			"clase", "cuerda", "inteligencia", "artificial", "mamifero",
			"generador", "pintar", "puerta", "asfalto", "marca","fortuna",
			"enchufe","toxicidad","plataforma","numero","blanco","pintura",
			"creatividad","cantautor","cemento","compositor","producto",
			"direccion","vacaciones","recreo","familia","abanico","amorodo",
			"anestesia","antipatico","astronomia","arco","amanecer","catalan",
			"tacaño","pesetero","rata","malhumorado","becerro","barco",
			"barrendero","butano","bebida","bisonte","boolean","informatica",
			"aplicacion","bienvenida","buenaventurado","bacalao","bota",
			"carcamal","cencerro","cuerdo","comida","cuero","piel","cabeza",
			"cencerro","cancion","pie","andar","comer","gaita","fideo",
			"manopla","cuchara","cucurucho","ortografia", "iodopolivinilpirrolidona",
			"electrografista","aguacate","cartera","hierbabuena","hospital"};

	/**
	 * Generate word.
	 *
	 * @return the string
	 * @throws GenerateWordException the generate word exception
	 */
	@Override
	public String generateWord() throws GenerateWordException {
		int generatedNumber = new Random().nextInt(3);

		return WORDLIST[generatedNumber];
	}

}
