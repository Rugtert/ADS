# Binaire bomen
## Wat is een binaire boom
(slides vanaf # 35)
Een boom is een manier om data te structureren. Elke node (knoop) heeft kinderen die eronder zitten. Deze kinderen zijn zelf weer nodes met kinderen. De boom begint bij de root en eindigt aan de leaves. Een binaire boom kan geen duplicates bevatten.

Een implementatie van een boom in java kan met classes. Voor een boom met twee kinderen:
```java
  class Tree {
    Node root;
  }
        
  class Node {
    Node left;
    Node right;
    int data; // Kan ook Strings etc zijn
  }

```
Een binaire boom ziet er als volgt uit: 
1. alleen getallen in de nodes
2. links is kleiner, rechts is groter.

![[Pasted image 20210604212431.png]]
Een boom heeft de functiescontains, add en delete.
Functie contains(7):
- zit getal 7 in de set? Boom afgaan!
- Hoeveel operaties?
	- Maximaal de diepte/hoogte van de boom. O(log(n))
		- ofwel, in de worst case is het aantal operaties gelijk aan log(diepte van de boom). Ofwel log(n)
- Wanneer we een leaf bereiken en deze heeft niet de waarde die we zoeken, bestaat de waarde niet in de boom
![[Pasted image 20210604214132.png]]

Functie add(5)
1. Boom afgaan naar beneden.
2. Getal toevoegen zodra je bij een leaf bent.
![[Pasted image 20210604214450.png]]

functie delete(8)
1. Vind het grootste getal
	1. ga 1x naar rechts en zoveel mogelijk naar links
2. Swap het nieuwe getal naar de juiste plaats
	1. 0 kinderen? Het is een blad, kan direct
	2. 1 kind? Geef child een new parent
	3. 2 kinderen is onmogelijk.

![[Pasted image 20210604214719.png]]

Al deze operaties duren maximaal de diepte van de boom. Bij een gebalanceerde boom is dit O(log n). Bij een ongebalanceerde boom is de worst case tijdscomplexiteit O(n) en de average case tijdscomplexiteit O(wortel n).
Een voorbeeld van een implementatie van een binaire boom vind je in antwoordcode\\ads_week4_antwoorden.

## Proeftoets
![[Pasted image 20210608152800.png]]