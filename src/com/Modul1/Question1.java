package com.Modul1;

public class Question1 {
    private String name, birthPlace;
    private int birthDate, birthMonth, birthYear, height;
    private float weight;

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getInfo() {
        return "Nama Lengkap " + this.name + ", Lahir di " +
                this.birthPlace + " pada Tanggal " + this.birthDate + " " +
                this.birthMonth + " " + this.birthYear + "\n" + "Tinggi Badan" +
                this.height + " cm dan Berat Badan " + this.weight + " kilogram";
    }
}