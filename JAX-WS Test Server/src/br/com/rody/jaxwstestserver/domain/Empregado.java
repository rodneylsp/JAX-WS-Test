package br.com.rody.jaxwstestserver.domain;

public class Empregado {
	
	private String id;
	private String nome;
	
	public Empregado(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	

	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Empregado [nome=" + nome + "]";
	}
	
}
