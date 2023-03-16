/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg4.pkg5.y.pkg6;

import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del cuadrado:");

        int columna;
        int filas;
        int num = leer.nextInt();
        
        for (columna = 1; columna <= num; columna++) {
            for (filas = 1; filas <= num; filas ++) {
                if ((columna > 1) && (columna < num) && (filas > 1) && (filas < num)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

