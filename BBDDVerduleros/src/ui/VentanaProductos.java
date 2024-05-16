package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.DAOGrupos;
import dao.DAOProductos;
import entidades.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaProductos extends JFrame {

	private static final long serialVersionUID = 1L;
	private DAOProductos daoProductos = new DAOProductos();
	private DAOGrupos daoGrupos = new DAOGrupos();
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldIdProducto;
	private JTextField textFieldNombreProducto;
	private JTextField textFieldPrecio;
	private JComboBox comboBoxGrupo;
	private JButton btnModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					VentanaProductos frame = new VentanaProductos();
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
	public VentanaProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(71, 79, 445, 160);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			pulsadoTabla();
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"IdProducto", "Nombre", "Grupo", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Gestión de la Fruterría");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(154, 30, 240, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("IdProducto");
		lblNewLabel_1.setBounds(71, 271, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldIdProducto = new JTextField();
		textFieldIdProducto.setEditable(false);
		textFieldIdProducto.setBounds(165, 268, 46, 20);
		contentPane.add(textFieldIdProducto);
		textFieldIdProducto.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setBounds(71, 299, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textFieldNombreProducto = new JTextField();
		textFieldNombreProducto.setColumns(10);
		textFieldNombreProducto.setBounds(165, 296, 86, 20);
		contentPane.add(textFieldNombreProducto);
		
		JLabel lblNewLabel_1_2 = new JLabel("Grupo");
		lblNewLabel_1_2.setBounds(71, 329, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Precio");
		lblNewLabel_1_3.setBounds(71, 362, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(165, 359, 86, 20);
		contentPane.add(textFieldPrecio);
		
		comboBoxGrupo = new JComboBox();
		comboBoxGrupo.setModel(new DefaultComboBoxModel(new String[] {"Hortalizas", "Frutas", "Verduras"}));
		comboBoxGrupo.setBounds(165, 325, 86, 22);
		contentPane.add(comboBoxGrupo);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoModificar();
			}
		});
		btnModificar.setBounds(305, 309, 89, 23);
		contentPane.add(btnModificar);
		cargarTabla();
	}
	
	protected void pulsadoTabla() {
		// TODO Auto-generated method stub
		//Buscar el producto seleccionado
		Producto p = daoProductos.get((Integer)( table.getValueAt(table.getSelectedRow(), 0)));
		//Rellenar ls datos en cada  campo
		textFieldIdProducto.setText( String.valueOf(p.getIdProducto()));
		textFieldPrecio.setText(String.valueOf( p.getPrecio()));
		textFieldNombreProducto.setText(String.valueOf( p.getNombre()));
	}

	//Cargamos los objetos productos en la tabla
	private void cargarTabla() {
		//Obtener los objetos
		ArrayList<Producto> lista = daoProductos.get();
		//Preparar un array bidimensional
		Object [][] datos = new Object [lista.size()][4];
		//Rellenar el array
		DecimalFormat formato  = new DecimalFormat("#0.00€");
		for (int i = 0; i < datos.length; i++) {
			datos [i][0] = lista.get(i).getIdProducto();
			datos [i][1] = lista.get(i).getNombre();
			datos [i][2] = daoGrupos.get(lista.get(i).getIdGrupo()).getNombre();
			datos [i][3] = formato.format( lista.get(i).getPrecio());
		}
		//visualizar datos
		table.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"IdProducto", "Nombre", "Grupo", "Precio"
				}
			));
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
		table.getColumnModel().getColumn(3).setCellRenderer(dtcr);
	}
	
	private void pulsadoModificar() {
		try {
			Producto p = new Producto(Integer.parseInt(textFieldIdProducto.getText())
														, textFieldNombreProducto.getText()
														, daoGrupos.get( (String) comboBoxGrupo.getSelectedItem() ).getIdGrupo()
														, Double.parseDouble(textFieldPrecio.getText()));
			daoProductos.update(p);
			cargarTabla();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "Controla el precio", "error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
