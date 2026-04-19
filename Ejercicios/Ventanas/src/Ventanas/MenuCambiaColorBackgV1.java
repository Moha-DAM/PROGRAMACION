package Ventanas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCambiaColorBackgV1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCambiaColorBackgV1 ventanaCambiarColor = new MenuCambiaColorBackgV1();
					ventanaCambiarColor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuCambiaColorBackgV1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		menuBar.setBounds(0, 0, 436, 22);
		contentPane.add(menuBar);
		
		JMenu mnCambiarColor = new JMenu("Cambiar Color");
		mnCambiarColor.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnCambiarColor);
		
		JMenuItem mntmRojo = new JMenuItem("Rojo");
		mntmRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.red);
			}
		});
		mntmRojo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		mnCambiarColor.add(mntmRojo);
		
		JMenuItem mntmVerde = new JMenuItem("Verde");
		mntmVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		mntmVerde.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		mnCambiarColor.add(mntmVerde);
		
		JMenuItem mntmAzul = new JMenuItem("Azul");
		mntmAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		mntmAzul.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		mnCambiarColor.add(mntmAzul);

	}
	
	
}
