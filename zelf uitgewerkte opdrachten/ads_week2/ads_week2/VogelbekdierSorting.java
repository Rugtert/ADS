package ads_week2;

import java.util.ArrayList;
import java.util.Arrays;
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
        sortWithArrayList(vogelbekdieren);

        mergeSort(vogelbekdieren, 0, vogelbekdieren.length);
    }

    private static void mergeSort(Vogelbekdier[] vogelbekdieren, int leftIndex, int rightIndex){
        if (leftIndex < rightIndex){
            int middle = leftIndex + (rightIndex - 1)/2;

            mergeSort(vogelbekdieren,leftIndex,middle);
            mergeSort(vogelbekdieren,middle,rightIndex);

            merge(vogelbekdieren,leftIndex,middle,rightIndex);
        }
    }

    private static void merge(Vogelbekdier[] vogelbekdieren, int leftIndex, int middle, int rightIndex){
        Vogelbekdier[] tempLeft = new Vogelbekdier[middle - leftIndex];
        Vogelbekdier[] tempRight = new Vogelbekdier[rightIndex - middle];


        for (int i = 0; i < tempLeft.length; i++) {
            tempLeft[i] = vogelbekdieren[leftIndex + i];
        }
        for (int i = 0; i < tempRight.length; i++) {
            tempRight[i] = vogelbekdieren[middle + i];
        }

        int i = 0;
        int j = 0;
        int k = leftIndex;

        while(i < tempLeft.length && j < tempRight.length){
            if (tempLeft[i].lengte <= tempRight[j].lengte){
                vogelbekdieren[k] = tempLeft[i];
                i++;
            }
            else {
                vogelbekdieren[k] = tempRight[j];
                j++;
            }
            k++;
        }

        while (i < tempLeft.length){
            vogelbekdieren[k] = tempLeft[i];
            i++;
            k++;
        }

        while (j < tempRight.length){
            vogelbekdieren[k] = tempRight[j];
            j++;
            k++;
        }
    }



    private static void sortWithArrayList(Vogelbekdier[] vogelbekdieren) {
        System.out.println("Sorting Array List---------------------------");
        ArrayList<Vogelbekdier> vogellist = new ArrayList<>();
        vogellist.addAll(Arrays.asList(vogelbekdieren));

        Vogelbekdier min;
        for (int i = 0; i < vogellist.size(); i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogellist.size(); j++) {
                if (vogellist.get(j).lengte < min.lengte){
                    min = vogellist.get(j);
                    vogellist.set(j,vogellist.get(i));
                    vogellist.set(i, min);
                }
            }
        }
        for (int i = 0; i < vogellist.size(); i++) {
            System.out.println(vogellist.get(i).lengte);
        }
    }

    // Sorteert meteen met O(log n)!!! :D
    public static void boomVogels(Vogelbekdier[] vogelbekdieren){
        System.out.println("Creating a TreeSet---------------------------");
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
        System.out.println("Creating a HashSet---------------------------");
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
        System.out.println("Using a selfmade LinkedList---------------------------");

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
        System.out.println("Sorting Array By Int--------------------------");

        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length ; i++) {
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
        System.out.println("Sorting Array by String---------------------------");

        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length; i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogelbekdieren.length; j++) {
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