package com.br.polimorfismo;

public class Ave extends Animal{

	@Override
	public void locomover() {
		System.out.println("voando");
	}

	@Override
	public void alimentar() {
		System.out.println("comer peixe");
	}

	@Override
	public void emitirsom() {
		System.out.println("som de ave");
	}

}
