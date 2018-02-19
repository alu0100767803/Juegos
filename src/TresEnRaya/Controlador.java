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
		for(int i = 0; i < getPanelJuego().getTAMANYO(); i++){
			for(int j = 0; j < getPanelJuego().getTAMANYO(); j++) {
				getPanelJuego().getCasilla(i, j).addMouseListener(new Mouser());
			}
		}
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
		public void mouseClicked(MouseEvent e) {
			for(int i = 0; i < getPanelJuego().getTAMANYO(); i++) {
				for(int j = 0; j < getPanelJuego().getTAMANYO(); j++) {
					if(e.getSource() == getPanelJuego().getCasilla(i, j)){
						getPanelJuego().getCasilla(i, j).colocarX_();
					}
				}
				System.out.println(e.getSource().getClass());
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {
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
