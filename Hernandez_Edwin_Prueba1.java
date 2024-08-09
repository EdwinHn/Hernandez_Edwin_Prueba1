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

            //Menu Principal
            System.out.println("--- MENU ---\n");
            System.out.println("1- Palabra Alreves");
            System.out.println("2- Número Perfecto");
            System.out.println("3- Primos");
            System.out.println("4- Votaciones");
            System.out.println("5- Salir\n");

            //Ingreso de opción
            System.out.print("Ingrese su opción: ");

            do {
                opcion = scan.nextInt();

                //Ingreso de opción inválida 
                if (opcion < 0 || opcion > 5) {
                    System.out.print("Ingrese una opción válida: ");
                    
                    
                    
                    

                    //Ejercicio 1 - Palabra invertida
                } else if (opcion == 1) {

                    int contador = 0;
                    String palabra;
                    String palabraInvertida = "";

                    System.out.println("\n** Palabra Alreves **\n");

                    //Ingreso de palabra
                    System.out.print("Ingrese una palabra: ");
                    palabra = scan.next();

                    int length = (palabra.length());

                    //Inversion del texto para su impresion posterior
                    for (int contadorInvertido = 0; contadorInvertido < (palabra.length()); contadorInvertido++) {
                        char letraInvertida = palabra.charAt(contadorInvertido);
                        palabraInvertida = letraInvertida + palabraInvertida;

                    }

                    //Impresión del texto invertido
                    while (length > 0) {
                        System.out.print(palabraInvertida.charAt(contador));

                        contador++;
                        length--;
                    }

                    //Regreso al menú
                    System.out.println("\n");
                    cicloOpcion = 0;

                    
                    
                    
                    
                    //Opción 2 - Número Perfecto 
                } else if (opcion == 2) {
                    int numeroPerfecto = 0;
                    int suma = 0;

                    System.out.println("\n** Número perfecto **\n");

                    //Ingreso de número
                    System.out.print("Ingrese un número: ");
                    numeroPerfecto = scan.nextInt();

                    //Comfirmación
                    for (int i = 1; i <= numeroPerfecto / 2; i++) {
                        if (numeroPerfecto % i == 0) {
                            suma += i;
                        }
                    }

                    //Impresión de resultados
                    if (suma == numeroPerfecto) {
                        System.out.println(numeroPerfecto + " es un número perfecto\n");

                    } else {
                        System.out.println(numeroPerfecto + " no es un número perfecto\n");

                    }

                    cicloOpcion = 0;

                    
                    
                    
                    
                    //Opción 3 - Primos
                } else if (opcion == 3) {
                    System.out.println("\n** Primos **\n");

                    int divisor = 0;
                    int numeroRandom = random.nextInt(1, 100);
                    String resultado = "";

                    //Impresión del número generado
                    System.out.println("Número generado: " + numeroRandom);

                    //Busca de divisores
                    for (int i = 2; i <= Math.sqrt(numeroRandom); i++) {
                        if (numeroRandom % i == 0) {
                            divisor = i;

                        }
                    }

                    //Selección de resultado
                    if (divisor == 0) {
                        resultado = numeroRandom + " es primo";

                    } else {
                        resultado = numeroRandom + " no es primo";

                    }

                    //Impresión de resultados y regreso al menú
                    System.out.println(resultado + "\n");
                    cicloOpcion = 0;

                    
                    
                    
                    
                    //Opción 4 - Votaciones
                } else if (opcion == 4) {

                    double porcentaje = 0;
                    int validacion = 0;
                    int votantes;
                    int cicloVotantes = 1;

                    int cicloVoto = 0;
                    String voto;

                    int votoAmarillo = 0;
                    int votoAzul = 0;
                    int votoNegro = 0;
                    int votoRojo = 0;
                    int votoNulo = 0;

                    String ganador = "";

                    System.out.println("\n** Votaciones **\n");

                    //Ingreso de votantes
                    System.out.print("¿Cuántos votantes hay en el país?: ");

                    do {

                        votantes = scan.nextInt();

                        //Ingreso de opción inválida 
                        if (votantes <= 0) {
                            System.out.print("Ingrese una cantidad válida: ");

                        } else {
                            cicloVoto = votantes;
                            System.out.println("");
                            cicloVotantes = 0;

                        }

                    } while (cicloVotantes > 0);

                    //Ingreso de voto
                    do {
                        System.out.println("-AMARILLO\n-AZUL\n-NEGRO\n-ROJO\n");
                        System.out.print("Escriba su elección: ");
                        voto = scan.next().toUpperCase();

                        //Opción inválida
                        if (!voto.equals("AMARILLO") && !voto.equals("AZUL") && !voto.equals("NEGRO") && !voto.equals("ROJO")) {
                            votoNulo++;

                            //Opciones válidas
                        } else if (voto.equals("AMARILLO")) {
                            votoAmarillo++;

                        } else if (voto.equals("AZUL")) {
                            votoAzul++;

                        } else if (voto.equals("NEGRO")) {
                            votoNegro++;

                        } else if (voto.equals("ROJO")) {
                            votoRojo++;

                        }

                        cicloVoto--;

                    } while (cicloVoto > 0);

                    //Cálculo de resultados
                    porcentaje = votantes * 0.6;

                    if (votoNulo > porcentaje) {
                        ganador = "VOTACIÓN FALLIDA";
                        validacion = 1;

                    } else if ((votoAmarillo > votoAzul) && (votoAmarillo > votoNegro) && (votoAmarillo > votoRojo)) {
                        ganador = "AMARILLO";

                    } else if ((votoAzul > votoAmarillo) && (votoAzul > votoNegro) && (votoAzul > votoRojo)) {
                        ganador = "AZUL";

                    } else if ((votoNegro > votoAmarillo) && (votoNegro > votoAzul) && (votoNegro > votoRojo)) {
                        ganador = "NEGRO";

                    } else if ((votoRojo > votoAmarillo) && (votoRojo > votoAzul) && (votoRojo > votoNegro)) {
                        ganador = "ROJO";

                    }

                    //Impresión de resultados y regreso al menú
                    System.out.println("\n - Resultados -\n");
                    System.out.println("AMARILLO: " + votoAmarillo);
                    System.out.println("AZUL: " + votoAzul);
                    System.out.println("NEGRO: " + votoNegro);
                    System.out.println("ROJO: " + votoRojo);
                    System.out.println("VOTOS NULOS: " + votoNulo + "\n");

                    if (validacion == 0) {
                        System.out.println("GANADOR: " + ganador + "\n");

                    } else if (validacion == 1) {
                        System.out.println("Resultado: " + ganador + "\n");

                    }

                    cicloOpcion = 0;

                    
                    
                    
                    
                    //Opción 5- Salir
                } else if (opcion == 5) {
                    System.out.println("\nadios :)");
                    cicloOpcion = 0;
                    menu = 0;
                }

            } while (cicloOpcion > 0);

        } while (menu > 0);

    }
}
