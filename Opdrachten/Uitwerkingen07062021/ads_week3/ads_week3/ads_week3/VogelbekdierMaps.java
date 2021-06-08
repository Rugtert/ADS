package ads_week3;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class VogelbekdierMaps {

    static Vogelbekdier[] getVogelbekdieren() {
        String[] namen = {"Jantje", "Zoe", "Perry", "Karel", "Elise"};
        int[] lengtes = {50, 45, 52, 55, 42};

        Vogelbekdier[] vogelbekdieren = new Vogelbekdier[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {
        Vogelbekdier[] vogelbekdieren = getVogelbekdieren();
//        priorityQueue(vogelbekdieren);
        arrayDeque(vogelbekdieren);
    }

    public static void priorityQueue(Vogelbekdier[] vogels) {
        // REDUDANT IS VOOR DE LEESBAARHEID
        Vogelbekdier[] vogelbekdieren = vogels;

        PriorityQueue<Vogelbekdier> priorityQueue = new PriorityQueue<Vogelbekdier>((v1, v2) ->
                v2.lengte - v1.lengte);
        // Add array to priorityQueue
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            priorityQueue.add(vogelbekdier);
        }

        // Extract and remove, remove func returns removed object
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        // Peek and remove object
        System.out.println(priorityQueue.poll());
        // Peek only shows the object
        System.out.println(priorityQueue.peek());

        // Diff between remove and poll, remove trows exception when queue is empty

    }

    public static void arrayDeque(Vogelbekdier[] vogels) {
        // REDUDANT IS VOOR DE LEESBAARHEID
        Vogelbekdier[] vogelbekdieren = vogels;

        //simpelweg toevoegen
        ArrayDeque<Vogelbekdier> arrayDeque = new ArrayDeque<Vogelbekdier>();
        for (Vogelbekdier vogel : vogels) {
                arrayDeque.add(vogel);
                arrayDeque.addFirst(vogel);
        }
        for (Vogelbekdier vogelbekdier : arrayDeque) {
            System.out.println(vogelbekdier);
        }
    }

    public static void jumba(){
        //Joost its a yours

    }

}