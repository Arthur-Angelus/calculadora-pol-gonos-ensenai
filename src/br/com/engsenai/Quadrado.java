package br.com.engsenai;

public class Quadrado {
	public double valor;
	public String nome;
	public double perimetro;
	public double area;

	public void setValor(double valor) {

		if (valor >=0) {
			this.valor = valor;
		} else {
			System.out.println("\nO valor" + valor + "deve ser maior que 0!\n");
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

	public double calcularPerimetro() {
		double perimetro = valor * 4;
		return perimetro;
	}

	public double calcularArea() {
		double area = valor * valor;
		return area;
	}

	public void mostrarResultados() {
		System.out.println("======================");
		System.out.println("Resultados");
		System.out.println("======================");
		System.out.println("Nome: " + nome);
		System.out.println("Lado: " + valor);
		System.out.println("Área: " + String.format("%.1f", calcularArea()));
		System.out.println("Perímetro: " + String.format("%.1f", calcularPerimetro()));
		System.out.println("======================");

	}
}
