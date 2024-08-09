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
        Random random = new Random();

        int menu = 1;
        int opcion;

        do {
            int cicloOpcion = 1;

            System.out.println("--- MENU ---\n");
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

                    int contador = 0;
                    String palabra;
                    String palabraInvertida = "";

                    System.out.println("\n** Palabra Alreves **\n");

                    System.out.print("Ingrese una palabra: ");
                    palabra = scan.next();

                    int length = (palabra.length());

                    //Inversion del texto para su impresion posterior
                    for (int contadorInvertido = 0; contadorInvertido < (palabra.length()); contadorInvertido++) {
                        char letraInvertida = palabra.charAt(contadorInvertido);
                        palabraInvertida = letraInvertida + palabraInvertida;

                    }

                    while (length > 0) {
                        System.out.print(palabraInvertida.charAt(contador));

                        contador++;
                        length--;
                    }

                    System.out.println("\n");
                    cicloOpcion = 0;

                } else if (opcion == 2) {
                    System.out.println("\n** Número perfecto **\n");
                    cicloOpcion = 0;

                } else if (opcion == 3) {
                    System.out.println("\n** Primos **\n");

                    int divisor = 0;
                    int numeroRandom = random.nextInt(1, 100);
                    String resultado = "";

                    System.out.println("Número generado: " + numeroRandom);

                    for (int i = 2; i <= Math.sqrt(numeroRandom); i++) {
                        if (numeroRandom % i == 0) {
                            divisor = i;
                            
                        }
                    }
                    
                    if (divisor == 0) {
                        resultado = numeroRandom + " es primo";

                    } else {
                        resultado = numeroRandom + " no es primo";

                    }

                    System.out.println(resultado + "\n");
                    cicloOpcion = 0;

                } else if (opcion == 4) {
                    System.out.println("\n** Votaciones **\n");
                    cicloOpcion = 0;

                } else if (opcion == 5) {
                    System.out.println("\nadios :)");
                    cicloOpcion = 0;
                    menu = 0;
                }

            } while (cicloOpcion > 0);

        } while (menu > 0);

    }
}
