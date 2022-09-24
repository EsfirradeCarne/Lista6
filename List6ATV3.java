
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class List6ATV3 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int vetor[] = new int[10];
       
       List<Integer> numerosRepetidos = new ArrayList<>();

       for (int i = 0; i < vetor.length; i++) {

           vetor[i] = scanner.nextInt();

       }

       for (int i = 0; i < vetor.length; i++) {
       if (!numerosRepetidos.contains(vetor[i])){
       for (int j = i + 1; j < vetor.length; j++) {
       if(vetor[i] == vetor[j]){

                  numerosRepetidos.add(vetor[i]);

                      break;

                  }

              }

           }

       }

       System.out.println("Números repetidos: " + numerosRepetidos);

   }

}
    

