package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadesDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        EspecialidadesDAO.criarEspecialidade();
        initPanels();

    }

    // Atributos da classe
    PanelPlanosDeSaude panelPlanosDeSaude;
    PanelEspecialidades panelEspecialidades;

    //Constantes da Classe
    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 140;
    private final int LARGURA = 950;
    private final int ALTURA = 400;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabecalho = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        icone = new javax.swing.JLabel();
        butttonPaciente = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonEspecialidade = new javax.swing.JButton();
        buttonPlano = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        PainelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        cabecalho.setBackground(new java.awt.Color(255, 255, 255));
        cabecalho.setLayout(null);

        titulo.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 153, 255));
        titulo.setText("Sistema de Agendamento de Consulta");
        cabecalho.add(titulo);
        titulo.setBounds(70, 0, 520, 60);

        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/calendario.png"))); // NOI18N
        cabecalho.add(icone);
        icone.setBounds(20, 10, 40, 40);

        getContentPane().add(cabecalho);
        cabecalho.setBounds(0, 0, 1050, 50);

        butttonPaciente.setBackground(new java.awt.Color(102, 153, 255));
        butttonPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        butttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/paciente.png"))); // NOI18N
        butttonPaciente.setToolTipText("Pacientes");
        butttonPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butttonPacienteMouseClicked(evt);
            }
        });
        butttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(butttonPaciente);
        butttonPaciente.setBounds(210, 90, 60, 60);

        buttonMedico.setBackground(new java.awt.Color(102, 153, 255));
        buttonMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/medico.png"))); // NOI18N
        buttonMedico.setToolTipText("Médicos");
        buttonMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMedicoMouseClicked(evt);
            }
        });
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(280, 90, 60, 60);

        buttonEspecialidade.setBackground(new java.awt.Color(102, 153, 255));
        buttonEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/cardapio.png"))); // NOI18N
        buttonEspecialidade.setToolTipText("Especialidades");
        buttonEspecialidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEspecialidadeMouseClicked(evt);
            }
        });
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(350, 90, 60, 60);

        buttonPlano.setBackground(new java.awt.Color(102, 153, 255));
        buttonPlano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/protecao.png"))); // NOI18N
        buttonPlano.setToolTipText("Plano de Saúde");
        buttonPlano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        buttonPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlano);
        buttonPlano.setBounds(420, 90, 60, 60);

        buttonAgenda.setBackground(new java.awt.Color(102, 153, 255));
        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/agendar.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        buttonAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAgendaMouseClicked(evt);
            }
        });
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(140, 90, 60, 60);

        buttonSair.setBackground(new java.awt.Color(255, 51, 51));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/calcular.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.setToolTipText("Sair");
        buttonSair.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                buttonSairAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        buttonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSairMouseExited(evt);
            }
        });
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(770, 100, 100, 40);

        buttonHome.setBackground(new java.awt.Color(102, 153, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagem/botao-de-inicio.png"))); // NOI18N
        buttonHome.setToolTipText("inicio");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(70, 90, 60, 60);

        PainelHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PainelHome.setMinimumSize(new java.awt.Dimension(940, 450));
        PainelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("SISACON");
        PainelHome.add(jLabel1);
        jLabel1.setBounds(90, 70, 170, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Sistema de agendamento para consultas");
        PainelHome.add(jLabel2);
        jLabel2.setBounds(90, 120, 322, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("E-mail:");
        PainelHome.add(jLabel5);
        jLabel5.setBounds(90, 190, 37, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Telefone:");
        PainelHome.add(jLabel6);
        jLabel6.setBounds(90, 210, 60, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Site:");
        PainelHome.add(jLabel7);
        jLabel7.setBounds(90, 230, 40, 40);

        jLabel3.setText("suporte@sisacon.com.br");
        PainelHome.add(jLabel3);
        jLabel3.setBounds(130, 190, 140, 40);

        jLabel4.setText("(11) 95555-5555");
        PainelHome.add(jLabel4);
        jLabel4.setBounds(150, 210, 110, 40);

        jLabel8.setText("www.sisacon.com.br");
        PainelHome.add(jLabel8);
        jLabel8.setBounds(120, 230, 140, 40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("Entre em contato");
        PainelHome.add(jLabel9);
        jLabel9.setBounds(90, 180, 160, 20);

        getContentPane().add(PainelHome);
        PainelHome.setBounds(50, 180, 850, 330);

        setBounds(0, 0, 976, 603);
    }// </editor-fold>//GEN-END:initComponents

    private void butttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonPacienteActionPerformed


    }//GEN-LAST:event_butttonPacienteActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed

    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed

    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed

    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoActionPerformed

        PainelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(true);

        buttonPlano.setBackground(new java.awt.Color(255, 51, 204));
        buttonHome.setBackground(new java.awt.Color(102, 153, 255));
        buttonEspecialidade.setBackground(new java.awt.Color(102, 153, 255));


    }//GEN-LAST:event_buttonPlanoActionPerformed

    private void buttonSairAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_buttonSairAncestorMoved

    }//GEN-LAST:event_buttonSairAncestorMoved

    private void buttonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSairMouseClicked

    }//GEN-LAST:event_buttonSairMouseClicked

    private void buttonAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAgendaMouseClicked

    }//GEN-LAST:event_buttonAgendaMouseClicked

    private void butttonPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butttonPacienteMouseClicked

    }//GEN-LAST:event_butttonPacienteMouseClicked

    private void buttonMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMedicoMouseClicked

    }//GEN-LAST:event_buttonMedicoMouseClicked

    private void buttonEspecialidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEspecialidadeMouseClicked

    }//GEN-LAST:event_buttonEspecialidadeMouseClicked

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none

    }//GEN-LAST:event_none

    private void buttonSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSairMouseExited

    }//GEN-LAST:event_buttonSairMouseExited

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        PainelHome.setVisible(true);
        panelPlanosDeSaude.setVisible(false);
        panelEspecialidades.setVisible(false);

        buttonHome.setBackground(new java.awt.Color(255, 51, 204));
        buttonPlano.setBackground(new java.awt.Color(102, 153, 255));
        buttonEspecialidade.setBackground(new java.awt.Color(102, 153, 255));

    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        PainelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(false);
        panelEspecialidades.setVisible(true);

        buttonHome.setBackground(new java.awt.Color(102, 153, 255));
        buttonPlano.setBackground(new java.awt.Color(102, 153, 255));
        buttonEspecialidade.setBackground(new java.awt.Color(255, 51, 204));
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelHome;
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPlano;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton butttonPaciente;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        panelPlanosDeSaude = new PanelPlanosDeSaude();

        panelPlanosDeSaude.setBounds(
                POSICAO_X,
                POSICAO_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(false);

        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POSICAO_X,
                POSICAO_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);

    }

}
