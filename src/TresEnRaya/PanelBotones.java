/**
 * 
 */
package TresEnRaya;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class PanelBotones extends JPanel {
	
	private final String NUEVO = "Nuevo juego";
	
	private JButton botonNuevo;
	private BotonInformacion botonInformacion;
	
	public PanelBotones(){
		setLayout(new BorderLayout());
		botonNuevo = new JButton(getNUEVO());
		botonInformacion = new BotonInformacion();
		
		add(BorderLayout.CENTER, botonNuevo);
		add(BorderLayout.SOUTH, botonInformacion.getInformacion());
	}
	
	/*
	 * --------------------------------- Getters y Setters----------------------------------------
	 */
	
	public JButton getBotonNuevo() {
		return botonNuevo;
	}

	public void setBotonNuevo(JButton botonNuevo) {
		this.botonNuevo = botonNuevo;
	}

	public String getNUEVO() {
		return NUEVO;
	}

	public BotonInformacion getBotonInformacion() {
		return botonInformacion;
	}

	public void setBotonInformacion(BotonInformacion botonInformacion) {
		this.botonInformacion = botonInformacion;
	}

	
	
}
