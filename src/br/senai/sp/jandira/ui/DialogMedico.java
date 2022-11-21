package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import br.senai.sp.jandira.model.Medico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;

public class DialogMedico extends javax.swing.JDialog {
    
    private TipoOperacao tipoOperacao;
    private Medico medico;
    
    private DefaultListModel<Especialidade> listaTodosModel = new DefaultListModel<>();
    private DefaultListModel<Especialidade> selecionadosModel = new DefaultListModel<>();
    private ArrayList<Especialidade> selecionados = new ArrayList<>();
    
    public DialogMedico(java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            Medico medico) {
        
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
        
    }
    
    private void preencherFormulario() {
        titulo.setText("Médico - " + tipoOperacao);
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/medico.png")));
        textCodigo.setText(medico.getCodigo().toString());
        textNomeMedico.setText(medico.getNome());
        textTelefone.setText(medico.getTelefone());
        
        listaTodosModel.addAll(EspecialidadesDAO.listarTodos());
       // listaTodos.setModel();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cebecalho = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        labelFicha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textNomeMedico = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textCrm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textDataNascimento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSelecionados = new javax.swing.JList<>();
        buttonDireita = new javax.swing.JButton();
        buttonEsquerda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaTodos = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        cebecalho.setBackground(new java.awt.Color(255, 255, 255));
        cebecalho.setLayout(null);

        titulo.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 153, 255));
        titulo.setText("Médico - ADICIONAR");
        cebecalho.add(titulo);
        titulo.setBounds(70, 0, 520, 50);

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/medico.png"))); // NOI18N
        cebecalho.add(icone);
        icone.setBounds(20, 0, 40, 50);

        getContentPane().add(cebecalho);
        cebecalho.setBounds(0, 0, 810, 50);

        labelFicha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) Médico(a)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(102, 153, 255))); // NOI18N
        labelFicha.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");
        labelFicha.add(jLabel1);
        jLabel1.setBounds(30, 50, 72, 20);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        labelFicha.add(textCodigo);
        textCodigo.setBounds(30, 70, 64, 22);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nome do(a) médico (a):");
        labelFicha.add(jLabel4);
        jLabel4.setBounds(260, 50, 140, 16);

        textNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeMedicoActionPerformed(evt);
            }
        });
        labelFicha.add(textNomeMedico);
        textNomeMedico.setBounds(260, 70, 450, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("CRM:");
        labelFicha.add(jLabel5);
        jLabel5.setBounds(120, 50, 116, 16);

        textCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCrmActionPerformed(evt);
            }
        });
        labelFicha.add(textCrm);
        textCrm.setBounds(120, 70, 116, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Especialidades");
        labelFicha.add(jLabel6);
        jLabel6.setBounds(40, 180, 116, 20);

        textTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefoneActionPerformed(evt);
            }
        });
        labelFicha.add(textTelefone);
        textTelefone.setBounds(30, 140, 116, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("E-mail:");
        labelFicha.add(jLabel7);
        jLabel7.setBounds(170, 120, 140, 16);

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        labelFicha.add(textEmail);
        textEmail.setBounds(170, 140, 210, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Data de Nascimento:");
        labelFicha.add(jLabel8);
        jLabel8.setBounds(420, 120, 140, 16);

        textDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascimentoActionPerformed(evt);
            }
        });
        labelFicha.add(textDataNascimento);
        textDataNascimento.setBounds(420, 140, 140, 22);

        jScrollPane1.setViewportView(listaSelecionados);

        labelFicha.add(jScrollPane1);
        jScrollPane1.setBounds(270, 220, 110, 130);

        buttonDireita.setBackground(new java.awt.Color(102, 153, 255));
        buttonDireita.setFont(new java.awt.Font("Playbill", 1, 24)); // NOI18N
        buttonDireita.setText("<<");
        buttonDireita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonDireitaMouseReleased(evt);
            }
        });
        buttonDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireitaActionPerformed(evt);
            }
        });
        labelFicha.add(buttonDireita);
        buttonDireita.setBounds(180, 230, 60, 50);

        buttonEsquerda.setBackground(new java.awt.Color(102, 153, 255));
        buttonEsquerda.setFont(new java.awt.Font("Playbill", 1, 24)); // NOI18N
        buttonEsquerda.setText(">>");
        buttonEsquerda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonEsquerdaMouseReleased(evt);
            }
        });
        buttonEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEsquerdaActionPerformed(evt);
            }
        });
        labelFicha.add(buttonEsquerda);
        buttonEsquerda.setBounds(180, 300, 60, 50);

        jScrollPane2.setViewportView(listaTodos);

        labelFicha.add(jScrollPane2);
        jScrollPane2.setBounds(30, 220, 110, 130);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Telefone:");
        labelFicha.add(jLabel9);
        jLabel9.setBounds(30, 120, 116, 20);

        getContentPane().add(labelFicha);
        labelFicha.setBounds(10, 70, 760, 370);

        buttonSalvar.setBackground(new java.awt.Color(102, 153, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/opcao-de-salvar-arquivo.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSalvar);
        buttonSalvar.setBounds(610, 460, 50, 50);

        buttonCancelar.setBackground(new java.awt.Color(102, 153, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cancelar (1).png"))); // NOI18N
        buttonCancelar.setToolTipText("cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelar);
        buttonCancelar.setBounds(680, 460, 50, 50);

        setBounds(0, 0, 827, 581);
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed

    }//GEN-LAST:event_textCodigoActionPerformed

    private void textNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeMedicoActionPerformed

    }//GEN-LAST:event_textNomeMedicoActionPerformed

    private void textCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCrmActionPerformed

    }//GEN-LAST:event_textCrmActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == tipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed
    private void atualizar() {
        medico.setNome(textNomeMedico.getText());
        medico.setCrm(textCrm.getText());
        
        medico.setCrm(textCrm.getText());
        
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
        
        Medico medico = new Medico();
        medico.setNome(textNomeMedico.getText());
        medico.setCrm(textCrm.getText());
        medico.setTelefone(textTelefone.getText());
        
        if (validarCadastro()) {
            MedicoDAO.gravar(medico);
            
            JOptionPane.showMessageDialog(
                    this,
                    "Médico gravado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
        }
    }
    
    private boolean validarCadastro() {
        
        if (textCrm.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Crm!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textCrm.requestFocus();
            
            return false;
            
        }
        
        if (textNomeMedico.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome do médico!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textNomeMedico.requestFocus();
            
            return false;
            
        }
        
        if (textTelefone.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o telefone!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textTelefone.requestFocus();
            
            return false;
            
        }
        
        if (textEmail.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o Email!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textEmail.requestFocus();
            
            return false;
            
        }
        
        if (textDataNascimento.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha a data de nascimento!",
                    "Médico",
                    JOptionPane.ERROR_MESSAGE);
            
            textDataNascimento.requestFocus();
            
            return false;
            
        }
        
        return true;
        
    }
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed
    

    private void textTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefoneActionPerformed

    }//GEN-LAST:event_textTelefoneActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed

    }//GEN-LAST:event_textEmailActionPerformed

    private void textDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascimentoActionPerformed

    }//GEN-LAST:event_textDataNascimentoActionPerformed

    private void buttonDireitaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDireitaMouseReleased

    }//GEN-LAST:event_buttonDireitaMouseReleased

    private void buttonDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireitaActionPerformed
    
    }//GEN-LAST:event_buttonDireitaActionPerformed

    private void buttonEsquerdaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEsquerdaMouseReleased

    }//GEN-LAST:event_buttonEsquerdaMouseReleased

    private void buttonEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEsquerdaActionPerformed

    }//GEN-LAST:event_buttonEsquerdaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonDireita;
    private javax.swing.JButton buttonEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel cebecalho;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel labelFicha;
    private javax.swing.JList<String> listaSelecionados;
    private javax.swing.JList<String> listaTodos;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCrm;
    private javax.swing.JTextField textDataNascimento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNomeMedico;
    private javax.swing.JTextField textTelefone;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
