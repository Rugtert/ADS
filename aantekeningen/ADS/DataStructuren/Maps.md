# Maps
## Wat zijn maps
Maps zijn datastructuren waarmee je makkelijk dingen op kan zoeken doormiddel van key-> value associaties.
In principe werken maps op eenzelfde manier als sets, met een extra functionaliteit, ze wijzen naar bepaalde data doormiddel van een key -> value systeem. (in tegenstelling tot sets, die enkel values hebben, benaderd door een hashcode te berekenen of te zoeken met behulp van een comparator)
Maps zijn enorm handig voor het opzoeken van data met behulp van een key. Er zijn 2 implementaties. TreeMap en HashMap. 

We gebruiken geen ArrayList omdat deze duplicates kunnen bevatten, iets dat we niet willen in Maps.

### Relevante functies
- get(k) \[en getOrDefault(k, 0)]
	- Vind values gegeven key
- put(k, v)
	- Insert value v met key k.
- remove(k) 
	- Removes de key k en bijbehorende value
- keyset()
	- Een Set met alle key
- values()
	- Een Collection met alle values (waar je met een forEach loop kan iteraten)
## Hoe gebruik je maps?
### HashMap
```java
public static void main(String[] args) {
        HashMap<String, Docent> naamMapping = new HashMap<>();
        naamMapping.put("Joost",    new Docent(1, "Joost",  1));
        naamMapping.put("Patrick",  new Docent(2, "Patrick", 20));
        naamMapping.put("Frans",    new Docent(3, "Frans", 40));
        System.out.println("Werkervaring Joost: " + naamMapping.get("Joost").werkErvaring);
    }
```
### TreeMap
```java
    public static void main(String[] args) {
        TreeMap<String, Docent> naamMapping = new TreeMap<>();
        naamMapping.put("Joost",    new Docent(1, "Joost",  1));
        naamMapping.put("Patrick",  new Docent(2, "Patrick", 20));
        naamMapping.put("Frans",    new Docent(3, "Frans", 40));
        System.out.println("Werkervaring Joost: " + naamMapping.get("Joost").werkErvaring);
        for (Docent docent: naamMapping.values()) {
            System.out.println(docent.naam);
        }
    }
```


	
