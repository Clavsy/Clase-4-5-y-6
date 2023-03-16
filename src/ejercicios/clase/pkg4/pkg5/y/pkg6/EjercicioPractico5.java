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
public class EjercicioPractico5 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite hasta donde sumar:");
        int limite = leer.nextInt();
        int suma = 0;
        int entrada;
                
        do{
            System.out.println("Ingrese numeros a sumar:");
            entrada = leer.nextInt();
            suma = suma + entrada;
        } while(suma < limite);
        
        System.out.println("La suma total es de: " + suma);
    }
}
