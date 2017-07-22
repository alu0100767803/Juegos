/**
 * 
 */
package TresEnRaya;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
	
	private VentanaInformacion ventanaInformacion;
	
	public Controlador(){
		setLayout(new BorderLayout());
		
		panelJuego = new PanelJuego();
		panelInferior = new PanelInferior();
		ventanaInformacion = new VentanaInformacion();
		
		add(BorderLayout.CENTER, panelJuego);
		add(BorderLayout.SOUTH, panelInferior);
		
		anyadirListeners();
	}
	
	public void anyadirListeners(){
		getBotonInformacion().addActionListener(new Listener());
	}
	
	class Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == getBotonInformacion()){
				getVentanaInformacion().setVisible(true);
			}
		}
	}
	
	/*
	 * ---------------------------------------- Getters y Setters ----------------------------------
	 */
	
	public JButton getBotonInformacion(){
		return getPanelInferior().getPanelBotones().getBotonInformacion().getInformacion();
	}

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

	public VentanaInformacion getVentanaInformacion() {
		return ventanaInformacion;
	}

	public void setVentanaInformacion(VentanaInformacion ventanaInformacion) {
		this.ventanaInformacion = ventanaInformacion;
	}
	
	
}
