package br.com.bdam.service;

import br.com.bdam.dao.IClienteDAO;
import br.com.bdam.domain.Cliente;
import br.com.bdam.service.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
