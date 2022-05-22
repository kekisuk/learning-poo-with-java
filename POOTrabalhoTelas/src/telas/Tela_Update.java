
package telas;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.sql.*;
import functions.Usuario;
import javax.swing.JOptionPane;
import static telas.Tela_Atualizar.CPFU;

public class Tela_Update extends javax.swing.JFrame {

    public Tela_Update() {
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
        TextHeader = new javax.swing.JLabel();
        ContainerButtons = new javax.swing.JPanel();
        BtCancelar = new javax.swing.JButton();
        TextNome = new javax.swing.JLabel();
        TextIdade = new javax.swing.JLabel();
        TextEndereco = new javax.swing.JLabel();
        TextModalidade = new javax.swing.JLabel();
        TextTelefone = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldIdade = new javax.swing.JTextField();
        TextFieldEndereco = new javax.swing.JTextField();
        TextFieldTelefone = new javax.swing.JTextField();
        ComboBoxModalidade = new javax.swing.JComboBox<>();
        BtAtualizar = new javax.swing.JButton();
        TextDigiteOCPF = new javax.swing.JLabel();
        TextFieldCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TextHeader.setForeground(new java.awt.Color(0, 0, 0));
        TextHeader.setText("Athletica System | Atualizar Cliente");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextHeader)
                .addGap(60, 60, 60))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TextHeader)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ContainerButtons.setBackground(new java.awt.Color(204, 204, 204));
        ContainerButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        TextNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextNome.setForeground(new java.awt.Color(0, 0, 0));
        TextNome.setText("Nome:");

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

        BtAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        BtAtualizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        BtAtualizar.setText("Atualizar");
        BtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizarActionPerformed(evt);
            }
        });

        TextDigiteOCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextDigiteOCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextDigiteOCPF.setText("CPF:");

        TextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerButtonsLayout = new javax.swing.GroupLayout(ContainerButtons);
        ContainerButtons.setLayout(ContainerButtonsLayout);
        ContainerButtonsLayout.setHorizontalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtAtualizar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerButtonsLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextModalidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextIdade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerButtonsLayout.createSequentialGroup()
                        .addComponent(TextDigiteOCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboBoxModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        ContainerButtonsLayout.setVerticalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDigiteOCPF)
                    .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(54, 54, 54)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCancelar)
                    .addComponent(BtAtualizar))
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
    }// </editor-fold>                        

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        dispose();
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

    private void ComboBoxModalidadeActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        CPF = TextFieldCPF.getText();
        nome = TextFieldNome.getText();
        idade = TextFieldIdade.getText();
        endereco = TextFieldEndereco.getText();
        telefone = TextFieldTelefone.getText();
        modalidade = ComboBoxModalidade.getSelectedItem();

        if(nome.equals("") || idade.equals("") ||
                endereco.equals("") || telefone.equals("") || modalidade.equals("")) {
            JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!", "Athletica System", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = (Connection) Conexao.AbrirConexao();
            UsuarioDAO sql = new UsuarioDAO((java.sql.Connection) con);
            
            UsuarioDAO.nome = nome;
            UsuarioDAO.idade = idade;
            UsuarioDAO.endereco = endereco;
            UsuarioDAO.telefone = telefone;
            UsuarioDAO.modalidade = (String) modalidade;
            UsuarioDAO.CPFU = CPF;
 
            sql.Atualizar_Usuario();
            Conexao.FecharConexao((java.sql.Connection) con);
            
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!", "Athletica System", JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
    }                                           

    private void TextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
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
            java.util.logging.Logger.getLogger(Tela_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Update().setVisible(true);
            }
        });
    }

                      
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JComboBox<String> ComboBoxModalidade;
    private javax.swing.JPanel ContainerButtons;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TextDigiteOCPF;
    private javax.swing.JLabel TextEndereco;
    private javax.swing.JTextField TextFieldCPF;
    private javax.swing.JTextField TextFieldEndereco;
    private javax.swing.JTextField TextFieldIdade;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldTelefone;
    private javax.swing.JLabel TextHeader;
    private javax.swing.JLabel TextIdade;
    private javax.swing.JLabel TextModalidade;
    private javax.swing.JLabel TextNome;
    private javax.swing.JLabel TextTelefone;
                     
}
