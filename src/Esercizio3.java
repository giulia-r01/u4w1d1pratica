import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi il valore del primo lato:");
        double l1 = scanner.nextDouble();

        System.out.println("Scrivi il valore del secondo lato:");
        double l2 = scanner.nextDouble();

        double perimetro = perimetroRettangolo(l1, l2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        System.out.println("Scrivi un numero");
        int n1 = scanner.nextInt();

        String risultato = pariDispari(n1);
        System.out.println(risultato);

        System.out.println("Inserisci il valore del primo lato");
        double a = scanner.nextDouble();
        System.out.println("Inserisci il valore del secondo lato");
        double b = scanner.nextDouble();
        System.out.println("Inserisci il valore del terzo lato");
        double c = scanner.nextDouble();

        double areaDiErone = perimetroTriangolo(a, b, c);
        System.out.println("L'area del triangolo è: " + areaDiErone);

    }


    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }

    public static String pariDispari(int n1) {
        if (n1 % 2 == 0) {
            return n1 + (" è pari");
        } else {
            return n1 + (" è dispari");
        }
    }

    public static double perimetroTriangolo(double a, double b, double c) {
        double semiperimetro = (a + b + c) / 2.0;
        return Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    }
}