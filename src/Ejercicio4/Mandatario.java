/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Android2357
 */
public class Mandatario {
    String Dni;
    String nombre;

    public Mandatario(String Dni, String nombre) {
        this.Dni = Dni;
        this.nombre = nombre;
    }
    
    public void Visualizar(){
        System.out.println("DNI: "+Dni);
        System.out.println("Nombre: "+nombre);
    }
    
}
