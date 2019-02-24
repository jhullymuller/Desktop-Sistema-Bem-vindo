package br.sc.senac.model;

public class Autor {
	private String nome;
	private int idade;
	private String contato;
	public Autor(String nome, int idade, String contato) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	

}
