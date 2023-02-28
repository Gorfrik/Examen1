/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Android2357
 */
public class Marioneta extends Mandatario{
    String manejador;
    int nCuerdas;

    public Marioneta(String manejador, int nCuerdas, String Dni, String nombre) {
        super(Dni, nombre);
        this.manejador = manejador;
        this.nCuerdas = nCuerdas;
    }

    public void Visualizar(){
        super.Visualizar();
        System.out.println("Manejador de: "+manejador);
        System.out.println("Numero de cuerdas: "+nCuerdas);
    }
}
