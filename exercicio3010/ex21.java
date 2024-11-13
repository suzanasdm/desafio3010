/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3010;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author suzana
 */
public class ex21 {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeros [][] = new int [3] [4];
           
            System.out.println("Ensira os valore desejados:");
             for(int  i=0; i<numeros.length; i++){
                for ( int j=0; j<numeros.length; j++){
                    numeros[i][j] =s.nextInt();
                    
            
                }
                
             }
             for(int i=0; i<numeros.length;i++){
             for(int j = 0; j<numeros[0].length;j++) {
             
                 System.out.println("valor desejado:"+ numeros[i][j]);}    
            
             }
            }
}

                      

            

        
    
    
    

