package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CiudadUnitTest {

	@Test
	void ciudadTest_todosLosAtributos_instanciaCorrecta() {
		Ciudad buenosAires = new Ciudad(001,"Buenos Aires", "1000");
		assertEquals(001, buenosAires.getIdCiudad());
		assertEquals("Buenos Aires" , buenosAires.getNombre());
		assertEquals("1000", buenosAires.getCodigoPostal());
	}
	void ciudadTest_faltaCodPostal_instanciaIncorrecta() {
		Ciudad cordoba = new Ciudad(002,"Cordoba",null);
		assertEquals(002, cordoba.getIdCiudad());
		assertEquals("Cordoba" , cordoba.getNombre());
		assertEquals(2000, cordoba.getCodigoPostal());
	}
	
}
