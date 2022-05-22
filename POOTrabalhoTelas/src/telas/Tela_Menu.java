
package telas;


public class Tela_Menu extends javax.swing.JFrame {

    public Tela_Menu() {
        initComponents();
    }
                        
    private void initComponents() {

        ContainerButtons = new javax.swing.JPanel();
        BtCadastrar = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtAtualizar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        TextMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContainerButtons.setBackground(new java.awt.Color(204, 204, 204));
        ContainerButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        BtCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        BtCadastrar.setText("Cadastrar Cliente");
        BtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastrarActionPerformed(evt);
            }
        });

        BtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BtBuscar.setText("Buscar Cliente");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtExcluir.setBackground(new java.awt.Color(255, 255, 255));
        BtExcluir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtExcluir.setForeground(new java.awt.Color(0, 0, 0));
        BtExcluir.setText("Excluir Cliente");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        BtAtualizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        BtAtualizar.setText("Atualizar Cliente");
        BtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizarActionPerformed(evt);
            }
        });

        BtSair.setBackground(new java.awt.Color(255, 255, 255));
        BtSair.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtSair.setForeground(new java.awt.Color(0, 0, 0));
        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerButtonsLayout = new javax.swing.GroupLayout(ContainerButtons);
        ContainerButtons.setLayout(ContainerButtonsLayout);
        ContainerButtonsLayout.setHorizontalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerButtonsLayout.createSequentialGroup()
                        .addComponent(BtSair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerButtonsLayout.createSequentialGroup()
                        .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtCadastrar))
                        .addGap(18, 18, 18)
                        .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        ContainerButtonsLayout.setVerticalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastrar)
                    .addComponent(BtBuscar))
                .addGap(18, 18, 18)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtExcluir)
                    .addComponent(BtAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(BtSair)
                .addContainerGap())
        );

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextMenu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TextMenu.setForeground(new java.awt.Color(0, 0, 0));
        TextMenu.setText("Athletica System | Menu Principal");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TextMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TextMenu)
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(ContainerButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void BtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        Tela_Cadastro tela_cadastro = new Tela_Cadastro();
        tela_cadastro.setVisible(true);
        setVisible(false);
    }                                           

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
       
        System.exit(0);
    }                                      

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        Tela_Buscar tela_buscar = new Tela_Buscar();
        tela_buscar.setVisible(true);
        setVisible(false);
    }                                        

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        Tela_Excluir tela_excluir = new Tela_Excluir();
        tela_excluir.setVisible(true);
        setVisible(false);
    }                                         

    private void BtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        Tela_Atualizar tela_atualizar = new Tela_Atualizar();
        tela_atualizar.setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Menu().setVisible(true);
            }
        });
    }
                  
    private javax.swing.JButton BtAtualizar;
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtSair;
    private javax.swing.JPanel ContainerButtons;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TextMenu;
                    
}
