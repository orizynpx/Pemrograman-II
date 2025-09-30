package com.Modul1;

import java.util.Scanner;

public class PRAK103_2410817210007_NoorMuhammadAkmalSulaiman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int startingNum = input.nextInt();
        input.close();

        NumberSequenceN.printSequence(N, startingNum);
    }
}

class NumberSequenceN {
    public static void printSequence(int N, int startingNum) {
        do {
            if (startingNum % 2 == 0) {
                startingNum++;
            }
            System.out.print(startingNum);
            if (N > 1) {
                System.out.print(", ");
            }
            startingNum += 2;
            N--;
        } while (N > 0);
    }
}