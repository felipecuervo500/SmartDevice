/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.smartdevice;

/**
 *
 * @author USUARIO
 */
public class SmartDevice {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("OppoSens", 64.50, 1.80, "LCD",
                1800000, "touch", 4, "Android");
        smartphone.mostrarDatos1();
        
        SmartWatch smartWatch = new SmartWatch("Baywatch", 68.50, 1.90, "OLED",
                3100000, "membrana", "metálica", "ijiZuo");
        smartWatch.mostrarDatos2();
    }
}
