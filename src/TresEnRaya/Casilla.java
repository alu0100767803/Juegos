/**
 * 
 */
package TresEnRaya;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class Casilla extends JPanel {
	
	private final ImageIcon X = new ImageIcon("x.png");
	private final ImageIcon O = new ImageIcon("circle.png");
	
	private Color colorBlanco;
	private Color colorVerde;
	

	public Casilla(){
		colorBlanco = Color.WHITE;
		colorVerde = Color.GREEN;
		
		setBackground(colorBlanco);
	}
}
