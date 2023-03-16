/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase.pkg4.pkg5.y.pkg6;

/**
 *
 * @author clavs
 */
public class EjerciciosExtra2 {
    public static void main(String[] args) {
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux;
        
        System.out.println("Valor de las variables inicializadas:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("Valor de las variables procesadas:");
        System.out.println("A = " + A + ", B = " + B + ", C = " + C + ", D = " + D);
    }
}
