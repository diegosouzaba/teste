package com.br.polimorfismo;

public class Mamifero extends Animal{

	@Override
	public void locomover() {
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

}
