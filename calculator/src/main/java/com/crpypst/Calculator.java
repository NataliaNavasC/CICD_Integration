package com.crpypst;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello world! V4");
    }

    public double sum(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return a - b;
    }
    public double multiplication(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
        if ( b != 0 ){
            return a / b;
        }
        return -1; // Error flag
    }
    public double plus2( double a ){
        return a + 2; // test
    }
}