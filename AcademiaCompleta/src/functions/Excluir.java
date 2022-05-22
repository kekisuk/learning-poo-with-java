package functions;

import java.io.File;
import javax.swing.JOptionPane;

public abstract class Excluir {
    public Buscar buscar_dados;
    
    public Excluir() {
        buscar_dados = new Buscar(){};
    }
    
    public void excluir() {
    	JOptionPane.showMessageDialog(null, "Para excluir, o sistema vai realizar uma busca.\n"
    			+ "Clique em OK para continuar.");
    	buscar_dados.buscar();
        int op = Integer.parseInt(JOptionPane.showInputDialog("Cliente encontrado. Tem certeza que deseja excluir "
                + "os dados desse usuário? As informações serão perdidas!\n"
                + "1 - Sim\n"
                + "2 - Não"));
        if(op == 1) {
            String cpf = JOptionPane.showInputDialog("Para prosseguir, digite novamente o CPF:");
            File ler = new File(cpf+".txt");
            ler.delete();
            JOptionPane.showMessageDialog(null, "O cliente foi excluido do sistema com sucesso!");
        }else if(op == 2) {
            JOptionPane.showMessageDialog(null, "Os dados originais não foram alterados!");
        } else {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR DADOS! OPÇÃO INVÁLIDA!");
        }
    }
}
