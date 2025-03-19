package br.com.engsenai.model;

public class Trapezio {
	public double baseMaior;
	public double baseMenor;
	public double altura;
	public double perimetro;
	public double area;

	public void setBaseMaior(double baseMaior) {

		if (baseMaior >= 0) {
			this.baseMaior = baseMaior;
		} else {
			System.out.println("\nA base maior" + baseMaior + "deve ser maior que 0!\n");
		}
	}
	
	public void setBaseMenor(double baseMenor) {

		if (baseMenor >= 0) {
			this.baseMenor = baseMenor;
		} else {
			System.out.println("\nA base menor" + baseMenor + "deve ser maior que 0!\n");
		}
	}

	public void setAltura(double altura) {

		if (altura >= 0) {
			this.altura = altura;
		} else {
			System.out.println("\nA altura" + altura + "deve ser maior que 0!\n");
		}

	}

	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura /2 ;
		return area;
	}

	public void mostrarDados() {
		System.out.println("======================");
		System.out.println("Resultados");
		System.out.println("======================");
		System.out.println("Nome: Trapezio");
		System.out.println("Base maior: " + baseMaior);
		System.out.println("Base menor: " + baseMenor);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + String.format("%.1f", calcularArea()));
		System.out.println("======================");

	}

}
