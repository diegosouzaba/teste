package com.br.estudo.polimorfismo;

public abstract class Animal {
	
	private double peso;
	private int idade;
	private int membro;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembro() {
		return membro;
	}
	public void setMembro(int membro) {
		this.membro = membro;
	}
	public  abstract void locomocao();
	public  abstract void alimentar();
	public  abstract void emitirsom();
	public  abstract void reagir();

	

}
