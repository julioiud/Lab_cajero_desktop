/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author JULIOCESARMARTINEZ
 */
public class Cliente {
    
    private int id;
    private String nombre;
    private String apellido;
    private int numCard;
    private int pin;
    private double saldo;
    private int intentos;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, int numCard, int pin, double saldo, int intentos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCard = numCard;
        this.pin = pin;
        this.saldo = saldo;
        this.intentos = intentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numCard=" + numCard + ", pin=" + pin + ", saldo=" + saldo + ", intentos=" + intentos + '}';
    }
 
    
}
