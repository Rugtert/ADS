package ads_week3_antwoorden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class VogelbekdierPriorityQueue {

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
        
        PriorityQueue<Vogelbekdier> prioQueue = new PriorityQueue<>( (e1, e2) -> 
            -1*Integer.compare(e1.lengte, e2.lengte)
        );
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            prioQueue.add(vogelbekdier);
        }

        System.out.println("Overgebleven vogelbekdier 1: " + prioQueue.poll().lengte);
        System.out.println("Overgebleven vogelbekdier 2: " + prioQueue.poll().lengte);
        System.out.println("Overgebleven vogelbekdier 3: " + prioQueue.poll().lengte);
        System.out.println("Overgebleven vogelbekdier 4: " + prioQueue.poll().lengte);
        System.out.println("Overgebleven vogelbekdier 5: " + prioQueue.poll().lengte);

    }

}