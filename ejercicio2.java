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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Numero randum
        
        Scanner datos=new Scanner(System.in);
        //Creación de variables
        int n,a,i=1,b;
        //Variables ingresadas por usuario
        System.out.print("Ingrese un numero: ");
        n=datos.nextInt();
        //Ciclo repetitivo
        do{
           b=(int)(Math.random()*n);
           System.out.println("\n Número: "+b);
           System.out.println("Desea ver un numero nuevo (1/2)");
           a=datos.nextInt();
        }while(a!=1);    
    }
}
   