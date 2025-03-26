package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Trapezio;
import br.com.engsenai.ui.Menu;

public class TrapezioDao {
	
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando um objeto trapezio...");
		System.out.print("Qual a base maior do trapezio? ");
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Qual a base menor do trapezio? ");
		Scanner leitor2 = new Scanner(System.in);
		
		trapezio.setBaseMenor(leitor2.nextDouble());
		
		System.out.print("Qual a altura do trapezio? ");
		Scanner leitor3 = new Scanner(System.in);
		
		trapezio.setAltura(leitor3.nextDouble());
		
		trapezio.mostrarDados();
		
		Menu.continuar(leitor);
		
		leitor2.close();
		leitor3.close();
		
	}

}
