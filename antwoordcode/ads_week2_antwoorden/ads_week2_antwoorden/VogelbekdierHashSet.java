package ads_week2_antwoorden;

import java.util.HashSet;

public class VogelbekdierHashSet {

    static Vogelbekdier3[] getVogelbekdieren() {
        String[] namen = { "Jantje", "Zoe", "Perry", "Karel", "Elise" };
        int[] lengtes = { 50, 45, 52, 55, 42 };

        Vogelbekdier3[] vogelbekdieren = new Vogelbekdier3[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier3(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {
        Vogelbekdier3[] vogelbekdieren = getVogelbekdieren();

        // De vogelbekdieren worden nu stuk voor stuk toegevoegd in deze for loop,
        //   maar je zou ze ook allemaal ineenkeer kunnen toevoegen in de constructor
        //   van de HashSet.
        HashSet<Vogelbekdier3> vogelbekdierenset = new HashSet<>();
        for (Vogelbekdier3 vogelbekdier : vogelbekdieren)
            vogelbekdierenset.add(vogelbekdier);
        
        Vogelbekdier3 perry = new Vogelbekdier3(52, "Perry");
        Vogelbekdier3 tiara = new Vogelbekdier3(47, "Tiara");

        System.out.println("Zit Perry in de set? " + vogelbekdierenset.contains(perry));
        System.out.println("Zit Tiara in de set? " + vogelbekdierenset.contains(tiara));
        System.out.println();
        System.out.println("Perry is weer eens ontsnapt! Bezig met Perry verwijderen...");
        vogelbekdierenset.remove(perry);
        System.out.println("Zit Perry in de set? " + vogelbekdierenset.contains(perry));
    }

}