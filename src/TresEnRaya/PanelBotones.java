/**
 * 
 */
package TresEnRaya;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class PanelBotones extends JPanel {
	
	private final String NUEVO = "Nuevo";
	
	private JButton botonNuevo;
	
	public PanelBotones(){
		botonNuevo = new JButton(getNUEVO());
		
		add(botonNuevo); 
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

}
