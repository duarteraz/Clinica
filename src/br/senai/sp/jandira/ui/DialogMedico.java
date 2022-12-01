package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.Medico;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DialogMedico extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;

    private DefaultListModel<String> listaDasEspecialidades = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesNSelecionadas = EspecialidadesDAO.listarTodos();

    private DefaultListModel<String> listaDasEspecialidadesDoMedico = new DefaultListModel<>();
    private ArrayList<String> selecionadas = new ArrayList<>();
    private ArrayList<Especialidade> especialidadesSelecionadas = new ArrayList<>();

    public DialogMedico(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        atualizarListasEspecialidades();

        //Preencher os campos, caso o tipo de operação for EDITAR
        if (tipoOperacao == TipoOperacao.EDITAR) {
            preencherFormulario();
            atualizarListasEspecialidades();
        }

    }

    private void preencherFormulario() {
        titulo.setText("Médico - " + tipoOperacao);
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/adicionar-ficheiro.png"))); // NOI18N
        textCodigo1.setText(medico.getCodigo().toString());
        textNome.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
         textCrm.setText(medico.getCrm());
        textEmail.setText(medico.getEmail());
        textTelefone.setText(medico.getTelefone());
        textData.setText(medico.getDataNascimento());

    }
    private void atualizarListasEspecialidades() {

        especialidades = EspecialidadesDAO.getListaDeNomes();
        listaDasEspecialidades.addAll(especialidades);
        listTodos.setModel(listaDasEspecialidades);
        
        if (tipoOperacao == TipoOperacao.ADICIONAR) {

        } else {
            especialidadesSelecionadas = medico.getEspecialidades();
            selecionadas = medico.getListaDeEspecialidadesDoMedico();
            listaDasEspecialidadesDoMedico.clear();
            listaDasEspecialidadesDoMedico.addAll(selecionadas);
            listSelecionados.setModel(listaDasEspecialidadesDoMedico);

            int i = 0;
            
            for (String e : selecionadas) {
                if (especialidades.contains(e)) {
                    especialidades.remove(e);
                }
            }
            listaDasEspecialidades.clear();
            listaDasEspecialidades.addAll(especialidades);

        }

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
        adicionarEspecialidade = new javax.swing.JButton();
        removerEspecialidade = new javax.swing.JButton();

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

        jScrollPane1.setViewportView(listSelecionados);

        labelFicha1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 260, 100, 130);

        jScrollPane2.setViewportView(listTodos);

        labelFicha1.add(jScrollPane2);
        jScrollPane2.setBounds(70, 260, 100, 130);

        adicionarEspecialidade.setBackground(new java.awt.Color(102, 153, 255));
        adicionarEspecialidade.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        adicionarEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        adicionarEspecialidade.setText(">>");
        adicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarEspecialidadeActionPerformed(evt);
            }
        });
        labelFicha1.add(adicionarEspecialidade);
        adicionarEspecialidade.setBounds(180, 290, 72, 30);

        removerEspecialidade.setBackground(new java.awt.Color(102, 153, 255));
        removerEspecialidade.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        removerEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        removerEspecialidade.setText("<<");
        removerEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerEspecialidadeActionPerformed(evt);
            }
        });
        labelFicha1.add(removerEspecialidade);
        removerEspecialidade.setBounds(180, 330, 72, 30);

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
    }//GEN-LAST:event_textDataActionPerformed

    private void adicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarEspecialidadeActionPerformed
        java.util.List<String> especialidadesDoMedico = listTodos.getSelectedValuesList();

        for (String e : especialidadesDoMedico) {
            selecionadas.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (especialidadesDoMedico.contains(e.getNome())) {
                especialidadesSelecionadas.add(e);
            }
        }

        listaDasEspecialidadesDoMedico.clear();
        listaDasEspecialidadesDoMedico.addAll(selecionadas);
        listSelecionados.setModel(listaDasEspecialidadesDoMedico);

        int[] excluir = listTodos.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidades.remove(e);
            especialidades.remove(e);

        }
    }//GEN-LAST:event_adicionarEspecialidadeActionPerformed

    private void removerEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerEspecialidadeActionPerformed
java.util.List<String> removerEspecialidades = listSelecionados.getSelectedValuesList();

        for (String e : removerEspecialidades) {
            especialidades.add(e);
        }
        for (Especialidade e : especialidadesNSelecionadas) {
            if (removerEspecialidades.contains(e.getNome())) {
                especialidadesSelecionadas.remove(e);
            }
        }

        listaDasEspecialidades.clear();
        listaDasEspecialidades.addAll(especialidades);
        listTodos.setModel(listaDasEspecialidades);

        int[] excluir = listSelecionados.getSelectedIndices();
        for (int e : excluir) {
            listaDasEspecialidadesDoMedico.remove(e);
            selecionadas.remove(e);
        }
     }//GEN-LAST:event_removerEspecialidadeActionPerformed

      private void atualizar() {
        medico.setNome(textNome.getText());
        medico.setTelefone(textTelefone.getText());
        medico.setEspecialidade(especialidadesSelecionadas);
        MedicoDAO.atualizar(medico);

        if (validarCadastro()) {
            MedicoDAO.atualizar(medico);

            JOptionPane.showMessageDialog(
                    null,
                    "Médico atualizado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void gravar() {
        //        Criar um objeto plano de saúde 
        Medico medico = new Medico();
        medico.setNome(textNome.getText());
        medico.setTelefone(textTelefone.getText());
         medico.setCrm(textCrm.getText());
        medico.setEmail(textEmail.getText());
        medico.setDataNascimento(textData.getText());
        medico.setEspecialidades(especialidadesSelecionadas);

        if (validarCadastro()) {
            MedicoDAO.gravar(medico);

            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textNome.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo Nome do Médico!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            textNome.requestFocus();

            return false;
        }

        if (textTelefone.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, preencha o campo Telefone!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);

            textTelefone.requestFocus();

            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarEspecialidade;
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
    private javax.swing.JButton removerEspecialidade;
    private javax.swing.JTextField textCodigo1;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables


}
