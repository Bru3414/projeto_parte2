package br.com.bdam.domain;

public class Cliente implements Persistente {
	private String nome;
	private Long cpf;
	private Long tel;
	private String end;
	private Integer num;
	private String cidade;
	private String uf;
	
	public Cliente(String nome, Long cpf, Long tel, String end, Integer num, String cidade, String uf) {
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
		this.end = end;
		this.num = num;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

}
