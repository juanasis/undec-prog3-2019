package excepciones;

public class ClienteExisteException extends Exception {

	public ClienteExisteException(String msg) {
		super("Cliente Existe Exception");
		
	}

	
}
