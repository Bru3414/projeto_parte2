package br.com.bdam;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.bdam.dao.ProdutoDAOMock;
import br.com.bdam.dao.IProdutoDAO;
import br.com.bdam.domain.Produto;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;
import br.com.bdam.service.ProdutoService;
import br.com.bdam.service.IProdutoService;

public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDAOMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto("ProdutoTeste", "Teste", BigDecimal.valueOf(100));
	}

	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void pesquisarCliente() {
		Produto produtoConsultado = produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
	}
	
	@Test
	public void excluirCliente() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Produto Teste");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Produto Teste", produto.getNome());
	}
}
