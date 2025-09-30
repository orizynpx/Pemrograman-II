package com.Modul1;

import java.util.Scanner;

public class PRAK104_2410817210007_NoorMuhammadAkmalSulaiman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] abuHand = new char[3];
        char[] bagasHand = new char[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            abuHand[i] = input.next().charAt(0);
        }
        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            bagasHand[i] = input.next().charAt(0);
        }

        Player abu = new Player("Abu", abuHand);
        Player bagas = new Player("Bagas", bagasHand);

        RockPaperScissors.countScore(abu, bagas);
        RockPaperScissors.printWinner(abu, bagas);

        input.close();
    }
}

class Player {
    private String name;
    private char[] playerHand = new char[3];
    private int score;

    public Player(String name, char[] playerHand) {
        this.name = name;
        this.playerHand = playerHand;
    }

    public char getHandAt(int index) {
        return this.playerHand[index];
    }

    public int getScore() {
        return this.score;
    }

    public void increaseScore(int score) {
        this.score += score;
    }
}

class RockPaperScissors {

    public static void countScore(Player p1, Player p2) {
        for (int i = 0; i < 3; i++) {
            char a = p1.getHandAt(i);
            char b = p2.getHandAt(i);

            if (a != b) {
                if ((a == 'B' && b == 'G' || a == 'G' && b == 'K' || a == 'K' && b == 'B')) {
                    p1.increaseScore(1);
                } else {
                    p2.increaseScore(1);
                }
            }
        }
    }

    public static void printWinner(Player p1, Player p2) {
        if (p1.getScore() > p2.getScore()) {
            System.out.println("Abu");
        } else if  (p1.getScore() < p2.getScore()) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}