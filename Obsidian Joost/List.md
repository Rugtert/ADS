geordende collectie, duidelijk wat waar in de lijst is opgenomen
Is een collectie waarin de lementen een positie hebben, soms ook een sequentie genoemd. Het is een collectie met meer bewerkingen: 
- Positionele toegang: het manipuleren van elementen gebaseerd op hun numerieke positie in de lijst.
- Zoeken: het zoeken naar een spcidiek object in de lijst, waarbij zijn numerieke positie wordt teruggegeven
- ListIterator: een uitbreding van de interatorbewerkingen, die rekening houdt met het sequentiele karakter van de lijst
- Rangeview: het uitvoeren van bewerkingen op een gedeelde van de lijst

[[ArrayList]] en [[LinkedList]] verschillen op de volgende punten:


---
[next →](https://www.javatpoint.com/difference-between-arraylist-and-linkedlistListIterator-interface-in-collection-framework) [← prev](https://www.javatpoint.com/difference-between-arraylist-and-linkedlistLinkedList-in-collection-framework)

# Difference between ArrayList and LinkedList

ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.

However, there are many differences between ArrayList and LinkedList classes that are given below.

ArrayList

LinkedList

1) ArrayList internally uses a **dynamic array** to store the elements.

LinkedList internally uses a **doubly linked list** to store the elements.

2) Manipulation with ArrayList is **slow** because it internally uses an array. If any element is removed from the array, all the bits are shifted in memory.

Manipulation with LinkedList is **faster** than ArrayList because it uses a doubly linked list, so no bit shift
- ![[Pasted image 20210522104929.png]]
