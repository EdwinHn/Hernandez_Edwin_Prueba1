/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hernandez_edwin_prueba1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author edwinhernandezlopez
 */
public class Hernandez_Edwin_Prueba1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int menu = 1;
        int opcion;

        do {
            int cicloOpcion = 1;

            System.out.println("--- MENNU ---\n");
            System.out.println("1- Palabra Alreves");
            System.out.println("2- Número Perfecto");
            System.out.println("3- Primos");
            System.out.println("4- Votaciones");
            System.out.println("5- Salir\n");

            System.out.print("Ingrese su opción: ");

            do {
                opcion = scan.nextInt();

                if (opcion < 0 || opcion > 5) {
                    System.out.print("Ingrese una opción válida: ");

                } else if (opcion == 1) {
                    System.out.println("** Palabra Alreves **\n");
                    cicloOpcion = 0;

                } else if (opcion == 2) {
                    System.out.println("** Número perfecto **\n");
                    cicloOpcion = 0;

                } else if (opcion == 3) {
                    System.out.println("** Primos **\n");
                    cicloOpcion = 0;

                } else if (opcion == 4) {
                    System.out.println("** Votaciones **\n");
                    cicloOpcion = 0;

                } else if (opcion == 5) {
                    System.out.println("adios :)");
                    cicloOpcion = 0;
                    menu = 0;
                }

            } while (cicloOpcion > 0);

        } while (menu > 0);

    }
}
