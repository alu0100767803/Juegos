/**
 * 
 */
package TresEnRaya;

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class PanelInferior extends JPanel {
	
	private PanelBotones panelBotones;
	private PanelJugadores panelJugadores;
	
	public PanelInferior(){
		setLayout(new BorderLayout());
		
		panelBotones = new PanelBotones();
		panelJugadores = new PanelJugadores();
		
		add(BorderLayout.CENTER, panelJugadores);
		add(BorderLayout.EAST, panelBotones);
	}
	
	/*
	 * --------------------------------------------- Getters y Setters -----------------------------------------
	 */

	public PanelBotones getPanelBotones() {
		return panelBotones;
	}

	public void setPanelBotones(PanelBotones panelBotones) {
		this.panelBotones = panelBotones;
	}

	public PanelJugadores getPanelJugadores() {
		return panelJugadores;
	}

	public void setPanelJugadores(PanelJugadores panelJugadores) {
		this.panelJugadores = panelJugadores;
	}
	
	

}
