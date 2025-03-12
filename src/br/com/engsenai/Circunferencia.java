package br.com.engsenai;

public class Circunferencia {
	public double raio;
	public double altura;
	public String nome;
	public double perimetro;
	public double area;

	public void setRaio(double raio) {

		if (raio >= 0) {
			this.raio = raio;
		} else {
			System.out.println("\nO raio" + raio + "deve ser maior que 0!\n");
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
		double area = raio * raio * Math.PI ;
		return area;
	}

	public void mostrarResultados() {
		System.out.println("======================");
		System.out.println("Resultados");
		System.out.println("======================");
		System.out.println("Nome: " + nome);
		System.out.println("raio: " + raio);
		System.out.println("Área: " + String.format("%.1f", calcularArea()));
		System.out.println("======================");

	}

}
