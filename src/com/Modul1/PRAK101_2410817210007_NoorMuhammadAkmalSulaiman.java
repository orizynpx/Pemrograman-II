package com.Modul1;

import java.util.Locale;
import java.util.Scanner;

public class PRAK101_2410817210007_NoorMuhammadAkmalSulaiman {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float weight = input.nextFloat();

        input.close();

        Person person = new Person(name, birthPlace, birthDate, birthMonth, birthYear, height, weight);
        person.printInfo();
    }
}

class Person {
    private String name, birthPlace;
    private int birthDate, birthMonth, birthYear, height;
    private float weight;
    private String[] months = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
        "Agustus", "September", "Oktober", "November", "Desember"
    };

    public Person(String name, String birthPlace, int birthDate, int birthMonth, int birthYear, int height, float weight) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Nama Lengkap " + this.name + ", Lahir di " + this.birthPlace + " pada Tanggal " + this.birthDate
                + " " + this.months[birthMonth - 1] + " " + this.birthYear);
        System.out.println("Tinggi Badan " + this.height + " cm dan Berat Badan " + this.weight + " kilogram");
    }
}