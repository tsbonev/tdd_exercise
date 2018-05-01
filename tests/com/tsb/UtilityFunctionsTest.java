package com.tsb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityFunctionsTest {

    @Test
    void greatestCommonDivider(){
        assertEquals(1, UtilityFunctions.gcd(2, 3));
    }

    @Test
    void leastCommonMultiple(){
        assertEquals(6, UtilityFunctions.lcm(3, 2));
    }

}