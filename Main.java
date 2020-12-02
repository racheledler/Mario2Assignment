package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        do {
            System.out.print("Height: ");
            height = input.nextInt();
        } while (height > 8 || height < 1);
        hash(height);
    }

    static void hash(int x) {
// i is the row, n is the column
        for (int i = 0; i < x; i++) {
            // if x=4, a space will be printed until 3
            for (int space = 0; space < x - i -1; space++){
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++) {
                System.out.print("#");
            }
            System.out.print(" ");
            for (int n = 0; n <= i ; n++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
