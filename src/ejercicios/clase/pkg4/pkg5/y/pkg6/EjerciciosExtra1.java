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
public class EjerciciosExtra1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor en minutos.");
        System.out.println("Se devolvera el equivalente en dias y horas");
        int minutos = leer.nextInt();
        
        int dias = 0;
        int horas = 0;
        
        if (minutos > 1439){
            
            dias = minutos / 1440;
            
            while (minutos >= 1440) {
                minutos = minutos - 1440;
            }
            
            horas = minutos / 60;
            
        } else {
            
            horas = minutos / 60;
            
        }
        
        System.out.println("Dias = " + dias);
        System.out.println("Horas = " + horas);
    }
}
