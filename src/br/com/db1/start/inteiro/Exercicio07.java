package br.com.db1.start.inteiro;

public class Exercicio07 {
	private Integer num1;
	private Integer cont;

	public Boolean mostraImpar() {
		for (cont = num1; cont <= 100; cont++) {
			if (cont % 2 == 0) {
				System.out.println(cont);
				return true;
			}

		}
		return false;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

}
