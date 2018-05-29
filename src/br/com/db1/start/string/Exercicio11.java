package br.com.db1.start.string;

import java.util.ArrayList;
import java.util.List;

public class Exercicio11 {
	private Integer contador;
	private Integer contadorVogal = 0;

	private List<String> iniciaVogais() {
		List<String> vogais = new ArrayList<>();
		vogais.add("a");
		vogais.add("e");
		vogais.add("i");
		vogais.add("o");
		vogais.add("u");
		return vogais;
	}

	private Integer contaVogais(String texto, List<String> vogais) {
		for (contador = 0; contador < texto.length(); contador++) {
			String umaPosicao = texto.substring(contador, contador + 1);
			if (vogais.contains(umaPosicao)) {
				contadorVogal++;
			}

		}
		return contadorVogal;
	}

	public Integer quantVogais(String texto) {
		return contaVogais(texto.toLowerCase(), iniciaVogais());
	}

}
