package VentanasEjercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VentanasEjercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido1;
	private JTextField textApellido2;
	private JTextField textDniNie;
	private JTextField textEdad;
	private JTextArea textArea ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio3 frame = new VentanasEjercicio3();
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
	public VentanasEjercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 644);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 244, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Formulario de registro de usuarios");
		lblTitulo.setBackground(new Color(192, 192, 192));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblTitulo.setBounds(60, 11, 284, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(50, 64, 81, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido1 = new JLabel("Apellido1");
		lblApellido1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido1.setBounds(50, 89, 81, 14);
		contentPane.add(lblApellido1);
		
		JLabel lblApellido2 = new JLabel("Apellido2");
		lblApellido2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido2.setBounds(50, 114, 81, 14);
		contentPane.add(lblApellido2);
		
		JLabel lblDniNie = new JLabel("DNI/NIE");
		lblDniNie.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDniNie.setBounds(50, 139, 81, 14);
		contentPane.add(lblDniNie);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEdad.setBounds(50, 164, 62, 14);
		contentPane.add(lblEdad);
		
		textNombre = new JTextField();
		textNombre.setBounds(130, 63, 125, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido1 = new JTextField();
		textApellido1.setColumns(10);
		textApellido1.setBounds(130, 88, 125, 20);
		contentPane.add(textApellido1);
		
		textApellido2 = new JTextField();
		textApellido2.setColumns(10);
		textApellido2.setBounds(130, 113, 125, 20);
		contentPane.add(textApellido2);
		
		textDniNie = new JTextField();
		textDniNie.setColumns(10);
		textDniNie.setBounds(130, 138, 125, 20);
		contentPane.add(textDniNie);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(130, 163, 125, 20);
		contentPane.add(textEdad);

//ComboBox DNI/NIE --------------------------------------------------------------------------------		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DNI", "NIE"}));
		comboBox.setBounds(151, 205, 62, 25);
		contentPane.add(comboBox);
		
//BUTTON TextArea--------------------------------------------------------	
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 14));
		textArea.setBackground(new Color(241, 188, 236));
		textArea.setBounds(50, 323, 310, 254);
		contentPane.add(textArea);
		
//BUTTON Aceptar--------------------------------------------------------------------------------		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dniNieBox = comboBox.getSelectedItem().toString();
				String dniNieForm = textDniNie.getText();
				
				//DNI : 
				if(dniNieBox.equals("DNI")) {
					if(dniNieForm.matches("[0-9]{8}[A-Za-z]")) {
						datosForm();
					}else {
						textArea.setText("ERROR DNI !!!");
					}
				}else if(dniNieBox.equals("NIE")) {
					if(dniNieForm.matches("[XYZxyz][0-9]{7}[A-Za-z]")) {
						datosForm();
					}else {
						textArea.setText("ERROR NIE !!!");
					}
				}	
			}
		});
		
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(84, 275, 105, 23);
		contentPane.add(btnNewButton);
	
//BUTTON Limpiar--------------------------------------------------------------------------------		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarForm();
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpiar.setBackground(new Color(255, 164, 164));
		btnLimpiar.setBounds(225, 275, 105, 23);
		contentPane.add(btnLimpiar);
	}
	
//METODOS -----------------------------------------------------------------------
	public void datosForm() {
		textArea.setText("\nNombre : "+textNombre.getText()
		+"\nApellido1 : "+textApellido1.getText()
		+"\nApellido2 : "+textApellido2.getText()
		+"\nDniNie : " + textDniNie.getText()
		+"\nEdad : " + textEdad.getText()
		);
	}
	
	public void limpiarForm() {
		textNombre.setText("");
		textApellido1.setText("");
		textApellido2.setText("");
		textDniNie.setText("");
		textEdad.setText("");
		
		textArea.setText("") ;
	}
	
}
