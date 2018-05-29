package br.com.db1.start.string;

public class Exercicio09 {
	private String nome = "Guilherme Crysthiano Nogueira";

	public String trocaNome() {
		return nome.substring((nome.length() - 4), nome.length());
	}

}
