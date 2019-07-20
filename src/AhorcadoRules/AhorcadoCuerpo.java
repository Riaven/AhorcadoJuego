/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AhorcadoRules;

/**
 * 
 * @author Riaven
 */
public class AhorcadoCuerpo {
    private boolean cabeza;
    private boolean torzo;
    private boolean brazoIzquierdo;
    private boolean brazoDerecho;
    private boolean piernaIzquierda;
    private boolean piernaDerecha;
    //constructor vacío
    public AhorcadoCuerpo(){
    }
    //constructor que recibe parametros pero no hace nada con ellos
    public AhorcadoCuerpo(boolean cabeza, boolean torzo, boolean brazoIzquierdo, boolean brazoDerecho, boolean piernaIzquierda, boolean piernaDerecha) {
        cabeza = false;
        torzo = false;
        brazoIzquierdo = false;
        brazoDerecho = false;
        piernaDerecha = false;
        piernaIzquierda = false;
    }

    public boolean isCabeza() {
        return cabeza;
    }

    public void setCabeza(boolean cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isTorzo() {
        return torzo;
    }

    public void setTorzo(boolean torzo) {
        this.torzo = torzo;
    }

    public boolean isBrazoIzquierdo() {
        return brazoIzquierdo;
    }

    public void setBrazoIzquierdo(boolean brazoIzquierdo) {
        this.brazoIzquierdo = brazoIzquierdo;
    }

    public boolean isBrazoDerecho() {
        return brazoDerecho;
    }

    public void setBrazoDerecho(boolean brazoDerecho) {
        this.brazoDerecho = brazoDerecho;
    }

    public boolean isPiernaIzquierda() {
        return piernaIzquierda;
    }

    public void setPiernaIzquierda(boolean piernaIzquierda) {
        this.piernaIzquierda = piernaIzquierda;
    }

    public boolean isPiernaDerecha() {
        return piernaDerecha;
    }

    public void setPiernaDerecha(boolean piernaDerecha) {
        this.piernaDerecha = piernaDerecha;
    }
    
    
    
    
}
