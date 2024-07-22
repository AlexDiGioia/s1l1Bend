public class Es3 {
    public static void main(String[] args) {

        double x = 4.7;
        double y = 8.6;
        double z = 4.2;
        int evenOrOdd = 6;

        System.out.println("perimetro rettangolo: " + perimetroRettangolo(x, y));

        if (pariDispari(evenOrOdd))
            System.out.println(evenOrOdd + " è dispari");
        System.out.println(evenOrOdd + " è pari");
        System.out.println("Perimetro Triangolo: " + perimetroTriangolo(x, y, z));
    }

    public static double perimetroRettangolo(double b, double h) {
        return (b + h) * 2;
    }

    public static boolean pariDispari(int n) {
        return n % 2 == 1;
    }

    public static double perimetroTriangolo(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3) / 2;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
}
