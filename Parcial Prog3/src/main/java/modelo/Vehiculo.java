package modelo;

public class Vehiculo {
	private int idVehiculo;
	private String marcaModelo;
	private String patente;
	private int anio;
	
	
	
	private Vehiculo(int idVehiculo, String marcaModelo, String patente, int anio) {
		
		this.idVehiculo = idVehiculo;
		this.marcaModelo = marcaModelo;
		this.patente = patente;
		this.anio = anio;
	}



	public static Vehiculo factoryVehiculo(int idVehiculo, String marcaModelo, String patente, int anio) {
		if(marcaModelo == null || patente == null  ) {
			return null;
		}
		else
			return new  Vehiculo( idVehiculo,  marcaModelo,  patente,  anio) ;
			
	}



	public String mostrarVehiculo() {
		// TODO Auto-generated method stub
		return ""+this.marcaModelo+" modelo "+this.anio+" - Patente "+this.patente;
	}

}
