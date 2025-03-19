package br.com.engsenai.model;

public class Quadrado {
	private double lado;
	public double perimetro;
	public double area;

	public void setLado(double lado) {

		if (lado >=0) {
			this.lado = lado;
		} else {
			System.out.println("\nO valor" + lado + "deve ser maior que 0!\n");
		}

	}

	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}

	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

	public void mostrarDados() {
		System.out.println("============================");
		System.out.println("Resultados");
		System.out.println("============================");
		System.out.println("Nome: Quadrado");
		System.out.println("Lado: " + lado);
		System.out.println("Área: " + String.format("%.1f", calcularArea()));
		System.out.println("Perímetro: " + String.format("%.1f", calcularPerimetro()));
		System.out.println("============================");

	}
}
