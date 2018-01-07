/**
 * 
 */
package TresEnRaya;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Jorge Alonso Hern�ndez
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
		this.addMouseListener(new Mouser());
	}
	
	class Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == getBotonInformacion()){
				getVentanaInformacion().setVisible(true);
			}
		}
	}
	
	class Mouser implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
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
