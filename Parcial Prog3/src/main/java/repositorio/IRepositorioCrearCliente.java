package repositorio;

import modelo.Cliente;

public class IRepositorioCrearCliente {

	public boolean guardar(Cliente clienteNuevo) {
		return true;
			
	}

	public boolean findByDNI(String documento) {
	    return false;
		
	}

	public boolean verificarCliente(Cliente clienteNuevo) {
		if(clienteNuevo.getDocumento() != null)
			return true;
		else 
			return false;
	}

}
