/**
 * 
 */
package TresEnRaya;

import javax.swing.JFrame;

/**
 * @author Jorge
 *
 */
public class VentanaInformacion extends JFrame{
	
	 private final int ALTO_VENTANA = 300;
	  private final int ANCHO_VENTANA = 400;
	  private final String TITULO_VENTANA = "Información";

	  private Informacion informacion;

	   public VentanaInformacion() {
	  	 informacion = new Informacion();
	     setSize(getANCHO_VENTANA(), getALTO_VENTANA());
	     setTitle(getTITULO_VENTANA());
	     setLocationRelativeTo(null);  
	     add(informacion);
	   }
	   
	   /*
	 	 * -------------------------------------- Getters y Setters ----------------------------------------------------------
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

}
