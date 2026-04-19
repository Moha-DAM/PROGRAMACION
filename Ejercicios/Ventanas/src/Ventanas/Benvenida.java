package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Benvenida {

	private JFrame frame;
	private JTextField textUsuario;
	private JTextField textClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Benvenida window = new Benvenida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Benvenida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 0, 255));
		frame.setBounds(100, 100, 787, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBenvenida = new JLabel("Benvenida");
		lblBenvenida.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBenvenida.setBounds(235, 20, 210, 39);
		frame.getContentPane().add(lblBenvenida);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUsuario.setBounds(121, 113, 94, 23);
		frame.getContentPane().add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(206, 113, 421, 31);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblClave = new JLabel("Clave");
		lblClave.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClave.setBounds(121, 174, 94, 23);
		frame.getContentPane().add(lblClave);
		
		textClave = new JTextField();
		textClave.setColumns(10);
		textClave.setBounds(206, 174, 421, 31);
		frame.getContentPane().add(textClave);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(0, 255, 0));
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegistrar.setBounds(235, 271, 142, 31);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                System.out.println(textUsuario.getText());		
			}
		});
		btnAceptar.setBackground(new Color(0, 255, 0));
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAceptar.setBounds(450, 271, 142, 31);
		frame.getContentPane().add(btnAceptar);
		
		
	}
}
