package br.sc.senac.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icones/icons8-seguran\u00E7a-verificada.png")));
		setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.background"));
		setType(Type.UTILITY);
		setFont(new Font("Century Schoolbook L", Font.BOLD | Font.ITALIC, 12));
		setTitle("Bem - Vindos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/jhully/\u00C1rea de Trabalho/Seja-bem-vindo..jpg"));
		lblNewLabel.setBounds(48, 90, 625, 349);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.shadow"));
		menuBar.setBounds(0, 0, 685, 42);
		contentPane.add(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-lista-com-marcadores.png")));
		mnInicio.setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.shadow"));
		menuBar.add(mnInicio);
		
		JMenu mnAutor = new JMenu("Autor");
		mnAutor.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-verifique-macho.png")));
		mnAutor.setBackground(UIManager.getColor("OptionPane.errorDialog.titlePane.shadow"));
		menuBar.add(mnAutor);
		
		JMenuItem mntmSobreAutor = new JMenuItem("Sobre Autor");
		mntmSobreAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
				
				
			}

			

			
		});
		mnAutor.add(mntmSobreAutor);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Seja Bem Vindo");
			}
		});
		btnNewButton.setBounds(296, 64, 117, 25);
		contentPane.add(btnNewButton);
	}
}
