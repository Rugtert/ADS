package ads_week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Jumba {
    public static void main(String[] args) throws FileNotFoundException {
        Kassa kassa1 = new Kassa("Kassa1");
        Kassa kassa2 = new Kassa("Kassa2");
        Kassa kassa3 = new Kassa("Kassa3");
        Kassa kassa4 = new Kassa("Kassa4");


        Kassa[] kassas = {kassa1,kassa2,kassa3,kassa4};



        ArrayDeque<String> lijstPersonenInRij = new ArrayDeque<String>();

        Scanner scanner = new Scanner(new File("ads_week3/personen_1.in"));
        while(scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            String persoon = nextLine.split(" ")[0]; 
            int tijd = Integer.parseInt(nextLine.split(" ")[1]);

            int maxKassaKlanten = 4;
            int aantalKassas = 4;

            lijstPersonenInRij.add(nextLine);
            while(Integer.parseInt(lijstPersonenInRij.peek().split(" ")[1]) > (tijd + 10)) {
                System.out.println("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]");
                lijstPersonenInRij.remove();
            }
            for (String s : lijstPersonenInRij) {
                System.out.println(s);
            }


            // Insert je code hieronder
            // De print statement is als hulp erbij gezet.

            System.out.println("Persoon " + persoon + " vertrekt om " + tijd + " bij kassa 1");
        }
        // Hieronder mag ook je code komen.


        scanner.close();
    }
}
