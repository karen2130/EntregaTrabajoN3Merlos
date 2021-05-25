package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.model.Cliente;

public interface IClienteService {
	public void guardarCliente(Cliente unCliente);
	public Cliente crearCliente();
	public List<Cliente> obtenerTodosClientes();

}
