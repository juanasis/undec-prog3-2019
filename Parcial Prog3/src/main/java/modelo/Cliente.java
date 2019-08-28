package modelo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import excepciones.ClienteIncompletoException;

public class Cliente {
	private int idCliente;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private String telefono;
	private LinkedList<Vehiculo> vehiculos;
	private Cliente(int idCliente, String apellido, String nombres, String documento, LocalDate fechaNacimiento,
			String domicilio, String telefono) {
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}
	public static Cliente factoryCliente(int idCliente, String apellido, String nombres, String documento, LocalDate fechaNacimiento,
			String domicilio, String telefono) throws ClienteIncompletoException{
		    if(apellido == null || nombres == null || documento == null || fechaNacimiento == null || domicilio == null || telefono == null)
		    {	return null;
		    } else 
		    	return new Cliente( idCliente, apellido, nombres, documento, fechaNacimiento,
		    			domicilio, telefono);
	}
	public void asignarVehiculo(Vehiculo elVehiculo) {
		// TODO Auto-generated method stub
		
	}
	public List<Vehiculo> devolverVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
