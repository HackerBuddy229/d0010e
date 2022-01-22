public class Change {

    public final int notation10, notation5, notation1;

    public Change(int totalValue) {
        notation10 = totalValue/10;
        var remainder = totalValue % 10;

        notation5 = remainder/5;
        remainder = remainder%5;

        notation1 = remainder;
    }
}
