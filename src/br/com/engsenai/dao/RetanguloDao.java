package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Retangulo;
import br.com.engsenai.ui.Menu;

public class RetanguloDao {
	
	public static void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual a base do retangulo? ");
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Qual a altura do retangulo? ");
		Scanner leitor2 = new Scanner(System.in);
		
		retangulo.setAltura(leitor2.nextDouble());
		
		retangulo.mostrarDados();
		
		Menu.continuar(leitor);
		
		leitor2.close();
		
	}

}
