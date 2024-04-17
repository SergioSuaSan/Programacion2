package ventana;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Color extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblValorRojo;
	private JSlider sliderAzul;
	private JSlider sliderVerde;
	private JLabel lblValorAzul;
	private JLabel lblValorVerde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Color frame = new Color();
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
	public Color() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		
		lblValorRojo = new JLabel("0");
		lblValorRojo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorRojo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblValorRojo.setBounds(361, 117, 51, 38);
		contentPane.add(lblValorRojo);

		
		
		lblValorAzul = new JLabel("0");
		lblValorAzul.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorAzul.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblValorAzul.setBounds(361, 192, 51, 38);
		contentPane.add(lblValorAzul);
		
		lblValorVerde = new JLabel("0");
		lblValorVerde.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorVerde.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblValorVerde.setBounds(361, 155, 51, 38);
		contentPane.add(lblValorVerde);
		
		
		JSlider sliderRojo = new JSlider();

		contentPane.setLayout(null);
		sliderRojo.setMinorTickSpacing(20);
		sliderRojo.setMaximum(255);
		
		sliderRojo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		sliderRojo.setValue(0);
		sliderRojo.setBounds(118, 129, 200, 26);
		contentPane.add(sliderRojo);
		
		sliderAzul = new JSlider();

		sliderAzul.setValue(0);
		sliderAzul.setMinorTickSpacing(20);
		sliderAzul.setMaximum(255);
		sliderAzul.setFont(new Font("Tahoma", Font.PLAIN, 30));
		sliderAzul.setBounds(118, 204, 200, 26);
		contentPane.add(sliderAzul);
		
		sliderVerde = new JSlider();

		sliderVerde.setValue(0);
		sliderVerde.setMinorTickSpacing(20);
		sliderVerde.setMaximum(255);
		sliderVerde.setFont(new Font("Tahoma", Font.PLAIN, 30));
		sliderVerde.setBounds(118, 167, 200, 26);
		contentPane.add(sliderVerde);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new java.awt.Color(0, 0, 0));
		panel.setBounds(118, 11, 204, 98);
		contentPane.add(panel);
		
		
		
		
		
		JLabel Rojo = new JLabel("R");
		Rojo.setForeground(new java.awt.Color(255, 0, 0));
		Rojo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Rojo.setBounds(55, 137, 46, 14);
		contentPane.add(Rojo);
		
		JLabel Verde = new JLabel("G");
		Verde.setFont(new Font("Dialog", Font.PLAIN, 18));
		Verde.setForeground(new java.awt.Color(0, 255, 0));
		Verde.setBounds(55, 167, 36, 14);
		contentPane.add(Verde);
		
		JLabel Azul = new JLabel("B");
		Azul.setFont(new Font("Dialog", Font.PLAIN, 18));
		Azul.setForeground(new java.awt.Color(0, 0, 255));
		Azul.setBounds(55, 204, 46, 14);
		contentPane.add(Azul);
		
		
		sliderAzul.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorAzul.setText(String.valueOf( sliderAzul.getValue()));
				panel.setBackground(new java.awt.Color(sliderRojo.getValue(),sliderVerde.getValue(),sliderAzul.getValue()));
	
			}
		});
		
		sliderRojo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorRojo.setText(String.valueOf( sliderRojo.getValue()));
				panel.setBackground(new java.awt.Color(sliderRojo.getValue(),sliderVerde.getValue(),sliderAzul.getValue()));
				
			}
		});
		sliderVerde.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValorVerde.setText(String.valueOf( sliderVerde.getValue()));
				panel.setBackground(new java.awt.Color(sliderRojo.getValue(),sliderVerde.getValue(),sliderAzul.getValue()));
			}
		});
		
		
		
	}
}
