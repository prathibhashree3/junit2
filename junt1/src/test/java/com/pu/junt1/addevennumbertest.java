package com.pu.junt1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class addevennumbertest {

    @Test
    void testEvenNumber() {
        int num = 8;
        assertTrue(num % 2 == 0);
    }

    @Test
    void testOddNumber() {
        int num = 7;
        assertFalse(num % 2 == 0);
    }

    @Test
    void testZeroIsEven() {
        int num = 0;
        assertTrue(num % 2 == 0);
    }

    @Test
    void testNegativeEvenNumber() {
        int num = -4;
        assertTrue(num % 2 == 0);
    }
}