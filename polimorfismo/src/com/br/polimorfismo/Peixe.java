package com.br.polimorfismo;

public class Peixe extends Animal{

	@Override
	public void locomover() {
		System.out.println("nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("come algas");
	}

	@Override
	public void emitirsom() {
		System.out.println("som de peixe");
	}

}
