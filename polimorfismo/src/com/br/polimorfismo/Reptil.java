package com.br.polimorfismo;

public class Reptil  extends Animal{

	@Override
	public void locomover() {
		System.out.println("arrastando");
	}

	@Override
	public void alimentar() {
		System.out.println("comer insetos");
	}

	@Override
	public void emitirsom() {
		System.out.println("som de reptil");
	}

}
