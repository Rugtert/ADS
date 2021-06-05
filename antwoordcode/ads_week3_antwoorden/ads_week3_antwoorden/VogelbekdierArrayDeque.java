package ads_week3_antwoorden;

import java.util.ArrayDeque;

public class VogelbekdierArrayDeque {

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
        
        ArrayDeque<Vogelbekdier> arrayDeque = new ArrayDeque<>();

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            arrayDeque.addFirst(vogelbekdier);
        }

        System.out.println("Vooraan de rij: " + arrayDeque.getFirst());
        System.out.println("Achteraan de rij: " + arrayDeque.getLast());

    }

}