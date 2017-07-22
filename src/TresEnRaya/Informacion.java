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
public class Informacion extends JPanel {
	
  private final String AUTOR = "Autor: Jorge Alonso Hernandez";
  private final String CORREO = "Correo: alu0100767803@ull.edu.es";
  private final String ASIGNATURA = "Programación de Aplicaciones Interactivas";
  private final String  JUEGO = "Juego del Tres en Raya";
  private final String UNIVERSIDAD = "Universidad de La Laguna";
  private final String FACULTAD = "Escuela Superior de Ingeniería y Tecnología";
  private final String GRADO = "Grado en Ingeniería Informática";
  
  private JLabel autor;
  private JLabel correo;
  private JLabel asignatura;
  private JLabel juego;
  private JLabel universidad;
  private JLabel facultad;
  private JLabel grado;
  
  public Informacion(){
  	setLayout(new GridLayout(10,1));
  	
  	autor = new JLabel(getAUTOR());
  	correo = new JLabel(getCORREO());
  	asignatura = new JLabel(getASIGNATURA());
  	juego = new JLabel(getJUEGO());
  	universidad = new JLabel(getUNIVERSIDAD());
  	facultad = new JLabel(getFACULTAD());
  	grado = new JLabel(getGRADO());
  	
  	add(autor);
  	add(correo);
  	add(asignatura);
  	add(universidad);
  	add(facultad);
  	add(grado);
  	add(juego);
  	
  }
  
  /*
   * --------------------------------- Getters y Setters ----------------------------------------
   */
  
	public JLabel getAutor() {
		return autor;
	}

	public void setAutor(JLabel autor) {
		this.autor = autor;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JLabel getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(JLabel asignatura) {
		this.asignatura = asignatura;
	}

	public JLabel getUniversidad() {
		return universidad;
	}

	public void setUniversidad(JLabel universidad) {
		this.universidad = universidad;
	}

	public JLabel getFacultad() {
		return facultad;
	}

	public void setFacultad(JLabel facultad) {
		this.facultad = facultad;
	}

	public JLabel getGrado() {
		return grado;
	}

	public void setGrado(JLabel grado) {
		this.grado = grado;
	}

	public String getAUTOR() {
		return AUTOR;
	}

	public String getCORREO() {
		return CORREO;
	}

	public String getASIGNATURA() {
		return ASIGNATURA;
	}

	public String getUNIVERSIDAD() {
		return UNIVERSIDAD;
	}

	public String getFACULTAD() {
		return FACULTAD;
	}

	public String getGRADO() {
		return GRADO;
	}

	public JLabel getJuego() {
		return juego;
	}

	public void setJuego(JLabel juego) {
		this.juego = juego;
	}

	public String getJUEGO() {
		return JUEGO;
	}
  
  

}
