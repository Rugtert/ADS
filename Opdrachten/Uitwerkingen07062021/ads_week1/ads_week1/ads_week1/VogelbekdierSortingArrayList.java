package ads_week2_antwoorden;

import ads_week1.Vogelbekdier;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class VogelbekdierSortingArrayList {

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
        ArrayList<Vogelbekdier> vogelbekdieren = new ArrayList<>(Arrays.asList(getVogelbekdieren()));

        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op lengte...");
        vogelbekdieren.sort((e1, e2) -> Integer.compare(e1.lengte, e2.lengte));
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op naam...");
        vogelbekdieren.sort((e1, e2) -> e1.naam.compareTo(e2.naam));
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

    }

    public static void printVogelbekdieren(Iterable<Vogelbekdier> vogelbekdieren) {
        System.out.println("----------Vogelbekdieren----------");
        for (Vogelbekdier vogelbekdier : vogelbekdieren)
            System.out.println(vogelbekdier);

        Node
    }

}