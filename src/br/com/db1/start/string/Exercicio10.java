package br.com.db1.start.string;

public class Exercicio10 {
	private String texto;

	public String[] separaTexto(String texto) {
		return texto.split(",");

	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
