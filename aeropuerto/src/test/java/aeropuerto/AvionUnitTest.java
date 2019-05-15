package aeropuerto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import excepciones.AvionException;

public class AvionUnitTest {
	@Test
	public void ModeloAvion_FaltaModelo_InstanciaIncorrecta() {
		Avion elAvion = null;
		List<Asiento> listaDeAsientos = new ArrayList<Asiento>();
		listaDeAsientos.add(new Asiento(1, "01 A"));
		listaDeAsientos.add(new Asiento(2, "02 A"));
		listaDeAsientos.add(new Asiento(3, "01 B"));
		try {
			elAvion = new Avion(001, "", "ABC 123", listaDeAsientos);
		} catch (AvionException e) {
			assertEquals("Avion Modelo Incorrecto",e.getMessage());
		}
	}
	@Test
	public void MatriculaAvion_FaltaMatricula_InstanciaIncorrecta() {
		Avion elAvion = null;
		List<Asiento> listaDeAsientos = new ArrayList<Asiento>();
		listaDeAsientos.add(new Asiento(1, "01 A"));
		listaDeAsientos.add(new Asiento(2, "02 A"));
		listaDeAsientos.add(new Asiento(3, "01 B"));
		try {
			elAvion = new Avion(001, "Boeing_737", "", listaDeAsientos);
		} catch (AvionException e) {
			assertEquals("Avion Matricula Incorrecta",e.getMessage());
		}
	}
		@Test
		public void ListaAsientosAvion_LisatAsientosVacia_InstanciaIncorrecta() {
			Avion elAvion = null;
			List<Asiento> listaDeAsientos = new ArrayList<Asiento>();
			
			try {
				elAvion = new Avion(001, "Boeing_737", "ABC 123", listaDeAsientos);
			} catch (AvionException e) {
				assertEquals("Avion Lista Asientos Incorrecta",e.getMessage());
		}	
	}
}