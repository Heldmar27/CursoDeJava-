package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Inicializo mi clase Scanner y las vavriables a utilizar.
        Scanner entrada = new Scanner(System.in);
        int altura, peso = 0;
        String genero;

        //Le pido al usuario que ingrese su altura.
        System.out.println("Por favor. Ingrese su altura en cm: ");
        altura = entrada.nextInt();

        //Le pido al usuario que ingrese su género.
        System.out.println("Por favor. Ingrese su género (H/M): ");
        genero = entrada.next();

        //Dependiendo del genero el cálculo es diferente.
        if (genero.equals("H") || genero.equals("h")){

            peso = altura -110;

        } else if (genero.equals("M") || genero.equals("m")){

            peso = altura -120;

        }

        //Imprimo el peso ideal por consola.
        System.out.println("Su peso ideal es: "+peso);
    }
}
