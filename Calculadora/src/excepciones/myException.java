package excepciones;

public class myException extends Exception {

	String mensaje ="";
	
	//hola
	public myException(String mensaje) {
		super();
		this.mensaje = mensaje + " estamos en una beca de java";
	}

	@Override
	public String toString() {
		return "myException [mensaje=" + mensaje + "]";
	}

	
}
