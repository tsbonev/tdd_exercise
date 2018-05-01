package com.tsb;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fractionConstructor() {

        Fraction fraction = new Fraction(2, 1);

        assertEquals(2, fraction.num);
        assertEquals(1, fraction.denom);

    }

    @Test
    void freactionNormalization(){
        Fraction f1 = new Fraction(3, 6);
        Fraction f2 = new Fraction(1, 2);

        assertTrue((f2.equals(f1)));
    }

    @Test
    void fractionSum() {
        Fraction f1 = new Fraction(3, 6);
        Fraction f2 = new Fraction(3, 4);
        Fraction sumFraction = new Fraction(5, 4);

        assertTrue((sumFraction.equals(f1.sum(f2))));

    }

    @Test
    void fractionSubtraction(){
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(1 ,5);
        Fraction subtractedFraction = new Fraction(2, 5);

        assertTrue((subtractedFraction.equals(f1.subtract(f2))));

    }

    @Test
    void complexFractionSubtraction(){
        Fraction f1 = new Fraction(3, 6);
        Fraction f2 = new Fraction(1 ,6);
        Fraction subtractedFraction = new Fraction(1, 3);

        assertTrue((subtractedFraction.equals(f1.subtract(f2))));
    }

}