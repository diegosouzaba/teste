package com.br.estudo.polimorfismo;

public class Tartaruga extends Reptil {
	@Override
	public void locomocao() {
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
