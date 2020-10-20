package botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static java.awt.Color.*;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class OyenteBoton implements ActionListener {

  private final PanelBotones panel;
  
  public OyenteBoton(PanelBotones panel) {
    this.panel = panel;
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    JButton origen = (JButton)e.getSource();
    
    switch(origen.getName()) {
      case "rojo" -> {
        panel.getPanelNorte().setBackground(RED);
        panel.setBackground(RED);
      }
      
      case "verde" -> {
        panel.getPanelNorte().setBackground(GREEN);
        panel.setBackground(GREEN);
      }
      
      case "azul" -> {
        panel.getPanelNorte().setBackground(BLUE);
        panel.setBackground(BLUE);
      }
    }
  }
  
}
