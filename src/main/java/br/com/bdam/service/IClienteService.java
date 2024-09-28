package br.com.bdam.service;

import br.com.bdam.domain.Cliente;
import br.com.bdam.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
