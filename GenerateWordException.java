package aforcado.ui;

/**
 * 
 */
public class GenerateWordException extends Exception{

	
	private boolean visible;

	/**
	 * Constructor
	 *
	 * @param visible the visible
	 * @param message the message
	 */
	public GenerateWordException(boolean visible, String message) {
		super(message);
		this.visible = visible;
		
	}

	/**
	 * Devuelve el parámetro visible
	 * 
	 * @return true/false
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 *Ajusta el parámetro visible 
	 *
	 * @param visible 
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	
}
