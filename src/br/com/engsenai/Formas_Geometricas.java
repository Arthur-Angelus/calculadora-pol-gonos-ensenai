package br.com.engsenai;

public class Formas_Geometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado q1 = new Quadrado();
		q1.setValor(5.24059);
		q1.setNome("quadrado 1");
		
		Quadrado q2 = new Quadrado();
		q2.setValor(7.24235);
		q2.setNome("quadrado 2");
		
		System.out.println(q1);
		System.out.println(q2);
		
		q1.mostrarResultados();
		q2.mostrarResultados();
		
		Retangulo r1 = new Retangulo();
		r1.setBase(10.238748623);
		r1.setAltura(5.2348068024);
		r1.setNome("retangulo 1");
		
		Retangulo r2 = new Retangulo();
		r2.setBase(14.3974083);
		r2.setAltura(7.24235);
		r2.setNome("retangulo 2");
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.mostrarResultados();
		r2.mostrarResultados();
		
		Triangulo t1 = new Triangulo();
		t1.setBase(10.238748623);
		t1.setAltura(5.2348068024);
		t1.setNome("triangulo 1");
		
		Triangulo t2 = new Triangulo();
		t2.setBase(14.3974083);
		t2.setAltura(7.24235);
		t2.setNome("triangulo 2");
		
		System.out.println(t1);
		System.out.println(t2);
		
		t1.mostrarResultados();
		t2.mostrarResultados();
		
		Trapezio z1 = new Trapezio();
		z1.setBaseMaior(14.320704);
		z1.setBaseMenor(5.792474);
		z1.setAltura(6.8274896436);
		z1.setNome("trapezio 1");
		
		Trapezio z2 = new Trapezio();
		z2.setBaseMaior(16.9437594);
		z2.setBaseMenor(7.32535);
		z2.setAltura(8.089743);
		z2.setNome("trapezio 2");
		
		System.out.println(z1);
		System.out.println(z2);
		
		z1.mostrarResultados();
		z2.mostrarResultados();
		
		Circunferencia c1 = new Circunferencia();
		c1.setRaio(10.238748623);
		c1.setNome("circunferencia 1");
		
		Circunferencia c2 = new Circunferencia();
		c2.setRaio(14.3974083);
		c2.setNome("circunferencia 2");
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.mostrarResultados();
		c2.mostrarResultados();

	}

}
