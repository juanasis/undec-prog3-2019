package aeropuerto;

import excepciones.CiudadCodPostalIncorrectoException;
import excepciones.CiudadException;
import excepciones.CiudadNombreIncorrectoException;

public class Ciudad {

	private int idCiudad;
	private String nombre;
	private String codigoPostal;
	public Ciudad(int idCiudad, String nombre, String codigoPostal)throws CiudadException {
		if(nombre.length() == 0)
			throw new CiudadNombreIncorrectoException();
		if(codigoPostal.length() == 0 || codigoPostal.length() > 5 )
			throw new CiudadCodPostalIncorrectoException();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}
	public int getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	@Override
	public String toString() {
		return "Ciudad [idCiudad=" + idCiudad + ", nombre=" + nombre + ", codigoPostal=" + codigoPostal + "]";
	}
	
	
}


