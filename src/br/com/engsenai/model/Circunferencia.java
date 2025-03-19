package br.com.engsenai.model;

public class Circunferencia {
	public double raio;
	public double perimetro;
	public double area;

	public void setRaio(double raio) {

		if (raio >= 0) {
			this.raio = raio;
		} else {
			System.out.println("\nO raio" + raio + "deve ser maior que 0!\n");
		}
	}

	public double calcularArea() {
		double area = raio * raio * Math.PI ;
		return area;
	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("Resultados");
		System.out.println("======================");
		System.out.println("Nome: Circunferencia");
		System.out.println("Raio: " + raio);
		System.out.println("Área: " + String.format("%.1f", calcularArea()));
		System.out.println("======================");

	}

}
