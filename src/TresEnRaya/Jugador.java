/**
 * 
 */
package TresEnRaya;

import javax.swing.JLabel;

/**
 * @author Jorge
 *
 */
public class Jugador {

	private final String NOMBRE;
	private boolean turno;
	private JLabel jugador;
	
	public Jugador(String nombre){
		NOMBRE = nombre;
		turno = false;
		jugador = new JLabel(getNOMBRE());
	}
	
	/*
	 * ------------------------------------------ Getters y Setters ----------------------------------
	 */


	public boolean isTurno() {
		return turno;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public JLabel getJugador() {
		return jugador;
	}

	public void setJugador(JLabel jugador) {
		this.jugador = jugador;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}
	
	
}
