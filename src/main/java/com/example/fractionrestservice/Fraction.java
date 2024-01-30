package com.example.fractionrestservice;

public class Fraction {
    private String numerator;
    private String denominator;

    public Fraction(String numerator, String denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator='" + numerator + '\'' +
                ", denominator='" + denominator + '\'' +
                '}';
    }
}
