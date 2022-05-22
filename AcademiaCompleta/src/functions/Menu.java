package functions;

import javax.swing.JOptionPane;

public abstract class Menu {

	public void rodaMenu() {
		
		
		int op;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Athletica System - Menu \n"
	                + "1 - Cadastrar cliente \n"
	                + "2 - Buscar cliente \n"
	                + "3 - Atualizar cliente \n"
	                + "4 - Excluir cliente \n"
	                + "0 - Sair do programa \n"));
			
			switch (op) {
			
				case 1: {
					Cadastrar cadastrar = new Cadastrar(){};
			        cadastrar.cadastrar();
					break;
				}
				
				case 2: {
					Buscar buscar = new Buscar(){};
				    buscar.buscar();
					break;
				}
				case 3: {
					Atualizar atualizar = new Atualizar(){};
				    atualizar.atualizar();
					break;
				}
				case 4:{
					Excluir excluir = new Excluir(){};
				    excluir.excluir();
					break;
				}
			}
		
		}while(op!=0);
	}
	
	
	
}
