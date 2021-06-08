package ads_week1;

public class VogelbekdierSorting {
    
    static Vogelbekdier[] getVogelbekdieren() {
        String[] namen = {"Jantje", "Emma", "Perry", "Karel", "Elise"};
        int[] lengtes = {50, 45, 52, 55, 42};

        Vogelbekdier[] vogelbekdieren = new Vogelbekdier[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }
    
    public static void main(String[] args) {
        
        Vogelbekdier [] vogelbekdieren = getVogelbekdieren();

        // Taak 1: Sorteer de vogelbekdieren op lengtes en print ze naar sysout.
        // Taak 2: Sorteer de vogelbekdieren op naam en print ze naar sysout.
        // Implementeer je eigen sorteerfunctie!
        // Insert je code hieronder. 

    }

}