/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg4.pkg5.y.pkg6;

import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author clavs
 */
public class EjercicioPractico3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase de maximo 8 caracteres:");
        
        String frase = leer.next();
        
        if (frase.length() == 8) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto.Pe");
        }
        
    }
}
