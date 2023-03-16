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
public class EjercicioGuia2 {
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al menu de ventas!");
        System.out.println("Seleccione el tipo de bomba requerido:");
        System.out.println("  1 - Bomba de agua.");
        System.out.println("  2 - Bomba de gasolina.");
        System.out.println("  3 - Bomba de hormigon.");
        System.out.println("  4 - Bomba de pasta alimenticia.");
        
        Scanner leer = new Scanner(System.in);
                
                int tipoBomba = leer.nextInt();
                
                switch(tipoBomba) {
                    case 1:
                        System.out.println("La bomba seleccionada es una bomba de agua.");
                break;
                    case 2:
                        System.out.println("La bomba seleccionada es una bomba de gasolina.");
                break;
                  case 3:
                        System.out.println("La bomba seleccionada es una bomba de hormigon.");
                break;
                  case 4:
                        System.out.println("La bomba seleccionada es una bomba de pasta alimenticia.");
                break;
                  default:
                        System.out.println("El numero ingresado no pertenece a ningun producto.");
                }

}
}
