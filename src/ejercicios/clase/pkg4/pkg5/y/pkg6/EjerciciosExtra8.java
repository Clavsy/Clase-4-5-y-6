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
public class EjerciciosExtra8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int entrada;
        int numLeidos = 0;
        int contador = 0;
        int pares = 0;
        int impares = 0;
        
        System.out.println("Ingrese numeros enteros.");
        System.out.println("Si ingresa un multiplo de 5, el programa termina y arroja los resultados.");
        System.out.println("Los numeros negativos no se cuentan.");
        
        do {
            
            contador++;
            System.out.println("Numero #" + contador);
            entrada = leer.nextInt();
            
            if(entrada%5 != 0 && entrada >= 0){
            numLeidos++;
            }
            
            if(entrada%2 == 0){
                if (entrada >= 0 && entrada%5 != 0){
                    pares++;
                }
            } else {
                if (entrada >= 0 && entrada%5 != 0){
                    impares++;
                }
            }
            
        } while(entrada%5 != 0);
        
        System.out.println("Numeros leidos: " + numLeidos);
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
        
    }
}
