package ads_week3_antwoorden;

import java.util.TreeMap;

public class VogelbekdierMaps {

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

        /********* Deel 1 ***********/

        TreeMap<String, Vogelbekdier> stringMap = new TreeMap<>();

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            stringMap.put(vogelbekdier.naam, vogelbekdier);
        }

        System.out.println("Lengte van Zoe: " + stringMap.get("Zoe").lengte);
        System.out.println("Zit Patrick hierin? " + stringMap.containsKey("Patrick"));


        /********* Deel 2 ***********/
        TreeMap<Integer, Vogelbekdier> intMap = new TreeMap<>();

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            intMap.put(vogelbekdier.lengte, vogelbekdier);
        }

        
        System.out.println("===== String print =====");
        // Print alle vogelbekdieren
        for (Vogelbekdier vogelbekdier : stringMap.values()) {
            System.out.println(vogelbekdier);
        }

        System.out.println("===== Integer print =====");
        for (Vogelbekdier vogelbekdier : intMap.values()) {
            System.out.println(vogelbekdier);
        }


    }

}