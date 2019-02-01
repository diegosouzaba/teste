package com.br.estudo.polimorfismo;

public class Mamifero extends Animal {

	@Override
	public void locomocao() {
		System.out.println("corre");
	}

	@Override
	public void alimentar() {
		System.out.println("come capim");
	}

	@Override
	public void emitirsom() {
		System.out.println("som de mamifero");
	}

	@Override
	public void reagir() {
		// TODO Auto-generated method stub
		System.out.println("nada");
		
	}
	
	public void atacar() {
		
	}
	
	

}
