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
public class EjercicioGuia1 {
        public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero:");
        int num2 = leer.nextInt();
   
        if(num1>25 && num2>25){
        System.out.println("Ambos numeros son mayores a 25.");      
        }
        if(num1>25 && num2<=25){
        System.out.println("Un solo numero es mayor a 25.");
        }
        if(num1<=25 && num2>25){
        System.out.println("Un solo numero es mayor a 25.");
        }
        if(num1<=25 && num2<=25){
        System.out.println("Ningun numero es mayor a 25.");
        }
    } 
}
