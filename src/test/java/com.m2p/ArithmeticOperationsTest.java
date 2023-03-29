package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticOperationsTest{
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    @Test
    void toReturnTenWhenSevenIsAddedtoThree()
    {
        //Arrange
        int expectedValue = 10;

        //Act
        int actualValue = arithmeticOperations.add(7,3);

        //Assert
        assertEquals(expectedValue,actualValue);
    }
}