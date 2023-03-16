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
public class EjerciciosExtra6 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas a medir:");
        int personas = leer.nextInt();
        int contador = 0;
        int altura;
        int normales = 0;
        int umpalumpa = 0;
        int menor160 = 0;
        int promedio = 0;
        
        do {
            
            contador++;
            System.out.println("Persona #" + contador);
            altura = leer.nextInt();
            
            if(altura < 160) {
                umpalumpa = umpalumpa + altura;
                promedio = promedio + altura;
                menor160++;
            } else {
                normales = normales + altura;
                promedio = promedio + altura;
            }
            
        } while(contador != personas);
        
        System.out.println("PROMEDIO DE ALTURAS:");
        System.out.println("Menor a 160cm: " + (umpalumpa / menor160));
        System.out.println("Mayor a 160cm: " + (normales / (personas - menor160)));
        System.out.println("Promedio general: " + (promedio / personas));
    }
 }

