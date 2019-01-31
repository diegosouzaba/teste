package com.br.polimorfismo;

public class Cachorro extends Mamifero{
	
	@Override
	public void locomover() {
		System.out.println("correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("come osso");
	}

	@Override
	public void emitirsom() {
		System.out.println("late");
	}
	
	

}
