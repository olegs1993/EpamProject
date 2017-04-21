package com.company;

/**
 * Created by Oleg on 20.04.2017.
 */
public class Printer {

    public void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void reversePrint() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
