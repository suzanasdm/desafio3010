/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3010;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 60002070
 */
public class suzana4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       Random r = new Random();
        int numeros [][] = new int [5] [4];
        int soma = 0;
        for(int  i=0; i<numeros.length; i++){
                for ( int j=0; j<numeros[0].length; j++){
                    numeros[i][j] =r.nextInt(60);
        
                } 
        }
        
        for(int i=0; i<numeros.length; i++){
            System.out.println("\nlinha:"+(i +1));
            
            for( int j= 0; j<numeros[0].length;j++){
            soma = soma + numeros[i][j];
                System.out.println("soma="+ soma);
            
            }
        
        }
        
    }
    
    
}
