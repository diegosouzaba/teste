package com.br.polimorfismo;

public class Canguru extends Mamifero {
	
	@Override
	public void locomover() {
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
