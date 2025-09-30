package com.Modul1;

import java.util.Scanner;

public class PRAK102_2410817210007_NoorMuhammadAkmalSulaiman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startingNum = input.nextInt();
        input.close();

        NumberSequence.printSequence(startingNum);
    }
}

class NumberSequence {
    public static void printSequence(int startingNum) {
        int i = 0;
        while (i <= 10) {
            if (startingNum % 5 == 0) {
                System.out.print(startingNum / 5 - 1);
            } else {
                System.out.print(startingNum);
            }
            if (i < 10) {
                System.out.print(", ");
            }
            startingNum++;
            i++;
        }
    }
}