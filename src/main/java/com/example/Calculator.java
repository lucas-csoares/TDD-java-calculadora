package com.example;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public double division(int num1, int num2) {
        return (double) num1 / num2;
    }


    public Number multiplication(double num1, double num2) {
        double resultado = num1 * num2;
        if(resultado == (int) resultado)
            return (int) resultado;
        else
            return resultado;
    }



}
