package br.com.bdam.domain;

import java.math.BigDecimal;

import br.com.bdam.dao.generics.TipoChave;

public class Produto implements Persistente {

	@TipoChave("getCodigo")
	private String codigo;
	
	private String nome;
	
	private String descricao;
	
	private BigDecimal valor;
	
	public Produto(String nome, String descricao, BigDecimal valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
