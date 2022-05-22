package telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaExcluir extends JFrame{
	
	private JPanel painelTituloBusca = new JPanel();
	private JPanel painelBusca = new JPanel();
	private JPanel painelNome = new JPanel();
	private JPanel painelIdade = new JPanel();
	private JPanel painelEndereco = new JPanel();
	private JPanel painelTelefone = new JPanel();
	private JPanel painelModalidade = new JPanel();
	private JPanel painelBotoes = new JPanel();
	
	private JLabel jlTituloBusca = new JLabel("Atlhetic System | Excluir Matrícula");
	private JLabel jlSelecione = new JLabel("Selecione o CPF: ");
	private JLabel jlNome = new JLabel("Nome: ");
	private JLabel jlIdade = new JLabel("Idade: ");
	private JLabel jlEndereco = new JLabel("Endereço: ");
	private JLabel jlTelefone = new JLabel("Telefone: ");
	private JLabel jlModalidade = new JLabel("Modalidade: ");
	
	//Essa string tem que importar os cpf's do banco de dados
	String[] cpfsDoBancoDeDados = {"12345678910","151551515144","12312312348","1456789512"};
	JComboBox comboBoxCPF = new JComboBox(cpfsDoBancoDeDados);
	
	private JButton jbExcluirCadastro = new JButton("Excluir Permanentemente");
	private JButton jbVoltarAoMenu = new JButton("Voltar ao Menu");
	
	public void montaJanelaExcluir() {
		preparaPainelExcluir();
		preparaJFrame();
		preparaBotoes();
	}
	
	public void preparaPainelExcluir() {
		
	painelTituloBusca.setLayout(new FlowLayout());
	painelTituloBusca.add(jlTituloBusca);
	
	painelBusca.setLayout(new FlowLayout());
	painelBusca.add(jlSelecione);
	painelBusca.add(comboBoxCPF);
	comboBoxCPF.setEditable(true);//deixa digitar dentro da combobox, facilitando a busca
	
	painelNome.setLayout(new FlowLayout());
	painelNome.add(jlNome);
	
	painelIdade.setLayout(new FlowLayout());
	painelIdade.add(jlIdade);
	
	painelEndereco.setLayout(new FlowLayout());
	painelEndereco.add(jlEndereco);
	
	painelTelefone.setLayout(new FlowLayout());
	painelTelefone.add(jlTelefone);
	
	painelModalidade.setLayout(new FlowLayout());
	painelModalidade.add(jlModalidade);
	
	painelBotoes.setLayout(new FlowLayout());
	painelBotoes.add(jbExcluirCadastro);
	painelBotoes.add(jbVoltarAoMenu);
	}
	
	public void preparaJFrame() {
		setLayout(new FlowLayout());
		setTitle("Athletic System - Excluir Cliente");
		//ta muito estranho a posicao dos nomes
		add(painelTituloBusca);
		add(painelBusca);
		add(painelNome);
		add(painelIdade);
		add(painelEndereco);
		add(painelTelefone);
		add(painelModalidade);
		add(painelBotoes);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(370,350);
		setVisible(true);
	}
	
	public void preparaBotoes() {
		
		jbVoltarAoMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);
				//a resolver
							
			}
			
			
		});
		
		jbExcluirCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//a resolver
							
			}
			
			
		});
	}
}

