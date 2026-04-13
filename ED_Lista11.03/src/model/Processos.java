package model;

public class Processos {
	
	private String nome;
	private int qntRetornos;
	
	public Processos() {
		this.nome = "";
		this.qntRetornos = 0;
	}
	
	public void setName(String nome) {
		
		this.nome = nome;
	}
	
	public String getName() {
		
		return this.nome;
	}
	
	public void setQntRetornos(int num) {
		
		this.qntRetornos = num;
	}
	
	public int getQntRetornos() {
		
		return this.qntRetornos;
	}
	
	public String toString() {
		
		return "Processo: "+this.nome+"\nNúmero de retornos: "+this.qntRetornos;
	}
}
