package aeropuerto;

import excepciones.AerolineaException;
import excepciones.AerolineaNombreIncorrectoException;

public class Aerolinea {
	private int idAerolineas;
	private String nombre;
	public Aerolinea(int idAerolineas, String nombre) throws AerolineaException{
		if(nombre.length() == 0)
			throw new AerolineaNombreIncorrectoException();
		this.idAerolineas = idAerolineas;
		this.nombre = nombre;
	}
	public int getIdAerolineas() {
		return idAerolineas;
	}
	public void setIdAerolineas(int idAerolineas) {
		this.idAerolineas = idAerolineas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Aerolinea [idAerolineas=" + idAerolineas + ", nombre=" + nombre + "]";
	}
	

}
