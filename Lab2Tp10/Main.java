import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Inicializo la variable random.
        int numRandom = (int) (Math.random()*100+1);
        System.out.println(numRandom);
        //Inicializo el contador para saber la cantidad de intentos.
        int contador = 0;

        //Le pido al usuario que ingrese un número.
        int numUsuario= Integer.parseInt(JOptionPane.showInputDialog("Por favor. Ingrese un número: "));


        //Condiciones para orientar al usuario.
        while (numUsuario != numRandom){
            contador += 1;
            if (numUsuario<numRandom){
                numUsuario = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es menor"));
            } else if (numUsuario>numRandom){
                numUsuario = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado es mayor"));
            }

        }

        //Muestro por pantalla que el número es correcto.
        if (numUsuario == numRandom){JOptionPane.showMessageDialog(null,"El número "+numUsuario+" es correcto!"+"\nLa cantidad de intentos fueron: "+contador);}


    }
}
