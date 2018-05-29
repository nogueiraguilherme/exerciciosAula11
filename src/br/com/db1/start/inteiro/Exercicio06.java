package br.com.db1.start.inteiro;

public class Exercicio06 {
	private double num1;
	private double num2;

	public Boolean testaMaior() {
		if (num1 > num2) {
			System.out.println("O primeiro número é maior.");
			return true;
		}
		System.out.println("O segundo número é maior.");
		return false;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

}
