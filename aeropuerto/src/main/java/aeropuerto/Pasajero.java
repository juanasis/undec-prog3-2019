package aeropuerto;

import excepciones.PasajeroApellidoIncorrectoException;
import excepciones.PasajeroCuilIncorrectoException;
import excepciones.PasajeroException;
import excepciones.PasajeroNombreIncorrectoException;

public class Pasajero {
	private int idPasajero;
	private String CUIL;
	private String apellido;
	private String nombre;
	private String telefono;
	public Pasajero(int idPasajero, String cuil, String apellido, String nombre, String telefono) throws PasajeroException{
		if(nombre.length() == 0)
			throw new PasajeroNombreIncorrectoException();
		if(apellido.length() == 0)
			throw new PasajeroApellidoIncorrectoException();
		if(cuil.length() == 0 || cuil.length() > 10)
			throw new PasajeroCuilIncorrectoException();
		this.idPasajero = idPasajero;
		this.CUIL = cuil;
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getIdPasajero() {
		return idPasajero;
	}
	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}
	public String getCUIL() {
		return CUIL;
	}
	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", CUIL=" + CUIL + ", apellido=" + apellido + ", nombre="
				+ nombre + ", telefono=" + telefono + "]";
	}
	
}
