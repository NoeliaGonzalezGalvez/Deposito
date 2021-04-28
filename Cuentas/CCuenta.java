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
public class CCuenta {

    private String nombre;//nombre del titular de la cuenta
    private String cuenta1;//numero de cuenta 
    private double saldo;//saldo en la cuenta
    private double tipoInteres;//tipo de interes de la cuenta 
    

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
     this.nombre= nom;
     this.cuenta1=cue;
     this.saldo=sal;
     this.tipoInteres=tipo;
    }

    /**
     * 
     * @return double se refiere al saldo de la cuenta 
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
    * 
    * @param cantidad la nueva cantidad de saldo de la cuenta
    * @throws Exception no se puede ingresar una cantidad negativa
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * 
     * @param cantidad la nueva cantidad del saldo de la cuenta
     * @throws Exception no se puede retirar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return String de el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el nuevo numero de cuenta
     */
    public String getCuenta1() {
        return cuenta1;
    }

    /**
     * @param cuenta1 String del numero de cuenta
     */
    public void setCuenta1(String cuenta1) {
        this.cuenta1 = cuenta1;
    }

    /**
     * @return el nuevo saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param double saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el nuevo tipo de interes de la cuenta
     */
    public double getTipoInterés() {
        return tipoInteres;
    }

    /**
     * @param tipoInterés el nuevo tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }
    
    /**
     * 
     * @param cuenta1 numero de cuenta
     * @param cantidad cantidad de saldo en cuenta
     */
    public void operativo_cuenta(CCuenta cuenta1, double cantidad)
    {
        System.out.println("El saldo actual es" + cantidad);
        
        try{
            cuenta1.retirar(2300);
        }catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);     
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}

