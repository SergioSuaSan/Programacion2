package clinica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Atender extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public Atender(JFrame padre, boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 407, 223);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTurnoPara = new JLabel("Turno para:");
			lblTurnoPara.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblTurnoPara.setBounds(33, 53, 123, 54);
			contentPanel.add(lblTurnoPara);
		}
		{
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
			textField.setEditable(false);
			textField.setBounds(147, 54, 215, 54);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
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
		}
		
		//Antes de terminar la construccion del dialogo, relleno el textfieldNombre
		rellenarNombre();
	}
	
	public void pulsadoOK() {
		this.dispose();
	}
	private void rellenarNombre() {
		//Hablar con la ventana principal para pedirle a la lista de espera que nos de el paciente a atener
		Paciente p =((VentanaPrincipalClinica)this.getParent()).getListaDeEspera().atender();
		//Poner el nombre en el texto
		textField.setText(p.getNombre() + " (" + p.getCompania()+ ")");
	}
}
