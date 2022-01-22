package com.company;

public class Main {

    public static void main(String[] args) {
	    //get input
        var a0 = Integer.parseInt(args[0]);
        var ex = args[1];

        //ugly code
        switch (ex) {
            case "1":
                task1(a0);
                break;
            case "2":
                task2(a0);
                break;
            case "3":
                task3();
                break;
            case "4":
                task4(a0);
                break;
            case "5":
                task5();
                break;
            case "26":
                task6();
                break;
        }

    }

    private static void task6() {
        for (var i = 1; i <= 15; i++) {
            var iter = LifeLength.iterateLifeLength(i);
            var rec = LifeLength.recLifeLength(i);

            var out = String.format("iterative: %s, recursive: %s", iter, rec);

            System.out.println(out);
        }
    }

    private static void task5() {
        for (int i = 0; i < 15; i++) {
            var out = String.format("a%d = %d, l=%d", i, LifeLength.iterateF(42, i),
                    LifeLength.iterateLifeLength(LifeLength.iterateF(42, i)));

            System.out.println(out);
        }
    }



    private static void task4(int a0) {

        for (var i = 1; i <= 15; i++) {
            var result = LifeLength.iterateLifeLength(i);
            var output = intsToString(i, result);

            System.out.println(output);
        }

    }

    private static String intsToString(int a0, int iterations) {
        return String.format("The life length of %s is %s.", a0, iterations);
    }

    private static void task3() {
        var out = LifeLength.iterateF(3,5) + "\n" +
                LifeLength.iterateF(42,3) + "\n" +
                LifeLength.iterateF(1,3);

        System.out.println(out);
    }

    private static void task2(int a0) {
        //get output
        int[] out = {
                LifeLength.f1(a0),
                LifeLength.f2(a0),
                LifeLength.f4(a0),
                LifeLength.f8(a0),
                LifeLength.f16(a0),
                LifeLength.f32(a0),
        };

        //print [don't blame me for this looking like shit]
        var outputString = String.format("f1=%s, f2=%s, f4=%s, f8=%s, f16=%s, f32=%s",
                out[0],out[1],out[2],out[3],out[4],out[5]);

        System.out.println(outputString);

        System.out.println(LifeLength.iterateF(3,5)+ " " +
                LifeLength.iterateF(42,3)+ " " +
                LifeLength.iterateF(1, 3));
    }

    private static void task1(int a0) {
        System.out.println(LifeLength.f1(a0));
    }


}
