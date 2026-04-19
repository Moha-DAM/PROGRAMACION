package Ejercicio0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio0 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textMuestra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio0 frame = new Ejercicio0();
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
	public Ejercicio0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMuestra = new JButton("Muestra");
		btnMuestra.setBackground(new Color(0, 255, 0));
		btnMuestra.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnMuestra.setBounds(176, 31, 101, 25);
		
		btnMuestra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evento) {
				mostraTexto();
			}
		});
		contentPane.add(btnMuestra);
		
		textMuestra = new JTextField();
		textMuestra.setText("¡Hey!");
		textMuestra.setForeground(new Color(255, 0, 0));
		textMuestra.setFont(new Font("Tahoma", Font.BOLD, 14));
		textMuestra.setBorder(null);
		textMuestra.setBackground(null);
		textMuestra.setBounds(125, 84, 184, 33);
		contentPane.add(textMuestra);
		textMuestra.setColumns(10);

	}
	
	public void mostraTexto() {
		String hay = textMuestra.getText();
		String hayText = "¡Hey!" ;
		
		if (hayText.equals(hay)) {
			textMuestra.setText("¡Hola mundo!");
		}else {
			textMuestra.setText("¡Hey!");
		}	
	}
	
	
}
