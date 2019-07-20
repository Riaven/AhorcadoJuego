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
    /**se establecen las variables correspondientes
     * los intentos van a ser 6, por las 6 partes que tiene el cuerpo
     * del ahorcado
     * los aciertos se estableces como 0 inicialmente al igual que los
     * intentos fallidos
     */
    private static int intentos = 6;
    private static int aciertos = 0;
    private static int fallidos = 0;
    /**se establece un array el cual almacena todas las letras
     * que ha intentado el jugador con la intención de que no las vuelva a 
     * repetir, incluye las letras que son correctas tanto como las fallidas
     * lo muestra en la ventana y además compara, con el JTextField para no
     * permitir al usuario colocar esa letra otra vez
     */
    private static ArrayList<Character> arrayLetrasIntentos = new ArrayList<>();
    /**Método que recibe los aciertos que ha tenido el usuario, teniendo en cuenta
     * que algunas palabras, tendrán más de alguna letra repetida, se suma a
     * los aciertos, el número de letras acertadas que recibe por parámetro.
     */
    public static void intentoAcierto(int acierto){
         aciertos =+ acierto;
    }
    //método que permite obtener el total de aciertos actuales
    public static int retornaAciertos(){
        return aciertos;
    }
    /**Método que al ser llamado, este simplemente aumenta en 1 a los intentos
     * fallidos actuales
     */
    public static void intentoFallido(){
        fallidos++;
        
    }
    //cada vez que el jugador falle será quitado un intento, es decir,
    //los fallidos.
    public static int restoIntentos(){
        return intentos - fallidos;   
    }
    /**Método que se encarga de comprobar que el resto de intentos no sea menor 
     * o igual a 0, mientras esto sea así el método solo retornará un false...
     * cuando el resto de intentos sea 0, el método retornará un true
     * es decir que el jugador ha perdido, por falta de intentos
     */
    public static boolean haPerdido(){
        boolean perdido = false;
        if(restoIntentos() <= 0){
            perdido = true;
        }
        return perdido;
    }
    /** Método que se encarga de recibir un char, que corresponde a las letras 
     * que han sido intentadas por el usuario, la recibe como parámetro, para
     * luego agregarla al array que almacena todas las letras intetadas
     * arrayLetrasIntentos.
     */
    public static void letrasIntentadas(char letrita){
        arrayLetrasIntentos.add(letrita);
    }
    /**Método q se encarga de retornar el array completo de todas las letras
     * intentadas por el usuario, actualmente.
     */
    public static ArrayList<Character> retornarLetrasIntentadas(){
        return arrayLetrasIntentos;
    }
}
