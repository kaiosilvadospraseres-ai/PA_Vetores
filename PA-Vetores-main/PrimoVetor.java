package prjListaVetor01;

import java.util.Scanner;

public class PrimoVetor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j, divisores;
        a = new int[TAM];


        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + " valor do vetor A:");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            divisores = 0;

            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(a[i] + " é primo.");
            } else {
                System.out.println(a[i] + " não é primo.");
            }
        }
    }
}