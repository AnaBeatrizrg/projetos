/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contema;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dev
 */
public class ContemA {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String texto = scanner.nextLine();
        
        String regex = "[áãaA]";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        
        int contador = 0;
        while (matcher.find()){
            contador++;
        }
        
        if(contador == 1){
            System.out.println("A String contém a letra A ou a, " + contador + " vez.");
        } else  if (contador > 1) {
            System.out.println("A String contém a letra A ou a, " + contador + " vezes.");
        } else {
            System.out.println("A String não contem a letra A ou a.");
        }
        
        
        
        


/*
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando que o usuário insira uma string
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        
        // Definindo a expressão regular para encontrar 'a' ou 'A'
        String regex = "[aA]";

        // Compilando a expressão regular
        Pattern pattern = Pattern.compile(regex);
        
        // Criando um Matcher para verificar a string
        Matcher matcher = pattern.matcher(entrada);

        // Inicializando o contador
        int contador = 0;

        // Encontrando todas as ocorrências de 'a' ou 'A'
        while (matcher.find()) {
            contador++;
        }
        
        // Exibindo o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' (ou 'A') existe na string e ocorre " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não existe na string.");
        }

        // Fechando o scanner
        scanner.close(); */
    }
}

        
    
    

