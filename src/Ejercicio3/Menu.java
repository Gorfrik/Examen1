/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Android2357
 */
public class Menu {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Camion cam = new Camion();
        boolean salir;
        do {
            salir=false;
            System.out.println("Cuantas horas va a conducir");
            int hor = sn.nextInt();
            cam.Alta(60, hor);
            int hora = cam.ComprobarHora();
            if (hora == -1) {
                System.out.println("error");
                salir = true;
            }
        } while (salir);

    }
}