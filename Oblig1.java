////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if (a.length == 0){
            throw new NoSuchElementException("Arrayet er tomt");
        }

        for (int i = 0; i < a.length-1; i++){
            if (a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        return a[a.length-1];
    }

    public static int ombyttinger(int[] a) {

        int teller = 0;

        for (int i = 0; i < a.length-1; i++){
            if (a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                teller++;
            }
        }
        return teller;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        int teller = 0;

        if (a.length > 0){
            teller++;

            for (int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]) {
                    throw new IllegalStateException("Arrayet er ikke sortert");
                }
                else if (a[i] != a[i+1]){
                    teller++;
                }
            }
        }

        return teller;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        int teller = 0;
        if (a.length > 0) {

            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        teller++;
                    }
                }
            }
        }
        return Math.abs(a.length-teller);
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        // Flytter alle verdiene i arrayet en plass til høyre
        if (a.length > 1) {
            // Initierer en hjelpe variabel med verdien til den siste bokstaven i tabellen
            char tmp = a[a.length - 1];
            // Kopierer arrayet og flytter det en plass til høyre ved hjelp av arraycopy
            System.arraycopy(a, 0, a, 1, a.length - 1);
            // Plasserer hjelpevariablen på plass a[0]
            a[0] = tmp;
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1

