package aeropuerto;

import java.time.LocalDate;
import java.time.Period;

public class Piloto {
	
	private int idPiloto;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;
	
	public Piloto(int idPiloto, String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
		
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
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
	
	
	@Override
	public String toString() {
		return "Piloto [idPiloto=" + idPiloto + ", apellido=" + apellido + ", nombres=" + nombres + ", documento="
				+ documento + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	public String getApelidoNombres() {
		return (apellido+", "+ nombres);
	}
	public int getAge(LocalDate of) {
		Period a�os;
		a�os = Period.between(fechaNacimiento,of );
		return a�os.getYears();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPiloto;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piloto other = (Piloto) obj;
		if (idPiloto != other.idPiloto)
			return false;
		return true;
	}
	
	

}
