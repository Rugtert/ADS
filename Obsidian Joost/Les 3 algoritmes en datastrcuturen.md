---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# Les 3 algoritmes en datastrcuturen
Boom van JAVA datastructuren?
![[Pasted image 20210518180251.png]]

Opdracht van vorige week
Implementeer O(_n_ log _n_)
TreeSet voegt ze automatisch toe op volgorde. Maar hoe wordt dat gedaan? Met Equals en CompareTo. Je bepaalt zelg op welke ordening dat gebeurd
Hashset is eigenlijk sneller maar vooral als je geen sortering nodig hebt.

#### Sets
Set is een verzameling van objecten en duplicaten worden niet bewaard. Objecten kunnen niet op index worden aangeroepen. 

![[Pasted image 20210518181302.png]]

##### HashSet
op basis van een hashcode. Namen worden opgeslagen in hashes. Bereken een hashcode en die kunnen snel worden bekeken.

##### TreeSet slaat objecten op in een Red-Black tree
voordeel is dat elementen dus gellijk gesorteerd worden.
Eerste en laatste elementen kan je snel pollen (grootste en en laagste kost O(log_n_))
Hashcode
![[Pasted image 20210518181549.png]]
Object.hash(properties, etc)

#### Maps
Key met bijbehorende value
Key-> value(s)

Set en Map worden in JAVA vergelijkbaar ingezet.
Welke key heeft welke value.
Extra functionaliteit tov SET. Ze verwijzen naar bepaalde data.
ArrayList heeft WEL duplicates 

Map kan aan meerdere dingen gelink worden. 

Sets en Maps ArrayDeque
PrioityQueu


### ArrayDeque
Soms is orde van data belangrijk dan kan je queues (rij) gebruiken. Queue is een rij aan objecten met een orde

LIFO is stapel. Last In First Out

FIFO is een rij, First In First Out


StackClass waarom is die er ?? Door legacy maar nu niet meer gebruiken.

LinkedList zou ook gebruik kunnen worden maar heeft slechtere Worsecase scenarios
![[Pasted image 20210518193242.png]]

### Priority Queue

Hiermee kan je makkelijke minimale of maximale waarde van je opgeslagen data vinden.
Java implementeert het als een _minheap_ Of de laagste of de hoogste is het belangrijkste
werkt vergelijkbaar als Treeset
Equals meegeven en CompareTo

Priority kan wel duplicaties bevatten. TreeSet niet. Running times:
![[Pasted image 20210518194038.png]]


Alle datastructuren:
![[Pasted image 20210518194631.png]]


volgende week  [[Les 4 Algoritmes en datastructuren]] over generieke data