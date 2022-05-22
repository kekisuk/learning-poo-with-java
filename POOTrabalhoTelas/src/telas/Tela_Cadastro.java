package telas;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.sql.*;
import functions.Usuario;
import javax.swing.JOptionPane;

public class Tela_Cadastro extends javax.swing.JFrame {

    public Tela_Cadastro() {
        initComponents();
    }
    
    Usuario usuario = new Usuario();
    String CPF;
    String nome;
    String idade;
    String endereco;
    String telefone;
    Object modalidade;
                        
    private void initComponents() {

        Header = new javax.swing.JPanel();
        TextCadastro = new javax.swing.JLabel();
        ContainerButtons = new javax.swing.JPanel();
        BtMenu = new javax.swing.JButton();
        TextNome = new javax.swing.JLabel();
        TextCPF = new javax.swing.JLabel();
        TextIdade = new javax.swing.JLabel();
        TextEndereco = new javax.swing.JLabel();
        TextModalidade = new javax.swing.JLabel();
        TextTelefone = new javax.swing.JLabel();
        TextFieldCPF = new javax.swing.JTextField();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldIdade = new javax.swing.JTextField();
        TextFieldEndereco = new javax.swing.JTextField();
        TextFieldTelefone = new javax.swing.JTextField();
        ComboBoxModalidade = new javax.swing.JComboBox<>();
        BtCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextCadastro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TextCadastro.setForeground(new java.awt.Color(0, 0, 0));
        TextCadastro.setText("Athletica System | Cadastro de Cliente");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextCadastro)
                .addGap(43, 43, 43))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TextCadastro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ContainerButtons.setBackground(new java.awt.Color(204, 204, 204));
        ContainerButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtMenu.setBackground(new java.awt.Color(255, 255, 255));
        BtMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtMenu.setForeground(new java.awt.Color(0, 0, 0));
        BtMenu.setText("Voltar ao Menu");
        BtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMenuActionPerformed(evt);
            }
        });

        TextNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextNome.setForeground(new java.awt.Color(0, 0, 0));
        TextNome.setText("Nome:");

        TextCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextCPF.setText("CPF:");

        TextIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextIdade.setForeground(new java.awt.Color(0, 0, 0));
        TextIdade.setText("Idade:");

        TextEndereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextEndereco.setForeground(new java.awt.Color(0, 0, 0));
        TextEndereco.setText("Endereço:");

        TextModalidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextModalidade.setForeground(new java.awt.Color(0, 0, 0));
        TextModalidade.setText("Modalidade:");

        TextTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextTelefone.setForeground(new java.awt.Color(0, 0, 0));
        TextTelefone.setText("Telefone:");

        TextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCPFActionPerformed(evt);
            }
        });

        TextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeActionPerformed(evt);
            }
        });

        TextFieldIdade.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldIdade.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdadeActionPerformed(evt);
            }
        });

        TextFieldEndereco.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldEndereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldEndereco.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEnderecoActionPerformed(evt);
            }
        });

        TextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTelefoneActionPerformed(evt);
            }
        });

        ComboBoxModalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musculação", "Crossfit", "Dança", "Karatê", "Jiu Jitsu", "Natação", "Ioga", "Pilates", "Jump", "Ginástica" }));
        ComboBoxModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxModalidadeActionPerformed(evt);
            }
        });

        BtCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        BtCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerButtonsLayout = new javax.swing.GroupLayout(ContainerButtons);
        ContainerButtons.setLayout(ContainerButtonsLayout);
        ContainerButtonsLayout.setHorizontalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtCadastrar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerButtonsLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextModalidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextIdade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        ContainerButtonsLayout.setVerticalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextModalidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtMenu)
                    .addComponent(BtCadastrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContainerButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContainerButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                     

    private void BtMenuActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        Tela_Menu tela_menu = new Tela_Menu();
        tela_menu.setVisible(true);
        dispose();
    }                                      

    private void TextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void TextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void TextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void TextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void TextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CPF = TextFieldCPF.getText();
        nome = TextFieldNome.getText();
        idade = TextFieldIdade.getText();
        endereco = TextFieldEndereco.getText();
        telefone = TextFieldTelefone.getText();
        modalidade = ComboBoxModalidade.getSelectedItem();
        
        if(CPF.equals("") || nome.equals("") || idade.equals("") ||
                endereco.equals("") || telefone.equals("") || modalidade.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!", "Athletica System", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = (Connection) Conexao.AbrirConexao();
            UsuarioDAO sql = new UsuarioDAO((java.sql.Connection) con);
            Usuario a = new Usuario();
            a.setCPF(CPF);
            a.setNome(nome);
            a.setIdade(idade);
            a.setEndereco(endereco);
            a.setTelefone(telefone);
            a.setModalidade(modalidade);
            
            sql.Inserir_Usuario(a);
            Conexao.FecharConexao((java.sql.Connection) con);
            
            TextFieldCPF.setText("");
            TextFieldNome.setText("");
            TextFieldIdade.setText("");
            TextFieldEndereco.setText("");
            TextFieldTelefone.setText("");
            ComboBoxModalidade.setSelectedItem("");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Athletica System", JOptionPane.INFORMATION_MESSAGE);
            
            Tela_Menu tela_menu = new Tela_Menu();
            tela_menu.setVisible(true);
            
            dispose();
        }
    }                                           

    private void ComboBoxModalidadeActionPerformed(java.awt.event.ActionEvent evt) {                                                   
       
    }                                                  

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro().setVisible(true);
            }
        });
    }

                  
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtMenu;
    private javax.swing.JComboBox<String> ComboBoxModalidade;
    private javax.swing.JPanel ContainerButtons;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TextCPF;
    private javax.swing.JLabel TextCadastro;
    private javax.swing.JLabel TextEndereco;
    private javax.swing.JTextField TextFieldCPF;
    private javax.swing.JTextField TextFieldEndereco;
    private javax.swing.JTextField TextFieldIdade;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldTelefone;
    private javax.swing.JLabel TextIdade;
    private javax.swing.JLabel TextModalidade;
    private javax.swing.JLabel TextNome;
    private javax.swing.JLabel TextTelefone;
                
}
