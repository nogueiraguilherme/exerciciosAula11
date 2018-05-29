package br.com.db1.start.inteiro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class InteiroTest {
	private Exercicio01 ex1 = new Exercicio01();
	private Exercicio02 ex2 = new Exercicio02();
	private Exercicio03 ex3 = new Exercicio03();
	private Exercicio04 ex4 = new Exercicio04();
	private Exercicio05 ex5 = new Exercicio05();
	private Exercicio06 ex6 = new Exercicio06();
	private Exercicio07 ex7 = new Exercicio07();

	@Before
	public void valorEx1() {
		ex1.setNum1(2);
		Assert.assertTrue(2 == ex1.getNum1());
		ex1.setNum2(5);
		Assert.assertTrue(5 == ex1.getNum2());
	}

	public void valorEx2() {
		ex2.setNum1(2);
		Assert.assertTrue(2 == ex2.getNum1());
		ex2.setNum2(5);
		Assert.assertTrue(5 == ex2.getNum2());
	}

	public void valorEx3() {
		ex3.setNum1(2);
		Assert.assertTrue(2 == ex3.getNum1());
		ex3.setNum2(5);
		Assert.assertTrue(5 == ex3.getNum2());
	}

	public void valorEx4() {
		ex4.setNum1(2);
		Assert.assertTrue(2 == ex4.getNum1());
		ex4.setNum2(5);
		Assert.assertTrue(5 == ex4.getNum2());
	}

	public void valorEx5() {
		ex5.setNum1(2);
		Assert.assertTrue(2 == ex5.getNum1());

	}

	public void valorEx6() {
		ex6.setNum1(2);
		Assert.assertTrue(2 == ex6.getNum1());
		ex6.setNum2(5);
		Assert.assertTrue(5 == ex6.getNum2());
	}

	public void valorEx7() {
		ex7.setNum1(2);
		Assert.assertTrue(2 == ex7.getNum1());

	}

	@Test
	public void somaTest() {
		Assert.assertTrue(7 == ex1.soma());
	}

	@Test
	public void subtraiTest() {
		Assert.assertTrue(-3 == ex2.subtrai());
	}

	@Test
	public void multiplicaTest() {
		Assert.assertTrue(7 == ex3.multiplica());
	}

	@Test
	public void divideTest() {
		Assert.assertTrue(0.4 == ex4.divide());
	}

	@Test
	public void testaParTest() {
		Assert.assertTrue(ex5.testaPar());
	}

	@Test
	public void testaMaiorTest() {
		Assert.assertTrue(ex6.testaMaior());
	}

	@Test
	public void mostraImparTest() {
		Assert.assertTrue(ex7.mostraImpar());
	}
}
