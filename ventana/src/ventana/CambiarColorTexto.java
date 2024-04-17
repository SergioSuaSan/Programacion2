package ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CambiarColorTexto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTextoDePrueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambiarColorTexto frame = new CambiarColorTexto();
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
	public CambiarColorTexto() {
		setTitle("Cambiar el color de texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ButtonAzul = new JButton("Azul");
		ButtonAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTextoDePrueba.setForeground(Color.BLUE);
			}
		});
		ButtonAzul.setBounds(65, 163, 89, 23);
		contentPane.add(ButtonAzul);
		
		JButton ButtonRojo = new JButton("Rojo");
		ButtonRojo.setBounds(174, 163, 89, 23);
		contentPane.add(ButtonRojo);
		
		JButton ButtonVerde = new JButton("Verde");
		ButtonVerde.setBounds(289, 163, 89, 23);
		contentPane.add(ButtonVerde);
		
		lblTextoDePrueba = new JLabel("Texto de Prueba");
		lblTextoDePrueba.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTextoDePrueba.setBounds(65, 50, 313, 56);
		contentPane.add(lblTextoDePrueba);
	}
}
