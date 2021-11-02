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
        int aleatorioEmpezar;
        boolean repeticion = true;
        //Declaracion de objetos
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //Bucle de repeticion del programa se repite hasta que el usuario le de a salir
        do {
            //Bucle do que asegura la introduccion correcta de los datos del menu
            do {
                System.out.println("Elige una de las opciones del menu\n1.- 1 vs 1\n"
                        + "2.- 1 1 vs maquina\n"
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
                            System.out.println("¿Quien va a empezar?\n Escribe el nombre del jugador 1");
                            nombreJugador1 = teclado.nextLine();
                            System.out.println("Escribe el nombre del jugador 2");
                            nombreJugador2 = teclado.nextLine();
                            break;
                        case 2:
                            System.out.println("Escribe el nombre del jugador 1");
                            nombreJugador1 = teclado.nextLine();
                            System.out.println("Escribe el nombre del jugador 2");
                            nombreJugador2 = teclado.nextLine();
                            aleatorioEmpezar = aleatorio.nextInt(2 - 1 + 1) + 2;
                            System.out.println("Empieza el jugador: " + aleatorioEmpezar);

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
