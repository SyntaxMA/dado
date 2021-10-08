package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sumadados = new int[12];
        int dado1;
        int dado2;

        System.out.print("Veces que quieres tirar el dado: ");
        int veces = scanner.nextInt();

        for(int i = 0; i < veces; ++i) {
            dado1 = (int)(Math.random() * 6) + 1;
            dado2 = (int)(Math.random() * 6) + 1;
            ++sumadados[dado1 + dado2 - 1];
        }

        for(int f = 1; f < 12; ++f) {
            System.out.println(f + 1 + " -->\t" + sumadados[f] + " vegades");
        }

    }
}
