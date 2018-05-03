package com.tsb;

public class UtilityFunctions {

    public static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }

}
