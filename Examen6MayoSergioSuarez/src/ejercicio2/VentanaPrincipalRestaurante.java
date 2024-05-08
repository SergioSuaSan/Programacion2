package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class VentanaPrincipalRestaurante extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldDescripcion;
	private JTable table;
	private JTextField textFieldTotal;
	private GestorMenu gestorMenu = new GestorMenu(new File("menus.obj"));
	private GestorPlatos gestorPlatos = new GestorPlatos(new File("platos.obj"));
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());		
					VentanaPrincipalRestaurante frame = new VentanaPrincipalRestaurante();
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
	public VentanaPrincipalRestaurante() {
		setTitle("Gestión de menús");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setBounds(56, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descripción");
		lblNewLabel_1.setBounds(56, 104, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Platos");
		lblNewLabel_2.setBounds(56, 170, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setBounds(302, 336, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoCambioItem();
			}
		});
		comboBox.setBounds(141, 43, 82, 22);
		contentPane.add(comboBox);
		
		textFieldDescripcion = new JTextField();
		textFieldDescripcion.setEditable(false);
		textFieldDescripcion.setEnabled(false);
		textFieldDescripcion.setBounds(141, 101, 301, 20);
		contentPane.add(textFieldDescripcion);
		textFieldDescripcion.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(112, 163, 313, 158);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Descripci\u00F3n", "Precio"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButtonAnadir = new JButton("Añadir plato");
		btnNewButtonAnadir.setBounds(435, 170, 115, 38);
		contentPane.add(btnNewButtonAnadir);
		
		JButton btnNewButtonEliminar = new JButton("Eliminar Plato");
		btnNewButtonEliminar.setBounds(435, 219, 115, 42);
		contentPane.add(btnNewButtonEliminar);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setBounds(356, 333, 86, 20);
		contentPane.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		cargarTabla();
	}

	private void cargarTabla() {
		// TODO Auto-generated method stub
		ArrayList<Menu>lista;
		 String codigo = String.valueOf(comboBox.getSelectedItem());
	
	}

	protected void pulsadoCambioItem() {
		// TODO Auto-generated method stub
	
		
	}
}
