package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Triangulo;
import br.com.engsenai.ui.Menu;

public class TrianguloDao {
	
	public static void criarTriangulo() {
		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual a base do triangulo? ");
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("Qual a altura do triangulo? ");
		Scanner leitor2 = new Scanner(System.in);
		
		triangulo.setAltura(leitor2.nextDouble());
		
		triangulo.mostrarDados();
		
		Menu.continuar(leitor);
		
		leitor2.close();
		
	}

}
