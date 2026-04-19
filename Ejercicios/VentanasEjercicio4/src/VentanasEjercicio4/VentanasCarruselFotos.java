package VentanasEjercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasCarruselFotos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton primera ;
	private JButton anterior ;
	private JButton siguiente ;
	private JButton ultima ;
	private ImageIcon imageIcon1 ;
	private ImageIcon imageIcon2 ;
	private ImageIcon imageIcon3 ;
	private ImageIcon imageIcon4 ;
	private ImageIcon [] Images ;
	private JLabel lblIMG ;
	private int indexImgActual = 0 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasCarruselFotos frame = new VentanasCarruselFotos();
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
	public VentanasCarruselFotos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Carrusel de fotos");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblTitulo.setBackground(new Color(189, 227, 187));
		lblTitulo.setBounds(173, 30, 281, 34);
		contentPane.add(lblTitulo);
		
		primera = new JButton("Primera");
		primera.setBackground(new Color(241, 188, 236));
		primera.setFont(new Font("Tahoma", Font.BOLD, 16));
		primera.setBounds(225, 105, 152, 29);
		contentPane.add(primera);
		
		anterior = new JButton("Anterior");
		anterior.setFont(new Font("Tahoma", Font.BOLD, 16));
		anterior.setBackground(new Color(241, 188, 236));
		anterior.setBounds(225, 164, 152, 29);
		contentPane.add(anterior);
		
		siguiente = new JButton("Siguiente");
		siguiente.setFont(new Font("Tahoma", Font.BOLD, 16));
		siguiente.setBackground(new Color(241, 188, 236));
		siguiente.setBounds(225, 217, 152, 29);
		contentPane.add(siguiente);
		
		ultima = new JButton("Última");
		ultima.setFont(new Font("Tahoma", Font.BOLD, 16));
		ultima.setBackground(new Color(241, 188, 236));
		ultima.setBounds(225, 272, 152, 29);
		contentPane.add(ultima);
		
// Cargar imagenes	
		imageIcon1 = new ImageIcon("img/images1.jpg");
		imageIcon2 = new ImageIcon("img/images2.jpg");
		imageIcon3 = new ImageIcon("img/images3.jpg");
		imageIcon4 = new ImageIcon("img/images4.jpg");
		
		Images = new ImageIcon[4];
		Images[0] = imageIcon1 ;
		Images[1] = imageIcon2 ;
		Images[2] = imageIcon3 ;
		Images[3] = imageIcon4 ;
		
// JLabel para mostrar la imagen	
		lblIMG = new JLabel(Images[indexImgActual]);
		lblIMG.setBounds(10,311,551,282);
		contentPane.add(lblIMG);
		
		/*ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(primera);
		buttonGroup.add(anterior);
		buttonGroup.add(siguiente);
		buttonGroup.add(ultima);
		*/

		primera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indexImgActual = 0 ;
				lblIMG.setIcon(Images[indexImgActual]);	
				actualizarBotones();
			}
		});
		
		anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indexImgActual>0) {
					indexImgActual-- ;
					lblIMG.setIcon(Images[indexImgActual]);
					actualizarBotones();
				}
			}
		});
		
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indexImgActual<Images.length-1) {
					indexImgActual++;
					lblIMG.setIcon(Images[indexImgActual]);
					actualizarBotones();
				}
			}
		});
		
		ultima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indexImgActual= Images.length-1 ;
				lblIMG.setIcon(Images[indexImgActual]);
				actualizarBotones();
			}
		});		

		// Llamar a actualizarBotones() al final del constructor para inicializar el estado
		actualizarBotones();
	}
	
// Método auxiliar para habilitar/deshabilitar botones según la posición actual
	private void actualizarBotones() {
	    primera.setEnabled(indexImgActual != 0);
	    anterior.setEnabled(indexImgActual != 0);
	    siguiente.setEnabled(indexImgActual != Images.length - 1);
	    ultima.setEnabled(indexImgActual != Images.length - 1);
	}
	
}
