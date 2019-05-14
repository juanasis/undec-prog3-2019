package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CiudadUnitTest {

	@Test
	void ciudadTest_todosLosAtributos_instanciaCorrecta() {
		Ciudad buenosAires = new(001,"Buenos Aires", 1000);
		assertEquals(001, buenosAires.getId());
		assertEquals("Bueno Aires" , buenosAires.getNombre());
		assertEquals(1000, buenosAires.getCodigoPostal());
	}
	void ciudadTest_faltaCodPostal_instanciaIncorrecta() {
		Ciudad cordoba = new(002,"Cordoba");
		assertEquals(002, cordoba.getId());
		assertEquals("Cordoba" , cordoba.getNombre());
		assertEquals(2000, cordoba.getCodigoPostal());
	}
	void ciudadTest_faltaCodPostal_instanciaIncorrecta() {
		Ciudad cordoba = new(002,"Cordoba");
		assertEquals(002, cordoba.getId());
		assertEquals("Cordoba" , cordoba.getNombre());
		assertEquals(2000, cordoba.getCodigoPostal());
	}
}
