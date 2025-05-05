public class Esercizio1 {
    public static void main(String[] args) {
        int moltiplica = moltiplica(5, 5);
        System.out.println("Il risultato dell'operazione è " + moltiplica);

        String concatena = concatena("Anno", 2025);
        System.out.println("Il risultato del concatena è "+ concatena);

        String[] arrayIniziale = {"Ciao ", "mi ", "chiamo ", "Giulia ", "Rizzo"};
        String stringaDaInserire = "Nuova Parola";

        String[] risultato = inserisciInArray(arrayIniziale, stringaDaInserire);
//        System.out.println(risultato[0]);
//        System.out.println(risultato[1]);
//        System.out.println(risultato[2]);
//        System.out.println(risultato[3]);
//        System.out.println(risultato[4]);
//        System.out.println(risultato[5]);
        // Oppure:
        for (int i = 0; i < risultato.length; i++) {
            System.out.println(risultato[i]);
        }

    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena(String testo, int num){
        return testo + num;
    }

    public static String[] inserisciInArray(String[] array5, String nuovaStringa){
        String[] nuovoArray = new String[6];

        nuovoArray[0] = array5[0];
        nuovoArray[1] = array5[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = array5[2];
        nuovoArray[4] = array5[3];
        nuovoArray[5] = array5[4];

        return nuovoArray;
    }
}
