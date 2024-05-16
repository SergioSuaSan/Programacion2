package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCurso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldObservaciones;
	private JButton btnAnotar;
	private JComboBox comboBoxNota;
	private JComboBox comboBoxCurso;
	private JComboBox comboBoxAlumno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaCurso frame = new VentanaCurso();
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
	public VentanaCurso() {
		setTitle("Evaluación de cursos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 210, 466, 174);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Alumno", "Curso", "Nota", "Observaciones"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Seleccione alumno:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(27, 41, 137, 14);
		contentPane.add(lblNewLabel);
		
		comboBoxAlumno = new JComboBox();
		comboBoxAlumno.setBounds(207, 37, 265, 22);
		contentPane.add(comboBoxAlumno);
		
		comboBoxCurso = new JComboBox();
		comboBoxCurso.setBounds(207, 73, 265, 22);
		contentPane.add(comboBoxCurso);
		
		JLabel lblSeleccioneCurso = new JLabel("Seleccione curso:");
		lblSeleccioneCurso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccioneCurso.setBounds(60, 77, 104, 14);
		contentPane.add(lblSeleccioneCurso);
		
		comboBoxNota = new JComboBox();
		comboBoxNota.setBounds(207, 108, 265, 22);
		contentPane.add(comboBoxNota);
		
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNota.setBounds(118, 112, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblObservaciones.setBounds(60, 145, 104, 14);
		contentPane.add(lblObservaciones);
		
		btnAnotar = new JButton("Anotar");
		btnAnotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoAnotar();
			}
		});
		btnAnotar.setBounds(232, 176, 89, 23);
		contentPane.add(btnAnotar);
		
		textFieldObservaciones = new JTextField();
		textFieldObservaciones.setBounds(207, 142, 265, 20);
		contentPane.add(textFieldObservaciones);
		textFieldObservaciones.setColumns(10);
		
		cargarTabla();
	}

	private void cargarTabla() {
		// TODO Auto-generated method stub
		
	}

	protected void pulsadoAnotar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
