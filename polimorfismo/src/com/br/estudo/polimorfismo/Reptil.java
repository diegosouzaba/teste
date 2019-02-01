package com.br.estudo.polimorfismo;

public class Reptil extends Animal{

	@Override
	public void locomocao() {
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

	@Override
	public void reagir() {
		// TODO Auto-generated method stub
		
	}

}
