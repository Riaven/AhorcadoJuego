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
public class AhorcadoPalabra {
    private static String palabra;
    private static ArrayList<Character> letraPalabra =  new ArrayList<Character>();
    private static ArrayList<Character> letraEscondida =  new ArrayList<Character>();
    /**
     * Obtiene la palabra y la guarda en la variable palabra
     * posterior a eso se le recorre la palabra y se rellena un array de
     * caracteres
    */
    public String getPalabra(){
        return palabra;
    }
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }
    public static ArrayList<Character> rellenaArrayChar(String palabraInco){
        palabra = palabraInco;
        //limpiar el array
        letraPalabra.removeAll(letraPalabra);
        //recorre la palabra para rellenar el array
        for (int i = 0; i < palabra.length(); i++){
            letraPalabra.add(palabra.charAt(i));
        }
        return letraPalabra;
    }
     
    public static ArrayList<Character> rellenarEscondida(ArrayList<Character> letraPalabra){
        //limpia el array de las letras escondidas
        letraEscondida.removeAll(letraPalabra);
        //recorre el array que recibe el método para esconder cada una de las letras
        for(int i = 0; i < letraPalabra.size(); i++){
            //Reemplaza con un _ cada una de las letras
            letraEscondida.add('_');
        }
        //retorna el array con todas las letras escondidas por un guión bajo
        return letraEscondida;
    }
    /**Método que compara la letra que obtiene con cada una que está en el array
     * y lo actualiza, cambiando el guion por la letra correspondiente
     * y devuelve el total de letras que fueron cambiadas para poder cambiar los 
     * aciertos
     */
    public static void cambiarGuionXLetra(char letra){
        int aciertos = 0;
        for(int i = 0; i < letraPalabra.size(); i++){
            if(letraPalabra.get(i).equals(letra)){
                letraEscondida.set(i, letra);
                aciertos++;
            }
        }
        //si es que la letra no se asemeja a ninguna se concidera fallo
        if(aciertos == 0){
            AhorcadoJugador.intentoFallido();
        }
        //se suman los aciertos del jugador
        AhorcadoJugador.intentoAcierto(aciertos);
    }
    public static ArrayList<Character> obtenerArrayEscondido(){
        return letraEscondida;
    }
    
}
