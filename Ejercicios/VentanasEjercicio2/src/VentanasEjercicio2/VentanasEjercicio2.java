package VentanasEjercicio2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasEjercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textVJ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasEjercicio2 frame = new VentanasEjercicio2();
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
	public VentanasEjercicio2() {
		setTitle("videos Juegos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnVideoJ1 = new JRadioButton("video juego 1");
		rdbtnVideoJ1.setBackground(new Color(255, 128, 64));
		rdbtnVideoJ1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVideoJ1.setBounds(17, 60, 149, 21);
		contentPane.add(rdbtnVideoJ1);
		
		JRadioButton rdbtnVideoJ2 = new JRadioButton("video juego 2");
		rdbtnVideoJ2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVideoJ2.setBackground(new Color(0, 255, 0));
		rdbtnVideoJ2.setBounds(17, 89, 149, 21);
		contentPane.add(rdbtnVideoJ2);
		
		JRadioButton rdbtnVideoJ3 = new JRadioButton("video juego 3");
		rdbtnVideoJ3.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVideoJ3.setBackground(new Color(128, 128, 255));
		rdbtnVideoJ3.setBounds(17, 119, 149, 21);
		contentPane.add(rdbtnVideoJ3);
		
		JRadioButton rdbtnVideoJ4 = new JRadioButton("video juego 4");
		rdbtnVideoJ4.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnVideoJ4.setBackground(new Color(255, 0, 255));
		rdbtnVideoJ4.setBounds(17, 149, 149, 21);
		contentPane.add(rdbtnVideoJ4);
		
		textVJ = new JTextField();
		textVJ.setForeground(new Color(255, 0, 0));
		textVJ.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textVJ.setBorder(null);
		textVJ.setBackground(null);
		textVJ.setBounds(58, 193, 335, 31);
		contentPane.add(textVJ);
		textVJ.setColumns(10);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnVideoJ1);
		group.add(rdbtnVideoJ2);
		group.add(rdbtnVideoJ3);
		group.add(rdbtnVideoJ4);
		
		
		rdbtnVideoJ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVJ.setText("El video juego Prefirido es:  "+rdbtnVideoJ1.getText());
			}
		});
		
		rdbtnVideoJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVJ.setText("El video juego Prefirido es:  "+rdbtnVideoJ2.getText());
			}
		});
		rdbtnVideoJ3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVJ.setText("El video juego Prefirido es:  "+rdbtnVideoJ3.getText());
			}
		});
		rdbtnVideoJ4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVJ.setText("El video juego Prefirido es:  "+rdbtnVideoJ4.getText());
			}
		});
	}
}
