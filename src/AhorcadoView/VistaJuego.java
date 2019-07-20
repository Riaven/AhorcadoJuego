/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhorcadoView;

import AhorcadoRules.AhorcadoJugador;
import AhorcadoRules.AhorcadoPalabra;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Riaven
 */
public class VistaJuego extends javax.swing.JFrame {

    /**
     * Creates new form VistaJuego
     */
    public VistaJuego() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprobar = new javax.swing.JButton();
        jtfLetra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblCabeza = new javax.swing.JLabel();
        lblBrazoIzquierdo = new javax.swing.JLabel();
        lblBrazoDerecho = new javax.swing.JLabel();
        lblTorzo = new javax.swing.JLabel();
        lblPiernaDerecha = new javax.swing.JLabel();
        lblPiernaIzquierda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblEspacio = new javax.swing.JLabel();
        lblPista = new javax.swing.JLabel();
        lblIntentosRestantes = new javax.swing.JLabel();
        lblAciertos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLetrasIntentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnComprobar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        btnComprobar.setText("Comprobar");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });

        jtfLetra.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jtfLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfLetraKeyTyped(evt);
            }
        });

        jLabel3.setText("Version 0.1");

        lblCabeza.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCabeza.setText("O");

        lblBrazoIzquierdo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBrazoIzquierdo.setText("\\");

            lblBrazoDerecho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblBrazoDerecho.setText("/");

            lblTorzo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            lblTorzo.setText("|");

            lblPiernaDerecha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblPiernaDerecha.setText("/");

            lblPiernaIzquierda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            lblPiernaIzquierda.setText("\\");

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel1.setText("--------¬");

                jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
                jLabel2.setText("Adivina la palabra!");

                lblEspacio.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
                lblEspacio.setText("-");

                lblPista.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
                lblPista.setText("Pista! la palabra tiene 0 letras!");

                lblIntentosRestantes.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
                lblIntentosRestantes.setText("Tienes 7 intentos restantes");

                lblAciertos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
                lblAciertos.setText("Aciertos : 0");

                jLabel4.setText("Intentos");

                lblLetrasIntentos.setText("-");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblCabeza))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblBrazoIzquierdo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTorzo))
                            .addComponent(lblBrazoDerecho))
                        .addGap(86, 86, 86)
                        .addComponent(lblEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblPiernaDerecha)
                        .addGap(16, 16, 16)
                        .addComponent(lblPiernaIzquierda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblAciertos)
                        .addGap(92, 92, 92)
                        .addComponent(jtfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnComprobar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLetrasIntentos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPista))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(119, 119, 119)
                                .addComponent(lblIntentosRestantes))))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCabeza)
                                    .addComponent(jLabel2))))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBrazoIzquierdo)
                            .addComponent(lblTorzo)
                            .addComponent(lblBrazoDerecho)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPiernaDerecha)
                                    .addComponent(lblPiernaIzquierda))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblAciertos))
                                    .addComponent(jtfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4))
                                    .addComponent(lblIntentosRestantes))
                                .addGap(6, 6, 6)
                                .addComponent(lblLetrasIntentos)
                                .addGap(0, 16, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPista)))
                        .addContainerGap())
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void jtfLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLetraKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        int contar;
        contar = 0;
        contar = jtfLetra.getText().toString().length();
        if(contar == 1){
            evt.consume();
        }
        int contador = 0;
        for(int i = 0; i < AhorcadoJugador.retornarLetrasIntentadas().size(); i++){
            if(AhorcadoJugador.retornarLetrasIntentadas().get(i).equals(caracter)){
                contador++;
            }
        }
        if (contador > 0){
            evt.consume();
        }
         // Verificar si la tecla pulsada no es un digito
       // if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)){

         //   evt.consume(); 
        //} 
    }//GEN-LAST:event_jtfLetraKeyTyped

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
        // TODO add your handling code here:
        if(!jtfLetra.getText().isEmpty()){
            AhorcadoPalabra.cambiarGuionXLetra(jtfLetra.getText().charAt(0));
            AhorcadoJugador.letrasIntentadas(jtfLetra.getText().charAt(0));
            actualizarVentana();
            //comprobar que se ha perdido
            if(AhorcadoJugador.haPerdido()){
                JOptionPane.showMessageDialog(null, "Oh no! haz perdido!");
                dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debes de colocar una letra para comprobar!");
        }
    }//GEN-LAST:event_btnComprobarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJuego().setVisible(true);
            }
        });
    }  
    //recibe palabra y arma la vista
    public void armarVentana(String palabra){
        String palabraEscondida;
        //Crea un array para almacenar lo que trae uno de los métodos
        ArrayList<Character> arrayChar = new ArrayList<Character>();
        //Se almacena en la variable el array
        arrayChar = AhorcadoPalabra.rellenaArrayChar(palabra);
        //Se rellenan las letras y quedan escondidas
        palabraEscondida = AhorcadoPalabra.rellenarEscondida(arrayChar).toString();
        //System.out.println(AhorcadoPalabra.rellenarEscondida(arrayChar));
        lblEspacio.setText(palabraEscondida);
        lblPista.setText("Pista! la palabra tiene "+ palabra.length() + " letras!");
        //ocultar el cuerpo 
        lblCabeza.setVisible(false);
        lblBrazoDerecho.setVisible(false);
        lblBrazoIzquierdo.setVisible(false);
        lblTorzo.setVisible(false);
        lblPiernaDerecha.setVisible(false);
        lblPiernaIzquierda.setVisible(false);
        lblLetrasIntentos.setText(AhorcadoJugador.retornarLetrasIntentadas().toString());
    }
    
    public void actualizarVentana(){
        //actualiza todo
        String palabra = AhorcadoPalabra.obtenerArrayEscondido().toString();
        lblEspacio.setText(palabra);
        jtfLetra.setText("");
        lblPista.setText("Pista! la palabra tiene "+ AhorcadoPalabra.obtenerArrayEscondido().size() + " letras!");
        lblIntentosRestantes.setText("Tienes " + AhorcadoJugador.restoIntentos()+  " intentos restantes");
        lblAciertos.setText("Aciertos : " + AhorcadoJugador.retornaAciertos());
        lblLetrasIntentos.setText(AhorcadoJugador.retornarLetrasIntentadas().toString());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtfLetra;
    private javax.swing.JLabel lblAciertos;
    private javax.swing.JLabel lblBrazoDerecho;
    private javax.swing.JLabel lblBrazoIzquierdo;
    private javax.swing.JLabel lblCabeza;
    private javax.swing.JLabel lblEspacio;
    private javax.swing.JLabel lblIntentosRestantes;
    private javax.swing.JLabel lblLetrasIntentos;
    private javax.swing.JLabel lblPiernaDerecha;
    private javax.swing.JLabel lblPiernaIzquierda;
    private javax.swing.JLabel lblPista;
    private javax.swing.JLabel lblTorzo;
    // End of variables declaration//GEN-END:variables
}