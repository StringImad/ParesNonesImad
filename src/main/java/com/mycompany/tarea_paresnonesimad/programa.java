/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_paresnonesimad;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class programa {

    public static void main(String[] args) {
        //Declaracion de variables
        int eleccion = 0;
        int eleccionJuego = 0;
        String nombreJugador1;
        String nombreJugador2;
        String nombre;
        String eleccionJugador;
        int dedosJugador1;
        int dedosJugador2;
        int sumaDedos;
        int aleatorioEmpezar;
        boolean repeticion = true;
        boolean acceso = true;

        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //Bucle de repeticion del programa se repite hasta que el usuario le de a salir
        do {
            //Bucle do que asegura la introduccion correcta de los datos del menu
            do {
                System.out.println("Elige una de las opciones del menu\n1.- 1 vs 1\n"
                        + "2.- 1 vs maquina\n"
                        + "3.- Salir");
                eleccion = teclado.nextInt();
            } while (eleccion < 1 || eleccion > 3);
            switch (eleccion) {
                case 1:
                    do {
                        System.out.println("Elige una de las opciones del menu\n1.- Eleccion manual\n"
                                + "2.- Eleccion Aleatoria\n"
                                + "3.- Salir");
                        eleccionJuego = teclado.nextInt();

                    } while (eleccionJuego < 1 || eleccionJuego > 3);
                    switch (eleccionJuego) {
                        case 1:
                            teclado.nextLine();
                            System.out.println("¿Quien va a empezar?\nEscribe el nombre del jugador 1");
                            nombreJugador1 = teclado.nextLine();
                            System.out.println("Escribe el nombre del jugador 2");
                            nombreJugador2 = teclado.nextLine();
                            do {
                                System.out.println(nombreJugador1 + " elige pares o nones");
                                eleccionJugador = teclado.nextLine();
                                if (eleccionJugador.equalsIgnoreCase("pares") || (eleccionJugador.equalsIgnoreCase("nones"))) {
                                    acceso = false;
                                } else {
                                    acceso = true;
                                }
                            } while (acceso);
                            do {
                                System.out.println(nombreJugador1 + " empieza, procede a sacar los dedos");
                                dedosJugador1 = teclado.nextInt();

                            } while (dedosJugador1 < 0 || dedosJugador1 > 10);

                            do {
                                System.out.println(nombreJugador2 + " empieza, procede a sacar los dedos");
                                dedosJugador2 = teclado.nextInt();
                            } while (dedosJugador2 < 0 || dedosJugador2 > 10);
                            sumaDedos = dedosJugador2 + dedosJugador1;
                            System.out.println("La suma de los dedos sacado es " + sumaDedos);
                            if (sumaDedos % 2 == 0) {
                                System.out.println("Ganan pares");
                            } else {
                                System.out.println("Ganan nones");
                            }
                            break;
                        case 2:
                            System.out.println("Escribe el nombre del jugador 1");
                            teclado.nextLine();
                            nombreJugador1 = teclado.nextLine();
                            System.out.println("Escribe el nombre del jugador 2");
                            nombreJugador2 = teclado.nextLine();
                            aleatorioEmpezar = aleatorio.nextInt(2 - 1 + 1) + 2;

                            if (aleatorioEmpezar == 1) {
                                System.out.println("Empieza el jugador: " + nombreJugador1);
                            } else {
                                System.out.println("Empieza el jugador: " + nombreJugador2);
                            }

                            do {
                                if (aleatorioEmpezar == 1) {
                                    nombre = nombreJugador1;
                                } else {
                                    nombre = nombreJugador2;
                                }
                                System.out.println(nombre + " elige pares o nones");
                                eleccionJugador = teclado.nextLine();
                                if (eleccionJugador.equalsIgnoreCase("pares") || (eleccionJugador.equalsIgnoreCase("nones"))) {
                                    acceso = false;
                                } else {
                                    acceso = true;
                                }
                            } while (acceso);
                            

                            break;
                        case 3:
                            repeticion = false;
                            break;
                    }
                    break;
                case 2:

                    break;
                case 3:
                    repeticion = false;
                    break;
            }

        } while (repeticion);
    }
}
