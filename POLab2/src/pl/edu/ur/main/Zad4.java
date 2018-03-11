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
public class Zad4 {
    
        public static void main(String[] args) {
            int i,menu,sum=0,iloczyn=1,min,max;
            float srednia;
            int[] tab = new int[10];
            Scanner wczytaj = new Scanner(System.in);
            for(i=0;i<tab.length;i++){
                System.out.print("Podaj liczbe: ");
                tab[i] = wczytaj.nextInt();
            }
            
            System.out.println("1 - oblicz sumę elementów tablicy");
            System.out.println("2 - oblicz iloczyn elementów tablicy");
            System.out.println("3 - wyznacz wartość średnią");
            System.out.println("4 - wyznacz wartość minimalną");
            System.out.println("5 - wyznacz wartość maksymalną");
            System.out.print("Wybierz opcje: ");
            menu = wczytaj.nextInt();
            switch(menu){
                case 1:
                    for(i=0;i<tab.length;i++)
                        sum=sum+tab[i];
                    System.out.println("Suma elementow wynosi: "+sum);
                    break;
                case 2:
                    for(i=0;i<tab.length;i++)
                        iloczyn=iloczyn*tab[i];
                    System.out.println("Iloczyn elementow wynosi: "+iloczyn);
                    break;
                case 3:
                    for(i=0;i<tab.length;i++)
                       sum=sum+tab[i];
                    srednia=sum/tab.length;
                    System.out.println("Srednia elementow wynosi: "+srednia);
                    break;
                case 4:
                    min=tab[0];
                    for(i=1;i<tab.length;i++){
                        if(tab[i]<min)
                            min=tab[i];
                    }
                    System.out.println("Wartosc minimalna to: "+min);
                    break;
                case 5:
                    max=tab[0];
                    for(i=1;i<tab.length;i++){
                        if(tab[i]>max)
                            max=tab[i];
                    }
                    System.out.println("Wartosc maksymalna to: "+max);
                    break;
                default:
                    System.out.println("Wybrano zla opcje.");
                    break;
            }
    }
}
