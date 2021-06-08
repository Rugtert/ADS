---
tags: 📝/literature
aliases: 
cssclass:
notes: "literature"
---
# Notes uit het boek Algoritmen en datastructuren
**title**: [[Notes uit het boek Algoritmen en datastructuren]]
**linked source**: [[Algoritmen en datastructuren]]
**tags**: #Algoritmen, #Datastructuren
**Status**: 📝/🌿

----
## Complexiteit
#### Hoofdstuk 2 verschillende paragrafen
Analyse van een algoritme omvat een overzicht van benodigde resources om een bepaald algoritme te kunnen voltooien.
Vaak is het een relatieve vergelijking. Een asymtotische analyse is een schatting van de bruikbaarheid van een algoritme. 
**Uitvoeringstijd** en **geheugenruimte** zijn belangrijke bepalers voor het bepalen van de bruikbaarheid van een algoritme.
Big O notatie is een manier om de toename van een functie weer te geven. O(n) bijvoorbeeld of O(n<sup>2</sup>)
Vervolgens kan worden gekeken naar gemiddelde, beste en slechtste uitvoeringstijd.
#### Hoofdstuk 3 Sorteren
##### Collection Framework JAVA
Een [[collection]] is een object dat meerdere elementen tot een geheel groepeert.

[[Set]]: Laat geen duplicaten toe. 
[[List]]
- [[ArrayList]]
- [[LinkedList]]

[[Map]]: een collection die sleutels op waarden afbeeldt. Bevat GEEN duplicaten. Elke sleutel wordt op hoogstens een waarde afgebeeld.. Een sleutel waarde -paar wordt ook een **entry** genoemd.
[[HashMap]] en [[TreeMap]] zijn de bekende map structuren van JAVA Zie ook [Java Documentation](file:///Users/joostoomen/OneDrive%20-%20Avans%20Hogeschool/Jaar%203,%20blok%204/docs/technotes/guides/collections/overview.html)
#### Hoofdstuk 6 Verdeel en heers algoritmes
Lineair zoeken vs Binaire zoeken.
Linaire zoeken omvat het doorzoeken van de lijst (en dat heeft in het slechtste geval dus een zoektocht door de hele lijst nodig). O(_n_)
Binair zoeken kan in een gesorteerde lijst en heeft een O(log _n_)
#### Hoofdstuk 7 Sorteeralgoritmen
##### Kwadratische sorteeralgoritmen
Drie mogelijkheden die hier gebruikt kunnen worden:
1. [[BubbleSort]]
2. [[SelectionSort]]
3. [[InsertionSort]]
##### MergeSort
Wat is [[MergeSort]]
##### QuickSort
[[QuickSort]] is doorgaans de beste keuze voor een intern sorteeralgoritme. Zoals de naam aangeeft, is dit zeer snel sorteeralgoritme. De gemiddelde utivoeringstijd is O(_n_ log _n_) en de slechtste mogelijke uitvoeringstijd is O(_n_<sup>2</sup>), maar de kans dat dit slechtste geval zich voordoet, kan zeer klein worden gemaakt!

##### Lineaire sorteeralgoritmen
Deze sorteeralgoritmen zin niet op vergelijkingen gebaseerd zoals bij voorgaande algoritmen.
1. [[CountingSort]]
2. [[RadixSort]]

#### Hoofdstuk 14 Hash Tabellen
Een [[hash table]] is een structuur die gegevens in een associatieve manier bewaart. Het wordt in een array format opgeslagen waarbij elke waarde een unieke index waarde heeft. 
Toegang tot de gegevens is erg snel
Dit is een datastrcutuur waar insert en zoeken erg snel zijn en onafhankelijk van de groote van de data. Hash table gebruike een array als opslag medium en gebruikt hash technique voor het genereren van een index waar het element geplaatst moet worden (en gevonden kan worden)
#### Hoofdstuk 15 Geschakelde lijsten
Een [[LinkedList]] is een sequentie van datastructuren welke geschakeld zijn via links.
Een [[ArrayList]] 

#### Hoofdstuk 16 Binaire zoekbomen
De [[Binary Tree]] is een datastructuur die een omplementatie levert van de abstracte datatypes _SortedSet_ en _SortedMap_.
De gemiddelde uitvoeringstijd voor de meeste bewerkingen is O(log _n_), maar jammer genoeg is de langst mogelijke iuitvoeringstijd O(n) in het algemene geval van een binaire zoekboom.
#### Hoofdstuk 5 Recursie
#### Hoofdstuk 9 Bomen