/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancogerente;
import javax.swing.JCheckBox;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
/**
 *
 * @author Guto
 */
public class Emprestimos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Emprestimos
     */
    public Emprestimos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_emprestimos = new javax.swing.JTable();
        btn_fechar = new javax.swing.JButton();
        btn_enviar = new javax.swing.JButton();
        btn_info4 = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Empréstimos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        table_emprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Antonio Souza", "A", "1500", "21/07/2015", "(19)98855654", null},
                {"Felipe Rubens", "B", "8500", "21/07/2015", "(19)33255688", null},
                {"Erick Berns", "B", "1200", "21/07/2015", "(19)33255338", null},
                {"Dexter Morgan", "D", "10000", "21/07/2015", "(19)99255688", null},
                {"Berry Allen", "A", "5800", "21/07/2015", "(19)33255688", null},
                {"Will Smith", "C", "6520", "21/07/2015", "(19)33255688", null},
                {"Oliver Queen", "A", "9000", "21/07/2015", "(21)33255688", null},
                {"Bruce Wayne", "A", "152", "21/07/2015", "(19)33255688", null},
                {"Tony Stark", "A", "200", "21/07/2015", "(19)33255688", null},
                {"Steve Rogers", "C", "845", "21/07/2015", "(19)33255688", null},
                {"Hannah Montana", "B", "785", "22/07/2015", "(19)33255688", null},
                {"Ashley Morgan", "C", "1200", "22/07/2015", "(19)33255688", null},
                {"Jennifer Anniston", "A", "5880", "22/07/2015", "(19)33255688", null},
                {"Monica Corners", "C", "15000", "22/07/2015", "(19)33255688", null},
                {"Henrique Cardoso", "C", "2555", "22/07/2015", "(19)33255688", null}
            },
            new String [] {
                "Nome", "Confiabilidade", "Valor (R$)", "Data de Vencimento", "Telefone", "Aprovar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_emprestimos);

        btn_fechar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_fechar.setText("Fechar");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        btn_enviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_enviar.setText("Enviar Respostas");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        btn_info4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_info4.setText("Mais Informações");
        btn_info4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_info4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_fechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_info4)
                        .addGap(168, 168, 168)
                        .addComponent(btn_enviar)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_fechar)
                    .addComponent(btn_enviar)
                    .addComponent(btn_info4))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        JCheckBox checkBox = new javax.swing.JCheckBox();
        table_emprestimos.getColumn("Aprovar").setCellEditor(new DefaultCellEditor(checkBox));
    }//GEN-LAST:event_formComponentShown

    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btn_fecharActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        JOptionPane.showMessageDialog(null,"Respostas Enviadas.");
        this.setVisible(false);
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void btn_info4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_info4ActionPerformed
        JOptionPane.showMessageDialog(null,"Antonio Souza, Agencia 1819 Conta:99099-9, Confiabilidade: Classe A.");
    }//GEN-LAST:event_btn_info4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_fechar;
    private javax.swing.JToggleButton btn_info4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_emprestimos;
    // End of variables declaration//GEN-END:variables
}
