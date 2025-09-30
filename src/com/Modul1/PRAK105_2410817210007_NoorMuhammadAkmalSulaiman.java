package com.Modul1;

import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2410817210007_NoorMuhammadAkmalSulaiman {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        cylinder.printVolume();

        input.close();
    }
}

class Cylinder {
    private final double pi = 3.14;
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void printVolume() {
        double volume = this.pi * this.radius * this.radius * this.height;
        System.out.printf("Volume tabung dengan jari-jari %2.1f cm dan tinggi %2.1f cm adalah %4.3f m3", radius, height, volume);
    }
}