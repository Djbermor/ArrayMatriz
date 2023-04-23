/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloactividad1;
import java.util.Random;
import java.util.*;
/**
 *
 * @author ctg104
 */
public class ArregloActividad1 {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //Arreglo de bytes(A,B,C,D):
        byte[] byteArreglo;
        byteArreglo = new byte[5];
        byteArreglo[0] = 1;
        byteArreglo[1] = 2;
        byteArreglo[2] = 3;
        byteArreglo[3] = 4;
        byteArreglo[4] = 5;
        
        for (byte b : byteArreglo) {
            System.out.println(b);
        }
        
        //Arreglo de Bytes(A,B,C,D):
        Byte[] ByteObjArreglo;
        ByteObjArreglo = new Byte[5];
        ByteObjArreglo[0] = 1;
        ByteObjArreglo[1] = 2;
        ByteObjArreglo[2] = 3;
        ByteObjArreglo[3] = 4;
        ByteObjArreglo[4] = 5;
        
        for (Byte b : ByteObjArreglo) {
            System.out.println(b);
        }
        
        //Arreglo de caracteres(A,B,C,D):
        
        char[] charArreglo; 
        charArreglo = new char[5];
        charArreglo[0] = 'a';
        charArreglo[1] = 'b';
        charArreglo[2] = 'c';
        charArreglo[3] = 'd';
        charArreglo[4] = 'e';
        
        for (char c : charArreglo) {
            System.out.println(c);
        }
        
        //Arreglo de Characters(A,B,C,D):

        Character[] CharObjArreglo;
        CharObjArreglo = new Character[5];
        CharObjArreglo[0] = 'a';
        CharObjArreglo[1] = 'b';
        CharObjArreglo[2] = 'c';
        CharObjArreglo[3] = 'd';
        CharObjArreglo[4] = 'e';
        
        for (Character c : CharObjArreglo) {
            System.out.println(c);
        }
        
        //Arreglo de short(A,B,C,D):

        short[] shortArreglo;
        shortArreglo = new short[5];
        shortArreglo[0] = 1;
        shortArreglo[1] = 2;
        shortArreglo[2] = 3;
        shortArreglo[3] = 4;
        shortArreglo[4] = 5;
        
        for (short s : shortArreglo) {
            System.out.println(s);
        }
        
        //Arreglo de Shorts (A,B,C,D):

        Short[] ShortObjArreglo;
        ShortObjArreglo = new Short[5];
        ShortObjArreglo[0] = '1';
        ShortObjArreglo[1] = '2';
        ShortObjArreglo[2] = '3';
        ShortObjArreglo[3] = '4';
        ShortObjArreglo[4] = '5';

        for (Short s : ShortObjArreglo) {
            System.out.println(s);
        }
        
        //Arreglo de enteros (A,B,C,D):

        int[] intArreglo;
        intArreglo = new int[5];
        intArreglo[0] = 1;
        intArreglo[1] = 2;
        intArreglo[2] = 3;
        intArreglo[3] = 4;
        intArreglo[4] = 5;

        for (int i : intArreglo) {
            System.out.println(i);
        }
        
        //Arreglo de Integers(A,B,C,D):

        Integer[] IntegerObjArreglo;
        IntegerObjArreglo = new Integer[5];
        IntegerObjArreglo[0] = 1;
        IntegerObjArreglo[1] = 2;
        IntegerObjArreglo[2] = 3;
        IntegerObjArreglo[3] = 4;
        IntegerObjArreglo[4] = 5;

        for (Integer i : IntegerObjArreglo) {
            System.out.println(i);
        }
        
        //Arreglo de longs(A,B,C,D):

        long[] longArreglo;
        longArreglo = new long[5];
        longArreglo[0] = 1L;
        longArreglo[1] = 2L;
        longArreglo[2] = 3L;
        longArreglo[3] = 4L;
        longArreglo[4] = 5L;

        for (long l : longArreglo) {
            System.out.println(l);
        }
        
        //Arreglo de Longs(A,B,C,D):

        Long[] LongObjArreglo;
        LongObjArreglo = new Long[5];
        LongObjArreglo[0] = 1L;
        LongObjArreglo[1] = 2L;
        LongObjArreglo[2] = 3L;
        LongObjArreglo[3] = 4L;
        LongObjArreglo[4] = 5L;

        for (Long l : LongObjArreglo) {
            System.out.println(l);
        }
        
        //Arreglo de floats(A,B,C,D):

        float[] floatArreglo;
        floatArreglo = new float[5];
        floatArreglo[0] = 1.0f;
        floatArreglo[1] = 2.0f;
        floatArreglo[2] = 3.0f;
        floatArreglo[3] = 4.0f;
        floatArreglo[4] = 5.0f;

        for (float f : floatArreglo) {
            System.out.println(f);
        }
        
        //Arreglo de Floats(A,B,C,D):

        Float[] FloatObjArreglo;
        FloatObjArreglo = new Float[5];
        FloatObjArreglo[0] = 1.0f;
        FloatObjArreglo[1] = 2.0f;
        FloatObjArreglo[2] = 3.0f;
        FloatObjArreglo[3] = 4.0f;
        FloatObjArreglo[4] = 5.0f;

        for (Float f : FloatObjArreglo) {
            System.out.println(f);
        }
        
        //Arreglo de dobles(A,B,C,D):

        double[] doubleArreglo;
        doubleArreglo = new double[5];
        doubleArreglo[0] = 1.0;
        doubleArreglo[1] = 2.0;
        doubleArreglo[2] = 3.0;
        doubleArreglo[3] = 4.0;
        doubleArreglo[4] = 5.0;
        //Arreglo de Doubles(A,B,C,D):

        for (double d : doubleArreglo) {
            System.out.println(d);
        }
        
        Double[] DoubleObjArreglo;
        DoubleObjArreglo = new Double[5];
        DoubleObjArreglo[0] = 1.0;
        DoubleObjArreglo[1] = 2.0;
        DoubleObjArreglo[2] = 3.0;
        DoubleObjArreglo[3] = 4.0;
        DoubleObjArreglo[4] = 5.0;

        for (Double d : DoubleObjArreglo) {
            System.out.println(d);
        }
        
        //Arreglo de objetos(A,B,C,D):

        Object[] ObjectArreglo;
        ObjectArreglo = new Object[5];
        ObjectArreglo[0] = DoubleObjArreglo;
        ObjectArreglo[1] = doubleArreglo;
        ObjectArreglo[2] = FloatObjArreglo;
        ObjectArreglo[3] = floatArreglo;
        ObjectArreglo[4] = intArreglo;

        for (Object o : ObjectArreglo) {
            System.out.println(o);
        }
        
        //Arreglo de cadenas de caracteres(A,B,C,D):

        String[] stringArreglo;
        stringArreglo = new String[5];
        stringArreglo[0] = "Hola";
        stringArreglo[1] = "Mundo";
        stringArreglo[2] = "en";
        stringArreglo[3] = "Java";
        stringArreglo[4] = "!";
        
        for (String s : stringArreglo) {
            System.out.println(s);
        }
        
        //Arreglo de String dataStructs y características (E,F,G,2(A)):
        String[] dataStructs = {"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        
        String[] características = new String[5];
        características[0] = "Simples, Circulares y Enlazadas";
        características[1] = "Primero en entrar, Primero en Salir. Último en entrar, Primero en salir";
        características[2] = "Primero en entrar, Último en salir";
        características[3] = "Parejas de clave y valor";
        características[4] = "Elementos no repetidos";
   
        for (int i = 0; i < dataStructs.length; i++) {
            System.out.println(dataStructs[i] + " - " + características[i]);
        }
        
    //Arreglo de Venta punto 2 (B,C,D,E,F,G,H):
        Random rand = new Random();

        // Declarar arreglo de enteros llamado ventas
        int[] ventas;

        // Generar una cantidad aleatoria de elementos para el arreglo ventas
        int n = rand.nextInt(10) + 1;

        // Inicializar el arreglo ventas con una cantidad aleatoria de elementos
        ventas = new int[n];

        // Llenar el arreglo ventas con valores aleatorios entre 1 y 1000
        for (int i = 0; i < n; i++) {
            ventas[i] = rand.nextInt(1000) + 1;
        }

        // Mostrar la cantidad de ventas
        System.out.println("Cantidad de ventas: " + n);

        // Mostrar el valor de cada una de las ventas
        System.out.println("Valores de las ventas:");
        for (int i = 0; i < n; i++) {
            System.out.println(ventas[i]);
        }

        // Mostrar el total de ventas
        int total_ventas = 0;
        for (int i = 0; i < n; i++) {
            total_ventas += ventas[i];
        }
        System.out.println("Total de ventas: " + total_ventas);

        // Mostrar el promedio de las ventas
        double promedio_ventas = (double) total_ventas / n;
        System.out.println("Promedio de ventas: " + promedio_ventas);
        
        //Arreglo de Venta punto 3 (B,C,D,E):
        imprimir(ventas);
        
        //Arreglo de Venta punto 4 (B,C,D):
        ordenarVentasDescendente(ventas);
        System.out.println("Valores de las ventas descendente:");
        mostrarVentas(ventas,n);
        ordenarVentasAscendente(ventas);
        System.out.println("Valores de las ventas ascendente:");
        mostrarVentas(ventas,n);
        desordenarVentas(ventas);
        System.out.println("Valores de las ventas desordenada:");
        mostrarVentas(ventas,n);
        ordenarVentasImparPar(ventas);
        System.out.println("Valores de las ventas ordenada de modo impar y par:");
        mostrarVentas(ventas,n);
        
        //Arreglo de Venta punto 5 (A,B,C,D,E,F,G,H,I,J):
        
        Object[][] lenguajes = new Object[8][5];
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
        infoLenguajes(lenguajes);
        System.out.println("Ingresando lenguaje a buscar: ");
        String nombreLenguaje = input.nextLine();
        System.out.println("Lenguaje: "+buscarLenguaje(lenguajes,nombreLenguaje));
        int[] coordenadas = new int[2];
        coordenadas = buscarLenguajeCoordenadas(lenguajes,nombreLenguaje);
        System.out.println("Posicion: ["+ coordenadas[0]+"]["+coordenadas[1]+"]");
                
        System.out.println("Ingresando la fila a buscar: ");
        int fila = Integer.parseInt(input.nextLine());
        System.out.println("Fila: ");
        mostrar(obtenerFila(lenguajes,fila));
        
        System.out.println("Ingresando columna a buscar: ");
        int columna = Integer.parseInt(input.nextLine());
        System.out.println("Columna: ");
        mostrar(obtenerColumna(lenguajes,columna));
        
        System.out.println("Mostrar datos de las cordenadas ingresada: ");
        mostrarObjeto(obtenerRegistro(fila,columna,lenguajes));
        
        System.out.println("Mostrar cordenadas donde se guarda el lenguaje: ");
        mostrarPosicion(buscarLenguajePunto5(lenguajes,nombreLenguaje));
        
        System.out.println();

        System.out.println("Mostrar informacion encontrada: ");
        boolean info[] = {true, false, true, true, false};
        infoLenguajes(lenguajes,info);
    } 
    
    public static void imprimir(int[] ventas){
        System.out.println("Ventas mas alta: " + buscarVentaMasAlta(ventas));
        System.out.println("Ventas mas baja: " + encontrarVentaMasBaja(ventas));
        System.out.println("Total de venta: " + obtenerTotalVentas(ventas));
        System.out.println("Promedio: " + promedio(ventas));
        System.out.println("Valor que se acerque más al valor que le sigue al promedio: " + ventaMasCercanaAlPromedio(ventas,promedio(ventas)));
    }
    
    public static int buscarVentaMasAlta(int[] ventas) {
        int maxVenta = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > maxVenta) {
                maxVenta = ventas[i];
            }
        }
        return maxVenta;
    }
    
    public static int encontrarVentaMasBaja(int[] ventas) {
        int ventaMasBaja = ventas[0];
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] < ventaMasBaja) {
                ventaMasBaja = ventas[i];
            }
        }
        return ventaMasBaja;
    }
    public static int obtenerTotalVentas(int[] ventas) {
        int total_ventas = 0;
        for (int i = 0; i < ventas.length; i++) {
            total_ventas += ventas[i];
        }
        return total_ventas;
    }
    
    public static double promedio(int[] ventas) {
        int n = ventas.length;
        int total_ventas = 0;
        for (int i = 0; i < n; i++) {
            total_ventas += ventas[i];
        }
        return (double) total_ventas / n;
    }
    
    public static int ventaMasCercanaAlPromedio(int[] ventas, double promedio) {
        int ventaMasCercana = ventas[0];
        double diferenciaMenor = Math.abs(ventas[0] - promedio);

        for (int i = 1; i < ventas.length; i++) {
            double diferencia = Math.abs(ventas[i] - promedio);
            if (diferencia < diferenciaMenor) {
                diferenciaMenor = diferencia;
                ventaMasCercana = ventas[i];
            }
        }

        return ventaMasCercana;
    }
    
    public static void mostrarVentas(int [] ventas, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(ventas[i]);
        }
    }
    
    public static void mostrar(Object [] lenguaje){
        for (int i = 0; i < lenguaje.length; i++) {
            System.out.println(lenguaje[i]);
        }
    }
    
    public static void mostrarPosicion(int [] lenguaje){
        for (int i = 0; i < lenguaje.length; i++) {
            System.out.print("["+lenguaje[i]+"]");
        }
    }
    
    public static void mostrarObjeto(Object [] lenguaje){
        for (int i = 0; i < lenguaje.length; i++) {
            
            if(i==1){
                Object [] registro = (Object[]) lenguaje[i];
                for (int j = 0; j < registro.length; j++) {
                    System.out.println(registro[j]);
                }
            }else{
                System.out.println(lenguaje[i]);
            }
        }
    }
    
    public static void ordenarVentasDescendente(int[] ventas) {
        int n = ventas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ventas[j] < ventas[j + 1]) {
                    // Intercambiar los valores
                    int temp = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = temp;
                }
            }
        }
    }
    
    public static void ordenarVentasAscendente(int[] ventas) {
        int n = ventas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ventas[j] > ventas[j + 1]) {
                    int temp = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = temp;
                }
            }
        }
    }
    
    public static void desordenarVentas(int[] ventas) {
        Random rand = new Random();
        for (int i = ventas.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = ventas[i];
            ventas[i] = ventas[j];
            ventas[j] = temp;
        }
    }

    public static void ordenarVentasImparPar(int[] ventas) {
        int[] pares = new int[ventas.length];
        int[] impares = new int[ventas.length];

        // Dividir el arreglo en pares e impares
        int paresIndex = 0;
        int imparesIndex = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] % 2 == 0) {
                pares[paresIndex++] = ventas[i];
            } else {
                impares[imparesIndex++] = ventas[i];
            }
        }
        // Ordenar cada parte por separado
        Arrays.sort(pares, 0, paresIndex);
        Arrays.sort(impares, 0, imparesIndex);

        // Unir las dos partes en el arreglo original
        int index = 0;
        for (int i = 0; i < paresIndex; i++) {
            ventas[index++] = pares[i];
        }
        for (int i = 0; i < imparesIndex; i++) {
            ventas[index++] = impares[i];
        }
    }
    
    public static void infoLenguajes(Object[][] lenguajes) {
        for (int i = 1; i < lenguajes.length; i++) {
            System.out.println("Ingresando datos para la fila " + i);
            for (int j = 0; j < lenguajes[i].length; j++) {
                System.out.print("Ingrese el dato para la columna " + lenguajes[0][j] + ": ");
                lenguajes[i][j] = input.nextLine();
            }
        }
    }

    public static boolean buscarLenguaje(Object[][] lenguajes, String nombreLenguaje) {
        for (int i = 1; i < lenguajes.length; i++) {
            if (lenguajes[i][0] != null && lenguajes[i][0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }
    
    public static int[] buscarLenguajeCoordenadas(Object[][] lenguajes, String nombreLenguaje) {
        int[] coordenadas = new int[2];
        for (int i = 1; i < lenguajes.length; i++) {
            for (int j = 0; j < lenguajes[i].length; j++) {
                if (lenguajes[i][j] != null && lenguajes[i][j].equals(nombreLenguaje)) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return coordenadas;
                }
            }
        }
        return null;
    }
    
    public static Object[] obtenerFila(Object[][] lenguajes, int fila) throws Exception {
        if (fila < 1 || fila >= lenguajes.length) {
            throw new Exception("La fila " + fila + " no existe en la matriz lenguajes.");
        }
        return lenguajes[fila];
    }
    
    public static Object[] obtenerColumna(Object[][] lenguajes, int columna) throws Exception {
        if (columna < 0 || columna >= lenguajes[0].length) {
            throw new Exception("La columna " + columna + " no existe en la matriz lenguajes.");
        }
        Object[] datosColumna = new Object[lenguajes.length - 1];
        for (int i = 1; i < lenguajes.length; i++) {
            datosColumna[i - 1] = lenguajes[i][columna];
        }
        return datosColumna;
    }
    
    public static Object[] obtenerRegistro(int fila, int columna, Object[][] lenguaje) throws Exception {
        if (fila < 0 || fila >= lenguaje.length || columna < 0 || columna >= lenguaje[0].length) {
            throw new Exception("Coordenadas erradas");
        }
        Object[] registro = lenguaje[fila];
        Object valor = registro[columna];
        return new Object[]{valor, registro};
    }
    
    public static int[] buscarLenguajePunto5(Object[][] lenguajes, String nombreLenguaje) {
        for (int i = 0; i < lenguajes.length; i++) {
            for (int j = 0; j < lenguajes[0].length; j++) {
                if (lenguajes[i][j] != null && lenguajes[i][j].equals(nombreLenguaje)) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    
    public static void infoLenguajes(Object[][] lenguajes, boolean[] info) {
        for (int i = 0; i < lenguajes.length; i++) {
            for (int j = 0; j < info.length; j++) {
                if (info[j]) {
                    System.out.print(lenguajes[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
