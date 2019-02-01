package com.br.estudo.polimorfismo;

public class Ave extends Animal{

	@Override
	public void locomocao() {
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

	@Override
	public void reagir() {
		// TODO Auto-generated method stub
		
	}

}
