package com.company;

public class LifeLength {

    /**
     * Could be prettier
     * @param a0 n natural number
     * @return next number in sequence(always natural)
     */
    public static int f1(int a0) {
        int out;

        if (a0 == 1) {out = 1;}
        else if (a0 % 2 == 0) {out = a0/2;}
        else {out = 3*a0+1;}

        return out;
    }

    /**
     *
     * @param a0
     * @param rounds
     * @return
     */
    public static int iterateF(int a0, int rounds) {
        int out = a0;

        for (int round = 0; round < rounds; round++) {
            out = f1(out);
        }

        return out;
    }


    // Why would you possibly make me do this, I will cry...
    public static int f2(int a0) { return iterateF(a0, 2); }
    public static int f4(int a0) { return iterateF(a0, 4); }
    public static int f8(int a0) { return iterateF(a0, 8); }
    public static int f16(int a0) { return iterateF(a0, 16); }
    public static int f32(int a0) { return iterateF(a0, 32); }

    public static int iterateLifeLength(int a0) {
        int iterations = 0;
        int current_a = a0;

        while (current_a != 1) {
            current_a = f1(current_a);
            iterations++;
        }

        return iterations;
    }

//    public static int reclifelength(int a0) {
//        return a0 == 1 ? 1 : reclifelength(f1(a0));
//    }

    public static int recLifeLength(int a0) {
        return a0 == 1 ? 0 : 1+recLifeLength(f1(a0));
    }
}

