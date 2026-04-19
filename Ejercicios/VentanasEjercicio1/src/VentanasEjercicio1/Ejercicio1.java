package VentanasEjercicio1;

import java.awt.EventQueue;

import java.awt.Font;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsuario.setBounds(40, 42, 94, 24);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(40, 94, 94, 24);
		contentPane.add(lblPassword);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textUsuario.setBounds(144, 47, 190, 19);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPassword.setBounds(144, 99, 190, 19);
		contentPane.add(txtPassword);
		
//-----------------------------------------------------------------------------------------------		
		JButton btnValidar = new JButton("Validar");
		btnValidar.setBackground(new Color(0, 255, 0));
		btnValidar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnValidar.setBounds(198, 150, 94, 21);
		
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();		
			}
		});
		contentPane.add(btnValidar);
//-----------------------------------------------------------------------------------------------

	}
	
	private void login() {
		String usuarioValido = "admin";
		String passwordValido = "123" ;
		String usuario = textUsuario.getText();
		String password = new String(txtPassword.getPassword());
		
		if((usuario.equals(usuarioValido)) && (password.equals(passwordValido))) {
			JOptionPane.showMessageDialog(null, "Bienvenido");
			
		}else {
			JOptionPane.showMessageDialog(null, "User o password desconocido !!");
		}
	}
	
	
}
