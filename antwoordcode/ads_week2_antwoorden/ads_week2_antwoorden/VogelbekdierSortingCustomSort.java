package ads_week2_antwoorden;

public class VogelbekdierSortingCustomSort {

    static Vogelbekdier[] getVogelbekdieren() {
        String[] namen = { "Jantje", "Zoe", "Perry", "Karel", "Elise" };
        int[] lengtes = { 50, 45, 52, 55, 42 };

        Vogelbekdier[] vogelbekdieren = new Vogelbekdier[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {
        Vogelbekdier[] vogelbekdieren = getVogelbekdieren();

        // Taak 1: Sorteer de vogelbekdieren op lengtes en print ze naar sysout.
        // Taak 2: Sorteer de vogelbekdieren op naam en print ze naar sysout.
        // Implementeer je eigen sorteerfunctie!
        // Insert je code hieronder. 
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op lengte...");
        sortByInt(vogelbekdieren);
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op naam...");
        sortByString(vogelbekdieren);
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

    }

    public static void printVogelbekdieren(Vogelbekdier[] vogelbekdieren) {
        System.out.println("----------Vogelbekdieren----------");
        for (Vogelbekdier vogelbekdier : vogelbekdieren)
            System.out.println(vogelbekdier);
    }

    // Vind de index van het vogelbekdier met de minste lengte.
    // Bekijkt vanaf de minIndex.
    public static int findMinKeyInt(Vogelbekdier[] vogelbekdieren, int minIndex) {
        int minValIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = minIndex; i < vogelbekdieren.length; i++) {
            int curValue = vogelbekdieren[i].lengte;
            if (curValue < minValue) {
                minValue = curValue;
                minValIndex = i;
            }
        }
        return minValIndex;
    }

    // Implementeert SelectionSort d.m.v. integers.
    public static void sortByInt(Vogelbekdier[] vogelbekdieren) {
        for (int i = 0; i < vogelbekdieren.length - 1; i++) {
            int minValueKey = findMinKeyInt(vogelbekdieren, i);
            // Swap
            Vogelbekdier temp = vogelbekdieren[minValueKey];
            vogelbekdieren[minValueKey] = vogelbekdieren[i];
            vogelbekdieren[i] = temp;
        }
    }

    // Vind de index van het vogelbekdier met de minste lengte.
    // Bekijkt vanaf de minIndex.
    public static int findMinKeyString(Vogelbekdier[] vogelbekdieren, int minIndex) {
        int minValIndex = -1;
        String minString = "ZZZZZZZZ";
        for (int i = minIndex; i < vogelbekdieren.length; i++) {
            String curString = vogelbekdieren[i].naam;
            if (curString.compareTo(minString) < 0) {
                minString = curString;
                minValIndex = i;
            }
        }
        return minValIndex;
    }

    // Implementeert SelectionSort d.m.v. integers.
    public static void sortByString(Vogelbekdier[] vogelbekdieren) {
        for (int i = 0; i < vogelbekdieren.length - 1; i++) {
            int minValueKey = findMinKeyString(vogelbekdieren, i);
            // Swap
            Vogelbekdier temp = vogelbekdieren[minValueKey];
            vogelbekdieren[minValueKey] = vogelbekdieren[i];
            vogelbekdieren[i] = temp;
        }
    }

}