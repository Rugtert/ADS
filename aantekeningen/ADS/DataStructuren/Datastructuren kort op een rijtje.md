# Korte beschrijving van de datastructuren
- Array\<E>: een lijst aan getallen, kan niet worden veranderd.
- ArrayLists\<E>: kan eigenlijk alles ermee, houdt arrays bij in de achtergrond.
- LinkedLists\<E>: linkt naar volgende datapunt. In principe inferieur aan ArrayList en ArrayDeque.
- Sets\<E>: Handig om te checken of iets geweest is (add, contains, remove)
	- HashSet\<E>: Gebruikt hashing en hashCode(). Soms zijn er collisions.
	- TreeSet\<E>: Gebruikt een sorteerorde en een gebalanceerde binaire zoekboom.
- Map\<K, V>: Handig om dingen mee op te zoeken.
	- Net als bij Sets zijn er HashMaps en TreeMaps.
- ArrayDeque\<E>: Goed om de volgorde van data bij te houden.
- PriorityQueue\<E>: Wordt gebruikt om continu een minimum (of maximum) bij te houden.

# O notaties van operaties op datastructuren
![[Pasted image 20210605112137.png]]