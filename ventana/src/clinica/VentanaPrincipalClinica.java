package clinica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dialogo.Formulario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipalClinica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Prepar un atributo lista d espera
	private ListaDeEspera listaDeEspera;
	private JLabel lblNumero;

	public ListaDeEspera getListaDeEspera() {
		return listaDeEspera;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());		
					VentanaPrincipalClinica frame = new VentanaPrincipalClinica();
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
	public VentanaPrincipalClinica() {
		//Lo primero es cargar la lista de espera
		this.listaDeEspera = new ListaDeEspera();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClinicaAzarquiel = new JLabel("Clínica Azarquiel");
		lblClinicaAzarquiel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblClinicaAzarquiel.setHorizontalAlignment(SwingConstants.CENTER);
		lblClinicaAzarquiel.setBounds(103, 54, 217, 55);
		contentPane.add(lblClinicaAzarquiel);
		
		JButton btnNuevoPaciente = new JButton("Nuevo paciente");
		btnNuevoPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoNuevoPaciente();
			}
		});
		btnNuevoPaciente.setBounds(71, 175, 120, 23);
		contentPane.add(btnNuevoPaciente);
		
		JButton btnAtender = new JButton("Atender");
		btnAtender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoAtender();
			}
		});
		btnAtender.setBounds(264, 175, 89, 23);
		contentPane.add(btnAtender);
		
		JLabel lblListadeEspera = new JLabel("Lista de espera:");
		lblListadeEspera.setBounds(151, 221, 89, 14);
		contentPane.add(lblListadeEspera);
		
		lblNumero = new JLabel("0");
		lblNumero.setBounds(240, 221, 46, 14);
		contentPane.add(lblNumero);
	}
	
	public void pulsadoNuevoPaciente() {
		NuevoPaciente dialogo = new NuevoPaciente(this,true);
		dialogo.setLocationRelativeTo(this);
		dialogo.setVisible(true);
		//Cuando el dialogo termina, lo siguiente será actualizar la etiqueta de pacientes esperando
		lblNumero.setText(String.valueOf(this.listaDeEspera.size()));
	}
	
	public void pulsadoAtender() {
		try {
			Atender dialogo = new Atender(this,true);
			dialogo.setLocationRelativeTo(this);
			dialogo.setVisible(true);
			//Cuando el dialogo termina, lo siguiente será actualizar la etiqueta de pacientes esperando
			lblNumero.setText(String.valueOf(this.listaDeEspera.size()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Nadie esperando", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
