package com.br.estudo.polimorfismo;

public class Teste {
	public static void main(String[] args) {
		
		/**
		 * autor: Diego
		 * Definição de polimorfismo:Acontece quando substituimos um metodo
		 * de uma superclasse na sua subclasse,usando a mesma assinatura.
		 */
		
		//Polimorfismo de sobreposicao
		Animal r = new Reptil();
		Animal m = new Mamifero();
		Animal p = new Peixe();
		Animal a = new Ave();
		
		
		r.alimentar();
		r.emitirsom();
		r.locomocao();
		r.setIdade(2);
		r.setMembro(4);
		r.setPeso(0.2);
		
//		m.alimentar();
//		m.emitirsom();
//		m.locomocao();
//		m.setIdade(2);
//		m.setMembro(4);
//		m.setPeso(0.2);
//		
//		p.alimentar();
//		p.emitirsom();
//		p.locomocao();
//		p.setIdade(2);
//		p.setMembro(4);
//		p.setPeso(0.2);
//		
//		a.alimentar();
//		a.emitirsom();
//		a.locomocao();
//		a.setIdade(2);
//		a.setMembro(4);
//		a.setPeso(0.2);
		
		//Polimorfismo de sobrecarga
		Cachorro cachoro = new Cachorro();
		cachoro.atacar("dona");
		cachoro.atacar(5);
		
	}
	

}
