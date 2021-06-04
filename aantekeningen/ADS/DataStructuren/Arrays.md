# Arrays en Lists
## Array
Een array is een structuur voor opslag van een lijst van elementen
1. van hetzelfde type
2. aaneengesloten aan het geheugen
3. lengte van de lijst is vooraf bepaald en kan dus niet aangepast worden

```java
int[] intarray = new int[10];
```
### Functionaliteiten van een array
![[Pasted image 20210604161655.png]]

## ArrayList
Een arraylist is een klasse die automatisch de arrays voor je beheert. Je kan het beschouwen als een array met variabele lengte.

Achter de schermen houdt het een array met een fixed lengte bij. Wanneer deze array vol zit kopieert het naar een nieuwe array.

Omdat het een klasse in plaats van een primitieve is moet je het aanroepen met functies.

### Functionaliteit van een arrayList
![[Pasted image 20210604161930.png]]

## LinkedList
In plaats van alle elementen achter elkaar te zetten zoals bij een arraylist bewaart een linkedlist een referentie naar het volgende object.

Op deze manier is het toevoegen en verwijderen van elementen een stuk sneller en het heeft een dynamische lengte.
![[Pasted image 20210604163215.png]]
Wanneer je in een linkedlist met .iterator() werkt kan het zoeken naar een element om toe te voegen of te verwijderen O(1) zijn. Zo niet is het O(n).
### Arraylist en LinkedList vergeleken
![[Pasted image 20210604163339.png]]