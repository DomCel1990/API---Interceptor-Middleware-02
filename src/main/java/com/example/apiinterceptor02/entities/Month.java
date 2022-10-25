package com.example.apiinterceptor02.entities;
public class Month {
    private int monthNumber;
    private String englishName;

    private String italianName;
    private String germanName;

    public Month() {
    }

    public Month(int monthNumber, String englishName, String italianName, String germanName) {
        this.monthNumber = monthNumber;
        this.englishName = englishName;
        this.italianName=italianName;
        this.germanName=germanName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getItalianName() {
        return italianName;
    }

    public String getGermanName() {
        return germanName;
    }
    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }
}

