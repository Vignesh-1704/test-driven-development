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

    @Test
    void toReturnFiveWhenTwelveisSubtractedFromSeven()
    {
        //Arrange
        int expectedValue = 5;

        //Act
        int actualValue = arithmeticOperations.sub(12,7);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnNegativeFiveWhenSevenIsSubtractedFromTwelve()
    {
        //Arrange
        int expectedValue = -5;

        //Act
        int actualValue = arithmeticOperations.sub(7,12);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnSeventySevenWhenSevenIsMultipliedWithEleven()
    {
        //Arrange
        int expectedValue = 77;

        //Act
        int actualValue = arithmeticOperations.mul(7,11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnSeventySevenWhenNegativeSevenisMultipliedWithEleven()
    {
        //Arrange
        int expectedValue = 77;

        //Act
        int actualValue = arithmeticOperations.mul(-7,-11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnNegativeSeventySevenWhenNegativeSevenisMultipliedWithPositiveEleven()
    {
        //Arrange
        int expectedValue = -77;

        //Act
        int actualValue = arithmeticOperations.mul(-7,11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnNegativeSeventySevenWhenPositiveSevenisMultipliedWithNegativeEleven()
    {
        //Arrange
        int expectedValue = -77;

        //Act
        int actualValue = arithmeticOperations.mul(7,-11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toReturnZeroWhenSevenIsMultipliedWithZero()
    {
        //Arrange
        int expectedValue = 0;

        //Act
        int actualValue = arithmeticOperations.mul(7,0);

        //Assert
        assertEquals(expectedValue,actualValue);
    }
}