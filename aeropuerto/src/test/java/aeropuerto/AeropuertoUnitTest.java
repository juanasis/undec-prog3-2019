package aeropuerto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AeropuertoUnitTest {
	@Test
	void aeropuertoTest_ReturnsFormatted() {

		Ciudad laCiudad = new Ciudad(1, "La Rioja", "5300");
		Aeropuerto ElAeropuerto = new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", laCiudad,
				"IRJ");

		String returned = ElAeropuerto.detalles();

		assertEquals("Aeropuerto Capitán Vicente Almandos Almonacid - La Rioja - IRJ", returned);

	}

}

