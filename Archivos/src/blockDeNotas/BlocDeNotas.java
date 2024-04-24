package blockDeNotas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BlocDeNotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
					BlocDeNotas frame = new BlocDeNotas();
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
	public BlocDeNotas() {
		setTitle("Bloc de notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		scrollPane.setColumnHeaderView(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoAbrir();
			}
		});
		mntmAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnArchivo.add(mntmAbrir);
		
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoGuardar();
			}
		});
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		mnArchivo.add(mntmGuardar);
		
		JMenuItem mntmGuardarComo = new JMenuItem("Guardar como");
		mntmGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			pulsadoGuardarComo();
			}
		});
		mnArchivo.add(mntmGuardarComo);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
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
			this.setTitle(gestor.getArchivo().getName() + ": bloc de notas");
		} 
	}
	
	
	private void pulsadoGuardarComo() {
		//Mostrar un dialogo para elegir el archivo donde guardar
		JFileChooser dialogo = new JFileChooser(gestor.getArchivo());
		dialogo.showSaveDialog(dialogo);
		//Ahora habrá que preguntar si han seleccionado algo
		if (dialogo.getSelectedFile() != null) {
			//Le paso el archivo al gestor
			this.gestor.setArchivo(dialogo.getSelectedFile());
			//Pasamos al gestor el archivo que debe almacenar
			gestor.setTexto(textArea.getText());
		}
	}
	
	private void pulsadoGuardar() {
		// Preguntamos si tenemos un archivo elegido
		if (gestor.getArchivo()== null)     {
			this.pulsadoGuardarComo();
		} else {
			//Ya tenemos archivo seleccionado, guardamos directamente
			gestor.setTexto(textArea.getText());
		}
	}
	
	
}
