package br.com.bdam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.bdam.dao.ClienteDAOMock;
import br.com.bdam.dao.IClienteDAO;
import br.com.bdam.domain.Cliente;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAOMock();
	}
	
	@Before
	public void init() {
		cliente = new Cliente("Bruno", Long.parseLong("06003208201"), Long.parseLong("992797005"), "Rua teste", 345, "Jaru", "RO");
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Bruno Dambroski");
		clienteDao.alterar(cliente);
		
		Assert.assertEquals("Bruno Dambroski", cliente.getNome());
	}
}
