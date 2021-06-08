---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# Informatie over les 2 Algoritmen
Sheets van de les
[[ADS-2 v1.0.pdf]]

---
### Opdracht 1  in de les Custom Sorting:
1.  Implementeer een Custom sorting algoritme met Vogelbekdieren
##### startfile
   ```java
package ads_week2_antwoorden;

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

package ads_week2_antwoorden;

public class VogelbekdierSortingCustomSort {

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

        // Taak 1: Sorteer de vogelbekdieren op lengtes en print ze naar sysout.
        // Taak 2: Sorteer de vogelbekdieren op naam en print ze naar sysout.
        // Implementeer je eigen sorteerfunctie!
        // Insert je code hieronder. 
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op lengte...");
        sortByInt(vogelbekdieren);
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op naam...");
        sortByString(vogelbekdieren);
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

    }

    public static void printVogelbekdieren(Vogelbekdier[] vogelbekdieren) {
        System.out.println("----------Vogelbekdieren----------");
        for (Vogelbekdier vogelbekdier : vogelbekdieren)
            System.out.println(vogelbekdier);
    }

    // Vind de index van het vogelbekdier met de minste lengte.
    // Bekijkt vanaf de minIndex.
    public static int findMinKeyInt(Vogelbekdier[] vogelbekdieren, int minIndex) {
        int minValIndex = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i = minIndex; i < vogelbekdieren.length; i++) {
            int curValue = vogelbekdieren[i].lengte;
            if (curValue < minValue) {
                minValue = curValue;
                minValIndex = i;
            }
        }
        return minValIndex;
    }

    // Implementeert SelectionSort d.m.v. integers.
    public static void sortByInt(Vogelbekdier[] vogelbekdieren) {
        for (int i = 0; i < vogelbekdieren.length - 1; i++) {
            int minValueKey = findMinKeyInt(vogelbekdieren, i);
            // Swap
            Vogelbekdier temp = vogelbekdieren[minValueKey];
            vogelbekdieren[minValueKey] = vogelbekdieren[i];
            vogelbekdieren[i] = temp;
        }
    }

    // Vind de index van het vogelbekdier met de minste lengte.
    // Bekijkt vanaf de minIndex.
    public static int findMinKeyString(Vogelbekdier[] vogelbekdieren, int minIndex) {
        int minValIndex = -1;
        String minString = "ZZZZZZZZ";
        for (int i = minIndex; i < vogelbekdieren.length; i++) {
            String curString = vogelbekdieren[i].naam;
            if (curString.compareTo(minString) < 0) {
                minString = curString;
                minValIndex = i;
            }
        }
        return minValIndex;
    }

    // Implementeert SelectionSort d.m.v. integers.
    public static void sortByString(Vogelbekdier[] vogelbekdieren) {
        for (int i = 0; i < vogelbekdieren.length - 1; i++) {
            int minValueKey = findMinKeyString(vogelbekdieren, i);
            // Swap
            Vogelbekdier temp = vogelbekdieren[minValueKey];
            vogelbekdieren[minValueKey] = vogelbekdieren[i];
            vogelbekdieren[i] = temp;
        }
    }

}
```
V
### Opdracht 2 in de les: Arraylist
2. Implementeer VogelbekdierSorting met ArrayList
##### startfile
   ```java
package ads_week2_antwoorden;

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
package ads_week2_antwoorden;

import java.util.ArrayList;
import java.util.Arrays;

public class VogelbekdierSortingArrayList {

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
        ArrayList<Vogelbekdier> vogelbekdieren = new ArrayList<>(Arrays.asList(getVogelbekdieren()));

        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op lengte...");
        vogelbekdieren.sort((e1, e2) -> Integer.compare(e1.lengte, e2.lengte));
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

        System.out.println("Sorteer vogelbekdieren op naam...");
        vogelbekdieren.sort((e1, e2) -> e1.naam.compareTo(e2.naam));
        printVogelbekdieren(vogelbekdieren);
        System.out.println();

    }

    public static void printVogelbekdieren(Iterable<Vogelbekdier> vogelbekdieren) {
        System.out.println("----------Vogelbekdieren----------");
        for (Vogelbekdier vogelbekdier : vogelbekdieren)
            System.out.println(vogelbekdier);
    }

}

```
### Opdracht 3 in de les: Linked List
3.  Implementeer custom linked list
##### startfile
   ```java
	package ads_week2_antwoorden;

public class IntLinkedList {

    public Node head;
    private int length;

    public IntLinkedList() {
        head = null;
        length = 0;
    }

    /**
     * Not mandatory, but this constructor allows to create a new linkedlist from an
     * intArray. It does so by iterating over the ints in a reverse manner.
     */
    public IntLinkedList(int[] intArray) {
        Node[] nodeList = new Node[intArray.length];
        Node prevNode = null;
        for (int i = intArray.length - 1; i >= 0; i--) {
            nodeList[i] = new Node(prevNode, intArray[i]);
            prevNode = nodeList[i];
        }
        head = nodeList[0];
        this.length = intArray.length;
    }

    /**
     * Add data at the end of the LinkedList. O(n)
     * 
     * Since it's a single LinkedList, this add method would take O(n) if we didn't
     * store the final node. One way to improve this function to O(1) is by storing
     * and updating the final node.
     */
    public void add(int data) {
        if (length == 0) {
            head = new Node(null, data);
        } else {
            Node curNode = head;
            while (curNode.next != null)
                curNode = curNode.next;
            curNode.next = new Node(null, data);
        }
        length++;
    }

    /**
     * Inserts data at index i. O(n)
     */
    public void insert(int i, int data) {
        // Update head.
        if (i == 0) {
            head = new Node(head, data);
        } else {
            Node curNode = head;
            // Skip to the correct node.
            while (i > 1) {
                curNode = curNode.next;
                i--;
            }

            // Update the references and add the new node.
            Node newNode = new Node(curNode.next, data);
            curNode.next = newNode;
        }
        length++;
    }

    /**
     * Removes the final node of the LinkedList. O(n)
     * 
     * Takes O(n) as we need to locate the second-to-final node. Could be improved
     * to O(1) if we implement a double linked list. Or by storing the
     * second-to-final node.
     */
    public void remove() {
        Node curNode = head;
        if (length == 1) {
            curNode = null;
        } else {
            while (curNode.next.next != null)
                curNode = curNode.next;
            curNode.next = null;
        }

        length--;
    }

    /**
     * Removes data at index i. O(n)
     */
    public void remove(int i) {
        Node curNode = head;
        if (i == 0) {
            head = head.next;
        }
        while (i > 1) {
            curNode = curNode.next;
            i--;
        }
        curNode.next = curNode.next.next;

        length--;
    }

    /**
     * Gets data at index i. O(n)
     */
    public int get(int i) {
        Node curNode = head;
        while (i > 0) {
            curNode = curNode.next;
            i--;
        }
        return curNode.data;
    }

    /**
     * Updates data at index 1. O(n)
     */
    public void set(int i, int data) {
        Node curNode = head;
        while (i > 0) {
            curNode = curNode.next;
            i--;
        }
        curNode.data = data;
    }

    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        if (length == 0)
            return "[]";

        String finalString = "[";
        Node curNode = head;
        while (curNode.next != null) {
            finalString += curNode.data + ", ";
            curNode = curNode.next;
        }
        finalString += curNode.data + "]";
        return finalString;

    }

    public class Node {
        Node next;
        int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }
}

```

#### Uitwerking
``` java

package ads_week2_antwoorden;

public class LinkedListExample {
    public static void main(String[] args) {
        IntLinkedList linky = new IntLinkedList();
        // Test element adding.
        linky.add(3);
        System.out.println(linky);

        linky.add(77);
        System.out.println(linky);

        linky.add(72);
        System.out.println(linky);

        // Test element insertion.
        linky.insert(1, 368);
        System.out.println(linky);

        // Test end-of-list removal.
        linky.remove();
        System.out.println(linky);

        // Test the update operation.
        linky.set(0, 18);
        System.out.println(linky);

        // Test the remove operation.
        linky.remove(1);
        System.out.println(linky);
        
        // Test the get operation.
        System.out.println(linky.get(1));

    }
}

```
### Opdracht 4 in de les: Arraylist
4.  Implementeer sorting met vogelbekdieren en TreeSets
##### startfile
   ```java
	public class Vogelbekdier2 implements Comparable<Vogelbekdier2> {
    int lengte;
    String naam;

    public Vogelbekdier2(int lengte, String naam) {
        this.lengte = lengte;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Vogelbekdier " + this.naam + " met lengte " + this.lengte;
    }

    // Aanname: Als vogelbekdieren gelijke namen en lengtes hebben, 
    //  dan is het dezelfde vogelbekdier.
    // Je zou dit kunnen voorkomen door met ids te werken, e.g. this.id=3.
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Vogelbekdier2))
            return false;

        if(getClass() != obj.getClass())
            return false;

        Vogelbekdier2 andereDier = (Vogelbekdier2) obj;

        if(naam.equals(andereDier.naam) && lengte == andereDier.lengte)
            return true;

        return false;
    }

    // Sorteer ze automatisch op naam.
    @Override
    public int compareTo(Vogelbekdier2 o) {
        return naam.compareTo(o.naam);
    }
	}
```

#### Uitwerking
``` java
package ads_week2_antwoorden;

import java.util.TreeSet;

public class VogelbekdierSortingTreeSort {

    static Vogelbekdier2[] getVogelbekdieren() {
        String[] namen = { "Jantje", "Zoe", "Perry", "Karel", "Elise" };
        int[] lengtes = { 50, 45, 52, 55, 42 };

        Vogelbekdier2[] vogelbekdieren = new Vogelbekdier2[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier2(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {
        Vogelbekdier2[] vogelbekdieren = getVogelbekdieren();

        // De vogelbekdieren worden nu stuk voor stuk toegevoegd in deze for loop,
        //   maar je zou ze ook allemaal ineenkeer kunnen toevoegen in de constructor
        //   van de TreeSet.
        TreeSet<Vogelbekdier2> vogelbekdierenset = new TreeSet<>();
        for (Vogelbekdier2 vogelbekdier : vogelbekdieren)
            vogelbekdierenset.add(vogelbekdier);
        
        Vogelbekdier2 perry = new Vogelbekdier2(52, "Perry");
        Vogelbekdier2 tiara = new Vogelbekdier2(47, "Tiara");

        System.out.println("Zit Perry in de set? " + vogelbekdierenset.contains(perry));
        System.out.println("Zit Tiara in de set? " + vogelbekdierenset.contains(tiara));

        System.out.println("Alle vogelbekdieren volgens de TreeSet");
        printVogelbekdieren(vogelbekdierenset);
        System.out.println();

    }

    public static void printVogelbekdieren(Iterable<Vogelbekdier2> vogelbekdieren) {
        System.out.println("----------Vogelbekdieren----------");
        for (Vogelbekdier2 vogelbekdier : vogelbekdieren)
            System.out.println(vogelbekdier);
    }

}

```
### Opdracht 5 in de les: HashSet
5.  Implementeer een HashSet met vogelbekdieren
##### startfile
```java
package ads_week2_antwoorden;

import java.util.Objects;

public class Vogelbekdier3 {
    int lengte;
    String naam;

    public Vogelbekdier3(int lengte, String naam) {
        this.lengte = lengte;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Vogelbekdier " + this.naam + " met lengte " + this.lengte;
    }

    // Aanname: Als vogelbekdieren gelijke namen en lengtes hebben, 
    //  dan is het dezelfde vogelbekdier.
    // Je zou dit kunnen voorkomen door met ids te werken, e.g. this.id=3.
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Vogelbekdier3))
            return false;

        if(getClass() != obj.getClass())
            return false;

        Vogelbekdier3 andereDier = (Vogelbekdier3) obj;

        if(naam.equals(andereDier.naam) && lengte == andereDier.lengte)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, lengte);
    }
    
}

```
#### Uitwerking
``` java

package ads_week2_antwoorden;

import java.util.HashSet;

public class VogelbekdierHashSet {

    static Vogelbekdier3[] getVogelbekdieren() {
        String[] namen = { "Jantje", "Zoe", "Perry", "Karel", "Elise" };
        int[] lengtes = { 50, 45, 52, 55, 42 };

        Vogelbekdier3[] vogelbekdieren = new Vogelbekdier3[namen.length];

        for (int i = 0; i < namen.length; i++) {
            vogelbekdieren[i] = new Vogelbekdier3(lengtes[i], namen[i]);
        }

        return vogelbekdieren;

    }

    public static void main(String[] args) {
        Vogelbekdier3[] vogelbekdieren = getVogelbekdieren();

        // De vogelbekdieren worden nu stuk voor stuk toegevoegd in deze for loop,
        //   maar je zou ze ook allemaal ineenkeer kunnen toevoegen in de constructor
        //   van de HashSet.
        HashSet<Vogelbekdier3> vogelbekdierenset = new HashSet<>();
        for (Vogelbekdier3 vogelbekdier : vogelbekdieren)
            vogelbekdierenset.add(vogelbekdier);
        
        Vogelbekdier3 perry = new Vogelbekdier3(52, "Perry");
        Vogelbekdier3 tiara = new Vogelbekdier3(47, "Tiara");

        System.out.println("Zit Perry in de set? " + vogelbekdierenset.contains(perry));
        System.out.println("Zit Tiara in de set? " + vogelbekdierenset.contains(tiara));
        System.out.println();
        System.out.println("Perry is weer eens ontsnapt! Bezig met Perry verwijderen...");
        vogelbekdierenset.remove(perry);
        System.out.println("Zit Perry in de set? " + vogelbekdierenset.contains(perry));
    }

}
```