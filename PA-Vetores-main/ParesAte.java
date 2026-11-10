package prjListaVetor01;

import java.util.Scanner;

public class ParesAte {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j;
        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor A:");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.print("\nNúmero " + a[i] + " - pares de 0 até " + a[i] + ": ");
            for (j = 0; j <= a[i]; j += 2) {
                System.out.print(j + "  ");
            }
        }
    }
}