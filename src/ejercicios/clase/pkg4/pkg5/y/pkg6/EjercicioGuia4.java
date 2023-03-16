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
public class EjercicioGuia4 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese 20 numeros:");
        
        int contador = 0;
        int num;
        int suma = 0;
        
        do{
            
            System.out.println("Numero " + (contador+1));
            num = leer.nextInt();
            contador = contador + 1;
            
            if (num>=0)
                suma = suma + num;
            
            switch(num){
                case 0:
                        contador = 20;
                        System.out.println("Se capturo el numero 0.");
            }
                    
        } while(contador<20);
        
        System.out.println("La suma de los valores ingresados es = " + suma);
    }
}
        
        

