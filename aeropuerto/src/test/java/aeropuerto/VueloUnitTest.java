package aeropuerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class VueloUnitTest {
	@Test
	void ShowDetails_ReturnsRightFormat() {

		Vuelo elVuelo = crearUnVuelo();

		String salida = elVuelo.mostrarVuelo();

		String expected = "Vuelo AR2443 - Embraer ERJ-190-100AR\r\n"
				+ "Martes 10 de abril 21:10 IRJ (La Rioja - Aeropuerto Capitán Vicente Almandos Almonacid)\r\n"
				+ "Martes 10 de abril 22:45 AEP (Buenos Aires - Aeropuerto Buenos Aires Jorge Newbery)\r\n"
				+ "Operado por Austral";

		assertEquals(expected, salida);

	}

	@Test
	void formatofechaHora_atributofecha_instanciaCorrecta() {
		LocalDateTime fechayhora = LocalDateTime.of(2018, 06, 07, 13, 10);
		Vuelo elVuelo = new Vuelo("", null, fechayhora, null, null, null, null, null, null);

		LocalDateTime formatoFecha = elVuelo.getFechaHoraSalida();

		assertEquals("Jueves 7 de junio 13:10", formatoFecha);

	}

	

	private Vuelo crearUnVuelo() {

		Ciudad laRioja = new Ciudad(1, "La Rioja", "5300");
		Ciudad buenosAires = new Ciudad(2, "Buenos Aires", "1000");
		Aeropuerto salida = new Aeropuerto(1, "Aeropuerto Capitán Vicente Almandos Almonacid", laRioja, "IRJ");
		Aeropuerto arribo= new Aeropuerto(2, "Aeropuerto Buenos Aires Jorge Newbery", buenosAires, "AEP");
		Aerolinea austral = new Aerolinea(1, "Austral");
		Avion embraer = new Avion(4, "Embraer ERJ-190-100AR", "LV-CIH", null);

		final Vuelo unVuelo = new Vuelo("AR2443", salida, LocalDateTime.of(2018, 04, 10, 21, 10), arribo,
				LocalDateTime.of(2018, 04, 10, 22, 45), austral, null, embraer, null);

		return unVuelo;
	}

}
