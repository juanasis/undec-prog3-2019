package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excepciones.CiudadCodPostalIncorrectoException;
import excepciones.CiudadException;
import excepciones.CiudadNombreIncorrectoException;

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
	@Test
	void ciudadTest_faltaCodPostal_instanciaIncorrecta() {
		Ciudad cordoba = null;
		try {
			cordoba = new Ciudad(001,"Cordoba", "");
		}catch (CiudadException e) {
			assertEquals("Codigo Postal Incorrecto", e.getMessage());
		}
		
	}
	@Test
	void ciudadTest_faltaNombreCiudad_instanciaIncorrecta() {
		Ciudad cordoba = null;
		try {
			cordoba = new Ciudad(001,"","1234");
		}catch (CiudadException e) {
			assertEquals("Ciudad Nombre Incorrecto", e.getMessage());
		}
		
	}
	
}
