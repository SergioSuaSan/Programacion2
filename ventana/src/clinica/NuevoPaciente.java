package clinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevoPaciente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldDNI;
	private JTextField textFieldNombre;
	private JTextField textFieldCompania;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 * @param b 
	 * @param ventanaPrincipalClinica 
	 */
	public NuevoPaciente(VentanaPrincipalClinica padre, boolean modal) {
		super(padre, modal);
		setBounds(100, 100, 319, 243);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDNI = new JLabel("DNI");
			lblDNI.setBounds(23, 27, 71, 14);
			contentPanel.add(lblDNI);
		}
		
		textFieldDNI = new JTextField();
		textFieldDNI.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldDNI.setBounds(105, 24, 129, 20);
		contentPanel.add(textFieldDNI);
		textFieldDNI.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(23, 70, 71, 14);
		contentPanel.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(105, 67, 129, 20);
		contentPanel.add(textFieldNombre);
		
		JLabel lblCompaia = new JLabel("Compañia");
		lblCompaia.setBounds(23, 122, 71, 14);
		contentPanel.add(lblCompaia);
		
		textFieldCompania = new JTextField();
		textFieldCompania.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldCompania.setColumns(10);
		textFieldCompania.setBounds(105, 119, 129, 20);
		contentPanel.add(textFieldCompania);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					pulsadoOK();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					pulsadoCancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void pulsadoOK() {
		//Comprobación de que tengo todos los datos
		if (textFieldDNI.getText().isBlank()|| textFieldNombre.getText().isBlank()|| textFieldCompania.getText().isBlank()) {
			JOptionPane.showMessageDialog(this, "Revisa los datos", "Error", JOptionPane.ERROR_MESSAGE);
		} else {
			//Crear un Objeto Paciente con los 3 datos escritos
			Paciente nuevo = new Paciente(textFieldDNI.getText(),textFieldNombre.getText(),textFieldCompania.getText());
			//Voy a la ventana principal y guardo el paciente en la lista de espera
			((VentanaPrincipalClinica) this.getParent()).getListaDeEspera().add(nuevo);
			//desaparecer
			this.dispose();
		}
	}
	
	public void pulsadoCancel() {
		this.dispose();
	}
	
	
}
