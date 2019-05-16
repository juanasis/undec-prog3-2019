package aeropuerto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import excepciones.AerolineaException;
import excepciones.AeropuertoNombreIncorrectoExcepcion;
import excepciones.AeropuertoExcepcion;
import excepciones.CiudadException;
import excepciones.CiudadNombreIncorrectoException;
 

public class AeropuertoUnitTest {
	@Test
	public void aeropuertoTest_devuelveFormato(){
		Ciudad buenosAires = null;
		try {
			buenosAires = new Ciudad(1,"Buenos Aires", "2323");
		} catch (CiudadNombreIncorrectoException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		Aeropuerto elAeropuerto = null;
		try {						
			elAeropuerto = new Aeropuerto(002,"Capitán Vicente Almandos Almonacid", buenosAires,  "0001");
		}catch (AeropuertoExcepcion e) {
			e.printStackTrace();
		}
		assertEquals("Aeropuerto Nombre Incorrecto",e.getMessage());
	
   }
} 		
		

