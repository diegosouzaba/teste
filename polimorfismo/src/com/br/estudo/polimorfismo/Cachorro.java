package com.br.estudo.polimorfismo;

public class Cachorro extends Mamifero {

	@Override
	public void locomocao() {
		System.out.println("correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("come osso");
	}

	@Override
	public void emitirsom() {
		System.out.println("late");
	}

	
	public void atacar(String dono) {
		if (dono != "dono") {
			System.out.println("Latir e morder");
		}
		if(dono=="dono") {
			System.out.println("Brincar e abanar o rabo");
		}
		
	}

	
	public void atacar(int hora) {
		if (hora > 0 || hora < 6) {
			System.out.println("Latir e morder todos");
		} else {
			System.out.println("Brincar e abanar o rabo");
		}

	}

}
