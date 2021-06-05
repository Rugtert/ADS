package ads_week3_antwoorden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DocentMaps {
    
    
    public static void main(String[] args) {
        Vak wiskundeVak = new Vak("Wiskunde", 1);
        Vak adsVak = new Vak("ADS", 2);
        Vak designPatternsVak = new Vak("Design Patterns", 3);

        Docent joostDocent = new Docent(1, "Joost",  1);
        Docent patrickDocent = new Docent(2, "Patrick", 20);

        // Relevante hashmap.
        HashMap<Docent, ArrayList<Vak>> docentMap = new HashMap<>();

        // Vakken arraylists aanmaken.
        ArrayList<Vak> joostVakken = new ArrayList<>(Arrays.asList(adsVak, wiskundeVak));
        ArrayList<Vak> patrickVakken = new ArrayList<>(Arrays.asList(adsVak, designPatternsVak));

        docentMap.put(joostDocent, joostVakken);
        docentMap.put(patrickDocent, patrickVakken);

        System.out.println("Vakken van joost: " + docentMap.get(joostDocent));

    }
}
