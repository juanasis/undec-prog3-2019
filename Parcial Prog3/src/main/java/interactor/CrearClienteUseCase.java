package interactor;

import modelo.Cliente;
import repositorio.IRepositorioCrearCliente;

public class CrearClienteUseCase {
	private IRepositorioCrearCliente elRepositorio;
	public CrearClienteUseCase(IRepositorioCrearCliente crearClienteGateway) {
		this.elRepositorio = crearClienteGateway;
	}

	public boolean crearCliente(Cliente clienteNuevo) {
		if (!elRepositorio.verificarCliente(clienteNuevo)) {
			return elRepositorio.guardar(clienteNuevo);
		}
		return false;

}


}
