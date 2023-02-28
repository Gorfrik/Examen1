/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Android2357
 */
public class Dictador extends Mandatario{
    boolean Asesino;
    int Anos_poder;

    public Dictador(boolean Asesino, int Anos_poder, String Dni, String nombre) {
        super(Dni, nombre);
        this.Asesino = Asesino;
        this.Anos_poder = Anos_poder;
    }

    public void Visualizar(){
        super.Visualizar();
        System.out.println("Asesino: "+Asesino);
        System.out.println("Anos_poder"+Anos_poder);
    }
}
