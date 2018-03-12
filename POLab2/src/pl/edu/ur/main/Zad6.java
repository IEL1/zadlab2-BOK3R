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
public class Zad6 {

    public static void main(String[] arg) {
        Scanner wczytaj = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Podaj liczbe: ");
            a = wczytaj.nextInt();
            if (a < 0) {
                break;
            }
        }
    }
}
