
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelMedico extends javax.swing.JPanel {

    int linha;
    
    public PanelMedico() {
        initComponents();
        criarTabelaMedicos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabelaMedicos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabMedicos = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();

        setLayout(null);

        TabelaMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Médicos(as)\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(102, 153, 255))); // NOI18N
        TabelaMedicos.setForeground(new java.awt.Color(102, 153, 255));
        TabelaMedicos.setPreferredSize(new java.awt.Dimension(1050, 700));
        TabelaMedicos.setLayout(null);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(750, 402));

        tabMedicos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabMedicos.setGridColor(new java.awt.Color(0, 0, 0));
        tabMedicos.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tabMedicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabMedicosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabMedicosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabMedicos);

        TabelaMedicos.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 870, 240);

        editar.setBackground(new java.awt.Color(102, 153, 255));
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/contrato.png"))); // NOI18N
        editar.setToolTipText("Alterar");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        TabelaMedicos.add(editar);
        editar.setBounds(670, 300, 70, 50);

        adicionar.setBackground(new java.awt.Color(102, 153, 255));
        adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar-ficheiro.png"))); // NOI18N
        adicionar.setToolTipText("Adicionar");
        adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionarMouseClicked(evt);
            }
        });
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        TabelaMedicos.add(adicionar);
        adicionar.setBounds(750, 300, 60, 50);

        excluir.setBackground(new java.awt.Color(102, 153, 255));
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/remover.png"))); // NOI18N
        excluir.setToolTipText("Excluir");
        excluir.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                excluirComponentRemoved(evt);
            }
        });
        excluir.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                excluirAncestorRemoved(evt);
            }
        });
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        TabelaMedicos.add(excluir);
        excluir.setBounds(820, 300, 60, 50);

        add(TabelaMedicos);
        TabelaMedicos.setBounds(20, 20, 920, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void tabMedicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabMedicosKeyPressed

    }//GEN-LAST:event_tabMedicosKeyPressed

    private void tabMedicosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabMedicosKeyReleased

    }//GEN-LAST:event_tabMedicosKeyReleased

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked

    }//GEN-LAST:event_editarMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        linha = tabMedicos.getSelectedRow();
        if (linha != -1) {
            editar();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Selecione qual Médico você deseja editar!!",
                "Meédicos",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_editarActionPerformed
 private void editar() {

        Medico medico = MedicoDAO.getMedico(getCodigo());

        DialogMedico dialogMedico = new DialogMedico(
                null, 
                true, 
                TipoOperacao.ALTERAR,
                null);
                        

        dialogMedico.setVisible(true);
        
        criarTabelaMedicos();

    }
    private void adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseClicked

    }//GEN-LAST:event_adicionarMouseClicked

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed

        DialogMedico dialogMedico
        = new DialogMedico(
            null,
            true,
            TipoOperacao.ADICIONAR,
            null);

        dialogMedico.setVisible(true);

        criarTabelaMedicos();
    }//GEN-LAST:event_adicionarActionPerformed

    private void excluirComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_excluirComponentRemoved

    }//GEN-LAST:event_excluirComponentRemoved

    private void excluirAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_excluirAncestorRemoved

    }//GEN-LAST:event_excluirAncestorRemoved

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked

    }//GEN-LAST:event_excluirMouseClicked

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

        linha = tabMedicos.getSelectedRow();
        if (linha != -1) {
            excluir();
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Selecione qual Médico você deseja excluir!!",
                "Médicos",
                JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_excluirActionPerformed

 private void excluir() {

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja excluir o médico selecionado?",
                "Médico",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {

            MedicoDAO.excluir(getCodigo());
            criarTabelaMedicos();

        }

    }

    private Integer getCodigo() {
        String codigoStr = tabMedicos.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabelaMedicos;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabMedicos;
    // End of variables declaration//GEN-END:variables
  private void criarTabelaMedicos() {

        tabMedicos.setModel(MedicoDAO.getTableModel());

        //Desativar o Rendimensionar 
        tabMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna
        tabMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabMedicos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabMedicos.getColumnModel().getColumn(2).setPreferredWidth(300);

        //Impedir/Bloquear a movimentação das colunas
        tabMedicos.getTableHeader().setReorderingAllowed(false);

        //Impedir/bloquear a edição das células
        tabMedicos.setDefaultEditor(Object.class, null);

    }

}
