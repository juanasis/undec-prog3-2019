package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.CiudadNombreIncorrectoExcepcion;

class CiudadUnitTest {

	@Test
	void ciudadTest_todosLosAtributos_instanciaCorrecta() {
		Ciudad buenosAires = null;
		try {
		buenosAires = new Ciudad(001,"Buenos Aires", "1000");
		}catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(001, buenosAires.getIdCiudad());
		assertEquals("Buenos Aires" , buenosAires.getNombre());
		assertEquals("1000", buenosAires.getCodigoPostal());
	}
	void ciudadTest_faltaCodPostal_instanciaIncorrecta() {
		Ciudad cordoba = null;
		try {
			cordoba = new Ciudad(001,"", "1000");
		}catch (CiudadNombreIncorrectoExcepcion e) {
			assertEquals("Ciudad Nombre Incorrecto", e.getMessage());
		}
		
	}
	
}
