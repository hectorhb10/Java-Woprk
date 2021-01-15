//OchoTres 2 Ejercicio 2_SCD
//Tiempo = 04:40
import java.util.*;

public class Main {
    public  static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String cadenaEntrada;
        char[] elementos = new char[50];

       System.out.print("Teclea Enter para Comenzar");
        while (!lector.nextLine().equals('.')){
            System.out.print("Ingrese una Cadena: ");
            cadenaEntrada = lector.nextLine();

            copiarCadena(elementos, cadenaEntrada);

            for(int i=0; i<50/cadenaEntrada.length(); i++){
                for(int j=0; j<cadenaEntrada.length(); j++){
                    System.out.print(elementos[j]);
                }
            }

            if (cadenaEntrada.equals(".")) {
                System.exit(0);
                lector.close();
            }
        }
    }

    public static void copiarCadena(char[] recibidos, String cadenaRecibida){
        int tamanoArreglo = 50;
        int vecesQueCabe = 0;

        vecesQueCabe = (50/cadenaRecibida.length());

        for(int i=0; i<vecesQueCabe; i++){
            cadenaRecibida += cadenaRecibida;
        }

        for(int j=0; j<50; j++){
            recibidos[j] = cadenaRecibida.charAt(j);
        }
    }
}
