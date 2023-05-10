/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartdevice;

/**
 *
 * @author USUARIO
 */
public class Smartphone extends SmartDevice1{
    private int camaras;
    private String sistemaOperativo;
    
    
    public Smartphone(String modelo, double memoria, double procesador, String pantalla, int precio, String teclado, int camaras, String sistemaOperativo) {
        super(modelo, memoria, procesador, pantalla, precio, teclado);
        this.camaras = camaras;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public void mostrarDatos1(){
        System.out.println("Modelo: " + getModelo() +
                "\nMemoria: "+ getMemoria()+
                "\nProcesador: "+ getProcesador()+
                "\nPantalla: "+ getPantalla()+
                "\nPrecio: "+ getPrecio()+
                "\nTeclado: " + getTeclado()+
                "\nCamaras: " + camaras +
                "\nSistemaOperativo: " + sistemaOperativo
        );
    }
    }

