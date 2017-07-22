/**
 * 
 */
package TresEnRaya;

import javax.swing.JFrame;


/**
 * @author Jorge Alonso Hernández
 * E-mail: alu0100767803@ull.edu.es
 * Fecha: 20/07/2017
 * Version: 1
 * Comentario: Clase que crea la ventana del juego
 */
public class Ventana extends JFrame {
	
	private final int ALTO_VENTANA = 600;
  private final int ANCHO_VENTANA = 900;
	private final String TITULO_VENTANA = "Tres en Raya";
	private Controlador controlador;
	
	public Ventana(){
		controlador = new Controlador();
		setSize(getANCHO_VENTANA(), getALTO_VENTANA());
		setTitle(getTITULO_VENTANA());
		setLocationRelativeTo(null);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(controlador);
	}

	/*
	 * ---------------------------------- Getters y Setters-----------------------------------------
	 */
	public int getALTO_VENTANA() {
		return ALTO_VENTANA;
	}

	public int getANCHO_VENTANA() {
		return ANCHO_VENTANA;
	}

	public String getTITULO_VENTANA() {
		return TITULO_VENTANA;
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}
	
	
	
	

}
