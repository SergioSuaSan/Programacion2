package agendaGraficaConArchivo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AnadirContacto extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JTextField textFieldTelefono;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public AnadirContacto( VentanaPrincipalAgenda parent, boolean modal) {
		super(parent, modal);
		setBounds(100, 100, 325, 224);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(149, 37, 86, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(53, 40, 46, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(53, 85, 46, 14);
		contentPanel.add(lblTelefono);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(149, 82, 86, 20);
		contentPanel.add(textFieldTelefono);
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
					pulsadoCancelar();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
	private void pulsadoCancelar() {
		this.dispose();
	}
	
	private void pulsadoOK() {
		try {
			//Comprobar que los datos están completos
			if (textFieldNombre.getText().isBlank()||textFieldTelefono.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "Revisa los datos", "Error", JOptionPane.ERROR_MESSAGE);
			}
			//recoger los datos de los textFields y crear un objeto contacto
			Contacto nuevo = new Contacto(textFieldNombre.getText(), Long.parseLong(textFieldTelefono.getText()));
			//Hablar con la agenda que esá en la ventana padre y pedirle que añada el contacto
			((VentanaPrincipalAgenda)this.getParent()).getAgenda().add(nuevo);
			//Terminar
			this.dispose();
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
