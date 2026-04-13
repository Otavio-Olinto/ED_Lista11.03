package view;

import otavioolinto.fila.Fila;
import model.Processos;
import controller.EscalonadorController;

public class Principal {

	public static void main(String[] args) {
		// Criando a fila de Processos
		Fila<Processos> fila = new Fila<>(Processos.class);
		
		// Instanciando os métodos da classe EScalonadorController
		EscalonadorController metodo = new EscalonadorController();
		
		String[] proc = {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"};
		
		for(String val: proc) {
			
			String[] nome = val.split(";");
			criarProcessos(fila, nome);
		}
		
		try {
			
			metodo.escalonador(fila);
		}catch(Exception exc) {
			
			System.err.println(exc.getMessage());
		}
		
		System.exit(0);
		
	}
	
	static void criarProcessos(Fila<Processos> fila,String[] nome) {
		
		// Criando os processos
		Processos processos = new Processos();
		
		// É necessário criar um novo objeto toda vez que for adicionar a fila
		// Caso contrário estará apenas alterando o valor do mesmo objeto
		// E adicionando o mesmo objeto em todas posições
		// Portanto terimos o mesmo objeto com o último valor em todas as posições
		
		processos.setName(nome[0]);
		processos.setQntRetornos(Integer.parseInt(nome[1]));
		
		fila.insert(processos);
		
	}

}
