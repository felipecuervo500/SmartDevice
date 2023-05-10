/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartdevice;

/**
 *
 * @author USUARIO
 */
public class SmartWatch extends SmartDevice1{
    private String tipoCorrea;
    private String cargador;
    
    public SmartWatch(String modelo, double memoria, double procesador, String pantalla, int precio, String teclado, String tipoCorrea, String cargador){
        super(modelo, memoria, procesador, pantalla, precio, teclado);
        this.tipoCorrea = tipoCorrea;
        this.cargador = cargador;
    }
    
    public void mostrarDatos2(){
        System.out.println("Modelo: " + getModelo() +
                "\nMemoria: "+ getMemoria()+
                "\nProcesador: "+ getProcesador()+
                "\nPantalla: "+ getPantalla()+
                "\nPrecio: "+ getPrecio()+
                "\nTeclado: " + getTeclado()+
                "\nTipoCorrea: " + tipoCorrea +
                "\nCargador: " + cargador
        );
    }
}
