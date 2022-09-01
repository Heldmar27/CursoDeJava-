//package com.company;


public class UsoCuenta {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Gastón Montiel",5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Nala",10000);

        //Imprimo por consola los datos de las cuentas
        System.out.println("Cuenta 1:");
        System.out.println("Nombre: "+cuenta1.getNombre());
        System.out.println("Saldo: "+cuenta1.getSaldo());
        System.out.println("Nro de cuenta: "+cuenta1.getNrocuenta());

        System.out.println("\nCuenta 2:");
        System.out.println("Nombre: "+cuenta2.getNombre());
        System.out.println("Saldo: "+cuenta2.getSaldo());
        System.out.println("Nro de cuenta: "+cuenta2.getNrocuenta());


        //Transferencia de $2500, de cuenta 1 a cuenta 2.
        cuenta1.trasferir(cuenta2,2500);

        System.out.println("");
        System.out.println("\nDatos actualizados: ");
        //Imprimo en pantalla los datos de las cuentas actualizadas
        System.out.println("\nCuenta 1:");
        System.out.println("Nombre: "+cuenta1.getNombre());
        System.out.println("Saldo: "+cuenta1.getSaldo());
        System.out.println("Nro de cuenta: "+cuenta1.getNrocuenta());

        System.out.println("\nCuenta 2:");
        System.out.println("Nombre: "+cuenta2.getNombre());
        System.out.println("Saldo: "+cuenta2.getSaldo());
        System.out.println("Nro de cuenta: "+cuenta2.getNrocuenta());
    }
}
