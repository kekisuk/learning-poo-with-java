package tela;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.CalculaIMC;

public class TelaCalculaIMC extends JFrame{
	
	private JPanel painelAltura = new JPanel();
	private JPanel painelPeso = new JPanel();
	private JPanel painelBotoes = new JPanel();
	private JPanel painelResultado = new JPanel();
	
	private JLabel jlAltura = new JLabel("Altura: ");
	private JLabel jlPeso = new JLabel("Peso: ");
	private JLabel jlIMC = new JLabel("IMC: ");
	private JLabel jlResultado = new JLabel();
	
	private JTextField txtAltura = new JTextField(15);
	private JTextField txtPeso = new JTextField(15);
	
	private JButton jbCalc = new JButton("Calcular IMC");
	private JButton jbLimpar = new JButton("Limpar Campos");
	private JButton jbSair = new JButton("Sair");

	public void montaJanela() {
		preparaPainel();
		preparaJFrame();
		preparaBotoes();
	}
	
	public void preparaPainel() {
		painelAltura.setLayout(new FlowLayout());
		painelAltura.add(jlAltura);
		painelAltura.add(txtAltura);
		
		painelPeso.setLayout(new FlowLayout());
		painelPeso.add(jlPeso);
		painelPeso.add(txtPeso);
		
		painelBotoes.setLayout(new FlowLayout());
		painelBotoes.add(jbCalc);
		painelBotoes.add(jbLimpar);
		painelBotoes.add(jbSair);
		
		painelResultado.setLayout(new FlowLayout());
		painelResultado.add(jlIMC);
		painelResultado.add(jlResultado);
		
		
	}
	
	public void preparaJFrame() {
		setLayout(new FlowLayout());
		add(painelAltura);
		add(painelPeso);
		add(painelBotoes);
		add(painelResultado);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(370,200);
		setVisible(true);
	}
	
	public void preparaBotoes() {
		CalculaIMC calcula = new CalculaIMC();
		jbCalc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String altura = txtAltura.getText();
					String peso = txtAltura.getText();
					
					double IMC = calcula.calcula(altura, peso);
					
					
					jlResultado.setText(calcula.resultado(IMC));
					
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null, "Os campos devem ser preenchidos! Erro: " + ex.toString());
					
				}
				
				
			}

		});
		
		jbSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
							
			}
			
			
		});
		jbLimpar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtAltura.setText("");
				txtPeso.setText("");
			}
			
		});
	}
}
