package controller;

import otavioolinto.fila.Fila;
import model.Processos;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}
	
	public void escalonador(Fila<Processos> fila)throws Exception {
		
		// Criando o processo Auxiliar
		Processos procAux;
		
		int qnt = 0;
		
		System.out.println("Processos em operação:\n");
		
		while(!fila.isEmpty()) {
			
			procAux = fila.remove();
			
			qnt = procAux.getQntRetornos();
			qnt--;
			
			procAux.setQntRetornos(qnt);
			
			System.out.println(procAux+"\n");
			
			if(qnt>0) {
				
				fila.insert(procAux);
			}
		}
	}

}
