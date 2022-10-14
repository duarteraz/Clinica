/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282117
 */
public class DialogPlanosDeSaude extends javax.swing.JDialog {

    /**
     * Creates new form DialogPlanosDeSaude
     */
    public DialogPlanosDeSaude(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        cabeçalho = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        labelFicha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textOperadora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textPlano = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttpnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        cabeçalho.setBackground(new java.awt.Color(255, 255, 255));
        cabeçalho.setLayout(null);

        titulo.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 153, 255));
        titulo.setText("Planos de Saúde - ADICIONAR");
        cabeçalho.add(titulo);
        titulo.setBounds(70, 0, 520, 50);

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar-ficheiro.png"))); // NOI18N
        cabeçalho.add(icone);
        icone.setBounds(20, 0, 40, 50);

        getContentPane().add(cabeçalho);
        cabeçalho.setBounds(0, 0, 810, 50);

        labelFicha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Plano de Saúde ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 153, 255))); // NOI18N
        labelFicha.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");
        labelFicha.add(jLabel1);
        jLabel1.setBounds(60, 110, 72, 20);

        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        labelFicha.add(textCodigo);
        textCodigo.setBounds(60, 130, 64, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nome da Opradora:");
        labelFicha.add(jLabel4);
        jLabel4.setBounds(60, 170, 116, 16);

        textOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOperadoraActionPerformed(evt);
            }
        });
        labelFicha.add(textOperadora);
        textOperadora.setBounds(60, 190, 116, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo de Plano");
        labelFicha.add(jLabel5);
        jLabel5.setBounds(60, 230, 116, 16);

        textPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlanoActionPerformed(evt);
            }
        });
        labelFicha.add(textPlano);
        textPlano.setBounds(60, 250, 116, 22);

        getContentPane().add(labelFicha);
        labelFicha.setBounds(10, 70, 760, 360);

        buttonSalvar.setBackground(new java.awt.Color(102, 153, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/opcao-de-salvar-arquivo.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(630, 450, 50, 50);

        buttpnCancelar.setBackground(new java.awt.Color(102, 153, 255));
        buttpnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cancelar (1).png"))); // NOI18N
        buttpnCancelar.setToolTipText("cancelar");
        buttpnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttpnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttpnCancelar);
        buttpnCancelar.setBounds(690, 450, 50, 50);

        setBounds(0, 0, 824, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOperadoraActionPerformed

    private void textPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPlanoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textOperadora.getText());
        planoDeSaude.setTipoDoPlano(textPlano.getText());

        PlanoDeSaudeDAO.gravar(planoDeSaude);
        JOptionPane.showMessageDialog(this, "Plano de Saude Gravado com sucesso",
                "Plano de Saude", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private boolean validarCadastro() {
        if (textOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o Nome da Operadora",
                    "Plano de Saude", JOptionPane.ERROR_MESSAGE);
            textOperadora.requestFocus();

            return false;

        }

        if (textPlano.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha oTipo do Plano",
                    "Plano de Saude", JOptionPane.ERROR_MESSAGE);
            textPlano.requestFocus();

            return false;
        }

        return true;
    }


    private void buttpnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttpnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttpnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPlanosDeSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogPlanosDeSaude dialog = new DialogPlanosDeSaude(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttpnCancelar;
    private javax.swing.JPanel cabeçalho;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel labelFicha;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textOperadora;
    private javax.swing.JTextField textPlano;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}