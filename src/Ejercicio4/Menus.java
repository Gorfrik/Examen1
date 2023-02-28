/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Android2357
 */
public class Menus {

    public static void MENU() {

        System.out.println("------=MENU=------");
        System.out.println("1).Nueva mandatario");
        System.out.println("2).Nuevo Dictador");
        System.out.println("3).Nuevo monarca");
        System.out.println("4).Nueva marioneta");
        System.out.println("5).Ver Persona de poder");
        System.out.println("6).Salir");

    }

    public static void main(String[] args) {
        ArrayList<Mandatario> mario = new ArrayList();

        Scanner sn = new Scanner(System.in);
        ArrayList<Mandatario> man = new ArrayList();
        int caso;
        String Dni;
        String nombre;
        do {
            MENU();
            caso = sn.nextInt();
            switch (caso) {
                case 1:
                    System.out.println("Nombre");
                    nombre = sn.next();
                    System.out.println("Dni");
                    Dni = sn.next();
                    Mandatario manda = new Mandatario(Dni, nombre);
                    man.add(manda);
                    break;
                case 2:
                    System.out.println("Nombre");
                    nombre = sn.next();
                    System.out.println("Dni");
                    Dni = sn.next();
                    System.out.println("Es un asesino? si/no");
                    String ase = sn.next();
                    boolean asesi = false;
                    if (ase.equalsIgnoreCase("si")) {
                        asesi = true;
                    }
                    System.out.println("Cuantos anios lleva en el poder");
                    int anios=sn.nextInt();
                    Dictador dic = new Dictador(asesi, anios, Dni, nombre);
                    man.add(dic);
                    break;
                case 3:
                    System.out.println("Nombre");
                    nombre = sn.next();
                    System.out.println("Dni");
                    Dni = sn.next();
                    System.out.println("Es inmune?");
                    String inmu = sn.next();
                    boolean inmune = false;
                    if (inmu.equalsIgnoreCase("si")) {
                        asesi = true;
                    }
                    System.out.println("Cual es el valor de los regalos?");
                    float valor=sn.nextFloat();
                    Monarca mona = new Monarca(inmune, valor, Dni, nombre);
                    man.add(mona);
                    break;
                case 4:
                    System.out.println("Nombre");
                    nombre = sn.next();
                    System.out.println("Dni");
                    Dni = sn.next();
                    System.out.println("A quien maneja");
                    String mane=sn.next();
                    System.out.println("Cuantas cuerdas tiene?");
                    int cuerdas=sn.nextInt();
                    Marioneta mari = new Marioneta(mane, cuerdas, Dni, nombre);
                    man.add(mari);
                    break;
                case 5:
                    boolean encontrado=true;
                    System.out.println("Nombre");
                    nombre = sn.next();
                    for (int i = 0; i < man.size(); i++) {
                        if (man.get(i).nombre.equalsIgnoreCase(nombre)) {
                            man.get(i).Visualizar();
                            encontrado=false;
                        }
                    }
                    if (encontrado){
                        System.out.println("No se encontro");}
                    break;

            }
        } while (caso != 6);
    }
}
