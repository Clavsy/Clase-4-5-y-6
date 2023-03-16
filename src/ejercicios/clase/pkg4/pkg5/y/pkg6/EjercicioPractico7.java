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
public class EjercicioPractico7 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("SIMULADOR DE RS232:");
        System.out.println("Ingrese cadenas de max. 5 caracteres.");
        System.out.println("Forma de lectura de este dispositivo:");
        System.out.println("Si comienza con X y termina con O el envio es correcto.");
        System.out.println("Si no se cumple esta condicion, el envio es incorrecto.");
        System.out.println("Escriba ´´&&&&&´´ para finalizar los envios.");
        
        int contador = 0;
        int enviosCorrectos = 0;
        int enviosIncorrectos = 0;
        String envio;
        
        do{
            
            contador = contador + 1;
            System.out.println("Envio #" + contador + ":");
            
            envio = leer.next();
            
            if(!"&&&&&".equals(envio)) {
                     if (envio.length() == 5 && "X".equalsIgnoreCase(envio.substring(0, 1)) && "O".equalsIgnoreCase(envio.substring(4, 5))) {
                        enviosCorrectos = enviosCorrectos + 1;
                     } else {
                        enviosIncorrectos = enviosIncorrectos + 1;
                    }
            }
        }while(!"&&&&&".equals(envio));
        
        System.out.println("INFORME DE ENVIOS:");
        System.out.println("Envios correctos: " + enviosCorrectos);
        System.out.println("Envios incorrectos: " + enviosIncorrectos);
    }
}
