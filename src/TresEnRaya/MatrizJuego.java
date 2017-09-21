/**
 * 
 */
package TresEnRaya;

/**
 * @author Jorge
 *
 */
public class MatrizJuego {
	
	private final int TAMANYO = 3;
	private final int X = 1;
	private final int O = 2;
	private final int VACIO = 0;
	
	private int[][] tablero;
	
	public MatrizJuego(){
		tablero = new int [getTAMANYO()][getTAMANYO()];
		inicializarTablero();
	}
	
	public void inicializarTablero(){
		for(int i = 0; i < getTAMANYO(); i++){
			for(int j = 0; j < getTAMANYO(); j++){
				getTablero()[i][j] = getVACIO();
			}
		}
	}
	
	public void colocarX(int i, int j){
		getTablero()[i][j] = getX();
	}
	
	public void colocarO(int i, int j){
		getTablero()[i][j] = getO();
	}
	
	public int comprobarGanador(){
		if(comprobarX()){
			return getX();
		}
		
		else if (comprobarO()){
			return getO();
		}
		
		else {
			return getVACIO();
		}
		
	}
	
	public boolean comprobarX(){
		if(getElemTab(0,0) == getX() && getElemTab(0,1) == getX() && getElemTab(0,2) == getX()){
			return true;
		}
		
		else if (getElemTab(0,0) == getX() && getElemTab(1,0) == getX() && getElemTab(2,0) == getX()){
			return true;
		}
		
		else if (getElemTab(0,2) == getX() && getElemTab(1,2) == getX() && getElemTab(2,2) == getX()){
			return true;
		}
		
		else if (getElemTab(2,0) == getX() && getElemTab(2,1) == getX() && getElemTab(2,2) == getX()){
			return true;
		}
		
		else if (getElemTab(0,0) == getX() && getElemTab(1,1) == getX() && getElemTab(2,2) == getX()){
			return true;
		}
		
		else if (getElemTab(2,0) == getX() && getElemTab(1,1) == getX() && getElemTab(0,2) == getX()){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean comprobarO(){
		if(getElemTab(0,0) == getO() && getElemTab(0,1) == getO() && getElemTab(0,2) == getO()){
			return true;
		}
		
		else if (getElemTab(0,0) == getO() && getElemTab(1,0) == getO() && getElemTab(2,0) == getO()){
			return true;
		}
		
		else if (getElemTab(0,2) == getO() && getElemTab(1,2) == getO() && getElemTab(2,2) == getO()){
			return true;
		}
		
		else if (getElemTab(2,0) == getO() && getElemTab(2,1) == getO() && getElemTab(2,2) == getO()){
			return true;
		}
		
		else if (getElemTab(0,0) == getO() && getElemTab(1,1) == getO() && getElemTab(2,2) == getO()){
			return true;
		}
		
		else if (getElemTab(2,0) == getO() && getElemTab(1,1) == getO() && getElemTab(0,2) == getO()){
			return true;
		}
		
		else {
			return false;
		}
	}

	
	/*
	 * ------------------------------- Getters y Setters ------------------------------------------
	 */
	
	public int getElemTab(int i, int j){
		return getTablero()[i][j];
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	public int getTAMANYO() {
		return TAMANYO;
	}

	public int getX() {
		return X;
	}

	public int getO() {
		return O;
	}

	public int getVACIO() {
		return VACIO;
	}
	
	

}
