/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author NOELIA
 */
public class Main {

    /**
     * @param args the command line arguments
     * @param operativa_cuenta
     */

    public static void main(String[] args, CCuenta  cuenta1) {
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        
        cuenta1.operativo_cuenta(cuenta1, saldoActual );

      
    }
}
