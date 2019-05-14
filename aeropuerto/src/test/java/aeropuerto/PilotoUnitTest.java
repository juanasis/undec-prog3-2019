package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PilotoUnitTest {
	@Test
	public void apellidoYNombre_TodosLosAtributos_instanciaCorrecta() {
		final Piloto unPiloto = crearPiloto();
		final String nombrePiloto = unPiloto.getApelidoNombres() ;
		assertEquals("Asis, Juan Antonio", nombrePiloto);
	}

	@Test
	public void getEdadPiloto_CalcularEdad() {
		final Piloto unPiloto = crearPiloto();
		final int edadPiloto = unPiloto.getAge(LocalDate.of(2018, 4, 13));
		assertEquals(34, edadPiloto);
	}

	private Piloto crearPiloto() {
		return new Piloto(1, "Asis", "Juan Antonio", "07071970", LocalDate.of(1984, 1, 31));
	}

}
