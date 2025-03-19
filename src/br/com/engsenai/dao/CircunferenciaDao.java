package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Circunferencia;

public class CircunferenciaDao {
	
	public static void criarCircunferencia() {
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual o raio da circunferencia? ");
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		circunferencia.setRaio(leitor.nextDouble());
		
		circunferencia.mostrarDados();
		
		// Fechar o objeto scanner, remover da memória
		leitor.close();
		
	}

}
