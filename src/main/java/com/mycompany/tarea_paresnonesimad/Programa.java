/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_paresnonesimad;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Programa {

    public static void main(String[] args) {
        //Declaracion de variables
        int eleccion = 0;
        int eleccionJuego = 0;
        String nombreJugador1;
        String nombreJugador2;
        String nombre;
        String eleccionJugador;
        String eleccionJugadorNombre;
        int dedosJugador1 = 0;
        int dedosJugador2 = 0;
        int sumaDedos;
        int aleatorioEmpezar;
        int aleatorioMaquina;
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
                try {
                    eleccion = teclado.nextInt();
                } catch (InputMismatchException IME) {
                    System.out.println("Solo admite numeros del 1 al 3");
                    teclado.nextLine();
                }

            } while (eleccion < 1 || eleccion > 3);
            //Estructura de seleccion para elegir el modo de juego ( 1 contra 1 , 1 vs maquina o salir)
            switch (eleccion) {
                case 1:
                    //control de las opciones no se salgan del rango 
                    do {
                        System.out.println("Elige una de las opciones del menu\n1.- Eleccion manual\n"
                                + "2.- Eleccion Aleatoria\n"
                                + "3.- Salir");
                        try {
                            eleccionJuego = teclado.nextInt();
                        } catch (InputMismatchException IME) {
                            System.out.println("Solo admite numeros del 1 al 3");
                            teclado.nextLine();
                        }
                    } while (eleccionJuego < 1 || eleccionJuego > 3);

                    //Estructura de seleccion para elegir el modo de juego ( manual, Aleatorio o salir)
                    switch (eleccionJuego) {
                        case 1:
                            //Limpiamos el buffer al pasar de int a line
                            teclado.nextLine();
                            System.out.println("¿Quien va a empezar?\n"
                                    + "Escribe el nombre del jugador 1");
                            nombreJugador1 = teclado.nextLine();
                            System.out.println("Escribe el nombre del jugador 2");
                            nombreJugador2 = teclado.nextLine();

                            do {
                                System.out.println(nombreJugador1 + " elige pares o nones");
                                eleccionJugador = teclado.nextLine();
                                //Condicion que hace que el programa se repita hasta que el jugador introduzca los datos correctamente 
                                if (eleccionJugador.equalsIgnoreCase("pares") || (eleccionJugador.equalsIgnoreCase("nones"))) {
                                    eleccionJugadorNombre = nombreJugador1 + " pares";
                                    acceso = false;
                                } else {
                                    eleccionJugadorNombre = nombreJugador1 + " nones";

                                    acceso = true;
                                }
                            } while (acceso);
                            //bucle do while que contra la introduccion correcta de los rangos
                            do {
                                try {
                                    System.out.println(nombreJugador1 + " empieza, procede a sacar los dedos");
                                    dedosJugador1 = teclado.nextInt();
                                } catch (InputMismatchException IME) {
                                    System.out.println("Solo admite numeros del 0 al 10");
                                    teclado.nextLine();
                                }
                            } while (dedosJugador1 < 0 || dedosJugador1 > 10);
                            //bucle do while que contra la introduccion correcta de los rangos
                            do {
                                try {
                                    System.out.println(nombreJugador2 + " empieza, procede a sacar los dedos");
                                    dedosJugador2 = teclado.nextInt();
                                } catch (InputMismatchException IME) {
                                    System.out.println("Solo admite numeros del 0 al 10");
                                    teclado.nextLine();
                                }
                            } while (dedosJugador2 < 0 || dedosJugador2 > 10);
                            sumaDedos = dedosJugador2 + dedosJugador1;
                            System.out.println("La suma de los dedos sacado es " + sumaDedos);
                            //Condicion que controla si es pares o nones, si el resto es igual a 0 es par
                            if ((dedosJugador1 + dedosJugador2) % 2 == 0 && eleccionJugadorNombre.contains("pares")
                                    || eleccionJugadorNombre.contains("nones") && (dedosJugador1 + dedosJugador2) % 2 != 0) {
                                System.out.println("Gana: " + nombreJugador1);
                            }else{
                                System.out.println("Gana: "+ nombreJugador2);
                            }
                            break;
                        case 2:
                            System.out.println("Escribe el nombre del jugador 1");
                            teclado.nextLine();
                            nombreJugador1 = teclado.nextLine();
                            System.out.println("Escribe el nombre del jugador 2");
                            nombreJugador2 = teclado.nextLine();
                            //Objeto aleatorio que nos almacena en la variable un numero entre 1 y 2
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
                            //Bucle do while que asgura qu saquen los dedos de la mano
                            //el orden de introducir los dedos no influye ya que deben de sacar los dedos a la
                            do {
                                System.out.println(nombreJugador1 + " ,proceda a sacar los dedos");
                                dedosJugador1 = teclado.nextInt();

                            } while (dedosJugador1 < 0 || dedosJugador1 > 10);

                            do {
                                System.out.println(nombreJugador2 + " ,proceda a sacar los dedos");
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
                        case 3:
                            repeticion = false;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escribe el nombre del jugador 1");
                    teclado.nextLine();
                    nombreJugador1 = teclado.nextLine();

                    do {
                        System.out.println(nombreJugador1 + " elige pares o nones");
                        eleccionJugador = teclado.nextLine();
                        //Condicion que hace que el programa se repita hasta que el jugador introduzca los datos correctamente 
                        if (eleccionJugador.equalsIgnoreCase("pares") || (eleccionJugador.equalsIgnoreCase("nones"))) {
                            acceso = false;
                        } else {
                            acceso = true;
                        }
                    } while (acceso);
                    //bucle do while que contra la introduccion correcta de los rangos
                    do {
                        System.out.println(nombreJugador1 + " empieza, procede a sacar los dedos");
                        dedosJugador1 = teclado.nextInt();

                    } while (dedosJugador1 < 0 || dedosJugador1 > 10);
                    //bucle do while que contra la introduccion correcta de los rangos
                    aleatorioMaquina = aleatorio.nextInt(11);

                    System.out.println("La maquina procede a sacar los dedos " + aleatorioMaquina);

                    sumaDedos = aleatorioMaquina + dedosJugador1;
                    System.out.println("La suma de los dedos sacado es " + sumaDedos);
                    //Condicion que controla si es pares o nones, si el resto es igual a 0 es par
                    if (sumaDedos % 2 == 0) {
                        System.out.println("Ganan pares");
                    } else {
                        System.out.println("Ganan nones");
                    }
                    break;
                case 3:
                    repeticion = false;
                    break;
            }

        } while (repeticion);
    }
}
