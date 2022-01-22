public class Prime {
    public static boolean ärPrimtal(int n) {
        for (var m = 2; m < n; m++) {
            int remainder = n % m;

            if (remainder == 0) {
                return false;
            }
        }

        return true;
    }
}
