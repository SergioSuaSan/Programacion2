package buscarTexto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import blockDeNotas.GestorArchivoTexto;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BuscarTexto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldBarraBusqueda;
	private JTextField textFieldFiltro;
	//necesito un objeto Gestor
	private GestorArchivoTexto gestor = new GestorArchivoTexto(null);
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());	
					BuscarTexto frame = new BuscarTexto();
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
	public BuscarTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 500, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldBarraBusqueda = new JTextField();
		textFieldBarraBusqueda.setEditable(false);
		textFieldBarraBusqueda.setEnabled(false);
		textFieldBarraBusqueda.setBounds(10, 12, 358, 20);
		panel.add(textFieldBarraBusqueda);
		textFieldBarraBusqueda.setColumns(10);
		
		JButton btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoAbrir();
			}
		});
		btnAbrir.setBounds(378, 11, 89, 23);
		panel.add(btnAbrir);
		
		textFieldFiltro = new JTextField();
//		textFieldFiltro.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				pulsadoFiltrar();
//			}
//		});
		textFieldFiltro.setColumns(10);
		textFieldFiltro.setBounds(10, 46, 206, 20);
		textFieldFiltro.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				pulsadoFiltrar();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				pulsadoFiltrar();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				pulsadoFiltrar();
			}
		});
		
		panel.add(textFieldFiltro);
		
		JButton btnFiltrar = new JButton("Filtrar");
		btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoFiltrar();
			}
		});
		btnFiltrar.setBounds(226, 45, 89, 23);
		panel.add(btnFiltrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 107, 500, 228);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	
	
	private void pulsadoAbrir() {
		//Debería salir un diálogo para seleccionar el archivo (JFileChooser)
		JFileChooser dialogo =new JFileChooser(gestor.getArchivo());
		dialogo.showOpenDialog(this);
		
		//Ahora hay que preguntar si han seleccionado algo
		if (dialogo.getSelectedFile()!=null) {
			//le paso el archivo al gestor
			this.gestor.setArchivo(dialogo.getSelectedFile());
			ArrayList<String> texto = this.gestor.getTexto();
			
			//Limpiar el area de texto
			textArea.setText("");
			
			//Mando el texto al textarea
			for (String string : texto) {
				textArea.append(string + "\n");
			}
			//Ponemos el nombre del archivo en el tútulo de la ventana
			this.setTitle(gestor.getArchivo().getName() + ": BuscarTexto");
			textFieldBarraBusqueda.setText(gestor.getArchivo().getAbsolutePath());
		} 
	}
	
	//Luego podemos poner una palabra para filtrar y solo deben aparecer en el área de texto las líneas que contienen esa palabra.
	private void pulsadoFiltrar() {
		// TODO Auto-generated method stub
		String filtro = textFieldFiltro.getText();

			ArrayList<String> texto = this.gestor.getTexto();
			
			//Limpiar el area de texto
			textArea.setText("");
			
			//Mando el texto al textarea
			for (String string : texto) {
				if (string.contains(filtro)) {
					textArea.append(string + "\n");					
				}
			}
			//Ponemos el nombre del archivo en el tútulo de la ventana
			this.setTitle(gestor.getArchivo().getName() + ": BuscarTexto");
			
		
		
	}
	
}
