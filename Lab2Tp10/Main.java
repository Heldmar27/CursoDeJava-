package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Inicializo la variable random.
        int numRandom = (int) (Math.random()*100+1);

        //Le pido al usuario que ingrese un número.
        int numUsuario= Integer.parseInt(JOptionPane.showInputDialog("Por favor. Ingrese un número: "));


        //Condiciones para orientar al usuario.
        while (numUsuario != numRandom){
            if (numUsuario<numRandom){
                numUsuario = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es menor"));
            } else if (numUsuario>numRandom){
                numUsuario = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es mayor"));
            }
        }

        //Muestro por pantalla que el número es correcto.
        if (numUsuario == numRandom){JOptionPane.showMessageDialog(null,"El número "+numUsuario+" es correcto!");}


    }
}
