/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Android2357
 */
public class Camion {
    int velocidad;
    int horasConduciendo;

    public void Alta(int velocidad, int horasConduciendo) {
        this.velocidad = velocidad;
        this.horasConduciendo = horasConduciendo;
    }
    public int ComprobarHora(){
    int devolver=-1;
        if(horasConduciendo<7){
            devolver=horasConduciendo;
        }
        return devolver;
    }
    
}
