package org.pab2020.factorial;

/**
 * This class implements a method to compute the factorial of an integer number
 *
 * @author Juan Antonio Herrera Conde
 */


public class Factorial {

    public long compute(long value) {
        long result;
        if ((value == 0) || (value == 1)) {
            result = 1;
        } else if (value == 2) {
            result = 2;
        } else {
            result = value * compute(value - 1);
        }
        return result;
    }
}



