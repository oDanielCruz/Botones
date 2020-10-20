package botones;

import javax.swing.JPanel;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class PanelBotones extends javax.swing.JPanel {

  public PanelBotones() {
    initComponents();
  }
  
  public void addEventos(OyenteBoton oyente) {
    this.botonRojo.addActionListener(oyente);
    this.botonVerde.addActionListener(oyente);
    this.botonAzul.addActionListener(oyente);
    
    this.botonRojo.setName("rojo");
    this.botonVerde.setName("verde");
    this.botonAzul.setName("azul");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelNorte = new javax.swing.JPanel();
    botonRojo = new javax.swing.JButton();
    botonVerde = new javax.swing.JButton();
    botonAzul = new javax.swing.JButton();

    setLayout(new java.awt.BorderLayout());

    botonRojo.setText("Cambiar color Rojo");
    panelNorte.add(botonRojo);

    botonVerde.setText("Cambiar color Verde");
    panelNorte.add(botonVerde);

    botonAzul.setText("Cambiar color Azul");
    panelNorte.add(botonAzul);

    add(panelNorte, java.awt.BorderLayout.NORTH);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonAzul;
  private javax.swing.JButton botonRojo;
  private javax.swing.JButton botonVerde;
  private javax.swing.JPanel panelNorte;
  // End of variables declaration//GEN-END:variables

  public JPanel getPanelNorte() {
    return this.panelNorte;
  }
}
