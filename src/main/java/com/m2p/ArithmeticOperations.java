package com.m2p;

public class ArithmeticOperations {
    public int addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        if(secondNumber == 0)
        {
            throw new ArithmeticException();
        }
        return firstNumber / secondNumber;
    }
}
