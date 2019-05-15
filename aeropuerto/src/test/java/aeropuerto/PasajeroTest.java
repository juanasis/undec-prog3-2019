package aeropuerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excepciones.PasajeroException;

public class PasajeroTest {
	@Test
	public void PasajeroNombreIncorrecto_FaltaNombre_InstanciaIncorrecta(){
		Pasajero elPasajero = null;
		try {
			elPasajero = new Pasajero(001, "20-2929938-2","Stark","", "11-15576642");
			} catch (PasajeroException e) {
				assertEquals("Pasajero Nombre Incorrecto", e.getMessage());
		}
	}
	@Test
	public void PasajeroApellidoIncorrecto_FaltaApellido_InstanciaIncorrecta(){
		Pasajero elPasajero = null;
		try {
			elPasajero = new Pasajero(001, "20-2929938-2","","Tony", "11-15576642");
			} catch (PasajeroException e) {
				assertEquals("Pasajero Apellido Incorrecto", e.getMessage());
		}
	}
	@Test
	public void PasajeroCuilIncorrecto_FaltaCuil_InstanciaIncorrecta(){
		Pasajero elPasajero = null;
		try {
			elPasajero = new Pasajero(001, "","Stark","Tony", "11-15576642");
			} catch (PasajeroException e) {
				assertEquals("Pasajero Cuil Incorrecto", e.getMessage());
		}
	}
}
