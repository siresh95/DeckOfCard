package com.bridgelabz;

import java.util.Scanner;

public class NumberOfPlayer {

    public static void numberOfPlayer() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number Of Player (Minimum Player 2 and Maximum player 4)");
        int num = scan.nextInt();
        if (num > 4) {
            System.out.println("Invalid Number Of Player");
        }
        if (num < 2) {
            System.out.println("Invalid Number Of Player");
        }
    }
}