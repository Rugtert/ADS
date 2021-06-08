---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# Les 4 Algoritmes en datastructuren
### Generics
```java
ArrayList<Vogelbekdier> vogelbekdieren
```

![[Pasted image 20210525180856.png]]
Wildcard is het vraagteken VOOR extends
![[Pasted image 20210525180945.png]]
Of op deze manier
Je maakt dan een generieke functie

Je kan ook generieke classes maken

Generieke methode
![[Pasted image 20210525181635.png]]

OFFICIELE COPY FUNCTIE
![[Pasted image 20210525181710.png]]

Vraag1 van de opdracht
```java
import java.util.ArrayList; import java.util.List; public class main {
    public static void main(Stringargs) {
        ArrayList<String> a = new ArrayList<>();
 a.add("bier");
 a.add("kut");
 a.add("friet");
 a.add("wta");
 a.add("dasfg");
 a.forEach((e) -> System._out_.println(e));
 }

    public static <T> T arrayToList(ArrayList<T> array){
        return (T[]) array.toArray();
 }
}
```

### Recursie
Een functie die zichzelf callt Dat heet _recursie_
Voor de Fibonacci reeks zou dit het volgende KUNNEN zijn
![[Pasted image 20210525185537.png]]

Met RECURSIE is het als volgt. En dan is het eleganter
![[Pasted image 20210525185608.png]]
Wel net een nadeel
Dat nadeel is dat het vele malen trager. Je roept alle voorgaande ook weer aan. 
O(2<sup>n</sup>)

Memorization slaat het antwoord op zodat het niet elke keer voor het voorgaande antwoord hoeft te worden uitgezocht.

#### Recursieve Binary search
Je moet het de mid waarde onthouden om in de volgende search te kunnen gebruiken.

#### MergeSort
![[Pasted image 20210525190500.png]]

### Bomen
Binaire zoekbomen?
Hoe werkt dat?
Een boom is een manier om data te strcutureren
Elke _node_ heeft kinderen die eronder zitten. 
Deze kindern zijn zelf weer _nodes_ met kinderen
Een boom begint bij de root en eindigt bij de leaves
![[Pasted image 20210525191341.png]]

Zelf balancing boom ( O(n) is dan de mate van complexiteit)
- B-tree
- Red-black tree
- en nog meer.....



