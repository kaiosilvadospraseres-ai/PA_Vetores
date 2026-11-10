package prjListaVetor01;

import java.util.Scanner;

public class ImparesEParesVetor {

	public static void main(String[] args) {
		 
        Scanner in = new Scanner(System.in);
        final int TAM = 20;
        int a[], b[], i, j = 0;
        a = new int[TAM];
        b = new int[TAM];
 
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor A:");
            a[i] = in.nextInt();
        }
        
        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }

        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
            }
        }

        System.out.print("\nB = ");
        for (i = 0; i < TAM; i++) {
            System.out.print(b[i] + "  ");
        }
    }
}