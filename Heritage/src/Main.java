//OchoTres 4 Ejercicio 4_SCD
//Tiempo = 00:00
import java.net.PortUnreachableException;
import java.util.*;
public class Main {

    private final static int ANIO_MINIMO = 2002;
    private final static int ANIO_ACTUAL = 2020;
    private final static int MES_ACTUAL = 10;
    private final static int DIA_ACTUAL = 13;

    public static class Fecha {
        public int anio;
        public int mes;
        public int dia;
        Fecha() {
            anio = 0;
            mes = 0;
            dia = 0;
        }

        public int fijaAnio(int a) {
            if(a <= ANIO_MINIMO) {
                anio = a;
                System.out.println("Anio valido");
            }
            else {
                System.out.println("Es muy joven para ser Jugador Profesional");
            }
            return a;
        }

        public int fijaMes(int m) {
            if(m >= 1 && m <= 12) {
                mes = m;
                System.out.println("Mes valido");
            }
            else {
                System.out.println("No existe ese mes");
            }
            return m;
        }

        public int fijaDia(int d) {
            if(d >= 1 && d <= 31) {
                dia = d;
                System.out.println("Dia valido");
            }
            else {
                System.out.println("No existe ese dia");
            }
            return dia;
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
    };

    public static class Jugador {
        private String nombre;
        private String pais;
        private String posicion;
        private int numero;
        private int edad;
        private float altura;
        private float peso;

        public Fecha fechaNacimiento;

        public Jugador() {
            nombre = "";
            pais = "";
            posicion = "";
            numero = 0;
            altura = 0;
            peso = 0;
        }

        public String fijaNombre(String nombreEntrada) {
            byte[] elementos;
            elementos = nombreEntrada.getBytes();
            for(int i = 0; i < nombreEntrada.length(); i++) {
                if(elementos[i] < 33 || elementos[i] > 44) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("El nombre es valido");
            nombre = nombreEntrada;
            return nombre;
        }

        public String fijaPais(String nombreEntrada) {
            byte[] elementos;
            elementos = nombreEntrada.getBytes();
            for(int i = 0; i < nombreEntrada.length(); i++) {
                if(elementos[i] < 33 || elementos[i] > 44) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("El pais es valido");
            pais = nombreEntrada;
            return pais;
        }

        public String fijaPosicion(String nombreEntrada) {
            byte[] elementos;
            elementos = nombreEntrada.getBytes();
            for(int i = 0; i < nombreEntrada.length(); i++) {
                if(elementos[i] < 33 || elementos[i] > 44) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("La posicion es valida");
            posicion = nombreEntrada;
            return posicion;
        }

        public int fijaNumero(int numeroEntrada) {
            if(numeroEntrada >= 1 && numeroEntrada <= 100) {
                numero = numeroEntrada;
                System.out.println("Numero de jugador guardado");
            }
            else if(numeroEntrada <= 0) {
                System.out.println("Error numero invalido");
            }
            else {
                System.out.println("No puedes tener ese numero");
            }
            return numero;
        }

        public int fijaEdad(int a, int m, int d) {
            if(a < ANIO_ACTUAL) {
                if(m < MES_ACTUAL) {
                    edad = ANIO_ACTUAL - a;
                }
                else if(m == MES_ACTUAL) {
                    if(d < DIA_ACTUAL || d == DIA_ACTUAL) {
                        edad = ANIO_ACTUAL - a;
                    }
                    else {
                        edad = (ANIO_ACTUAL - a) - 1;
                    }
                }
                else if(m > MES_ACTUAL) {
                    edad = (ANIO_ACTUAL - a) - 1;
                }
            }
            return edad;
        }

        public float fijaAltura(float alturaEntrada) {
            if(alturaEntrada >= 1 && alturaEntrada <= 2.5) {
                alturaEntrada = alturaEntrada;
                System.out.println("Altura Guardada");
            }
            else {
                System.out.println("Nadie es tan alto");
            }
            return altura;
        }

        public float fijaPeso(float pesoEntrada) {
            if(pesoEntrada >= 50 && pesoEntrada <= 100) {
                peso = pesoEntrada;
                System.out.println("Tienes el peso necesario");
            }
            else {
                System.out.println("No tienes el peso necesarios");
            }
            return peso;
        }

        public String dameNombre() {
            return nombre;
        }

        public String damePais() {
            return pais;
        }

        public String damePosicion() {
            return posicion;
        }

        public int dameNumero() {
            return numero;
        }

        public int dameEdad() {

            return edad;
        }

        public float dameAltura() {
            return altura;
        }

        public float damePeso() {
            return peso;
        }
    };

    public static class JugadorProfesional extends Jugador {
        private String club;
        private String entrenador;
        private int sueldo;

        public JugadorProfesional() {
            club = "";
            entrenador = "";
            sueldo = 0;
        }

        public String fijaClub(String nombreEntrada) {
            byte[] elementos;
            elementos = nombreEntrada.getBytes();
            for(int i = 0; i < nombreEntrada.length(); i++) {
                if(elementos[i] < 33 || elementos[i] > 44) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("El nombre del Club es valido");
            club = nombreEntrada;
            return club;
        }

        public String fijaEntrenador(String nombreEntrenador)
        {
            byte[] elementos;
            elementos = nombreEntrenador.getBytes();
            for(int i = 0; i < nombreEntrenador.length(); i++)
            {
                if(elementos[i] < 33 || elementos[i] > 44) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("El entrenador es valido");
            entrenador = nombreEntrenador;
            return entrenador;
        }

        public int fijaSueldo(int sueldoEntrada) {
            if(sueldoEntrada >= 1 && sueldoEntrada <= 1000000) {
                sueldo = sueldoEntrada;
                System.out.println("Excelente sueldo");
            }
            else {
                System.out.println("No puedes tener ese sueldo");
            }
            return sueldo;
        }

        public String dameClub() {
            return club;
        }

        public String dameEntrenador() {
            return entrenador;
        }

        public int dameSueldo() {
            return sueldo;
        }

    };

    public static class JugadorEscolar extends Jugador {
        private String escuela;
        private int grado;
        private float promedio;

        public JugadorEscolar() {
            escuela = "";
            grado = 0;
            promedio = 0;
        }

        public String fijaEscuela(String nombreEntrada) {
            byte[] elementos;
            elementos = nombreEntrada.getBytes();
            for(int i = 0; i < nombreEntrada.length(); i++) {
                if(elementos[i] < 33 || elementos[i] > 44) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("El nombre de la escuela es valido");
            escuela = nombreEntrada;
            return escuela;
        }

        public int fijaGrado(int gradoEntrada) {
            for(int i = 0; i < gradoEntrada; i++) {
                if(gradoEntrada >= 1 || gradoEntrada <= 8) {
                    break;
                }
                else {
                    System.out.println("Caracteres invalidos");
                }
            }
            System.out.println("El grado es valido");
            grado = gradoEntrada;
            return grado;
        }

        public float fijaPromedio(float promedioEntrada) {
            if(promedioEntrada >= 1 && promedioEntrada <= 10) {
                promedio = promedioEntrada;
                System.out.println("Es un buen promedio");
            }
            else if(promedioEntrada <= 0) {
                System.out.println("Es un mal promedio");
            }
            else {
                System.out.println("Mentiroso nadie tiene un promedio mas alto de 10");
            }
            return promedio;
        }

        public String dameEscuela() {
            return escuela;
        }

        public int dameGrado() {
            return grado;
        }

        public float damePromedio() {
            return promedio;
        }
    };

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);

        Jugador jugador = new Jugador();
        JugadorProfesional jugadorPro = new JugadorProfesional();
        JugadorEscolar jugadorEsc = new JugadorEscolar();
        String datoEntrada = "";
        int dato = 0;
        float datoDiferente = 0;
        int opc = 0;

        do
        {
            System.out.println();
            System.out.println("Equipo de Futbol");
            System.out.println("1.- Registrar Jugador");
            System.out.println("2.- Registrar Jugador Profesional");
            System.out.println("3.- Registrar Jugador Escolar");
            System.out.println("4.- Salir");
            System.out.print("Ingrese opcion: ");
            opc = lector.nextInt();
            switch(opc)
            {
                case 1:
                    do
                    {
                        int a = 0;
                        int m = 0;
                        int d = 0;
                        System.out.println();
                        System.out.println("Jugador");
                        System.out.println("1.- Nombre");
                        System.out.println("2.- Pais");
                        System.out.println("3.- Posicion");
                        System.out.println("4.- Numero");
                        System.out.println("5.- Edad");
                        System.out.println("6.- Altura");
                        System.out.println("7.- Peso");
                        System.out.println("8.- Salir");
                        System.out.print("Ingrese opcion: ");
                        opc = lector.nextInt();
                        switch(opc)
                        {
                            case 1:
                                System.out.println("Ingrese el nombre");
                                System.out.print("Nombre: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugador.fijaNombre(datoEntrada);
                                System.out.println("Jugador: "+datoEntrada);
                                break;
                            case 2:
                                System.out.println("Ingrese el Pais");
                                System.out.print("Pais: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugador.fijaPais(datoEntrada);
                                System.out.println("Pais: "+jugador.damePais());
                                break;
                            case 3:
                                System.out.println("Ingrese Posicion");
                                System.out.print("Posicion: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugador.fijaPosicion(datoEntrada);
                                System.out.println("Entrenador: "+jugador.damePosicion());
                                break;
                            case 4:
                                System.out.println("Ingrese el Numero");
                                System.out.print("Numero: ");
                                dato = lector.nextInt();
                                jugador.fijaNumero(dato);
                                System.out.print("Titulos: "+jugador.dameNumero());
                                break;
                            case 5:
                                System.out.println("Ingrese la fecha de nacimiento");
                                System.out.println("Fecha de naciminto");
                                System.out.print("Anio: ");
                                a = lector.nextInt();
                                jugador.fechaNacimiento.fijaAnio(a);
                                System.out.print("Mes: ");
                                m = lector.nextInt();
                                jugador.fechaNacimiento.fijaMes(m);
                                System.out.println("Dia: ");
                                d = lector.nextInt();
                                jugador.fechaNacimiento.fijaDia(d);
                                jugador.fijaEdad(a,m,d);
                                System.out.println("Edad: "+jugador.dameEdad());
                                System.out.print("Fecha: "+jugador.fechaNacimiento.dameAnio()+" / "
                                    +jugador.fechaNacimiento.dameMes() +" / "
                                    +jugador.fechaNacimiento.dameDia());
                                break;
                            case 6:
                                System.out.println("Ingrese la altura");
                                System.out.println("Altura: ");
                                datoDiferente = lector.nextFloat();
                                jugador.fijaAltura(datoDiferente);
                                System.out.print("Altura: "+jugador.dameAltura());
                                break;
                            case 7:
                                System.out.println("Ingrese Peso");
                                System.out.println("Peso: ");
                                datoDiferente = lector.nextFloat();
                                jugador.fijaPeso(datoDiferente);
                                System.out.print("Peso: "+jugador.damePeso());
                                break;
                            default:
                                break;
                        }
                    }
                    while(opc != 8);
                    break;
                case 2:
                    do
                    {
                        int a = 0;
                        int m = 0;
                        int d = 0;
                        System.out.println();
                        System.out.println("Jugador Profesional");
                        System.out.println("1.- Nombre");
                        System.out.println("2.- Pais");
                        System.out.println("3.- Posicion");
                        System.out.println("4.- Numero");
                        System.out.println("5.- Edad");
                        System.out.println("6.- Altura");
                        System.out.println("7.- Peso");
                        System.out.println("8.- Club");
                        System.out.println("9.- Entrenador");
                        System.out.println("10.- Sueldo");
                        System.out.println("11.- Salir");
                        System.out.print("Ingrese opcion: ");
                        opc = lector.nextInt();
                        switch(opc)
                        {
                            case 1:
                                System.out.println("Ingrese el nombre");
                                System.out.print("Nombre: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorPro.fijaNombre(datoEntrada);
                                System.out.println("Jugador: "+jugadorPro.dameNombre());
                                break;
                            case 2:
                                System.out.println("Ingrese el Pais");
                                System.out.print("Pais: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorPro.fijaPais(datoEntrada);
                                System.out.println("Pais: "+jugadorPro.damePais());
                                break;
                            case 3:
                                System.out.println("Ingrese Posicion");
                                System.out.print("Posicion: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorPro.fijaPosicion(datoEntrada);
                                System.out.println("Entrenador: "+jugadorPro.damePosicion());
                                break;
                            case 4:
                                System.out.println("Ingrese el Numero");
                                System.out.print("Numero: ");
                                dato = lector.nextInt();
                                jugadorPro.fijaNumero(dato);
                                System.out.print("Titulos: "+jugadorPro.dameNumero());
                                break;
                            case 5:
                                System.out.println("Ingrese la fecha de nacimiento");
                                System.out.println("Fecha de naciminto");
                                System.out.print("Anio: ");
                                a = lector.nextInt();
                                jugadorPro.fechaNacimiento.fijaAnio(a);
                                System.out.print("Mes: ");
                                m = lector.nextInt();
                                jugadorPro.fechaNacimiento.fijaMes(m);
                                System.out.println("Dia: ");
                                d = lector.nextInt();
                                jugadorPro.fechaNacimiento.fijaDia(d);
                                jugadorPro.fijaEdad(a,m,d);
                                System.out.println("Edad: "+jugadorPro.dameEdad());
                                System.out.print("Fecha: "+jugadorPro.fechaNacimiento.dameAnio()+" / "
                                        +jugadorPro.fechaNacimiento.dameMes() +" / "
                                        +jugadorPro.fechaNacimiento.dameDia());
                                break;
                            case 6:
                                System.out.println("Ingrese la altura");
                                System.out.println("Altura: ");
                                datoDiferente = lector.nextFloat();
                                jugadorPro.fijaAltura(datoDiferente);
                                System.out.print("Altura: "+jugadorPro.dameAltura());
                                break;
                            case 7:
                                System.out.println("Ingrese Peso");
                                System.out.println("Peso: ");
                                datoDiferente = lector.nextFloat();
                                jugadorPro.fijaPeso(datoDiferente);
                                System.out.print("Peso: "+jugadorPro.damePeso());
                                break;
                            case 8:
                                System.out.println("Ingrese Club");
                                System.out.println("Club: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorPro.fijaClub(datoEntrada);
                                System.out.print("Peso: "+jugadorPro.dameClub());
                                break;
                            case 9:
                                System.out.println("Ingrese Entrenador");
                                System.out.println("Entrenador: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorPro.fijaEntrenador(datoEntrada);
                                System.out.print("Peso: "+jugadorPro.dameEntrenador());
                                break;
                            case 10:
                                System.out.println("Ingrese Sueldo");
                                System.out.println("Sueldo: ");
                                dato = lector.nextInt();
                                jugadorPro.fijaSueldo(dato);
                                System.out.print("Peso: "+jugadorPro.dameSueldo());
                                break;
                            default:
                                break;
                        }
                    }
                    while(opc != 11);
                    break;
                case 3:
                    do
                    {
                        int a = 0;
                        int m = 0;
                        int d = 0;
                        System.out.println();
                        System.out.println("Jugador Escolar");
                        System.out.println("1.- Nombre");
                        System.out.println("2.- Pais");
                        System.out.println("3.- Posicion");
                        System.out.println("4.- Numero");
                        System.out.println("5.- Edad");
                        System.out.println("6.- Altura");
                        System.out.println("7.- Peso");
                        System.out.println("8.- Escuela");
                        System.out.println("9.- Grado");
                        System.out.println("10.- Promedio");
                        System.out.println("11.- Salir");
                        System.out.println("Ingrese opcion: ");
                        opc = lector.nextInt();
                        switch(opc)
                        {
                            case 1:
                                System.out.println("Ingrese el nombre");
                                System.out.print("Nombre: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorEsc.fijaNombre(datoEntrada);
                                System.out.println("Jugador: "+jugadorEsc.dameNombre());
                                break;
                            case 2:
                                System.out.println("Ingrese el Pais");
                                System.out.print("Pais: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorEsc.fijaPais(datoEntrada);
                                System.out.println("Pais: "+jugadorEsc.damePais());
                                break;
                            case 3:
                                System.out.println("Ingrese Posicion");
                                System.out.print("Posicion: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorEsc.fijaPosicion(datoEntrada);
                                System.out.println("Entrenador: "+jugadorEsc.damePosicion());
                                break;
                            case 4:
                                System.out.println("Ingrese el Numero");
                                System.out.print("Numero: ");
                                dato = lector.nextInt();
                                jugadorEsc.fijaNumero(dato);
                                System.out.print("Titulos: "+jugadorEsc.dameNumero());
                                break;
                            case 5:
                                System.out.println("Ingrese la fecha de nacimiento");
                                System.out.println("Fecha de naciminto");
                                System.out.print("Anio: ");
                                a = lector.nextInt();
                                jugadorEsc.fechaNacimiento.fijaAnio(a);
                                System.out.print("Mes: ");
                                m = lector.nextInt();
                                jugadorEsc.fechaNacimiento.fijaMes(m);
                                System.out.println("Dia: ");
                                d = lector.nextInt();
                                jugadorEsc.fechaNacimiento.fijaDia(d);
                                jugadorEsc.fijaEdad(a,m,d);
                                System.out.println("Edad: "+jugadorEsc.dameEdad());
                                System.out.print("Fecha: "+jugadorEsc.fechaNacimiento.dameAnio()+" / "
                                        +jugadorEsc.fechaNacimiento.dameMes() +" / "
                                        +jugadorEsc.fechaNacimiento.dameDia());
                                break;
                            case 6:
                                System.out.println("Ingrese la altura");
                                System.out.println("Altura: ");
                                datoDiferente = lector.nextFloat();
                                jugadorEsc.fijaAltura(datoDiferente);
                                System.out.print("Altura: "+jugadorEsc.dameAltura());
                                break;
                            case 7:
                                System.out.println("Ingrese Peso");
                                System.out.println("Peso: ");
                                datoDiferente = lector.nextFloat();
                                jugadorEsc.fijaPeso(datoDiferente);
                                System.out.print("Peso: "+jugadorEsc.damePeso());
                                break;
                            case 8:
                                System.out.println("Ingrese Escuela");
                                System.out.println("Escuela: ");
                                datoEntrada = lector.nextLine();
                                datoEntrada = lector.next();
                                jugadorEsc.fijaEscuela(datoEntrada);
                                System.out.print("Peso: "+jugadorEsc.dameEscuela());
                                break;
                            case 9:
                                System.out.println("Ingrese Grado");
                                System.out.println("Entrenador: ");
                                dato = lector.nextInt();
                                jugadorEsc.fijaGrado(dato);
                                System.out.print("Peso: "+jugadorEsc.dameGrado());
                                break;
                            case 10:
                                System.out.println("Ingrese Promedio");
                                System.out.println("Promedio: ");
                                datoDiferente = lector.nextFloat();
                                jugadorEsc.fijaPromedio(datoDiferente);
                                System.out.print("Peso: "+jugadorEsc.damePromedio());
                                break;
                            default:
                                break;
                        }
                    }
                    while(opc != 11);
                    break;
                default:
                    break;
            }
        }
        while(opc != 4);
        lector.close();
    }
}
