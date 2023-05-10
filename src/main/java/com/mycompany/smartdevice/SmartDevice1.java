/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartdevice;

/**
 *
 * @author USUARIO
 */
public class SmartDevice1 {
    private String modelo;
    private double memoria;
    private double procesador;
    private String pantalla;
    private int precio;
    private String teclado;

    public SmartDevice1(String modelo, double memoria, double procesador, String pantalla, int precio, String teclado) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.procesador = procesador;
        this.pantalla = pantalla;
        this.precio = precio;
        this.teclado = teclado;
    }
    
    public String getModelo(){
        return modelo;
    }

    public double getMemoria() {
        return memoria;
    }

    public double getProcesador() {
        return procesador;
    }

    public String getPantalla() {
        return pantalla;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTeclado() {
        return teclado;
    }


    
    
    
}
