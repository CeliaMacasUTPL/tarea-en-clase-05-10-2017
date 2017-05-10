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
public class ejercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Presentar número par random de una serie
       
       Scanner datos=new Scanner(System.in);
       //Creación de variables
       int n,i=0,x;
       //Pedir al usuario que ingrese las variables
       System.out.print("Ingrese un número: ");
       n=datos.nextInt();
       //Ciclo repetitivo
        do{
            x=(int)(Math.random()*n);
            System.out.println("Número: "+x);
        }while(x%2!=0);
        System.out.println("Número seleccionado: "+x);    
    }
    
}
 


      