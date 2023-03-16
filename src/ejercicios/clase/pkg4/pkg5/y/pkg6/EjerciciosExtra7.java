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
public class EjerciciosExtra7 {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos numeros desea ingresar?");
        int n = leer.nextInt();
        int contador = 0;
        int promedio = 0;
        int entrada;
        int valorMax = -214748363;
        int valorMin = 214748364;
        
        while (contador < n) {
            
            contador++;
            System.out.println("Numero #" + contador);
            entrada = leer.nextInt();
            promedio = promedio + entrada;
            
            if (entrada < valorMin){
                valorMin = entrada;
            }
            
            if (entrada > valorMax){
                valorMax = entrada;
            } 
        }
        
        System.out.println("Promedio general = " + (promedio / n));
        System.out.println("Valor maximo ingresado = " + valorMax);
        System.out.println("Valor minimo ingresado = " + valorMin);
    }
}
