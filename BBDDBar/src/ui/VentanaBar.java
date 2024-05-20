package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAOLineaTicket;
import dao.DAOProductos;
import dao.DAOTicket;
import entidades.LineaTicket;
import entidades.Productos;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaBar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldTotal;
	private JButton btnPagado;
	private DAOLineaTicket daol=  new  DAOLineaTicket();
	private DAOProductos daop=  new  DAOProductos();
	private DAOTicket daot=  new  DAOTicket();
	private JTextField textFieldTicket;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBar frame = new VentanaBar();
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
	public VentanaBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 45, 300, 388);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Precio"
			}
		));
		
		textFieldTotal = new JTextField();
		textFieldTotal.setEnabled(false);
		textFieldTotal.setEditable(false);
		textFieldTotal.setBounds(46, 440, 86, 20);
		panel_1.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		btnPagado = new JButton("Pagado");
		btnPagado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPagado.setBounds(151, 439, 89, 23);
		panel_1.add(btnPagado);
		
		JLabel lblNewLabel = new JLabel("Ticket");
		lblNewLabel.setBounds(46, 11, 46, 14);
		panel_1.add(lblNewLabel);
		
		textFieldTicket = new JTextField();
		textFieldTicket.setText("");
		textFieldTicket.setBounds(110, 8, 86, 20);
		panel_1.add(textFieldTicket);
		textFieldTicket.setColumns(10);
		crearBotones();
		cargarTabla();
	}

	private void crearBotones() {
		// TODO Auto-generated method stub
		ArrayList<Productos> lista = daop.get();
		for (Productos p : lista) {
			JButton boton = new JButton();
			boton.setIcon(new javax.swing.ImageIcon(p.getImagen()));
			boton.setPreferredSize(new java.awt.Dimension(100, 100));
			boton.setName(p.getCodigo());
			boton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					pulsadoBebdida(evt);
				}
			});
			panel.add(boton);
		}
	}

	protected void pulsadoBebdida(ActionEvent evt) {
		// TODO Auto-generated method stub
		
	}

	private void cargarTabla() {
		// TODO Auto-generated method stub
		ArrayList<LineaTicket> lista = daol.get();
		Object[][] datos = new Object[lista.size()][3];
		for(int i=0;i<lista.size();i++) {
			datos[i][0]=lista.get(i).getNumeroTicket();
			datos[i][1]=lista.get(i).getCodigoProducto();
			datos[i][2]=lista.get(i).getCantidad();
		}
				table.setModel(new DefaultTableModel(
				datos,
				new String[] {
					"Producto", "Cantidad", "Precio"
				}
			));
	}
	
	
	
}
