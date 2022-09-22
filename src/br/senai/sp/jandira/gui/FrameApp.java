package br.senai.sp.jandira.gui;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameApp {
	
	//Atributos
	private String titulo;
	private int altura;
	private int largura;
	
	private void criarTela () {
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//Container
		Container painel = tela.getContentPane();
		
		//Labels e Texts
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Agendamento");
		labelTitulo.setBounds(altura, altura, largura, altura);
		
	}

}
