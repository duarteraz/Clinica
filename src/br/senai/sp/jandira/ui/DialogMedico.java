package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class DialogMedico extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico med;

    public DialogMedico(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico med) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.med = med;

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    private void preencherFormulario() {
          titulo.setText("Médicos - " + tipoOperacao);
         icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar-ficheiro.png")));
        textCrm.setText(med.getCodigo().toString());
        textCrm.setText(med.getCrm());
        textNome.setText(med.getNome());
        textTelefone.setText(med.getTelefone());
        textEmail.setText(med.getEmail());
        textData.setText(med.getDataNascimento().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cebecalho = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelFicha1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCodigo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textCrm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSelecionados = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTodos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cebecalho.setBackground(new java.awt.Color(255, 255, 255));
        cebecalho.setLayout(null);

        titulo.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 153, 255));
        titulo.setText("Médicos - ADICIONAR");
        cebecalho.add(titulo);
        titulo.setBounds(70, 0, 520, 50);

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar-ficheiro.png"))); // NOI18N
        cebecalho.add(icone);
        icone.setBounds(20, 0, 40, 50);

        getContentPane().add(cebecalho);
        cebecalho.setBounds(0, 0, 810, 50);

        buttonSalvar.setBackground(new java.awt.Color(102, 153, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/opcao-de-salvar-arquivo.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(610, 520, 50, 50);

        buttonCancelar.setBackground(new java.awt.Color(102, 153, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cancelar (1).png"))); // NOI18N
        buttonCancelar.setToolTipText("cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(680, 520, 50, 50);

        labelFicha1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do Médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 153, 255))); // NOI18N
        labelFicha1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Código:");
        labelFicha1.add(jLabel2);
        jLabel2.setBounds(60, 110, 72, 20);

        textCodigo1.setEditable(false);
        textCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigo1ActionPerformed(evt);
            }
        });
        labelFicha1.add(textCodigo1);
        textCodigo1.setBounds(60, 130, 64, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("CRM");
        labelFicha1.add(jLabel6);
        jLabel6.setBounds(160, 110, 116, 16);

        textCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCrmActionPerformed(evt);
            }
        });
        labelFicha1.add(textCrm);
        textCrm.setBounds(160, 130, 116, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nome do(a) médico(a)");
        labelFicha1.add(jLabel7);
        jLabel7.setBounds(310, 110, 150, 16);

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });
        labelFicha1.add(textNome);
        textNome.setBounds(310, 130, 230, 22);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        labelFicha1.add(textTelefone);
        textTelefone.setBounds(60, 210, 150, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Telefone");
        labelFicha1.add(jLabel8);
        jLabel8.setBounds(60, 190, 116, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("E-mail");
        labelFicha1.add(jLabel9);
        jLabel9.setBounds(250, 190, 116, 16);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        labelFicha1.add(textEmail);
        textEmail.setBounds(240, 210, 260, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Data de Nascimento");
        labelFicha1.add(jLabel10);
        jLabel10.setBounds(560, 190, 116, 16);

        textData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataActionPerformed(evt);
            }
        });
        labelFicha1.add(textData);
        textData.setBounds(560, 210, 150, 22);

        listSelecionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listSelecionados);

        labelFicha1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 260, 100, 146);

        listTodos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listTodos);

        labelFicha1.add(jScrollPane2);
        jScrollPane2.setBounds(70, 260, 100, 146);

        getContentPane().add(labelFicha1);
        labelFicha1.setBounds(10, 70, 760, 430);

        setBounds(0, 0, 805, 637);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void atualizar() {
        med.setCrm(textCrm.getText());
        med.setNome(textNome.getText());
        med.setTelefone(textTelefone.getText());
        med.setEmail(textEmail.getText());
        //      med.setDataNascimento(textData.get());

        if (validarCadastro()) {

            MedicoDAO.atualizar(med);

            JOptionPane.showMessageDialog(
                    null,
                    "Médicos atualizado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();

        }
    }

    private void gravar() {
        // Criar um objeto Plano de Saúde
        Medico med = new Medico();
        med.setCrm(textCrm.getText());
        med.setNome(textNome.getText());
        med.setTelefone(textTelefone.getText());
        med.setEmail(textEmail.getText());

        if (validarCadastro()) {
            MedicoDAO.gravar(med);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico(a) gravado com sucesso!",
                    "Médicos",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textCrm.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Crm!",
                    "Médicos",
                    JOptionPane.ERROR_MESSAGE);

            textCrm.requestFocus();

            return false;

        }

        if (textNome.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome do(a) médico(a)!",
                    "Médicos",
                    JOptionPane.ERROR_MESSAGE);

            textNome.requestFocus();

            return false;

        }

        if (textTelefone.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Telefone!",
                    "Médicos",
                    JOptionPane.ERROR_MESSAGE);

            textTelefone.requestFocus();

            return false;

        }

        if (textEmail.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o E-mail!",
                    "Médicos",
                    JOptionPane.ERROR_MESSAGE);

            textEmail.requestFocus();

            return false;

        }

        return true;

    }
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigo1ActionPerformed

    private void textCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCrmActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel cebecalho;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel labelFicha1;
    private javax.swing.JList<String> listSelecionados;
    private javax.swing.JList<String> listTodos;
    private javax.swing.JTextField textCodigo1;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
