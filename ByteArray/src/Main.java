//OchoTres  1 Ejercicio 1_SCD
//Tiempo=04:00

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        int contador;
        String cadenaCombinada = "";
        String cadenaEntrada = "";
        byte[] elementos;

        System.out.print("Ingrese una Cadena:");
        cadenaEntrada = lector.nextLine();

        contador = cadenaEntrada.length();
        cadenaEntrada = cadenaCombinada + cadenaEntrada;
        elementos = cadenaEntrada.getBytes();

        imprimirCadena(elementos);
    }

    public static void imprimirCadena(byte[] elememtosRecibidos){
        System.out.println("Tu Cadena es: ");
        for(int b= 0; b<elememtosRecibidos.length; b++){
            if(elememtosRecibidos[b] < 48 || elememtosRecibidos[b] > 57 ){
                System.out.println("Cadena: "+ (char)elememtosRecibidos[b] + " " + "ASCII: "+ elememtosRecibidos[b]);
            }
        }
    }
}
