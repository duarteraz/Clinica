
package br.senai.sp.jandira.ui;

import javax.swing.JOptionPane;


public class PanelEspecialidades extends javax.swing.JPanel {


    public PanelEspecialidades() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabelaEspecialidades = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEspecialidades = new javax.swing.JTable();
        editar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();

        setLayout(null);

        TabelaEspecialidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(102, 153, 255))); // NOI18N
        TabelaEspecialidades.setForeground(new java.awt.Color(102, 153, 255));
        TabelaEspecialidades.setPreferredSize(new java.awt.Dimension(1050, 700));
        TabelaEspecialidades.setLayout(null);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(750, 402));

        tabEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        tabEspecialidades.setGridColor(new java.awt.Color(0, 0, 0));
        tabEspecialidades.setSelectionBackground(new java.awt.Color(51, 153, 255));
        tabEspecialidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabEspecialidadesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabEspecialidadesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabEspecialidades);

        TabelaEspecialidades.add(jScrollPane1);
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
        TabelaEspecialidades.add(editar);
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
        TabelaEspecialidades.add(adicionar);
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
        TabelaEspecialidades.add(excluir);
        excluir.setBounds(820, 300, 60, 50);

        add(TabelaEspecialidades);
        TabelaEspecialidades.setBounds(20, 20, 920, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void tabEspecialidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabEspecialidadesKeyPressed

    }//GEN-LAST:event_tabEspecialidadesKeyPressed

    private void tabEspecialidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabEspecialidadesKeyReleased

    }//GEN-LAST:event_tabEspecialidadesKeyReleased

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked

    }//GEN-LAST:event_editarMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed

 
    }//GEN-LAST:event_editarActionPerformed

    private void adicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionarMouseClicked

    }//GEN-LAST:event_adicionarMouseClicked

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed

  
    }//GEN-LAST:event_adicionarActionPerformed

    private void excluirComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_excluirComponentRemoved

    }//GEN-LAST:event_excluirComponentRemoved

    private void excluirAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_excluirAncestorRemoved

    }//GEN-LAST:event_excluirAncestorRemoved

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked

    }//GEN-LAST:event_excluirMouseClicked

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed


    }//GEN-LAST:event_excluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabelaEspecialidades;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabEspecialidades;
    // End of variables declaration//GEN-END:variables
}
