package aeropuerto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import excepciones.CiudadNombreIncorrectoExcepcion;

public class AeropuertoUnitTest {
	@Test
	void aeropuertoTest_devuelveFormato() {

		Ciudad laCiudad=null;
		try {
			laCiudad = new Ciudad(1, "La Rioja", "5300");
		} catch (CiudadNombreIncorrectoExcepcion e) {
			e.printStackTrace();
		}
		Aeropuerto ElAeropuerto = new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", laCiudad,
				"IRJ");
		String returned = ElAeropuerto.detalles();
		assertEquals("Aeropuerto Capitán Vicente Almandos Almonacid - La Rioja - IRJ", returned);

	}

}

