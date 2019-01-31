package com.br.polimorfismo;

public class Tartaruga extends Reptil {
	@Override
	public void locomover() {
		System.out.println("de forma lenta");
	}

	@Override
	public void alimentar() {
		System.out.println("alface");
	}

	@Override
	public void emitirsom() {
		System.out.println("nada");
	}

}
