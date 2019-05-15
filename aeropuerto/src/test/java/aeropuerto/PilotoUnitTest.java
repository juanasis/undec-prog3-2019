package aeropuerto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import excepciones.PilotoException;
import excepciones.PilotoNombreIncorrectoException;

public class PilotoUnitTest {
	@Test
	public void apellidoYNombre_TodosLosAtributos_instanciaCorrecta() {
		Piloto unPiloto =null;
		try {
			unPiloto = new Piloto(1, "Asis", "Juan Antonio", "07071970", LocalDate.of(1984, 1, 31));
		}catch(PilotoException e) {
			e.printStackTrace();
		}
		String nombreYApellidoPiloto = unPiloto.getApelidoNombres() ;
		assertEquals("Asis, Juan Antonio", nombreYApellidoPiloto);
	}
    @Test
	public void apellido_faltaApellido_instanciaIncorrecta() {
		Piloto unPiloto = null;
		try {
			unPiloto = new Piloto(1,"", "Juan Antonio", "07071970", LocalDate.of(1984, 1, 31));
		}catch(PilotoException e) {
			 
			assertEquals("Apellido de piloto incompleto", e.getMessage() );
		}
	}
    @Test
  	public void dni_faltadni_instanciaIncorrecta() {
  		Piloto unPiloto = null;
  		try {
  			unPiloto = new Piloto(1,"Asis", "Juan Antonio", "", LocalDate.of(1984, 1, 31));
  		}catch(PilotoException e) {
  			 
  			assertEquals("dni de piloto incompleto", e.getMessage() );
  		}
  	}
    @Test
  	public void FechaNacimiento_fechaInvalida_instanciaIncorrecta() {
  		Piloto unPiloto = null;
  		try {
  			unPiloto = new Piloto(1,"Asis", "Juan Antonio", "23723782", LocalDate.of(2019, 1, 31));
  		}catch(PilotoException e) {
  			 
  			assertEquals("Fecha de Nacimiento Invalida", e.getMessage() );
  		}
  	}
}
