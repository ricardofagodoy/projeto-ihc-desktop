/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancogerente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Guto
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        dp_principal = new javax.swing.JDesktopPane();
        jp_logo = new javax.swing.JPanel();
        lb_logoTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_transacoes2 = new javax.swing.JButton();
        btn_investimentos2 = new javax.swing.JButton();
        btn_emprestimos2 = new javax.swing.JButton();
        btn_cartao = new javax.swing.JButton();
        btn_abrirFisica = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        btn_abrirContaFisica = new javax.swing.JMenuItem();
        btn_juridica = new javax.swing.JMenuItem();
        btn_compartilhada = new javax.swing.JMenuItem();
        btn_consultarInfoCliente = new javax.swing.JMenuItem();
        btn_movimentacoes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btn_emprestimos = new javax.swing.JMenuItem();
        btn_devedores = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        btn_gerarCartao = new javax.swing.JMenuItem();
        btn_cancelarCartao = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btn_transacoesGrandes = new javax.swing.JMenuItem();
        btn_estorno = new javax.swing.JMenuItem();
        btn_financiamento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btn_sobre = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CapitalBankManager");
        setBackground(new java.awt.Color(51, 153, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dp_principal.setBackground(new java.awt.Color(51, 153, 255));

        jp_logo.setBackground(new java.awt.Color(51, 153, 255));
        jp_logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jp_logo.setMaximumSize(new java.awt.Dimension(100, 500));

        lb_logoTitle.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 40)); // NOI18N
        lb_logoTitle.setForeground(new java.awt.Color(255, 255, 255));
        lb_logoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logoTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bancogerente/Images/logo/CapitalBank_MarcaM.png"))); // NOI18N

        javax.swing.GroupLayout jp_logoLayout = new javax.swing.GroupLayout(jp_logo);
        jp_logo.setLayout(jp_logoLayout);
        jp_logoLayout.setHorizontalGroup(
            jp_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_logoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_logoTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_logoLayout.setVerticalGroup(
            jp_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_logoTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_logoTitle.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPTLBNKBR=+255,85");

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        btn_transacoes2.setBackground(new java.awt.Color(51, 153, 255));
        btn_transacoes2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        btn_transacoes2.setForeground(new java.awt.Color(255, 255, 255));
        btn_transacoes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bancogerente/Images/white-banknotes-32.png"))); // NOI18N
        btn_transacoes2.setText("Transações");
        btn_transacoes2.setBorderPainted(false);
        btn_transacoes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transacoes2ActionPerformed(evt);
            }
        });

        btn_investimentos2.setBackground(new java.awt.Color(51, 153, 255));
        btn_investimentos2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        btn_investimentos2.setForeground(new java.awt.Color(255, 255, 255));
        btn_investimentos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bancogerente/Images/white-moneybox-32.png"))); // NOI18N
        btn_investimentos2.setText("Movimentações");
        btn_investimentos2.setBorderPainted(false);
        btn_investimentos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_investimentos2ActionPerformed(evt);
            }
        });

        btn_emprestimos2.setBackground(new java.awt.Color(51, 153, 255));
        btn_emprestimos2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        btn_emprestimos2.setForeground(new java.awt.Color(255, 255, 255));
        btn_emprestimos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bancogerente/Images/white-bank-32.png"))); // NOI18N
        btn_emprestimos2.setText("Empréstimos");
        btn_emprestimos2.setBorderPainted(false);
        btn_emprestimos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emprestimos2ActionPerformed(evt);
            }
        });

        btn_cartao.setBackground(new java.awt.Color(51, 153, 255));
        btn_cartao.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        btn_cartao.setForeground(new java.awt.Color(255, 255, 255));
        btn_cartao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bancogerente/Images/white-bank-cards-32.png"))); // NOI18N
        btn_cartao.setText("Gerar Cartão");
        btn_cartao.setBorderPainted(false);
        btn_cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cartaoActionPerformed(evt);
            }
        });

        btn_abrirFisica.setBackground(new java.awt.Color(51, 153, 255));
        btn_abrirFisica.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        btn_abrirFisica.setForeground(new java.awt.Color(255, 255, 255));
        btn_abrirFisica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bancogerente/Images/white-money-bag-32.png"))); // NOI18N
        btn_abrirFisica.setText("Solicitar Conta");
        btn_abrirFisica.setBorderPainted(false);
        btn_abrirFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirFisicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_abrirFisica)
                .addGap(18, 18, 18)
                .addComponent(btn_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_emprestimos2)
                .addGap(15, 15, 15)
                .addComponent(btn_investimentos2)
                .addGap(18, 18, 18)
                .addComponent(btn_transacoes2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_abrirFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_emprestimos2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_investimentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_transacoes2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout dp_principalLayout = new javax.swing.GroupLayout(dp_principal);
        dp_principal.setLayout(dp_principalLayout);
        dp_principalLayout.setHorizontalGroup(
            dp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dp_principalLayout.createSequentialGroup()
                .addGroup(dp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dp_principalLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_principalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(dp_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dp_principalLayout.setVerticalGroup(
            dp_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dp_principalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jp_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );
        dp_principal.setLayer(jp_logo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp_principal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp_principal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Capital Bank");

        jMenu5.setText("Abertura de Conta");

        btn_abrirContaFisica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_abrirContaFisica.setText("Pessoa Física");
        btn_abrirContaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirContaFisicaActionPerformed(evt);
            }
        });
        jMenu5.add(btn_abrirContaFisica);

        btn_juridica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_juridica.setText("Pessoa Jurídica");
        btn_juridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_juridicaActionPerformed(evt);
            }
        });
        jMenu5.add(btn_juridica);

        btn_compartilhada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_compartilhada.setText("Conta Compartilhada");
        btn_compartilhada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compartilhadaActionPerformed(evt);
            }
        });
        jMenu5.add(btn_compartilhada);

        jMenu1.add(jMenu5);

        btn_consultarInfoCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        btn_consultarInfoCliente.setText("Consultar Informações de Clientes");
        btn_consultarInfoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarInfoClienteActionPerformed(evt);
            }
        });
        jMenu1.add(btn_consultarInfoCliente);

        btn_movimentacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_movimentacoes.setText("Movimentações Bancárias");
        btn_movimentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_movimentacoesActionPerformed(evt);
            }
        });
        jMenu1.add(btn_movimentacoes);

        jMenu4.setText("Empréstimos");

        btn_emprestimos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_emprestimos.setText("Aprovar Empréstimos");
        btn_emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emprestimosActionPerformed(evt);
            }
        });
        jMenu4.add(btn_emprestimos);

        btn_devedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_devedores.setText("Consultar Devedores");
        btn_devedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_devedoresActionPerformed(evt);
            }
        });
        jMenu4.add(btn_devedores);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        jMenu3.setText("Cartão");

        btn_gerarCartao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_gerarCartao.setText("Gerar Cartão de Crédito");
        btn_gerarCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarCartaoActionPerformed(evt);
            }
        });
        jMenu3.add(btn_gerarCartao);

        btn_cancelarCartao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        btn_cancelarCartao.setText("Cancelar Cartão de Crédito");
        btn_cancelarCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCartaoActionPerformed(evt);
            }
        });
        jMenu3.add(btn_cancelarCartao);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator2);

        btn_transacoesGrandes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_transacoesGrandes.setText("Transações de Grandes Valores");
        btn_transacoesGrandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transacoesGrandesActionPerformed(evt);
            }
        });
        jMenu1.add(btn_transacoesGrandes);

        btn_estorno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_estorno.setText("Realizar Estornos");
        btn_estorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estornoActionPerformed(evt);
            }
        });
        jMenu1.add(btn_estorno);

        btn_financiamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        btn_financiamento.setText("Financiamento");
        btn_financiamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_financiamentoActionPerformed(evt);
            }
        });
        jMenu1.add(btn_financiamento);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        btn_sobre.setText("Sobre");
        btn_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sobreActionPerformed(evt);
            }
        });
        jMenu2.add(btn_sobre);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dp_principal)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        TelaLogin login = new TelaLogin();
        login.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        Lembretes lembretes = new Lembretes();
        this.dp_principal.add(lembretes);
        lembretes.show();
    }//GEN-LAST:event_formWindowOpened

    private void btn_abrirContaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirContaFisicaActionPerformed
        ContaFisica cFisica = new ContaFisica();
        this.dp_principal.add(cFisica);
        cFisica.show();
    }//GEN-LAST:event_btn_abrirContaFisicaActionPerformed

    private void btn_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sobreActionPerformed
        JOptionPane.showMessageDialog(null,"Desenvolvido pela AFRLS em parceria com o curso de Sistemas de Informação da PUC-Campinas.");
    }//GEN-LAST:event_btn_sobreActionPerformed

    private void btn_consultarInfoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarInfoClienteActionPerformed
       ConsultarInfo cInfo = new ConsultarInfo();
       this.dp_principal.add(cInfo);
       cInfo.show();
    }//GEN-LAST:event_btn_consultarInfoClienteActionPerformed

    private void btn_abrirFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirFisicaActionPerformed
        ContaFisica cConta = new ContaFisica();
        this.dp_principal.add(cConta);
        cConta.show();
    }//GEN-LAST:event_btn_abrirFisicaActionPerformed

    private void btn_emprestimos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emprestimos2ActionPerformed
        Emprestimos cEmpres = new Emprestimos();
        this.dp_principal.add(cEmpres);
        cEmpres.show();
    }//GEN-LAST:event_btn_emprestimos2ActionPerformed

    private void btn_gerarCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarCartaoActionPerformed
        GerarCartao gCartao = new GerarCartao();
        this.dp_principal.add(gCartao);
        gCartao.show();
    }//GEN-LAST:event_btn_gerarCartaoActionPerformed

    private void btn_cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cartaoActionPerformed
        GerarCartao gCartao = new GerarCartao();
        this.dp_principal.add(gCartao);
        gCartao.show();
    }//GEN-LAST:event_btn_cartaoActionPerformed

    private void btn_cancelarCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCartaoActionPerformed
        CancelarCartao cCartao = new CancelarCartao();
        this.dp_principal.add(cCartao);
        cCartao.show();
    }//GEN-LAST:event_btn_cancelarCartaoActionPerformed

    private void btn_transacoesGrandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transacoesGrandesActionPerformed
        Transacoes trans = new Transacoes();
        this.dp_principal.add(trans);
        trans.show();
    }//GEN-LAST:event_btn_transacoesGrandesActionPerformed

    private void btn_transacoes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transacoes2ActionPerformed
        Transacoes trans = new Transacoes();
        this.dp_principal.add(trans);
        trans.show();
    }//GEN-LAST:event_btn_transacoes2ActionPerformed

    private void btn_movimentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_movimentacoesActionPerformed
        Movimentacao mov = new Movimentacao();
        this.dp_principal.add(mov);
        mov.show();
    }//GEN-LAST:event_btn_movimentacoesActionPerformed

    private void btn_investimentos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_investimentos2ActionPerformed
        Movimentacao mov = new Movimentacao();
        this.dp_principal.add(mov);
        mov.show();
    }//GEN-LAST:event_btn_investimentos2ActionPerformed

    private void btn_estornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estornoActionPerformed
       Estorno est = new Estorno();
       this.dp_principal.add(est);
       est.show();
    }//GEN-LAST:event_btn_estornoActionPerformed

    private void btn_financiamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_financiamentoActionPerformed
        Financiamento fin = new Financiamento();
        this.dp_principal.add(fin);
        fin.show();
    }//GEN-LAST:event_btn_financiamentoActionPerformed

    private void btn_emprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emprestimosActionPerformed
       Emprestimos emp = new Emprestimos();
       this.dp_principal.add(emp);
       emp.show();
    }//GEN-LAST:event_btn_emprestimosActionPerformed

    private void btn_devedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_devedoresActionPerformed
        Devedores deve = new Devedores();
        this.dp_principal.add(deve);
        deve.show();
    }//GEN-LAST:event_btn_devedoresActionPerformed

    private void btn_juridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_juridicaActionPerformed
        ContaJuridica cJur = new ContaJuridica();
        this.dp_principal.add(cJur);
        cJur.show();
    }//GEN-LAST:event_btn_juridicaActionPerformed

    private void btn_compartilhadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compartilhadaActionPerformed
        ContaCompartilhada cCom = new ContaCompartilhada();
        this.dp_principal.add(cCom);
        cCom.show();
    }//GEN-LAST:event_btn_compartilhadaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_abrirContaFisica;
    private javax.swing.JButton btn_abrirFisica;
    private javax.swing.JMenuItem btn_cancelarCartao;
    private javax.swing.JButton btn_cartao;
    private javax.swing.JMenuItem btn_compartilhada;
    private javax.swing.JMenuItem btn_consultarInfoCliente;
    private javax.swing.JMenuItem btn_devedores;
    private javax.swing.JMenuItem btn_emprestimos;
    private javax.swing.JButton btn_emprestimos2;
    private javax.swing.JMenuItem btn_estorno;
    private javax.swing.JMenuItem btn_financiamento;
    private javax.swing.JMenuItem btn_gerarCartao;
    private javax.swing.JButton btn_investimentos2;
    private javax.swing.JMenuItem btn_juridica;
    private javax.swing.JMenuItem btn_movimentacoes;
    private javax.swing.JMenuItem btn_sobre;
    private javax.swing.JButton btn_transacoes2;
    private javax.swing.JMenuItem btn_transacoesGrandes;
    private javax.swing.JDesktopPane dp_principal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPanel jp_logo;
    private javax.swing.JLabel lb_logoTitle;
    // End of variables declaration//GEN-END:variables
}
