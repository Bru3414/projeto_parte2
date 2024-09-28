package br.com.bdam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.bdam.dao.ClienteDAOMock;
import br.com.bdam.domain.Cliente;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;
import br.com.bdam.service.ClienteService;
import br.com.bdam.service.IClienteService;
import br.com.bdam.dao.IClienteDAO;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente("Bruno", Long.parseLong("06003208201"), Long.parseLong("992797005"), "Rua teste", 345, "Jaru", "RO");
	}

	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Bruno Dambroski");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Bruno Dambroski", cliente.getNome());
	}
}
