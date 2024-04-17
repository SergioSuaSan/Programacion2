package dialogoColores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class VentanaColores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton botonCambiarColor;
	private JLabel lblNewLabel;

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaColores frame = new VentanaColores();
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
	public VentanaColores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonCambiarColor = new JButton("Cambiar Color");
		botonCambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoCambiarColor();
			}
		});
		botonCambiarColor.setBounds(140, 198, 168, 23);
		contentPane.add(botonCambiarColor);
		
		lblNewLabel = new JLabel("Texto de prueba");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 49, 247, 66);
		contentPane.add(lblNewLabel);
	}
	
	
	public void pulsadoCambiarColor() {
		DialogoColores miDialogo  =new DialogoColores(this,true);
		miDialogo.setLocationRelativeTo(this); //Que aparezca donde yo estoy
		miDialogo.setVisible(true);
	}
	
}
