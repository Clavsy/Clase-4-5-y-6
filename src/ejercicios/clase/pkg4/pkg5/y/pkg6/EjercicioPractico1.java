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
public class EjercicioPractico1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero. Se determinara si es par o no.");
        int num = leer.nextInt();
        
        if(num%2 !=0) {
            System.out.println("El numero es impar.");
        } else {
            System.out.println("El numero es par.");
        }
}
}
    
