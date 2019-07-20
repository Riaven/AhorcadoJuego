/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AhorcadoRules;

import java.util.ArrayList;

/**
 * 
 * @author Riaven
 */
public class AhorcadoJugador {
   
    private static int intentos = 6;
    private static int aciertos = 0;
    private static int fallidos = 0;
    private static ArrayList<Character> arrayLetrasIntentos = new ArrayList<>();
    //suma un acierto a la variable aciertos
    public static void intentoAcierto(int acierto){
         aciertos = aciertos + acierto;
    }
    public static int retornaAciertos(){
        return aciertos;
    }
    public static void intentoFallido(){
        fallidos++;
        
    }
    //cada vez que el jugador falle será quitado un intento
    public static int restoIntentos(){
        return intentos - fallidos;   
    }
    //comprueba q los intentos no sean menor o igual a 1
    //si es 0 el método devuelve un true
    public static boolean haPerdido(){
        boolean perdido = false;
        if(restoIntentos() <= 0){
            perdido = true;
        }
        return perdido;
    }
    
    public static void letrasIntentadas(char letrita){
        arrayLetrasIntentos.add(letrita);
    }
    public static ArrayList<Character> retornarLetrasIntentadas(){
        return arrayLetrasIntentos;
    }
}
