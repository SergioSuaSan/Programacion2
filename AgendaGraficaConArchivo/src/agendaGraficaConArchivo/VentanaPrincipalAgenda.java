package agendaGraficaConArchivo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaPrincipalAgenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//Atributo Agenda
	private Agenda agenda;
	private JTable table;
	File archivo = new File("contacto.obj");

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			guardarAgenda();
			}
		});
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
		
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			this.agenda = (Agenda) stream.readObject();
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado"	);
			//Si salta esta excepcion es porque no se ha creado el archivo
			//debe ser la primera vez que ejecutamos la aplicación
			//En ese caso creamos una agenda en blanco
			this.agenda = new Agenda();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de escritura");
			this.archivo.delete();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
	System.out.println("Error: ");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		
	
		}
	
	private void guardarAgenda() {
		
		ObjectOutputStream stream = null;
		
		try {
			stream =new ObjectOutputStream(new FileOutputStream(archivo));
			stream.writeObject(this.agenda);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de escritura");
			e.printStackTrace();
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error al cerrar");
			}
		}

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
