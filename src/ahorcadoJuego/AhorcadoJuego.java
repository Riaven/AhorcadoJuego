/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadoJuego;
import AhorcadoView.VistaPrincipal;
import java.awt.Toolkit;
/**
 *
 * @author Riaven
 */
public class AhorcadoJuego {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //configurar posicion de la ventana al centro de la pantalla
        int ancho;
        int alto;
        ancho = 0;
        alto = 0;
        //obtiene el alto y ancho de la pantalla en la cual se esta desplegando la ventana
        ancho = Toolkit.getDefaultToolkit().getScreenSize().width;
        alto = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        
        // TODO code application logic here
        VistaPrincipal vista = new VistaPrincipal();
        vista.setLocation((ancho/2) - (vista.getSize().width/2), (alto/2)-(vista.getSize().height/2));
        vista.setTitle("Juego Ahorcado");
        vista.setVisible(true);
    }
    
}
