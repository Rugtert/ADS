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
# Informatie over les 1 Algoritmen
Sheets van het college:
[[ADS-1 (na).pdf]]

---
Priemgetal zoeken
```java
package ads_week1_antwoorden;

public class PrimeFactorization {

    /** 
     * Kan je deze functie sneller maken?
     * 
     * Zoekt een priemfactor van n.
     * @return Kleinste priemfactor van n, of n als n eem priem is.
     */
    static long zoekFactor(long n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return i;
        return n;
    }

    public static void main(String[] args) {
        long[] longNumbers = { 27947197, 69804209, 927584033, 283583819, 261022493, 829372787, 2095726453 };

        for (long number : longNumbers) {
            System.out.print("Factorisatie van " + number + ". ");
            System.out.println("Oplossing: " + zoekFactor(number));
        }

    }
}

```

### Opdracht in de les:
Implementeer Lineair zoeken voor Strings. Input: 
"Piet", "Jan", "Katja", "Annabel", "Frans", "Lieke"] 
Output: Index van “Piet”
#### Uitwerking
``` java
package ads_week1_antwoorden;

public class LinearStringSearch {
    /**
     * Finds a number in an unordered array.
     * Returns index or -1 if not found.
     */
    public static int findString(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Piet", "Jan", "Katja", "Annabel", "Frans", "Lieke"};

        System.out.println("Index of Patrick: " + findString(stringArray, "Patrick"));
    }
}

```
### Opdracht 2: 
Implementeer Binair zoeken. Input: 18, 19, 25, 28, 29, 44, 44, 72, 93
Output: Index van 72 
#### Uitwerking
``` java
package ads_week1_antwoorden;

public class BinarySearch {

    /**
     * Performs binary search on the input array.
     * @return Index of number in array if found, else -1.
     */
    public static int binarySearch(int [] array, int number) {
        int low = 0;
        int mid;
        int high = array.length;

        while (high - low >= 0) {
            mid = (high + low) / 2;
            if (number == array[mid])       // Number found
                return mid;
            else if (number < array[mid])   // Check the lower half.
                high = mid - 1;
            else                            // Check the upper half.
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] numberArray = {18, 19, 25, 28, 29, 44, 44, 72, 93};
        
        int index = binarySearch(numberArray, 93);
        System.out.println("Index of 93: " + index);

        // Make sure to check each index for validity! 
        // Sometimes it can go wrong at index 0 or length - 1
        System.out.println("Testing all numbers: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(binarySearch(numberArray, numberArray[i]) + " ");
        }

    }
}


```
Opdracht 3: 
Implementeer Binair zoeken met Strings. Input: "Annabel", "Franks", "Jan", "Katja", "Lieke", "Piet“; 
Output: Index van “Piet” Tip: Gebruik string1.compareTo(string2)
#### Uitwerking
``` java
package ads_week1_antwoorden;

public class BinaryStringSearch {
    public static int binarySearch(String[] array, String name) {
        int low = 0;
        int mid;
        int high = array.length;

        while (high - low >= 0) {
            mid = (high + low) / 2;
            int stringComparison = name.compareTo(array[mid]);

            if (stringComparison == 0)      // Number found
                return mid;
            else if (stringComparison < 0)  // Check the lower half.
                high = mid - 1;
            else                            // Check the upper half.
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Annabel", "Franks", "Jan", "Katja", "Lieke", "Piet"};

        int index = binarySearch(stringArray, "Piet");
        System.out.println("Index of Piet: " + index);

        // Make sure to check each index for validity! 
        // Sometimes it can go wrong at index 0 or length - 1
        System.out.println("Testing all names: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(binarySearch(stringArray, stringArray[i]) + " ");
        }
    }
}


```

#### Opdracht 2: Sorteren van vogelbekdieren (doorgeschoven naar week 2)

-   VogelbekdierSorting.java (edit deze)
-   Vogelbekdier.java

Perry vindt het leuk om vogelbekdieren te houden. Er komt een nieuwe lading vogelbekdieren binnen en hij zou ze graag willen sorteren op naam en op lengte.
Implementeer deze functionaliteit met je eigen sorteerfunctie! Je mag zelf kiezen welke je gebruikt.
Input: array aan Vogelbekdieren \[vogelbekdier1, vogelbekdier2, …\]
-   String vogelbekdier1.naam bevat de naam van het vogelbekdier1
-   int vogelbekdier1.lengte bevat de lengte in cm van het vogelbekdier1.
Output (print naar System.out):

-   Array van vogelbekdieren, gesorteerd op lengte
-   Array van vogelbekdieren, gesorteerd op naam




