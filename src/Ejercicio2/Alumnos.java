/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Android2357
 */
public class Alumnos {
    public static void main(String[] args) {
        String DNI= "77558962F";
        String Nombre = "Paquito";
        Alumno Alumno1=new Alumno(DNI,Nombre);
        Alumno Alumno2=Alumno1;
        System.out.println( Alumno2);
    }
           
    
}
