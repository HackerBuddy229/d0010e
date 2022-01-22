public class Kvadrat {

    public static int kvadratRekursiv(int k) {
        return k == 0 ? 0 : (2*k)+1-kvadratRekursiv(k+1);
    }
}
