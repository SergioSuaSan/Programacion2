package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;



public class Factura2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TCantidad;
	private JTextField Ttotal;
	private JTextField TIVA;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Factura2 frame = new Factura2();
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
	public Factura2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(85, 37, 57, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(85, 166, 57, 32);
		contentPane.add(lblTotal);
		
		TCantidad = new JTextField();
		TCantidad.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				actualizar();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				actualizar();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				actualizar();
			}
		});
		TCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		TCantidad.setBounds(152, 43, 167, 20);
		contentPane.add(TCantidad);
		TCantidad.setColumns(10);
		
		Ttotal = new JTextField();
		Ttotal.setEnabled(false);
		Ttotal.setEditable(false);
		Ttotal.setHorizontalAlignment(SwingConstants.RIGHT);
		Ttotal.setBounds(152, 172, 167, 20);
		contentPane.add(Ttotal);
		Ttotal.setColumns(10);
		
		TIVA = new JTextField();
		TIVA.setEnabled(false);
		TIVA.setEditable(false);
		TIVA.setHorizontalAlignment(SwingConstants.RIGHT);
		TIVA.setColumns(10);
		TIVA.setBounds(152, 129, 167, 20);
		contentPane.add(TIVA);
		
		JLabel lblNewLabel_1_1 = new JLabel("IVA");
		lblNewLabel_1_1.setBounds(85, 123, 57, 32);
		contentPane.add(lblNewLabel_1_1);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				actualizar();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"21", "10", "4"}));
		comboBox.setBounds(152, 81, 95, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("IVA");
		lblNewLabel_1_1_1.setBounds(85, 80, 57, 32);
		contentPane.add(lblNewLabel_1_1_1);
	}

	protected void actualizar() {
//		if (!TCantidad.getText().isBlank()) {
			
		//Obtener el IVA que debo aplicar
		int iva;

		//Hablar con el combovox para preguntar qué está seleccionado
		String textoseleccionado = comboBox.getSelectedItem().toString();
		iva = Integer.parseInt(textoseleccionado);
		//Obtener la cantidad
		try {
			double cantidad = Double.parseDouble(TCantidad.getText());
			//Hacer los cálculos
			double ivaAPagar= cantidad*iva/100;
			double total = cantidad +ivaAPagar;
			//Actualizar los campos IVA y Total
			DecimalFormat formato = new DecimalFormat("#,##0.00€");
			TIVA.setText(formato.format(ivaAPagar));
			Ttotal.setText(formato.format(total));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			TIVA.setText("");
			Ttotal.setText("");
		}
//		} else {
//			TIVA.setText("");
//			Ttotal.setText("");
//		}
	}
}
