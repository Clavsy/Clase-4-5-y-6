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
public class EjercicioPractico4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que comience con la letra A:");
        
        String frase = leer.next();
        
        if ("A".equals(frase.substring(0,1))) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto.");
        }
    }
}
