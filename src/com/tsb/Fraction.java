package com.tsb;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Fraction {

    int num;
    int denom;

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;

        if(num > 1 && num <= denom && UtilityFunctions.lcm(num, denom) == denom){
            this.num = num / (denom / num);
            this.denom = denom / num;
        }

    }


    public Fraction sum(Fraction fraction) {
        Fraction result = new Fraction(0, 0);

        if (this.denom == fraction.denom) {
            result.denom = this.denom;
            result.num = this.num + fraction.num;
            return result;
        }

        int lcm = UtilityFunctions.lcm(fraction.denom, this.denom);
        result.denom = lcm;
        result.num = this.num * (lcm / this.denom) + fraction.num * (lcm / fraction.denom);
        return result;

    }

    public Fraction subtract(Fraction fraction){
        throw new NotImplementedException();
    }

    public Fraction multiply(Fraction fraction){
        throw new NotImplementedException();
    }

    public Fraction divide(Fraction fraction){
        throw new NotImplementedException();
    }



    public boolean equals(Fraction fraction) {

        if (this.denom == fraction.denom && this.num == fraction.num) return true;

        return false;
    }


}
