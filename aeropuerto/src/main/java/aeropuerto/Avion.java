package aeropuerto;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import excepciones.AvionException;
import excepciones.AvionListaAsientosIncorrectaException;
import excepciones.AvionMatriculaIncorrectaException;
import excepciones.AvionModeloIncorrectoException;

public class Avion {

		private int idAvion;
		private String modelo;
		private String matricula;
		private List<Asiento> listaAsientos;
		private int hsVuelo=0;
		public Avion(int idAvion, String modelo, String matricula, List<Asiento> listaAsientos)throws AvionException {
			if(modelo.length() == 0)
				throw new AvionModeloIncorrectoException();
			if(matricula.length() == 0)
				throw new AvionMatriculaIncorrectaException();
			if(listaAsientos.size() == 0)
				throw new AvionListaAsientosIncorrectaException();
			this.idAvion = idAvion;
			this.modelo = modelo;
			this.matricula = matricula;
			this.listaAsientos = listaAsientos;
		}
		public int getIdAvion() {
			return idAvion;
		}
		public void setIdAvion(int idAvion) {
			this.idAvion = idAvion;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public List<Asiento> getListaAsientos() {
			return listaAsientos;
		}
		public void setListaAsientos(LinkedList<Asiento> listaAsientos) {
			this.listaAsientos = listaAsientos;
		}
		public void acumuladorHoras(int x) {
			this.hsVuelo+=x;
			
		}
		public int getHsVuelo() {
			return hsVuelo/60;
		}
		public void setHsVuelo(int hsVuelo) {
			this.hsVuelo = hsVuelo;
		}
		@Override
		public String toString() {
			return "Avion [idAvion=" + idAvion + ", modelo=" + modelo + ", matricula=" + matricula + ", listaAsientos="
					+ listaAsientos + "]";
		}

				@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAvion;
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
		Avion other = (Avion) obj;
		if (idAvion != other.idAvion)
			return false;
		return true;
	}
		

}
