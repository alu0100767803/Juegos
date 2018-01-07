/**
 * 
 */
package TresEnRaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Jorge
 *
 */
public class Casilla extends JPanel {
	
	private final ImageIcon X_ = new ImageIcon("x.png");
	private final ImageIcon O_ = new ImageIcon("circle.png");
	
	private Image imagen;
	
	private Color colorBlanco;
	private Color colorVerde;
	private int xImagen;
	private int yImagen;
	

	public Casilla(){
		colorBlanco = Color.WHITE;
		colorVerde = Color.GREEN;
		
		setBackground(colorBlanco);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = getWidth() / 2 - getxImagen() / 2;
		int y = getHeight() / 2 - getyImagen() / 2;
		g.drawImage(getImagen(), x, y, this);
	}
	
	public void colocarX_(){
		setImagen(getX_().getImage());
		setxImagen(getX_().getIconWidth());
		setyImagen(getX_().getIconHeight());
		repaint();
	}
	
	public void colocarO_(){
		setImagen(getO_().getImage());
		setxImagen(getO_().getIconWidth());
		setyImagen(getO_().getIconHeight());
		repaint();
	}

	
	/*
	 * -------------------------------------- Getters y Setters ---------------------------------
	 */
	
	public JPanel obtenerPanel(){
		return this;
	}

	public Color getColorBlanco() {
		return colorBlanco;
	}


	public void setColorBlanco(Color colorBlanco) {
		this.colorBlanco = colorBlanco;
	}


	public Color getColorVerde() {
		return colorVerde;
	}


	public void setColorVerde(Color colorVerde) {
		this.colorVerde = colorVerde;
	}


	public ImageIcon getX_() {
		return X_;
	}


	public ImageIcon getO_() {
		return O_;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public int getxImagen() {
		return xImagen;
	}

	public void setxImagen(int xImagen) {
		this.xImagen = xImagen;
	}

	public int getyImagen() {
		return yImagen;
	}

	public void setyImagen(int yImage) {
		this.yImagen = yImage;
	}
	
	
	
}
