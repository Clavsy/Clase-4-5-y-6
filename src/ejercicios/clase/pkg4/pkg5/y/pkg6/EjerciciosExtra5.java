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
public class EjerciciosExtra5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su categoria de socio: ");
        String category = leer.next();
        System.out.println("Ingrese el importe a abonar sin descuento: ");
        double price = leer.nextDouble();
      
        switch (category) {
            case "a":
                price=price/2;
                System.out.println("Debera abonar "+price);
                break;
            case "b":
                price=price-(35*price/100);
                System.out.println("Debera abonar "+price);
                break;
            case "c":
                System.out.println("Usted no cuenta con descuentos por su categoria de socio");
                break;
            default:
                break;
        }
    }
}
