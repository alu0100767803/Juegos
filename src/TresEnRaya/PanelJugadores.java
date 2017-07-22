/**
 * 
 */
package TresEnRaya;

import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class PanelJugadores extends JPanel {
	
	private final String JUGADOR1 = "Jugador 1";
	private final String JUGADOR2 = "Jugador 2";
	
	private PanelJugador jugador1;
	private PanelJugador jugador2;
	
	public PanelJugadores(){
		
		jugador1 = new PanelJugador(getJUGADOR1());
		jugador2 = new PanelJugador(getJUGADOR2());
		
		setLayout(new GridLayout(1,2));
		
		add(jugador1);
		add(jugador2);
		
	}
	
	/*
	 * ------------------------------------------- Getters y Setters ---------------------------------
	 */

	public String getJUGADOR1() {
		return JUGADOR1;
	}

	public String getJUGADOR2() {
		return JUGADOR2;
	}

	public PanelJugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(PanelJugador jugador1) {
		this.jugador1 = jugador1;
	}

	public PanelJugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(PanelJugador jugador2) {
		this.jugador2 = jugador2;
	}
	
	

}
