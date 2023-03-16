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
public class EjercicioPractico6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros para acceder al menú:");
        System.out.println("Numero #1:");
        int num1 = leer.nextInt();
        System.out.println("Numero #2:");
        int num2 = leer.nextInt();
        
        int eleccion;
        String salir = "N";
        
        do{
            
            System.out.println("MENÚ");
            System.out.println(" 1. Sumar");
            System.out.println(" 2. Restar");
            System.out.println(" 3. Multiplicar");
            System.out.println(" 4. Dividir");
            System.out.println(" 5. Salir");
            System.out.println("Elija opción:");
            eleccion = leer.nextInt();
        
            switch(eleccion){
                case 1:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 + num2));
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 - num2));
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 * num2));
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("El resultado es " + (num1 / num2));
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Esta seguro que desea salir? ( S / N )");
                    salir = leer.next();
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opcion invalida.");
                    System.out.println(" ");
            }
        } while (!"S".equalsIgnoreCase(salir));

               
    }
}

