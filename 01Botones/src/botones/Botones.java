package botones;

import javax.swing.JFrame;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Botones {

  public static void main(String[] args) {
    PanelBotones panel = new PanelBotones();                      // Vista
    OyenteBoton oyente = new OyenteBoton(panel);                  // Controlador
    panel.addEventos(oyente);                                     // Receptor
    
    JFrame f = new JFrame("Ventana Botones");
    f.setSize(800, 600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(f);
    f.setContentPane(panel);
    f.setVisible(true);
  }
  
}
