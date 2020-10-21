package botones;

import javax.swing.JFrame;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Botones {

  public static void main(String[] args) {
    // Se crea un objeto de la clase PanelBotones
    PanelBotones panel = new PanelBotones();                      // Vista
    // Se crea un objeto de la clase OyenteBoton
    OyenteBoton oyente = new OyenteBoton(panel);                  // Controlador
    panel.addEventos(oyente);                                     // Receptor
    
    JFrame f = new JFrame("Ventana Botones"); // Creo un objeto de la clase JFrame
    f.setSize(800, 600); // Se le define un ancho y un alto a la ventana.
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Le agregamos propiedades al boton x (o cerrar)
    f.setLocationRelativeTo(f); // Centramos la ventana
    f.setContentPane(panel);
    f.setVisible(true); // Hacemos visible la ventana
  }
  
}
