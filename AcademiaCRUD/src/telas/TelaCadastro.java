package telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import functions.Usuario;

public class TelaCadastro extends JFrame {

	private JPanel painelTitulo = new JPanel();
	private JPanel painelCPF = new JPanel();
	private JPanel painelNome = new JPanel();
	private JPanel painelIdade = new JPanel();
	private JPanel painelEndereco = new JPanel();
	private JPanel painelTelefone = new JPanel();
	private JPanel painelModalidade = new JPanel();
	private JPanel painelBotoes = new JPanel();
	
	
	private JLabel jlTitulo = new JLabel("Atlhetic System | Cadastro de cliente");
	private JLabel jlCPF = new JLabel("CPF: ");
	private JLabel jlNome = new JLabel("Nome: ");
	private JLabel jlIdade = new JLabel("Idade: ");
	private JLabel jlEndereco = new JLabel("Endereço: ");
	private JLabel jlTelefone = new JLabel("Telefone: ");
	private JLabel jlModalidade = new JLabel("Modalidade: ");
	
	private JTextField txtCPF = new JTextField(15);
	private JTextField txtNome = new JTextField(15);
	private JTextField txtIdade = new JTextField(15);
	private JTextField txtEndereco = new JTextField(15);
	private JTextField txtTelefone = new JTextField(15);
	
	
	String[] modalidades = {"Musculação","Crossfit","Dança","Karatê","Jiu Jitsu","Natação","Ioga","Pilates","Jump","Ginastica"};
	JComboBox comboBox = new JComboBox(modalidades);
	
	private JButton jbCadastrar = new JButton("Cadastrar");
	private JButton jbVoltarAoMenu = new JButton("Voltar ao Menu");
	
	public void montaJanelaCadastro() {
		preparaPainel();
		preparaJFrame();
		preparaBotoes();
	}
	
	public void preparaPainel() {
		
		painelTitulo.setLayout(new FlowLayout());
		painelTitulo.add(jlTitulo);
		
		painelCPF.setLayout(new FlowLayout());
		painelCPF.add(jlCPF);
		painelCPF.add(txtCPF);
		
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
		painelBotoes.add(jbCadastrar);
		painelBotoes.add(jbVoltarAoMenu);
		
	}
	
	public void preparaJFrame() {
		setLayout(new FlowLayout());
		setTitle("Athletic System - Novo Cadastro");
		add(painelTitulo);
		add(painelCPF);
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
		
		Usuario dados = new Usuario();
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String CPF = txtCPF.getText();
					String Nome = txtNome.getText();
					String Idade = txtIdade.getText();
					String Endereco = txtEndereco.getText();
					String Telefone = txtTelefone.getText();
					Object modali1 = comboBox.getSelectedItem();
				
					dados.setCPF(CPF);
					dados.setNome(Nome);
					dados.setIdade(Idade);
					dados.setEndereco(Endereco);
					dados.setTelefone(Telefone);
					dados.setModalidade(comboBox.getSelectedItem());
					
					JOptionPane.showMessageDialog(null, "Os dados digitados foram:\n"
							+ "CPF: "+ CPF +"\n"
							+ "Nome: "+ Nome + "\n"
							+ "Idade: " + Idade + "\n"
							+ "Endereco: " + Endereco + "\n"
							+ "Telefone: " + Telefone + "\n"
							+ "Modalidade: " + modali1 + "\n");
							
							
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Os campos devem ser preenchidos! Erro: " + ex.toString());
					
				}
				
				
			}

		});
		
		jbVoltarAoMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaMenu().montaJanelaDoMenu();
				setVisible(false);
							
			}
			
			
		});
	}
	
}
