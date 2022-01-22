public class Siffersumma {
    public static int siffersumma(int n) {
        var exponent = 1;
        int currentTotal = 0, lastInteger;


        do {
            lastInteger = n/(int)Math.pow(10, exponent);
            currentTotal += lastInteger;

            exponent++;
        } while(lastInteger != 0);

        return currentTotal;
    }
}
