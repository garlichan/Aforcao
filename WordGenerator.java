package aforcado.ui;

/**
 * Interfaz
 */
public interface WordGenerator {

	/**
	 * Generate una palabra
	 *
	 * @return una palabra
	 * @throws GenerateWordException
	 */
	public String generateWord() throws GenerateWordException;
}
