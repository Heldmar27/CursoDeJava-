//package com.company;

import java.util.Scanner;

public class RaizScanner {

    public static void main(String[] args) {
	// write your code here

        //Inicializo la clase Scanner y declaro mis variables.
        Scanner entrada = new Scanner(System.in);
        int numeroR;

        //Le pido al usuario ingresar un número.
        System.out.println("Ingrese un número: ");
        numeroR = entrada.nextInt();

        //Imprimo el número y su raíz por consola.
        System.out.println("la raíz de "+numeroR+" es: "+Math.sqrt(numeroR));



    }
}
