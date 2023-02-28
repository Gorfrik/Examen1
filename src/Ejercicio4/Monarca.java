/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Android2357
 */
public class Monarca extends Mandatario{
    boolean inmune;
    float valor_regalos;

    public Monarca(boolean inmune, float valor_regalos, String Dni, String nombre) {
        super(Dni, nombre);
        this.inmune = inmune;
        this.valor_regalos = valor_regalos;
    }

   public void Visualizar(){
        super.Visualizar();
        System.out.println("Inmunidad: "+inmune);
        System.out.println("Valor de los regalos "+valor_regalos);
    }
    
}
