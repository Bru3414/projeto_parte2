package br.com.bdam;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.bdam.dao.IProdutoDAO;
import br.com.bdam.dao.ProdutoDAOMock;
import br.com.bdam.domain.Produto;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {

private IProdutoDAO produtoDao;
	
	private Produto produto;
	
	public ProdutoDAOTest() {
		produtoDao = new ProdutoDAOMock();
	}
	
	@Before
	public void init() {
		produto = new Produto("ProdutoTeste", "Teste", BigDecimal.valueOf(100));;
	}

	@Test
	public void pesquisarCliente() {
		Produto produtoConsultado = produtoDao.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoDao.cadastrar(produto);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		produtoDao.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Produto Teste");
		produtoDao.alterar(produto);
		
		Assert.assertEquals("Produto Teste", produto.getNome());
	}
}
