/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Android2357
 */
public class Ejercicio1 {

    public static void MENU() {

        System.out.println("------=MENU=------");
        System.out.println("1).Tomar temperatura");
        System.out.println("2).Ver ultima temperatura");
        System.out.println("3).Ver todas");
        System.out.println("4).Eliminar la temperatura mas bajas de todas");
        System.out.println("5).Salir");

    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Integer> tem = new ArrayList();
        int caso;
        do {
            MENU();
            caso = sn.nextInt();
            switch (caso) {
                case 1:
                    System.out.println("Temperatura nueva:");
                    int temperatura = sn.nextInt();
                    tem.add(temperatura);
                    break;
                case 2:
                    int ultima = tem.size()-1;
                    System.out.println("La ultima temperatura es " + tem.get(ultima));
                    break;
                case 3:
                    for (int i = 0; i < tem.size(); i++) {
                        System.out.println("Temperatura " + i+1 + "es: " + tem.get(i));
                    }
                    break;
                case 4:

                    int temMenor = 1000;
                    int posicion=0;
                    if (tem.size() > 0) {
                        temMenor = tem.get(0);
                    }
                    for (int i = 0; i < tem.size(); i++) {
                        if (temMenor > tem.get(i)) {
                            temMenor = tem.get(i);
                            posicion=i;
                        }

                    }
                    if (temMenor == 1000) {
                        System.out.println("No se encontro temperatura");
                    }else
                        tem.remove(posicion);
                   
                    
                    break;
                case 5:

                    break;

            }
        } while (caso != 5);
    }
}
