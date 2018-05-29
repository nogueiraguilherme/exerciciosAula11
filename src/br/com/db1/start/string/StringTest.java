package br.com.db1.start.string;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

	@Test
	public void textoMaiusculaTest() {
		Exercicio01 ex1 = new Exercicio01();
		Assert.assertEquals("DB1START", ex1.textoMaiuscula("db1start"));
	}

	@Test
	public void textoMinusculaTest() {
		Exercicio02 ex2 = new Exercicio02();
		Assert.assertEquals("db1start", ex2.textoMinuscula("DB1Start"));
	}

	@Test
	public void textoComprimentoTest() {
		Exercicio03 ex3 = new Exercicio03();
		Assert.assertTrue(8 == ex3.textoComprimento());
	}

	@Test
	public void textoLetrasTest() {
		Exercicio04 ex4 = new Exercicio04();
		Assert.assertEquals("DB1Start", ex4.textoLetras());
	}

	@Test
	public void textoLetrasQuantTest() {
		Exercicio05 ex5 = new Exercicio05();
		Assert.assertTrue(8 == ex5.textoLetrasQuant());
	}

	@Test
	public void letrasNomeTest() {
		Exercicio06 ex6 = new Exercicio06();
		Assert.assertEquals("Guil", ex6.letrasNome());
	}

	@Test
	public void letrasNome2Test() {
		Exercicio07 ex7 = new Exercicio07();
		Assert.assertEquals("lherme Crysthiano Nogueira", ex7.letrasNome2());
	}

	@Test
	public void letrasNome3Test() {
		Exercicio08 ex8 = new Exercicio08();
		Assert.assertEquals("eira", ex8.letrasNome3());
	}

	@Test
	public void trocaNomeTest() {
		Exercicio09 ex9 = new Exercicio09();
		Assert.assertEquals("erme", ex9.trocaNome());
	}

	@Test
	public void separaTextoTest() {
		Exercicio10 ex10 = new Exercicio10();
		String[] partes = ex10.separaTexto("banana,maçã,melancia");
		Assert.assertEquals("banana", partes[0]);
		Assert.assertEquals("maçã", partes[1]);
		Assert.assertEquals("melancia", partes[2]);

	}

	@Test
	public void quantVogaisTest() {
		Exercicio11 ex11 = new Exercicio11();
		Assert.assertTrue(3 == ex11.quantVogais("douglas"));
		Assert.assertTrue(4 == ex11.quantVogais("Emanuel"));
		Assert.assertTrue(4 == ex11.quantVogais("Guilherme"));
		

	}
}
