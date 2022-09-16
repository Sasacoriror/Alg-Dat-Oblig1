////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
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
        int partall = 0;
        int oddetall = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0){
                partall++;
            }else{
                oddetall++;
            }
        }

        int[] innPartall = new int[partall];
        int[] innOdetall = new int[oddetall];

        int partallIndex = 0;
        int oddetallIndex = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                innPartall[partallIndex] = a[i];
                partallIndex++;
            }else {
                innOdetall[oddetallIndex] = a[i];
                oddetallIndex++;
            }
        }

        Arrays.sort(innPartall);
        Arrays.sort(innOdetall);

        for (int i = 0; i < innOdetall.length; i++){
            a[i] = innOdetall[i];
        }

        for (int i = 0; i < innPartall.length; i++){
            a[oddetall] = innPartall[i];
            oddetall++;
        }
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length > 1) {
            char tmp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = tmp;
        }
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        StringBuilder flettetString = new StringBuilder();

        for(int i = 0; i < s.length() || i < t.length(); ++i) {
            if(i < s.length()) {
                flettetString.append(s.charAt(i));
            }
            if(i < t.length()) {
                flettetString.append(t.charAt(i));
            }
        }
        return flettetString.toString();
    }

    /// 7b)
    public static String flett(String... s) {
        StringBuilder flettetString = new StringBuilder();
        int charIndex = 0;
        boolean ferdig = false;

        while (!ferdig) {
            ferdig = true;

            for (String innhold : s) {
                int lengde = innhold.length();
                if (lengde > charIndex) {
                    flettetString.append(innhold.charAt(charIndex));
                    ferdig = false;
                }
            }
            charIndex++;
        }
        return flettetString.toString();
    }

}  // Oblig1

