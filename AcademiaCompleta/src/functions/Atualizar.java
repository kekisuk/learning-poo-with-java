package functions;

import javax.swing.JOptionPane;

public abstract class Atualizar {
    public Buscar buscar_dados;
    public Cadastrar recadastrar_dados;
    
    public Atualizar() {
        buscar_dados = new Buscar(){};
        recadastrar_dados = new Cadastrar(){};
    }
    
    public void atualizar(){
    	JOptionPane.showMessageDialog(null, "Para atualizar, o sistema vai realizar uma busca.\n"
    			+ "Clique em OK para continuar.");
    	
    	buscar_dados.buscar();
        int op = Integer.parseInt(JOptionPane.showInputDialog("Cliente encontrado. Tem certeza que deseja atualizar "
                + "os dados desse usuário? As informações antigas serão sobrescritas!\n"
                + "1 - Sim\n"
                + "2 - Não"));
        if(op == 1) {
            recadastrar_dados.cadastrar();
        }else if(op == 2) {
            JOptionPane.showMessageDialog(null, "Os dados originais não foram alterados!");
        } else {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR DADOS! OPÇÃO INVÁLIDA!");
        }
    }
    
}
