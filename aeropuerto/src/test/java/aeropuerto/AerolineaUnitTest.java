package aeropuerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excepciones.AerolineaException;

public class AerolineaUnitTest {
	@Test
	public void NombreAerolinea_NombreIncorrecto_InstanciaIncorrecta() {
		Aerolinea laAerolinea = null;
		try {
			laAerolinea = new Aerolinea(001, "Latam");
		} catch (AerolineaException e) {
			assertEquals("Nombre Aerolinea Incorrecta", e.getMessage());
 		}
	}
}
