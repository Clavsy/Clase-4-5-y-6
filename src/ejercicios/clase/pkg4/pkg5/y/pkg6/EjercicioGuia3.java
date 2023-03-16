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
public class EjercicioGuia3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = 11;
        
        while(num1<0 || num1>10){
            
            System.out.println("Ingrese un numero entre 1 y 10");
            num1 = leer.nextInt();
            
        }
        
        System.out.println("El numero ingresado es " + num1);
        
    }
}
