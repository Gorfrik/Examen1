/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Android2357
 */
public class Alumno {

    private String DNI;
    private String Nombre;

    public Alumno(String DNI, String Nombre) {
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "DNI=" + DNI + ", Nombre=" + Nombre + '}';
    }
    
}
