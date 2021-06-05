package ads_week2_antwoorden;

import java.util.TreeSet;

public class VogelbekdierSortingTreeSort {

    static Vogelbekdier2[] getVogelbekdieren() {
        String[] namen = { "Jantje", "Zoe", "Perry", "Karel", "Elise" };
        int[] lengtes = { 50, 45, 52, 55, 42 };

        Vogelbekdier2[] vogelbekdieren = new Vogelbekdier2[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier2(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {
        Vogelbekdier2[] vogelbekdieren = getVogelbekdieren();

        // De vogelbekdieren worden nu stuk voor stuk toegevoegd in deze for loop,
        //   maar je zou ze ook allemaal ineenkeer kunnen toevoegen in de constructor
        //   van de TreeSet.
        TreeSet<Vogelbekdier2> vogelbekdierenset = new TreeSet<>();
        for (Vogelbekdier2 vogelbekdier : vogelbekdieren)
            vogelbekdierenset.add(vogelbekdier);
        
        Vogelbekdier2 perry = new Vogelbekdier2(52, "Perry");
        Vogelbekdier2 tiara = new Vogelbekdier2(47, "Tiara");

        System.out.println("Zit Perry in de set? " + vogelbekdierenset.contains(perry));
        System.out.println("Zit Tiara in de set? " + vogelbekdierenset.contains(tiara));

        System.out.println("Alle vogelbekdieren volgens de TreeSet");
        printVogelbekdieren(vogelbekdierenset);
        System.out.println();

    }

    public static void printVogelbekdieren(Iterable<Vogelbekdier2> vogelbekdieren) {
        System.out.println("----------Vogelbekdieren----------");
        for (Vogelbekdier2 vogelbekdier : vogelbekdieren)
            System.out.println(vogelbekdier);
    }

}