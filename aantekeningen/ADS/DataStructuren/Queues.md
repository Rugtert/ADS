# Queues
Soms is de orde van data belangrijk, dan kunnen we queues gebruiken. Een queue is een rij aan objecten met een orde. Als je extra elementen aan de queue toevoegt dan sluit het achteraan aan. 

## FIFO en LIFO Queues
Haal je het object dat het laatste (kortste) de queue is gegaan eruit, dan heb je een LIFO Queue, Last In First Out. Ook wel een stack genoemd. Vergelijk het met een stapel borden. Doorgaans heb je het bord dat je het eerste pakt het laatste op de stapel gelegd.

Haal je het object dat het eerste de queue in is gegaan eruit, dan het je een FIFO queue. First In First Out. Ook wel een queue genoemd. Denk bijvoorbeeld aan de wachtrij bij een kassa.

Ze zijn in java beide te implementeren met 1 datastructuur. De [[#ArrayDeque]]
## ArrayDeque
Array deque = Array Double-ended queue
Je kan deze queue aan beide kanten bereiken.
![[Pasted image 20210604180005.png]]
De contains() functie is O(n)

Een ArrayDeque werkt achter de schermen met een array en twee integeres.
1. head -> index van de eerste in de queue
2. tail -> index van de laatste in de queue

Als er een element aan de queue wordt toegevoegd of verwijderd worden deze indices ook geupdate. Als je bijvoorbeeld het eerste element weghaald dan schuift de headindex één naar rechts. Als je een element achteraan toevoegd dan schuift de tail index één naar rechts.

Je kan in plaats van een ArrayDeque een [[Arrays#LinkedList]] gebruiken met dezelfde worst-case running times. Maar in de praktijk is een ArrayDeque sneller en gebruikt minder memory.
### Example code
#### FIFO
```java
public static void main(String[] args) {
        ArrayDeque<String> rij = new ArrayDeque<>();
        rij.addLast("Joost");
        rij.addLast("Pieter");
        rij.addLast("Annabel");
        rij.removeFirst();
        System.out.print("Mensen in de wachtrij: ");
        for (String person : rij)
            System.out.print(person + " ");
    }

```

#### LIFO
```java
   public static void main(String[] args) {
        ArrayDeque<String> rij = new ArrayDeque<>();
        rij.addLast("Joost");
        rij.addLast("Pieter");
        rij.addLast("Annabel");
        rij.removeLast();
        System.out.print("Mensen in de wachtrij: ");
        for (String person : rij)
            System.out.print(person + " ");
    }

```
## PriorityQueue
### Wat is een Priority Queue
Met een priority queue kan je heel makkelijk de minimale ***of (niet beide!)*** maximale waarde van je opgeslagen data vinden. Je kunt de laagste value peeken en pollen.
Om een ProrityQueue te kunnen gebruiken dien je, net zoals bij een TreeSet de volgende dingen implementeren:
1. equals();
2. Natural ordering om te comparen. Ofwel:
	1. Comparable implementeren
	2. Comparator meegevben bij het maken van de PriorityQueue ((e1,e2) -> Integer.compare(e1.lengte, e2.lengte))

Achter de schermen wordt een PriorityQueue geïmplementeerd als een binary heap.
Een Priority Queue kan duplicates bevatten.
### Example code
```java
        PriorityQueue<Vogelbekdier> prioQueue = new PriorityQueue<>();
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            prioQueue.add(vogelbekdier);
        }
        System.out.println("Eerste naam: " + prioQueue.peek().naam);

```
### Running Times
![[Pasted image 20210604181353.png]]