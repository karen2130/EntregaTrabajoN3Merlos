package ar.edu.unju.fi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.service.IClienteService;

@Service
@Qualifier("otroImp")
public class OtroImp implements IClienteService{

	@Override
	public void guardarCliente(Cliente unCliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente crearCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> obtenerTodosClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
