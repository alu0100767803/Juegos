/**
 * 
 */
package TresEnRaya;

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * @author Jorge Alonso Hernández
 * E-mail: alu0100767803@ull.edu.es
 * Fecha: 20/07/2017
 * Version: 1
 * Comentario: Juego del tres en raya
 */
public class Controlador extends JPanel {
	
	private PanelJuego panelJuego;
	private PanelInferior panelInferior;
	
	public Controlador(){
		setLayout(new BorderLayout());
		
		panelJuego = new PanelJuego();
		panelInferior = new PanelInferior();
		
		add(BorderLayout.CENTER, panelJuego);
		add(BorderLayout.SOUTH, panelInferior);
	}
	
	/*
	 * ---------------------------------------- Getters y Setters ----------------------------------
	 */

	public PanelJuego getPanelJuego() {
		return panelJuego;
	}

	public void setPanelJuego(PanelJuego panelJuego) {
		this.panelJuego = panelJuego;
	}

	public PanelInferior getPanelInferior() {
		return panelInferior;
	}

	public void setPanelInferior(PanelInferior panelInferior) {
		this.panelInferior = panelInferior;
	}
	
	
	
}
