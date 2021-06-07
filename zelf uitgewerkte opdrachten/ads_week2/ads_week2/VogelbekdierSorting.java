package ads_week2;

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
        LinkedVogelbekdierList vogelbekdierlist = new LinkedVogelbekdierList();
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            vogelbekdierlist.add(vogelbekdier);
        }
//        vogelbekdierlist.remove(3);
//        vogelbekdierlist.set(3,new Vogelbekdier(31,"rutger"));
        vogelbekdierlist.add(1,new Vogelbekdier(31,"rutger"));
//

        for (int i = 0; i < vogelbekdierlist.size; i++) {
            System.out.println("vogelbekdier @ " + i + ": " + vogelbekdierlist.get(i).naam);
        }
        System.out.println(vogelbekdierlist.contains(new Vogelbekdier(31,"Perry")));

//        sortByLength(vogelbekdieren);
//        sortByName(vogelbekdieren);

        // Taak 1: Sorteer de vogelbekdieren op lengtes en print ze naar sysout.
        // Taak 2: Sorteer de vogelbekdieren op naam en print ze naar sysout.
        // Implementeer je eigen sorteerfunctie!
        // Insert je code hieronder.

    }

    public static void sortByLength(Vogelbekdier[] vogelbekdieren) {
        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length -1; i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogelbekdieren.length; j++) {
                if (vogelbekdieren[j].lengte < min.lengte){
                    
                    System.out.println(vogelbekdieren[i].lengte);
                    System.out.println("-----------------------");
                    System.out.println(vogelbekdieren[j].lengte);
                    System.out.println("-----------------------");
                    System.out.println("-----------------------");
                    
                    min = vogelbekdieren[j];
                    vogelbekdieren[j] = vogelbekdieren[i];
                    vogelbekdieren[i] = min;
                    
                    System.out.println(vogelbekdieren[i].lengte);
                    System.out.println("-----------------------");
                    System.out.println(vogelbekdieren[j].lengte);
                    System.out.println("-----------------------");
                    System.out.println("-----------------------");
                    System.out.println("-----------------------");
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