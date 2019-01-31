package com.br.polimorfismo;

public class Cobra extends Reptil {
	
	@Override
	public void locomover() {
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
