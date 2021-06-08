package ads_week2;

import java.util.HashSet;
import java.util.TreeSet;

public class VogelbekdierSorting {

    static Vogelbekdier[] getVogelbekdieren() {
        String[] namen = { "Jantje", "Emma", "Perry", "Karel", "Elise" };
        int[] lengtes = { 50, 45, 52, 55, 42 };

        Vogelbekdier[] vogelbekdieren = new Vogelbekdier[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {

        Vogelbekdier[] vogelbekdieren = getVogelbekdieren();

        boomVogels(vogelbekdieren);
        hashVogels(vogelbekdieren);
        HomeMadeLinkedList(vogelbekdieren);
        sortByLength(vogelbekdieren);
        sortByName(vogelbekdieren);

    }

    public static void boomVogels(Vogelbekdier[] vogelbekdieren){
        TreeSet<Vogelbekdier> boomvogels = new TreeSet<>();
        // OF met lambda: TreeSet<Vogelbekdier> boomvogels = new TreeSet<>((e1,e2) -> e1.lengte - e2.lengte);
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            boomvogels.add(vogelbekdier);
        }
        for (Vogelbekdier boomvogel : boomvogels) {
            System.out.println(boomvogel.naam);
        }
    }

    public static void hashVogels(Vogelbekdier[] vogelbekdieren){
        HashSet<Vogelbekdier> vogelhash = new HashSet<>();
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            vogelhash.add(vogelbekdier);
        }

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            System.out.println(vogelhash.contains(vogelbekdier));
        }

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            vogelhash.remove(vogelbekdier);
        }

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            System.out.println(vogelhash.contains(vogelbekdier));
        }

    }

    public static void HomeMadeLinkedList(Vogelbekdier[] vogelbekdieren){
        LinkedVogelbekdierList vogelbekdierlist = new LinkedVogelbekdierList();
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            vogelbekdierlist.add(vogelbekdier);
        }
        vogelbekdierlist.remove(3);
        vogelbekdierlist.set(3,new Vogelbekdier(31,"rutger"));
        vogelbekdierlist.add(1,new Vogelbekdier(31,"rutger"));

        for (int i = 0; i < vogelbekdierlist.size; i++) {
            System.out.println("vogelbekdier @ " + i + ": " + vogelbekdierlist.get(i).naam);
        }
        System.out.println(vogelbekdierlist.contains(new Vogelbekdier(31,"Perry")));
    }

    public static void sortByLength(Vogelbekdier[] vogelbekdieren) {
        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length -1; i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogelbekdieren.length; j++) {
                if (vogelbekdieren[j].lengte < min.lengte){
                    min = vogelbekdieren[j];
                    vogelbekdieren[j] = vogelbekdieren[i];
                    vogelbekdieren[i] = min;
                }
            }
        }
        for (int i = 0; i < vogelbekdieren.length; i++) {
            System.out.println(vogelbekdieren[i].lengte);
        }
    }

    public static void sortByName(Vogelbekdier[] vogelbekdieren) {
        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length -1; i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogelbekdieren.length; j++) {
                System.out.println(vogelbekdieren[j].naam.compareTo(min.naam));
                if (vogelbekdieren[j].naam.compareTo(min.naam) < 0){
                    min = vogelbekdieren[j];
                    vogelbekdieren[j] = vogelbekdieren[i];
                    vogelbekdieren[i] = min;
                }
            }
        }
        for (int i = 0; i < vogelbekdieren.length; i++) {
            System.out.println(vogelbekdieren[i].naam);
        }
    }

}