package ads_week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Jumba {
    public static void main(String[] args) throws FileNotFoundException {
        Kassa kassa1 = new Kassa("Kassa1");
        Kassa kassa2 = new Kassa("Kassa2");
        Kassa kassa3 = new Kassa("Kassa3");
        Kassa kassa4 = new Kassa("Kassa4");

        Scanner scanner = new Scanner(new File("..\\ads_week3\\personen_1.in"));

        PriorityQueue<Kassa> firstAvailable = new PriorityQueue<Kassa>((q1,q2) -> q1.queue.size() + q2.queue.size());
        firstAvailable.add(kassa1);
        firstAvailable.add(kassa2);
        firstAvailable.add(kassa3);
        firstAvailable.add(kassa4);

        while(scanner.hasNext()) {
            Persoon persoon = new Persoon();
            String nextLine = scanner.nextLine();
            persoon.name = nextLine.split(" ")[0];
            persoon.tijd = Integer.parseInt(nextLine.split(" ")[1]);

            // Insert je code hieronder
            // De print statement is als hulp erbij gezet.
            int maxKassaKlanten = 4;

            firstAvailable.peek().queue.add(persoon);
//            System.out.println("Persoon " + persoon + " vertrekt om " + tijd + " bij kassa 1");
        }

        for (Kassa kassa : firstAvailable) {
            for (Persoon persoon : kassa.queue) {
                System.out.println("Persoon " + persoon.name + " vertrekt om " + persoon.tijd + " bij :" + kassa.getName());
            }
        }
        // Hieronder mag ook je code komen.


        scanner.close();
    }
}
