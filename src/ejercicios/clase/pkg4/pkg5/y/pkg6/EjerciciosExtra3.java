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
public class EjerciciosExtra3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra.");
        System.out.println("Se devolvera si es vocal o consonante.");
        
        String letra = leer.next();
        
        if("a".equalsIgnoreCase(letra.substring(0, 1)) || "e".equalsIgnoreCase(letra.substring(0, 1)) || "i".equalsIgnoreCase(letra.substring(0, 1)) || "o".equalsIgnoreCase(letra.substring(0, 1)) || "u".equalsIgnoreCase(letra.substring(0, 1))) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada es una consonante.o");
        }
    }
}
