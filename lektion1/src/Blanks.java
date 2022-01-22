public class Blanks {

    public static String blanks(int n) {
        var out = "";

        for (var i = n; i > 0; i--){
            out += " ";
        }

        return out;
    }
}
