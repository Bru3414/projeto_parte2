package br.com.bdam.service;

import br.com.bdam.dao.IProdutoDAO;
import br.com.bdam.domain.Produto;
import br.com.bdam.service.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
