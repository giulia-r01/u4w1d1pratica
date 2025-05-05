import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa");
        String a1 = scanner.next();
        System.out.println("Inserisci la seconda stringa");
        String a2 = scanner.next();
        System.out.println("Inserisci la terza stringa");
        String a3 = scanner.next();

        String daStampare = concatenaStringhe(a1, a2, a3);
        System.out.println(daStampare);
    }

    public static String concatenaStringhe(String a1, String a2, String a3){
        return (a1+a2+a3)+ " " + (a3 + a2 + a1);
    }
}
