package br.senai.sp.model;

public class Triangulo {
	
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	public void exibirDados(){
		System.out.println("---------------");
		System.out.println(nome);
		System.out.println("---------------");
		System.out.println("Altura: " + altura);
		System.out.println("LadoC: " + ladoC);
		System.out.println("LadoB: " + ladoB);
		System.out.println("Base: " + base);
		System.out.println();
	}
}
