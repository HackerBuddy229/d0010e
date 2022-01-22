package com.company;

public class Raise {

    public static void main(String[] args) {
        //task9();

        task102();
    }

    private static void task9() {
        for (int i = 1; i <= 15; i++) {
            var half = recRaiseHalf(1.5, i);
            var one = recRaiseOne(1.5, i);

            System.out.println(half + ": 0, " + one.result + ":"+ one.depth);
        }
    }

    private static void task102() {
        var x = 1.0001;
        for (var k = 1; k <= 10000; k++) {
            var result = recRaiseOne(x, k);
            System.out.println(result.depth);
        }
    }

    private static RecursiveResult<Double> recRaiseOne(double x, int k) {
        if (k==0) {
            return new RecursiveResult<Double>(1.0, 0);
        } else {
            var result = recRaiseOne(x, k-1);
            return new RecursiveResult<Double>(x * result.result, result.depth+1);
        }
    }

    private static double recRaiseHalf(double x, int k) {
        if (k == 0) {
            return 1;
        }

        var exponent = Math.floor(k/2);
        var x_pow_k = Math.pow(x, exponent);

        return k % 2 == 0 ? Math.pow(x_pow_k, 2) : Math.pow(x_pow_k, 2) * x;
    }


}

