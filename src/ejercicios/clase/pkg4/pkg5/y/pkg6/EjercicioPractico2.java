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
public class EjercicioPractico2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la contraseña:");
        
        String pass = leer.next();
        
        if (pass.equalsIgnoreCase("eureka")) {
            System.out.println("Contraseña correcta!");
        } else {
            System.out.println("Contraseueña incorrecta.");
        }
                
    }
}
