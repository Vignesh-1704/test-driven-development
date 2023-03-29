package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticOperationsTest{
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    //Addition Test Cases
    @Test
    void toReturnTenWhenSevenIsAddedToThree()
    {
        //Arrange
        int expectedSum = 10;

        //Act
        int actualSum = arithmeticOperations.addition(7,3);

        //Assert
        assertEquals(expectedSum,actualSum);
    }

    //Subtraction Test Cases
    @Test
    void toReturnFiveWhenTwelveIsSubtractedFromSeven()
    {
        //Arrange
        int expectedDifference = 5;

        //Act
        int actualDifference = arithmeticOperations.subtract(12,7);

        //Assert
        assertEquals(expectedDifference,actualDifference);
    }

    @Test
    void toReturnNegativeFiveWhenSevenIsSubtractedFromTwelve()
    {
        //Arrange
        int expectedDifference = -5;

        //Act
        int actualDifference = arithmeticOperations.subtract(7,12);

        //Assert
        assertEquals(expectedDifference,actualDifference);
    }

    //Multiplication Test Cases

    @Test
    void toReturnSeventySevenWhenSevenIsMultipliedWithEleven()
    {
        //Arrange
        int expectedValue = 77;

        //Act
        int actualValue = arithmeticOperations.multiply(7,11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnSeventySevenWhenNegativeSevenIsMultipliedWithEleven()
    {
        //Arrange
        int expectedValue = 77;

        //Act
        int actualValue = arithmeticOperations.multiply(-7,-11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnNegativeSeventySevenWhenNegativeSevenIsMultipliedWithPositiveEleven()
    {
        //Arrange
        int expectedValue = -77;

        //Act
        int actualValue = arithmeticOperations.multiply(-7,11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnNegativeSeventySevenWhenPositiveSevenIsMultipliedWithNegativeEleven()
    {
        //Arrange
        int expectedValue = -77;

        //Act
        int actualValue = arithmeticOperations.multiply(7,-11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnZeroWhenSevenIsMultipliedWithZero()
    {
        //Arrange
        int expectedValue = 0;

        //Act
        int actualValue = arithmeticOperations.multiply(7,0);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Division Test Cases
    @Test
    void toReturnFiveWhenTenIsDividedByTwo()
    {
        //Arrange
        int expectedValue = 5;

        //Act
        int actualValue = arithmeticOperations.divide(10,2);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnExceptionWhenDividedByZero()
    {
        assertThrows(ArithmeticException.class,()->arithmeticOperations.divide(3,0));
    }
}