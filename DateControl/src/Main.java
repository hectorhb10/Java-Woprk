//OchoTres 3 Ejercicio 3_SCD
//Tiempo 04:00
import java.util.*;

public class Main {
    private final static int ENERO = 1;
    private final static int FEBRERO = 2;
    private final static int MARZO = 3;
    private final static int ABRIL = 4;
    private final static int MAYO = 5;
    private final static int JUNIO = 6;
    private final static int JULIO = 7;
    private final static int AGOSTO = 8;
    private final static int SEPTIEMBRE = 9;
    private final static int OCTUBRE = 10;
    private final static int NOVIEMBRE = 11;
    private final static int DICIEMBRE = 12;

    static class Fecha{
        private int anio;
        private int mes;
        private int dia;

        public Fecha(){
            anio = 1998;
            mes = 6;
            dia = 20;
        }
        Scanner lector = new Scanner(System.in);

        public boolean esFechaValida(int a, int m, int d) {
            boolean valido = false;
            boolean bisiesto = false;
            if ((a % 4 == 0 && a % 100 != 100) || (a % 400 == 0)) {
                bisiesto = true;
            }
            if (a >= 1 && (m == ENERO || m == MARZO || m == MAYO || m == JULIO ||
                    m == AGOSTO || m == OCTUBRE || m == DICIEMBRE)
                    && d >= 1 && d <= 31){
                valido = true;
            }
            else if ((m == ABRIL || m == JUNIO || m == SEPTIEMBRE || m == NOVIEMBRE)
                    && d >= 1 && d <= 30){
                    valido = true;
            }
            else if ((m == FEBRERO) && (bisiesto) && (d >= 1 && d <= 29)){
                    valido = true;
            }
            else if ((m == FEBRERO) && (!bisiesto) && (d >= 1 && d <= 28)) {
                    valido = true;
            }
            else {
                    System.out.println("Fecha No Valida");
                    valido = false;
            }
            return valido;
        }

        public boolean fijaAnio(int a) {
            if(esFechaValida(a,mes,dia) == true){
                anio = a;
                System.out.println("Se cambio el anio");
            }
            else {
                System.out.println("No se cambio el anio");
            }
            return esFechaValida(a,mes,dia);
        }

        public boolean fijaMes(int m) {
            if(esFechaValida(anio,m,dia) == true){
                mes = m;
                System.out.println("Se cambio el mes");
            }
            else {
                System.out.println("No se cambio el mes");
            }
            return esFechaValida(anio,m,dia);
        }

        public boolean fijaDia(int d) {
            if(esFechaValida(anio,mes,d) == true){
                dia = d;
                System.out.println("Se cambio el dia");

            }
            else {
                System.out.println("No se cambio el dia");
            }
            return esFechaValida(anio,mes,dia);
        }

        public int dameAnio() {
            return anio;
        }

        public int dameMes() {
            return mes;
        }

        public int dameDia() {
            return dia;
        }
    }

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int a;
        int m;
        int d;
        int opcion;

        Fecha f = new Fecha();

        do{
            System.out.println("Ingrese Fecha");
            System.out.println("1.- Anio");
            System.out.println("2.- Mes");
            System.out.println("3.- Día");
            System.out.println("4.- Fecha");
            System.out.println("5.- Salir");
            opcion = lector.nextInt();
            switch (opcion){
                case 1: System.out.print("Ingrese Año: ");
                        a = lector.nextInt();
                        f.fijaAnio(a);
                    break;
                case 2: System.out.print("Ingrese Mes: ");
                        m = lector.nextInt();
                        f.fijaMes(m);
                    break;
                case 3: System.out.print("Ingrese Día: ");
                        d = lector.nextInt();
                        f.fijaDia(d);
                    break;
                case 4: System.out.print("Fecha: "+ f.dameAnio() + " / "
                        + f.dameMes() + " / " + f.dameDia());
                        System.out.println();
                    break;
                default:
                    break;
            }
        }while(opcion != 5);
        lector.close();
    }
}
