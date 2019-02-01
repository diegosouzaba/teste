package com.br.estudo.polimorfismo;

public class Peixe extends Animal{

	@Override
	public void locomocao() {
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
	
	public void botarovos(){
		
		System.out.println("Botar ovos");
	}

	@Override
	public void reagir() {
		// TODO Auto-generated method stub
		
	}

}
