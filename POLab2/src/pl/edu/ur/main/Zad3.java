/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Boker
 */
public class Zad3 {

    public static void main(String[] args) {
        int i, a;
        boolean b = false;
        int[] tab = new int[10];
        Scanner wczytaj = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Podaj liczbe: ");
            tab[i] = wczytaj.nextInt();
        }

        System.out.println("Wybierz opcję:");
        System.out.println("1 - Wyświetlanie tablicy od pierwszego do ostatniego indeksu.");
        System.out.println("2 - Wyświetlanie tablicy od ostatniego do pierwszego indeksu.");
        System.out.println("3 - Wyświetlanie elementów o nieparzystych indeksach.");
        System.out.println("4 - Wyświetlanie elementów o parzystych indeksach.");

        do {
            System.out.print("Wybierz opcje: ");
            a = wczytaj.nextInt();
            if (a == 1) {
                b = true;
                for (i = 0; i < 10; i++) {
                    System.out.print(tab[i] + " ");
                }
            } else if (a == 2) {
                b = true;
                for (i = 9; i >= 0; i--) {
                    System.out.print(tab[i] + " ");
                }
            } else if (a == 3) {
                b = true;
                for (i = 1; i < 10; i = i + 2) {
                    System.out.print(tab[i] + " ");
                }
            } else if (a == 4) {
                b = true;
                for (i = 0; i < 10; i = i + 2) {
                    System.out.print(tab[i] + " ");
                }
            } else {
                b = false;
            }
        } while (b != true);
    }
}
