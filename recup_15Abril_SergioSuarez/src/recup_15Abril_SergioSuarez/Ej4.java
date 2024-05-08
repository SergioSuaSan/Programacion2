package recup_15Abril_SergioSuarez;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Ej4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldKm;
	private JLabel lblResultado;
	private JCheckBox chckbxIdaYVuelta;
	private JCheckBox chckbxMaletas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 frame = new Ej4();
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					frame.setLocationRelativeTo(null);
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
	public Ej4() {
		setTitle("Taxímetro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculaElPresupuesto = new JLabel("Calcula el presupuesto de tu taxi");
		lblCalculaElPresupuesto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCalculaElPresupuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculaElPresupuesto.setBounds(10, 34, 551, 35);
		contentPane.add(lblCalculaElPresupuesto);
		
		JLabel lblkmDeDistancia = new JLabel("Km de distancia:");
		lblkmDeDistancia.setBounds(63, 97, 86, 14);
		contentPane.add(lblkmDeDistancia);
		
		textFieldKm = new JTextField();
		textFieldKm.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldKm.setBounds(162, 94, 86, 20);
		contentPane.add(textFieldKm);
		textFieldKm.setColumns(10);
		
		chckbxIdaYVuelta = new JCheckBox("Ida y vuelta");


		chckbxIdaYVuelta.setBounds(162, 157, 97, 23);
		contentPane.add(chckbxIdaYVuelta);
		
		chckbxMaletas = new JCheckBox("Maletas (suplemento del 15%)");
		chckbxMaletas.setBounds(162, 183, 217, 23);
		contentPane.add(chckbxMaletas);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoCalcular();
			}
		});
		btnCalcular.setBounds(162, 229, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTotal.setBounds(362, 118, 56, 29);
		contentPane.add(lblTotal);
		
		lblResultado = new JLabel("00.00");
		lblResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado.setBounds(414, 118, 81, 29);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel = new JLabel("Precio por km: 0,30€");
		lblNewLabel.setBounds(439, 270, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultado_1 = new JLabel("€");
		lblResultado_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultado_1.setBounds(498, 118, 22, 29);
		contentPane.add(lblResultado_1);

	}
		
	private void pulsadoCalcular() {
		double km = 0, resultado;
		if (textFieldKm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Tienes que poner los km", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				km =	 Integer.parseInt(	textFieldKm.getText());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		if (chckbxIdaYVuelta.isSelected()&&chckbxMaletas.isSelected()) {
			resultado = km*0.30*2*1.15;			
			lblResultado.setText(String.valueOf(resultado));
		} else if (chckbxMaletas.isSelected()) {
			resultado = km*0.30*1.15;			
			lblResultado.setText(String.valueOf(resultado));	 		
		} else if (chckbxIdaYVuelta.isSelected()) {
		resultado = km*0.30*2;
		lblResultado.setText(String.valueOf(resultado));
		} else {
			resultado = km*0.30;
			lblResultado.setText(String.valueOf(resultado));			
		}
	}



}
