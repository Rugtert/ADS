# Sets
## Wat zijn sets?
Een set is een verzameling van objecten, zonder duplicates die niet direct op index aangeroepen kunnen worden.

Aanname van Sets
1. Orde van data maakt niets uit
2. Gedupliceerde data hoeft niet bijgehouden te worden

Wanneer is dit het geval?
1. Bij het bijhouden welk steden je hebt bezocht
2. Presentielijst van groepen
3. Databases (Key -> Value) ((primary) keys zijn nooit duplicate)

Er zijn over het algemeen twee sets. TreeSets en HashSets
TreeSet: Een set met O(log⁡(n)) operaties die automatisch de set sorteerd.
HashSet: Een set met O(1) operaties die gebruik maakt van hashes.

### Belangrijke functies van sets
![[Pasted image 20210604164143.png]]

## TreeSets
TreeSet implementeert een "self balancing binary search tree"
### Voor en nadelen
Voordeel is dat alle objecten in de treeset altijd gesorteerd zijn en dat het eerste en laatste element pollen met O(log n) gaat. Nadeel is dat toevoegen van een element altijd O(log n) is in plaats van O(1) bij hashset
![[Pasted image 20210604171436.png]]

## HashSet
Een HashSet gebruikt hashing:
1. map alle objecten naar een uniek getal, de hashcode
2. functie add(e)
	1. Bereken de hasCode van object e
	2. voeg object toe aan de linkedlist bij deze hashcode.

![[Pasted image 20210604164434.png]]

functie contains:
1. Bereken de hashCode van object e
2. is de hashcode nog niet eerder voorgekomen -> Return false
3. Is de hashcode wel eerder voorgekomen? -> Check voor collisions
	1. zit object in de linked list? -> return true
	2. zit object niet in de linked list? return false;

### Hoe snel is een hashSet?
![[Pasted image 20210604164817.png]]

## TreeSets en HashSets met eigen klassen
Als je voor hashsets en treesets bestaande datatypes wilt gebruiken zoals integers en strings dan kan dit gewoon. Wil je je eigen classes gebruiken dan moet je extra dingen implementeren.
1. voor hashSet: .equals() en .hashCode()
2. voor treeSet: .equals() en .compareTo()
	1. voor compareto heb je implements Comparable \<T> nodig of een comparator meegeven bij het aanmaken van de treeset (codeblock 2)

```java
public class hash {  
 String name;  
 int age;  
 String email;  
  
 @Override  
 public boolean equals(Object o) {  
        if (this == o) return true;  
 if (o == null || getClass() != o.getClass()) return false;  
 hash hash = (hash) o;  
 return age == hash.age &&  
                Objects.equals(name, hash.name) &&  
                Objects.equals(email, hash.email);  
 }  
  
 @Override  
 public int hashCode() {  
        return Objects.hash(name, age, email);  
 }  
 @Override  
 public int compareTo(hash o) {  
    return age \> o.age ? 1 : age \== o.age ? 0 : -1;  
}
}
```

```java
TreeSet<hash> treeSet \= new TreeSet<>((e1,e2) -> e1.name.compareTo(e2.name));
```
