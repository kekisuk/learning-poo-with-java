package telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMenu extends JFrame {
	
	private JPanel painelTituloMenu = new JPanel();
	private JPanel painelBotoesMenuCadastro = new JPanel();
	private JPanel painelBotoesMenuBuscar = new JPanel();
	private JPanel painelBotoesMenuExcluir = new JPanel();
	private JPanel painelBotoesMenuAtualizar = new JPanel();
	private JPanel painelBotoesMenuSair = new JPanel();
	
	private JLabel jlTituloMenu = new JLabel("Atlhetic System | Menu Principal");
	
	private JButton jbNovoCadastro = new JButton("Cadastrar um cliente");
	private JButton jbBuscarUmCadastro = new JButton("Buscar um cliente");
	private JButton jbExcluirUmCadastro = new JButton("Excluir um cliente");
	private JButton jbAtualizarCadastro = new JButton("Atualizar cliente");
	private JButton jbSairDoPrograma = new JButton("Sair de Athletic System");
	
	public void montaJanelaDoMenu() {
		preparaPainelDosBotoes();
		preparaJFrameDoMenu();
		BotoesDoMenu();
	}
	public void preparaPainelDosBotoes() {
		painelTituloMenu.setLayout(new FlowLayout());
		painelTituloMenu.add(jlTituloMenu);
		
		painelBotoesMenuCadastro.setLayout(new FlowLayout());
		painelBotoesMenuCadastro.add(jbNovoCadastro);
		
		painelBotoesMenuBuscar.setLayout(new FlowLayout());
		painelBotoesMenuBuscar.add(jbBuscarUmCadastro);
		
		painelBotoesMenuExcluir.setLayout(new FlowLayout());
		painelBotoesMenuExcluir.add(jbExcluirUmCadastro);
		
		painelBotoesMenuAtualizar.setLayout(new FlowLayout());
		painelBotoesMenuAtualizar.add(jbAtualizarCadastro);
		
		painelBotoesMenuSair.setLayout(new FlowLayout());
		painelBotoesMenuSair.add(jbSairDoPrograma);
	}
	
	public void preparaJFrameDoMenu() {
		setLayout(new FlowLayout());
		setTitle("Athletic System - Menu");
		add(painelTituloMenu);
		add(painelBotoesMenuCadastro);
		add(painelBotoesMenuBuscar);
		add(painelBotoesMenuExcluir);
		add(painelBotoesMenuAtualizar);
		add(painelBotoesMenuSair);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(380,220);
		setVisible(true);
	}
	
	public void BotoesDoMenu(){
		
		jbNovoCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaCadastro().montaJanelaCadastro();
				setVisible(false);
							
			}
			
			
		});
		
		jbBuscarUmCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaBuscar().montaJanelaBuscar();
							
			}
			
			
		});
		
		jbAtualizarCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaAtualizar().montaJanelaAtualizar();
							
			}
			
			
		});
		
		jbExcluirUmCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaExcluir().montaJanelaExcluir();
							
			}
			
			
		});
		
		
		jbSairDoPrograma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
							
			}
			
			
		});
	}
	
}
