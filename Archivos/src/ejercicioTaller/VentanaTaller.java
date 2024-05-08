package ejercicioTaller;

import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaTaller extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private GestorArchivoIntervenciones gestorIntervenciones = new GestorArchivoIntervenciones( new File("src\\ejercicioTaller\\intervenciones.obj"));
	private GestorArchivoVehiculos gestorVehiculos = new GestorArchivoVehiculos(new File("src\\ejercicioTaller\\vehiculos.obj"));
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaTaller frame = new VentanaTaller();
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
	public VentanaTaller() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matrícula");
		lblNewLabel.setBounds(138, 46, 46, 14);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			pulsadoCambioItem();
			}
		});
		comboBox.setBounds(223, 42, 104, 22);
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 493, 162);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Fecha", "Matricula", "Coche", "Descripcion"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		//Antes de terminar el constructor pido que cargue el combobox	
		cargarCombobox();
		cargarTabla();
		
	}
	
	 protected void pulsadoCambioItem() {
		// TODO Auto-generated method stub
		 this.cargarTabla();
		
	}

	private void cargarTabla() {
		//decidir qué objetos tengo que mostrar
		 ArrayList<Intervencion> lista;
		 	//Miro en el comboBox a ver qué hay seleccionado
		 String matricula = String.valueOf(comboBox.getSelectedItem());
		 if (matricula.equals("Todas")) {
			 lista = gestorIntervenciones.getIntervenciones();
		} else {
			lista = gestorIntervenciones.getIntervenciones(matricula);

		}
		 //Preparar un array de 2 dimensiones con los datos
		 Object[][] datos = new Object[lista.size()][4];
		 for (int i = 0; i < lista.size(); i++) {
			datos[i][0] = lista.get(i).getFecha();
			datos[i][1] = lista.get(i).getMatricula();
			datos[i][2] = lista.get(i).getCoste();
			datos[i][3] = lista.get(i).getDescripcion();
		}
		 //asignar el array al model de la tabla
			table.setModel(new DefaultTableModel(
					datos,
					new String[] {
						"Fecha", "Matricula", "Coche", "Descripcion"
					}
				));
	
		
	}

	private void cargarCombobox() {
		this.comboBox.addItem("Todas");
		 for (Vehiculo v : gestorVehiculos.getVehiculos()) {
			 this.comboBox.addItem(v.getMatricula());
			
		}
	 }
}
