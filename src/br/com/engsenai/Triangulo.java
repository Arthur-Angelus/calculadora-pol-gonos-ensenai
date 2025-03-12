package br.com.engsenai;

public class Triangulo {
	public double base;
	public double altura;
	public String nome;
	public double perimetro;
	public double area;

	public void setBase(double base) {

		if (base >= 0) {
			this.base = base;
		} else {
			System.out.println("\nA base" + base + "deve ser maior que 0!\n");
		}
	}

	public void setAltura(double altura) {

		if (altura >= 0) {
			this.altura = altura;
		} else {
			System.out.println("\nA altura" + altura + "deve ser maior que 0!\n");
		}

	}

	public void setNome(String nome) {
		// TRUE
		if (nome.length() >= 5) {
			this.nome = nome.toUpperCase();
		} else {
			// FALSE
			System.out.println("\nO nome " + nome + ", não é valido!\nO nome deve conter pelo menos 5 caracteres!\n");
		}
	}

	public double calcularArea() {
		double area = (altura * base) / 2;
		return area;
	}

	public void mostrarResultados() {
		System.out.println("======================");
		System.out.println("Resultados");
		System.out.println("======================");
		System.out.println("Nome: " + nome);
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Área: " + String.format("%.1f", calcularArea()));
		System.out.println("======================");

	}

}
