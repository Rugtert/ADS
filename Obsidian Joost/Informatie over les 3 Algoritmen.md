---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
###### 🔗 Linked to this page
[[Documentatie voor de toets]]

---
# Informatie over les 3 Algoritmen
Sheets van de les
[[ADS-3 v1.0.pdf]]
Eigen notities
[[Les 3 algoritmes en datastrcuturen]]

---
### Opdracht in de les
### Opdracht 1:
1 Implementeer een mapping van Naam → Vogelbekdier in de vogelbekdieren opdracht. [VogelbekdierMaps.java]
##### startfile
   ```java
package ads_week3_antwoorden;

public class Vogelbekdier {
    int lengte;
    String naam;

    public Vogelbekdier(int lengte, String naam) {
        this.lengte = lengte;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Vogelbekdier " + this.naam + " met lengte " + this.lengte;
    }
}

```

#### Uitwerking
``` java


```


### Opdracht 2:
2 In hetzelfde bestand, implementeer “Sorteren van vogelbekdieren” opdracht met TreeMaps. (Sorteer op integer en op naam.) Gebruik géén .sort()

#### Uitwerking
``` java
package ads_week3_antwoorden;

import java.util.TreeMap;

public class VogelbekdierMaps {

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

        /********* Deel 1 ***********/

        TreeMap<String, Vogelbekdier> stringMap = new TreeMap<>();

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            stringMap.put(vogelbekdier.naam, vogelbekdier);
        }

        System.out.println("Lengte van Zoe: " + stringMap.get("Zoe").lengte);
        System.out.println("Zit Patrick hierin? " + stringMap.containsKey("Patrick"));


        /********* Deel 2 ***********/
        TreeMap<Integer, Vogelbekdier> intMap = new TreeMap<>();

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            intMap.put(vogelbekdier.lengte, vogelbekdier);
        }

        
        System.out.println("===== String print =====");
        // Print alle vogelbekdieren
        for (Vogelbekdier vogelbekdier : stringMap.values()) {
            System.out.println(vogelbekdier);
        }

        System.out.println("===== Integer print =====");
        for (Vogelbekdier vogelbekdier : intMap.values()) {
            System.out.println(vogelbekdier);
        }


    }

}

```



### Opdracht 3:
3 Implementeer de mapping van Docent → Vakken. [DocentMaps.java] 1. Joost → ADS, Wiskunde 2. Patrick → ADS, Design Patterns Verifieer dat je implementatie werkt. (Krijg je de vakken ADS en Wiskunde als je get(“Joost”); uitvoert? Bijvoorbeeld.)
##### startfile
   ```java
package ads_week3_antwoorden;

import java.util.Objects;

public class Docent {
    int id;
    String naam;
    int werkErvaring;

    public Docent(int id, String naam, int werkErvaring) {
        this.id = id;
        this.naam = naam;
        this.werkErvaring = werkErvaring;
    }

    @Override
    public String toString() {
        return "Docent " + id + ": " + naam + " met " + werkErvaring + "jaar werkervaring";
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Docent)) return false;
        if (getClass() != obj.getClass()) return false;

        Docent b = (Docent) obj;

        return this.id == b.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


```

#### Uitwerking
``` java

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

```

### Opdracht 4:
1 Houd de maximale lengte van de Alpacas bij in een Priority Queue. 
#### Uitwerking
```java
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
```


### Opdracht 5:
2 Extract de lengte van de twee grootste alpacas. 
#### Uitwerking
```java

```

### Opdracht 6:
3 Poll de lengte van de grootste overgeleven alpacas. 
#### Uitwerking
```java

```

### Opdracht 7: ArrayDeck
3 Houd de volgorde van de Alpacas bij in een ArrayDeque + check functies 
#### Uitwerking
```java
package ads_week3_antwoorden;

import java.util.ArrayDeque;

public class VogelbekdierArrayDeque {

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
        
        ArrayDeque<Vogelbekdier> arrayDeque = new ArrayDeque<>();

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            arrayDeque.addFirst(vogelbekdier);
        }

        System.out.println("Vooraan de rij: " + arrayDeque.getFirst());
        System.out.println("Achteraan de rij: " + arrayDeque.getLast());

    }

}
```

### Opdracht 8: Volgorde haakjes
4 Stel je hebt een stuk code: Je wilt graag kijken of alle haakjes goed gesloten zijn in de goede volgorde. Voor de haakjes “(“, “{“, “\[“, bekijk of ze in de goede volgorde afgesloten worden.

#### Uitwerking
```java
package ads_week3_antwoorden;

import java.util.ArrayDeque;

public class CodeChecker {
    public static void main(String[] args) {
        String inputString = "public static void main(String[] args) {  " + 
            " Vogelbekdier[] vogelbekdieren = getVogelbekdieren(); " +
            "" +
            "ArrayDeque<Vogelbekdier> arrayDeque = new ArrayDeque<>();" +
            "for (Vogelbekdier vogelbekdier : vogelbekdieren) {" + 
            "    arrayDeque.addFirst(vogelbekdier);" + 
            "}" + 
            "System.out.println('Vooraan de rij: ' + arrayDeque.getFirst());" +
            "System.out.println('Achteraan de rij: ' + arrayDeque.getLast()); }";
    

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (Character c : inputString.toCharArray()) {
            if (c == '{' || c == '[' || c == '(')
                stack.addFirst(c);

            if (c == '}' || c == ']' || c == ')') {
                Character popChar = stack.removeFirst();
                // Bekijk of de laatste haakje in de Stack een matchend haakje is.
                if ((popChar == '{' && c == '}') || 
                    (popChar == '(' && c == ')') || 
                    (popChar == '[' && c == ']'))
                    ;
                else {
                    System.out.println("Error, wrong haakje");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Correct code!");
        }
        else {
            System.out.println("Error, wrong haakje");
        }
    
    }
}
```