package com.br.estudo.polimorfismo;

public class Canguru extends Mamifero {
	
	@Override
	public void locomocao() {
		System.out.println("pulando");
	}

	@Override
	public void alimentar() {
		System.out.println("comendo cenoura");
	}

	@Override
	public void emitirsom() {
		System.out.println("kif");
	}
	
	public void lutar(){
		System.out.println("Lutar boxe");
	}

}
