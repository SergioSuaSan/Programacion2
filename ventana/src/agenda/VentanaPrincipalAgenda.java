package agenda;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipalAgenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Atributo Agenda
	private Agenda agenda;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());		
					VentanaPrincipalAgenda frame = new VentanaPrincipalAgenda();
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
	public VentanaPrincipalAgenda() {
		//Lo primero al poner un atributo nuevo es ponerlo en el constructor
		cargarAgenda();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoanadir();
			}
		});
		btnAnadir.setBounds(64, 184, 89, 23);
		contentPane.add(btnAnadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoEliminar();
			}
		});
		btnEliminar.setBounds(250, 184, 89, 23);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 29, 275, 128);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Nombre", "Tel\u00E9fono"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(125);
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		//antes de acabar el constructor
		cargarTabla();
	}//Fin del contstructor
	
	private void cargarAgenda() {
		/*
		 * Aquí conextaré con una BDD o con un archivo donde estará guardada la agenda
		 * 
		 * Como no tenemos ni idea vamos a crear una agenda en blanco y le añadimos algún
		 * contacto para que parezca que funciona     
		 */
		this.agenda = new Agenda();
		this.agenda.add(new Contacto("Laura", 789789789));
		this.agenda.add(new Contacto("Marcos", 258929525));
		this.agenda.add(new Contacto("Laura2", 784564565));
		this.agenda.add(new Contacto("Laura3", 712312319));
		}
	
	private void cargarTabla() {
		//Este método sirve para cargar todos los contactos de la agenda en la tabla
		//Primer paso, Tengo que crear un array para preparar los datos
		Object [][] datos = new Object[agenda.length()][2];
		ArrayList<Contacto> lista = this.agenda.getListaDeContactos();
		//Relleno el array con los datos
		for (int i = 0; i < datos.length; i++) {
			datos[i][0] = lista.get(i).getNombre();
			datos[i][1] = lista.get(i).getTelefono();
		}
		//cargo el modelo
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"Nombre", "Tel\u00E9fono"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, Long.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
					false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(125);
			table.getColumnModel().getColumn(1).setPreferredWidth(125);
			table.setFillsViewportHeight(true);
	}
	
	
	public void pulsadoanadir() {
		AnadirContacto dialogo = new AnadirContacto(this,true);
		dialogo.setLocationRelativeTo(this);
		dialogo.setVisible(true);
		cargarTabla();
	}
	
	
	
	public void pulsadoEliminar() {

		int filaseleccionada = table.getSelectedRow();
		if (filaseleccionada == -1) {
			JOptionPane.showMessageDialog(this, "No hay fila seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			//Pregunto por si acaso no están seguros
			int opcionelegida = JOptionPane.showConfirmDialog(this, "¿Realmente quieres borrar ese contacto?","Confirmar", JOptionPane.YES_NO_OPTION);
			if (opcionelegida == JOptionPane.YES_OPTION) {
				//Borro el contacto
				this.agenda.delete(this.agenda.get(filaseleccionada));
				cargarTabla();
			} else {

			}
		}
	}

	
	
	public Agenda getAgenda() {
		return agenda;
	}
	
	
	
}
