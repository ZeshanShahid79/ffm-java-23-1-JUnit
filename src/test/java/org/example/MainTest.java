package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @Test
    void returnWelcome_whenAgeIs18_OrAbove() {
        //GIVEN
        int age = 19;
        // WHEN
        String actual = Main.isOfFullAge(age);
        //THEN
        String expected = "Welcome go in and pay your Entrancefee";
        assertEquals(expected, actual);
    }

    @Test
    void returnToYoungWhenAgeIsBelow18() {
        //GIVEN
        int age = 17;
        //WHEN
        String actual = Main.isOfFullAge(age);
        //THEN
        String expected = "You are too young";
        Assertions.assertEquals(expected, actual);
    }

    @Test
     void testAddition() {
        // GIVEN
        int a = 5;
        int b = 7;
        // WHEN
        int actual = Main.addTwoNumbers(a, b);
        // THEN
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
     void testIsEven() {
        // GIVEN
        int evenNumber = 10;
        int oddNumber = 7;

        // WHEN
        boolean evenResult = Main.isEven(evenNumber);
        boolean oddResult = Main.isEven(oddNumber);

        // THEN
        assertTrue(evenResult); // Die Zahl 10 sollte gerade sein
        assertFalse(oddResult); // Die Zahl 7 sollte ungerade sein
    }

    @Test
     void testMultiply() {
        // GIVEN
        int a = 3;
        int b = 4;
        // WHEN
        int actualProduct = Main.multiply(a, b);
        // THEN
        int expectedProduct = 12;
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
     void testToUpperCase() {
        // GIVEN
        String text = "hello";
        String expectedUpperCase = "HELLO";

        // WHEN
        String actualUpperCase = Main.toUpperCase(text);

        // THEN
        assertEquals(expectedUpperCase, actualUpperCase);
    }
    @Test
     void testIsPositive(){
        // Arrange
        int positiveNumber=10;
        int negativeNumber=-5;

        // Act
        boolean positiveResult=Main.isPositive(positiveNumber);
        boolean negativeResult=Main.isPositive(negativeNumber);

        // Assert
        assertTrue(positiveResult); // Die Zahl 10 sollte positiv sein
        assertFalse(negativeResult); // Die Zahl -5 sollte nicht positiv sein
    }
}