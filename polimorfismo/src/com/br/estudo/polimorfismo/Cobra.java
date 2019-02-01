package com.br.estudo.polimorfismo;

public class Cobra extends Reptil {
	
	@Override
	public void locomocao() {
		System.out.println("rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("come ratos");
	}

	@Override
	public void emitirsom() {
		System.out.println("~~");
	}

}
