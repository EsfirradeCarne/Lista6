
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class List6ATV1 {
    
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	float num[] = new float[10], qtdNegativos = 0, positivos = 0;
	
        for (int cont = 0; cont < 10; cont++) {
            System.out.print("Insira o " + (cont + 1) + "° número Real: ");
		num[cont] = entrada.nextFloat();

	if (num[cont] >= 0) {
            positivos = positivos + num[cont];
	} else {
            ++qtdNegativos;
	}
}
	if (qtdNegativos > 0) {
            System.out.println("A quantidade de números Reais negativos é: "
		+ qtdNegativos);
		}
	if (positivos > 0) {
            System.out.println("A soma dos números positivos do vetor é: "
		+ positivos);
	}

}
}
    

