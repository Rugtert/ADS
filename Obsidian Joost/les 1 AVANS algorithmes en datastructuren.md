---
tags: 📝
aliases: 
cssclass:
type:
notes:
---
###### 🔗 Linked to this page
---
# les 1 AVANS algorithmes en datastructuren
**title**: [[les 1 AVANS algorithmes en datastructuren]]
**tags**:  [[avans]]
**References**:
**Related**: 
**Date**: [[2021-05-04]]

---
Content:

## Algorithmes
Stappen om een probleem op te lossen
OM tot een oplossing te komen is het handig om data op te slaan. De manier waarop je dat kan opslaan is DataStructuur

### Voorbeeld 1: Zoeken:
Vind een waarde in een lijst.... Dat is het probleem
#### Lineair zoeken
Elk element checken of het aan de voorwaarde voldoet!
Vraag is hoe snel is dit? en hoe meet je dat?
In een worst-case scenario hoe snel is het. --> 1 vergelijking  is een comparison. 
Als het er niet in zit dat heb je aantal comparisons nodig.  Bij een n grootte van de array is het dus n comparisons.
Dit is een O(n) algoritme
#### Binair zoeken:
Hoe werkt dat? Op volgorde is de lijst. Hoger of lager. Dan is het zo of niet. Lijst moet wel gesorteerd zijn!
Hoe weet je of het getal er wel is? --> als er nog 1 getal is wat het niet is dan zit die er niet in!
Hoe snel is het algorithme in het worst-case scenario? --> log9
```mermaid
formula n/2steps = 1
```
> $$T(n) = log_{2}n$$

T is tijd per comparison

Hoe kan je tijd wel beter meten? asymptotische analyse
Running time wordt bepaald door de grootste term van de running time.
>$$T(n) = O(n^2)$$

Binaire search is een $$log_{n}$$ algoritme


$$O(n^2) < O(nlog_{n}) < O(n) $$

![[Pasted image 20210504201205.png]]



## Datastructuren
Elke datastructuur heeft zijn voor en nadelen.
Alle datastructuren kan 4 dingen doen
1. Vullen
2. Lezen
3. Updaten
4. Verwijderen

JAVA collection framewrok Hierarchy
![[Pasted image 20210504181525.png]]



---


