/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Presentar decremento de 10 en 10
        
         Scanner datos = new Scanner(System.in);
        // Creación de variables
        int n;
        // Pedir al usuario que ingrese variables
        System.out.print("Ingrese un número: ");
        n = datos.nextInt();
        // Ciclo repetitivo
        do{
            n++;
        }while(n%10 != 0);     
        do{
            System.out.println(n);
            n -= 10;
        }while(n > 10);        
    }
    
}