package com.company;

public class Main {

    public static void main(String[] args) {

   // Funciones trigonométricas habituales:
    Double sin = Math.sin(36);
    Double cos = Math.cos(100);
    Double tan = Math.tan(300);
    Double atan = Math.atan(499);
    Double atan2 = Math.atan2(5,7);

    //La función exponencial y su inversa
    Double exp = Math.exp(0);
    Double log = Math.log(125);

    //Las dos constantes PI y e
    Double pi = Math.PI;
    Double e = Math.E;

    //Impresión de las variables en pantalla
        System.out.println("\nFunciones trigonométricas habituales:");
        System.out.println("Función devuelve el seno de un número(36): "+sin);
        System.out.println("Función devuelve el coseno de un número(100):"+cos);
        System.out.println("Función devuelve la tangente de un número(300)"+tan);
        System.out.println("Función devuelve el arcotangente de un número(499): "+atan);
        System.out.println("Función devuelve el ángulo theta de un punto(5x,7y): "+atan2);

        System.out.println("\nLa función exponencial y su inversa");
        System.out.println("Función devuelve el exponente(0) del número de Euler: "+exp);
        System.out.println("Función devuelve el logaritmo de un número(125): "+log);

        System.out.println("\nLas dos constantes PI y e");
        System.out.println("Función devuelve el valor de Pi: "+pi);
        System.out.println("Función devuelve el valor de e: "+e);


    }
}
