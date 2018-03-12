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
public class Zad7 {

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        int a, i, sort = 1, temp;
        System.out.print("Podaj ile liczb chcesz wprowadzic: ");
        a = wczytaj.nextInt();
        int[] tab = new int[a];

        for (i = 0; i < tab.length; i++) {
            System.out.print("Podaj liczbe: ");
            tab[i] = wczytaj.nextInt();
        }
        while (sort != 0) {
            sort = 0;
            for (i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    sort++;
                }
            }
        }
        for (i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }
}
