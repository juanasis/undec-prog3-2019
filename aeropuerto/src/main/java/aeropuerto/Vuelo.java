package aeropuerto;
import java.time.LocalDateTime;
 import java.util.*;
import java.util.LinkedList;

 

public class Vuelo {

	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private LinkedList<Piloto> pilotos;
	private Avion avion;
	private LinkedList<Asignacion> pasajeros;
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, LinkedList<Piloto> pilotos, Avion avion,
			LinkedList<Asignacion> pasajeros) {
		
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}
	

	public String getCodigoVuelo() {
		return codigoVuelo;
	}
	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}
	public Aeropuerto getSalida() {
		return salida;
	}
	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public LinkedList<Piloto> getPilotos() {
		return pilotos;
	}
	public void setPilotos(LinkedList<Piloto> pilotos) {
		this.pilotos = pilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public LinkedList<Asignacion> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(LinkedList<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
		
	}
	@Override
	public String toString() {
		return "Vuelo [codigoVuelo=" + codigoVuelo + ", salida=" + salida + ", fechaHoraSalida=" + fechaHoraSalida
				+ ", arribo=" + arribo + ", fechaHoraArribo=" + fechaHoraArribo + ", aerolinea=" + aerolinea
				+ ", pilotos=" + pilotos + ", avion=" + avion + ", pasajeros=" + pasajeros + "]";
	}
	
	 
	public String mostrarVuelo() {
		
		return "Vuelo " + codigoVuelo + " - " + avion.getModelo() + " \n"+
				fechaHoraSalida.getDayOfWeek() +" "+fechaHoraSalida.getDayOfMonth()+" de "+fechaHoraSalida.getMonth()+" "+fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+ " " + salida.getCodigo() + "("+salida.verCiudad()+" "+salida.getNombre()+")"
				+"\n"+fechaHoraArribo.getDayOfWeek() +" " +fechaHoraArribo.getDayOfMonth()+" de "+fechaHoraArribo.getMonth()+ " "+fechaHoraArribo.getHour()+":"+fechaHoraArribo.getMinute()+" " + arribo.getCodigo() + "("+arribo.verCiudad()+" "+arribo.getNombre()+")"+
				"\nOperado por "+ aerolinea.getNombre();
		
	} 
	
	public String verAsignaciones() {
		int se�al=0;
		System.out.println("Detalle de asignacion - Vuelo "+this.getCodigoVuelo());
		for(Asiento a: avion.getListaAsientos()) {
			for(Asignacion as: pasajeros) {
					if(a.getIdAsiento() == as.getAsiento().getIdAsiento()) {
						se�al=1;
						System.out.println("Asiento " +a.getNumeroAsiento() + " - Ocupado");
						break;
						
					}
					else se�al=0;
					}
			if(se�al == 0) 
				System.out.println("Asiento "+a.getNumeroAsiento()+" - Libre");
				
			
		}
		
		return "";
	}



}
