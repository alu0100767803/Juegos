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
public class PanelJuego extends JPanel {
	
	private final int TAMANYO;
	
	private MatrizJuego matrizTablero;
	private Casilla[][] tablero;

	public PanelJuego(){	
		matrizTablero = new MatrizJuego();
		TAMANYO = getMatrizTablero().getTAMANYO();
		tablero = new Casilla[getTAMANYO()][getTAMANYO()];
		setLayout(new GridLayout(3,3,4,4));
		
		crearTablero();
	}
	
	public void crearTablero(){
		
		Casilla casilla;
		
		for(int i = 0; i < getTAMANYO(); i++){
			for(int j = 0; j < getTAMANYO(); j++){
				casilla = new Casilla();
				getTablero()[i][j] = casilla;
				add(casilla);
			}
		}
	}
	
	/*
	 * ----------------------------------------- Getters y Setters ----------------------------------
	 */

	public MatrizJuego getMatrizTablero() {
		return matrizTablero;
	}

	public void setMatrizTablero(MatrizJuego matrizTablero) {
		this.matrizTablero = matrizTablero;
	}

	public Casilla[][] getTablero() {
		return tablero;
	}

	public void setTablero(Casilla[][] tablero) {
		this.tablero = tablero;
	}

	public int getTAMANYO() {
		return TAMANYO;
	}
	
	
	
}
