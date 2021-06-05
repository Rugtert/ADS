package ads_week3_antwoorden;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Jumba {

    final static int MAX_QUEUE_LENGTH = 3;

    public static void main(String[] args) throws FileNotFoundException {
        Kassa kassa1 = new Kassa("Kassa 1");
        Kassa kassa2 = new Kassa("Kassa 2");
        Kassa kassa3 = new Kassa("Kassa 3");
        Kassa kassa4 = new Kassa("Kassa 4");

        // Bijhouden wanneer de volgende personen eruit moeten d.m.v. een queue.
        ArrayDeque<Pair> nextPersonLeaving = new ArrayDeque<>();

        // Gebruik ik voor de determineNextKassa ufnctie.
        Kassa[] allKassas = { kassa1, kassa2, kassa3, kassa4 };

        Scanner scanner = new Scanner(new File("ads_week3_antwoorden\\personen_2.in"));
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            String persoon = nextLine.split(" ")[0];
            int tijd = Integer.parseInt(nextLine.split(" ")[1]);

            // Bekijk of een persoon éérst de queue moet verlaten voordat
            // de huidige persoon aan de kassa's toegevoegd moet worden.
            while (!nextPersonLeaving.isEmpty() && tijd > nextPersonLeaving.peekLast().leaveTime)
                extractAndPrint(nextPersonLeaving.pollLast());

            Kassa openKassa = determineNextKassa(allKassas);
            openKassa.enterQueue(persoon);
            Pair kassaAndTime = new Pair(openKassa, tijd + 10);
            nextPersonLeaving.addFirst(kassaAndTime);
        }

        while (!nextPersonLeaving.isEmpty())
            extractAndPrint(nextPersonLeaving.pollLast());

        scanner.close();
    }

    public static class Pair {
        Kassa kassa;
        int leaveTime;

        public Pair(Kassa kassa, int leaveTime) {
            this.kassa = kassa;
            this.leaveTime = leaveTime;
        }
    }

    /**
     * Returns welke kassa nog open zit (van laag naar hoog).
     */
    public static Kassa determineNextKassa(Kassa[] kassas) {
        for (Kassa kassa : kassas) {
            if (kassa.getQueueLength() < MAX_QUEUE_LENGTH)
                return kassa;
        }

        System.out.println("Alle kassa's zitten vol!");
        return null;
    }

    /**
     * Print de correcte sysout wanneer er iemand de queue leaft.
     */
    public static void extractAndPrint(Pair kassaAndTime) {
        Kassa kassa = kassaAndTime.kassa;
        int leaveTime = kassaAndTime.leaveTime;

        String persoon = kassa.leaveQueue();

        System.out.println("Persoon " + persoon + " vertrekt om " + leaveTime + " bij " + kassa.getName());
    }
}
