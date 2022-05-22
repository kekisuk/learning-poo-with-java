package telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAtualizar extends JFrame {

	private JPanel painelTituloAtualizar = new JPanel();
	private JPanel painelBusca = new JPanel();
	private JPanel painelNome = new JPanel();
	private JPanel painelIdade = new JPanel();
	private JPanel painelEndereco = new JPanel();
	private JPanel painelTelefone = new JPanel();
	private JPanel painelModalidade = new JPanel();
	private JPanel painelBotoes = new JPanel();
	
	private JLabel jlTituloAtualizar = new JLabel("Atlhetic System | Alterar dados do cliente");
	private JLabel jlSelecione = new JLabel("Selecione o CPF: ");
	private JLabel jlNome = new JLabel("Nome: ");
	private JLabel jlIdade = new JLabel("Idade: ");
	private JLabel jlEndereco = new JLabel("Endereço: ");
	private JLabel jlTelefone = new JLabel("Telefone: ");
	private JLabel jlModalidade = new JLabel("Modalidade: ");
	
	private JTextField txtNome = new JTextField(15);
	private JTextField txtIdade = new JTextField(15);
	private JTextField txtEndereco = new JTextField(15);
	private JTextField txtTelefone = new JTextField(15);
	
	//Essa string tem que importar os cpf's do banco de dados
	String[] cpfsDoBancoDeDados = {"12345678910","151551515144","12312312348","1456789512"};
	JComboBox comboBoxCPF = new JComboBox(cpfsDoBancoDeDados);
	
	String[] modalidades = {"Musculação","Crossfit","Dança","Karatê","Jiu Jitsu","Natação","Ioga","Pilates","Jump","Ginastica"};
	JComboBox comboBox = new JComboBox(modalidades);
	
	private JButton jbVoltarAoMenu = new JButton("Voltar ao Menu");
	private JButton jbAtualizar = new JButton("Atualizar Dados");
	
	public void montaJanelaAtualizar() {
		preparaPainelAtualizar();
		preparaJFrameAtualizar();
		preparaBotoes();
	}
	
	public void preparaPainelAtualizar() {
		
	painelTituloAtualizar.setLayout(new FlowLayout());
	painelTituloAtualizar.add(jlTituloAtualizar);
	
	painelBusca.setLayout(new FlowLayout());
	painelBusca.add(jlSelecione);
	painelBusca.add(comboBoxCPF);
	comboBoxCPF.setEditable(true);//deixa digitar dentro da combobox, facilitando a busca
	
	painelNome.setLayout(new FlowLayout());
	painelNome.add(jlNome);
	painelNome.add(txtNome);
	
	painelIdade.setLayout(new FlowLayout());
	painelIdade.add(jlIdade);
	painelIdade.add(txtIdade);
	
	painelEndereco.setLayout(new FlowLayout());
	painelEndereco.add(jlEndereco);
	painelEndereco.add(txtEndereco);
	
	painelTelefone.setLayout(new FlowLayout());
	painelTelefone.add(jlTelefone);
	painelTelefone.add(txtTelefone);
	
	painelModalidade.setLayout(new FlowLayout());
	painelModalidade.add(jlModalidade);
	painelModalidade.add(comboBox);
	
	painelBotoes.setLayout(new FlowLayout());
	painelBotoes.add(jbAtualizar);
	painelBotoes.add(jbVoltarAoMenu);
	}
	
	public void preparaJFrameAtualizar() {
		setLayout(new FlowLayout());
		setTitle("Athletic System - Atualização de Dados");
		add(painelTituloAtualizar);
		add(painelBusca);
		add(painelNome);
		add(painelIdade);
		add(painelEndereco);
		add(painelTelefone);
		add(painelModalidade);
		add(painelBotoes);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,350);
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
		jbAtualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//a resolver
							
			}
			
			
		});
	}
	
	
	
}
