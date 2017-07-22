/**
 * 
 */
package TresEnRaya;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class PanelJugador extends JPanel {
	
	private final String TU_TURNO = "Tu turno";
	private Jugador jugador;
	private JLabel tu_turno;
	
	public PanelJugador(String nombre){
		jugador = new Jugador(nombre);
		tu_turno = new JLabel(getTU_TURNO());
		
		setLayout(new GridLayout(3,1));
		add(getJugador().getJugador());
		
		if(jugador.isTurno()){
			add(getTu_turno());
		}
	}
	
	/*
	 * --------------------------------- Getters y Setters -------------------------------------------
	 */

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public JLabel getTu_turno() {
		return tu_turno;
	}

	public void setTu_turno(JLabel tu_turno) {
		this.tu_turno = tu_turno;
	}

	public String getTU_TURNO() {
		return TU_TURNO;
	}
	
	
}
