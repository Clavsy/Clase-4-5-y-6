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
public class EjerciciosExtra4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 10.");
        System.out.println("Se trauducira en numeros romanos.");
        String n=leer.next();
        
        switch (n){
            case "1":
                System.out.println("I");
                break;
            case "2":
                System.out.println("II");
                break;
            case "3":
                System.out.println("III");
                break;
            case "4":
                System.out.println("IV");
                break;
            case "5":
                System.out.println("V");
                break;
            case "6":
                System.out.println("VI");
                break;
            case "7":
                System.out.println("VII");
                break;
            case "8":
                System.out.println("VIII");
                break;
            case "9":
                System.out.println("IX");
                break;
            case "10":
                System.out.println("X");
                break;
            default:
            System.out.println("El valor ingresado en la variable no es valido");
        }
    }
}
