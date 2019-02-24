package br.sc.senac.controller;

import br.sc.senac.model.Autor;

public class AutorControler {
	private Autor autor;
	public AutorControler() {
		super();
		autor = new Autor("Jhully",25,"9999999");
		
	}
	
	public Autor getAutor() {
		return autor;
	}

}
