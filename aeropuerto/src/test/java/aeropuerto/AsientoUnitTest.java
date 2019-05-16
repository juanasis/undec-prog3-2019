package aeropuerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excepciones.AsientoException;

public class AsientoUnitTest {
	@Test
	public void NumeroAsiento_FaltaNumero_InstanciaIncorrecta() {
		Asiento AsientoA1= null;
		try {
			AsientoA1 = new Asiento(01, "01-A1");
		} catch (AsientoException e) {
			assertEquals("Asiento Numero Incorrecto", e.getMessage());
		}
		
	}
}
