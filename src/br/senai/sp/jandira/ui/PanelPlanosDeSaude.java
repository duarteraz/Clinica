package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanosDeSaude extends javax.swing.JPanel {

    public PanelPlanosDeSaude() {
        initComponents();
         criarTabelaPlanosDeSaude();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabelaPlanos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPlanos = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1050, 595));
        setLayout(null);

        TabelaPlanos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(102, 153, 255))); // NOI18N
        TabelaPlanos.setForeground(new java.awt.Color(102, 153, 255));
        TabelaPlanos.setPreferredSize(new java.awt.Dimension(1050, 700));
        TabelaPlanos.setLayout(null);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(750, 402));

        tabPlanos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabPlanos.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Operadora", "Tipo do Plano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabPlanos.setGridColor(new java.awt.Color(0, 0, 0));
        tabPlanos.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tabPlanos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabPlanosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabPlanosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabPlanos);

        TabelaPlanos.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 870, 233);

        editar.setBackground(new java.awt.Color(102, 153, 255));
        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/contrato.png"))); // NOI18N
        editar.setToolTipText("Editar");
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
        TabelaPlanos.add(editar);
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
        TabelaPlanos.add(adicionar);
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
        TabelaPlanos.add(excluir);
        excluir.setBounds(820, 300, 60, 50);

        add(TabelaPlanos);
        TabelaPlanos.setBounds(20, 20, 920, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void tabPlanosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabPlanosKeyPressed

    }//GEN-LAST:event_tabPlanosKeyPressed

    private void tabPlanosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabPlanosKeyReleased

    }//GEN-LAST:event_tabPlanosKeyReleased

    private void excluirComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_excluirComponentRemoved

    }//GEN-LAST:event_excluirComponentRemoved

    private void excluirAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_excluirAncestorRemoved

    }//GEN-LAST:event_excluirAncestorRemoved

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked

    }//GEN-LAST:event_excluirMouseClicked

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

    int resposta = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o plano selecionado?", JOptionPane.QUESTION_MESSAGE);
                
        int linha = tabPlanos.getSelectedRow();
        
        if (linha != -1 ) {
            String codigoStr = tabPlanos.getValueAt(linha, 0).toString();
            Integer codigo = Integer.valueOf(codigoStr);
            PlanoDeSaudeDAO.excluir(codigo);
            criarTabelaPlanosDeSaude();
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione o plano que deseja excluir",
                "Plano de saúde", JOptionPane.ERROR_MESSAGE);
        }
        
         
    }//GEN-LAST:event_excluirActionPerformed

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked

    }//GEN-LAST:event_editarMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

    }//GEN-LAST:event_editarActionPerformed

    private void adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseClicked

    }//GEN-LAST:event_adicionarMouseClicked

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
      DialogPlanosDeSaude dialogPlanosDeSaude = new DialogPlanosDeSaude(null, true);
      dialogPlanosDeSaude.setVisible(true);
      
      criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_adicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabelaPlanos;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPlanos;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaPlanosDeSaude() {

        tabPlanos.setModel(PlanoDeSaudeDAO.getTableModel());

        //Desativar o Rendimensionar 
        tabPlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        //Definir a largura de cada coluna
        tabPlanos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabPlanos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabPlanos.getColumnModel().getColumn(2).setPreferredWidth(300);

        //Impedir/Bloquear a movimentação das colunas
        tabPlanos.getTableHeader().setReorderingAllowed(false);

        //Impedir/bloquear a edição das células
        tabPlanos.setDefaultEditor(Object.class, null);

    }
}
