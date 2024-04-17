package dialogoColores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoColores extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNegro;
	private JRadioButton rdbtnAzul;
	private JRadioButton rdbtnVerde;
	private JRadioButton rdbtnRojo;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 * @param b 
	 * @param ventanaColores 
	 */
	public DialogoColores(VentanaColores ventanaColores, boolean b) {
		super(ventanaColores, b);
		setBounds(100, 100, 197, 240);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		rdbtnNegro = new JRadioButton("Negro");
		buttonGroup.add(rdbtnNegro);
		rdbtnNegro.setBounds(63, 26, 68, 23);
		contentPanel.add(rdbtnNegro);
		
		rdbtnAzul = new JRadioButton("Azul");
		buttonGroup.add(rdbtnAzul);
		rdbtnAzul.setBounds(63, 52, 68, 23);
		contentPanel.add(rdbtnAzul);
		
		rdbtnVerde = new JRadioButton("Verde");
		buttonGroup.add(rdbtnVerde);
		rdbtnVerde.setBounds(63, 78, 68, 23);
		contentPanel.add(rdbtnVerde);
		
		rdbtnRojo = new JRadioButton("Rojo");
		buttonGroup.add(rdbtnRojo);
		rdbtnRojo.setBounds(63, 104, 68, 23);
		contentPanel.add(rdbtnRojo);
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
		//Antes de que acabe el contructor
		seleccionarcoloradecuado();
	}
	
	public void pulsadoOK() {
		//Averiguar cual es el color seleccionado
		Color colorseleccionado;
		if (rdbtnNegro.isSelected()) {
			colorseleccionado= Color.BLACK;
		} else if (rdbtnAzul.isSelected()) {
			colorseleccionado=Color.BLUE;
		} else if (rdbtnVerde.isSelected()) {
			colorseleccionado=Color.GREEN;
		}else {	
			colorseleccionado = Color.RED;
		}
		//Hablar con la ventana adre para cambiar el color de la etiqueta
		((VentanaColores)this.getParent()).getLblNewLabel().setForeground(colorseleccionado);
		//Desaparecer
		this.dispose();
		
	}
	public void pulsadoCancel() {
		this.dispose(); //Me elimino
	}
	
	public void seleccionarcoloradecuado() {
		//Hablar con la ventana principal y preguntar el color de la etiqueta
		Color colorseleccionado = ((VentanaColores)this.getParent()).getLblNewLabel().getForeground();
		if (colorseleccionado == Color.BLACK) {
			rdbtnNegro.setSelected(true);
		} else 	if (colorseleccionado == Color.BLUE) {
			rdbtnAzul.setSelected(true);
		} else 	if (colorseleccionado == Color.GREEN) {
			rdbtnVerde.setSelected(true);
		} else {
			rdbtnRojo.setSelected(true);
		} 
	}
}
