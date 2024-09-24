/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequenciafibonacci;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class SequenciaFibonacci {

        public static boolean testeFibonacci(int numero){
            if (numero == 0 || numero == 1){
                return true;
            } 
            
            int a = 0;
            int b = 1;
            int soma = a + b;
            
            
            while (soma <= numero) {
                
                if (soma == numero) {
                    return true;
                } 
                a = b;
                b = soma;
                soma = a + b;
            }
            return false;
        }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite um número, por favor:");
        int numero = scanner.nextInt();
        
        
        if(testeFibonacci(numero)){
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        } 
        scanner.close();
    } 
    
}
