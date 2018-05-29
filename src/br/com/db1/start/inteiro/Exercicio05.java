package br.com.db1.start.inteiro;

public class Exercicio05 {
	private double num1;

	public Boolean testaPar() {
		if (num1 % 2 == 0) {
			System.out.println("O número é par.");
			return true;
		}
		return false;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

}
