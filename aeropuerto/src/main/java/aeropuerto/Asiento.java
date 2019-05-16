package aeropuerto;

import excepciones.AsientoNumeroIncorrectoException;

public class Asiento {
	private int idAsiento;
	private String numeroAsiento;
	public Asiento(int idAsiento, String numeroAsiento) throws AsientoNumeroIncorrectoException {
		if(numeroAsiento.length() == 0)
			throw new AsientoNumeroIncorrectoException();
		this.idAsiento = idAsiento;
		this.numeroAsiento = numeroAsiento;
	}
	public int getIdAsiento() {
		return idAsiento;
	}
	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}
	public String getNumeroAsiento() {
		return numeroAsiento;
	}
	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	@Override
	public String toString() {
		return "Asiento [idAsiento=" + idAsiento + ", numeroAsiento=" + numeroAsiento + "]";
	}

}
