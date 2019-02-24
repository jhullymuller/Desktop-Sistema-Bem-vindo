package br.sc.senac.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.sc.senac.controller.AutorControler;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;

public class Sobre extends JFrame {

	private JPanel contentPane;
	private AutorControler autorControler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sobre() {
		autorControler = new AutorControler();
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 676, 549);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSobreOAutor = new JLabel("Sobre o Autor");
		lblSobreOAutor.setBounds(123, 31, 246, 22);
		lblSobreOAutor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobreOAutor.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblSobreOAutor);
		
		JLabel lblContato = new JLabel("Nome: "+ autorControler.getAutor().getNome());
		lblContato.setBounds(20, 417, 173, 36);
		contentPane.add(lblContato);
		
		JLabel lblEmail = new JLabel("idade :" + autorControler.getAutor().getIdade());
		lblEmail.setBounds(20, 454, 300, 15);
		contentPane.add(lblEmail);
		
		JLabel lblFacebookJhully = new JLabel("contato :" + autorControler.getAutor().getContato());
		lblFacebookJhully.setBounds(20, 477, 205, 15);
		contentPane.add(lblFacebookJhully);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Sobre.class.getResource("/icones/autor.png")));
		lblNewLabel.setBounds(133, 76, 314, 245);
		contentPane.add(lblNewLabel);
		
		
	}
}
