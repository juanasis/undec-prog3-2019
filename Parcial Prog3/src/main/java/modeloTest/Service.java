package modeloTest;

import java.time.LocalDate;

import modelo.Cliente;
import modelo.Vehiculo;

public class Service {
	private int idService;
	private Vehiculo vehiculo;
	private Cliente cliente;
	private LocalDate fechaService;
	private String detalleService;
	private float precio;
	public Service(int idService, Vehiculo vehiculo, Cliente cliente, LocalDate fechaService, String detalleService,
			float precio) {
		this.idService = idService;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.fechaService = fechaService;
		this.detalleService = detalleService;
		this.precio = precio;
	}
	public static Service factoryService(int i, Vehiculo elVehiculo, Cliente elCliente, LocalDate of, String detalle,
			float f) {
		if(elVehiculo == null || elCliente == null || of.isAfter(LocalDate.now())) {
			return null;
		}else
			return new Service( i,  elVehiculo,  elCliente,  of,  detalle,
					 f);
	}
	public String mostrarResumen() {
		// "Service Nro: 1\nCliente: Perez, Juan - 15152020\nVehiculo: VW Golf modelo 2009 
		//- Patente ABC123\nTrabajo Realizado: Cambio de Aceite y Filtro"
		return "Service Nro: "+this.idService+"\nCliente: "+this.cliente.getApellido()+", "+this.cliente.getNombres()+" - "+this.cliente.getTelefono()+
				"\nVehiculo: "+this.vehiculo.getMarcaModelo()+" modelo "+this.vehiculo.getAnio()+" - Patente "+
				this.vehiculo.getPatente()+"\nTrabajo Realizado: "+this.detalleService;
				
	}
	
	
	
	
}
