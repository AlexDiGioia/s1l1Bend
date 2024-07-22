import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {

        int x = 8;
        int y = 12;
        System.out.println("Moltiplicazione: " + moltiplica(x, y));
        String sProva = "Ciao";
        System.out.println("Concatenazione: " + concatena(sProva, 123));
        String[] stringArray = {"uno", "due", "tre", "quattro", "cinque"};
        System.out.println("inserisciInArray: " + Arrays.toString(inserisciInArray(stringArray, sProva)));
    }

    public static int moltiplica(int n1, int n2) {
        return n1 * n2;
    }

    public static String concatena(String s, int n) {
        return s + n;
    }

    public static String[] inserisciInArray(String[] array, String newString) {
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array deve contenere esattamente 5 elementi.");
        }
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, 5);
        for (int i = newArray.length - 1; i > 3; i--) newArray[i] = newArray[i - 1];
        newArray[3] = newString;

        return newArray;
    }

}
