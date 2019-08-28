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
	
	
	
	
}
