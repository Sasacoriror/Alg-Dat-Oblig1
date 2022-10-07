////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import static java.lang.Math.abs;

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

        // Det vil bli flest ombyttinger når det største tallet er plassert først
        // Det vil bli færrest ombyttinger hvis arrayet er sortert i stigende rekkefølge

        /*
        Med forskjellige tall(n) i en tabell er gjennomsnitt log(n)-0.423 av de større er den største av tallene
        fra kompendiet foran for 10, 100, 1000 tilfeldige ulike tall gir gjennomsnitt 1.9 , 4.2 og 6.5. Det
        forteller oss at maks > a[i] er true 8, 96 og 993 ganger. Denne metoden gir 7, 95 og 995 ombyttinger
        for tilsvarende n ulike tall. Men i maks funksjonen fra tidligere er sammenligningen motsatt, dvs
        antall ganger a[i] > maks. Så tilordningen i metoden maks utføres mindre enn antall ombyttinger
        utføres i denne metoden. Med det er da maks mer effekriv enn denne metoden.
         */
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

        int lengde = a.length;

        if (lengde < 2) {
            return;
        }

        int partallindex;
        int hoyre = lengde - 1;
        int venstre = 0;

        for (int i = 0; i < lengde; i++) {
            while (abs(a[venstre]) % 2 == 1 && venstre < lengde - 1) {
                venstre++;
            }
            while (a[hoyre] % 2 == 0 && hoyre > 0) {
                hoyre--;
            }
            if (venstre < hoyre) {
                bytt(a,venstre,hoyre);

            }
        }
        partallindex = venstre;

        if (hoyre == lengde - 1) {
            partallindex = lengde;
        }

        if(0 < partallindex) {
            quicksort(a, 0, partallindex-1);
        }

        if(partallindex < lengde) {
            quicksort(a, partallindex, lengde - 1);
        }
    }


    public static void quicksort(int[] a, int fra, int til) {
        if (fra >= til){
            return;
        }
        int k = partisjon2(a, fra, til, (fra + til) / 2);
        quicksort(a, fra, k - 1);
        quicksort(a, k + 1, til);
    }


    public static int partisjon1(int[] a, int v, int h, int skille) {
        while (true) {
            while (v <= h && a[v] < skille) v++;
            while (v <= h && a[h] >= skille) h--;
            if (v < h) {
                bytt(a, v++, h--);
            }
            else return v;
        }
    }
    public static int partisjon2(int[] a, int v,int h, int index){
        bytt(a,index,h);
        int pos = partisjon1(a,v,h-1,a[h]);
        bytt(a,pos,h);
        return pos;
    }

    public static void bytt(int[] a, int venstre, int hoyre) {
        int tmp = a[venstre];
        a[venstre] = a[hoyre];
        a[hoyre] = tmp;
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        if (a.length > 1) {
            char siste = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = siste;
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

