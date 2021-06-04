# Tijds en geheugencomplexiteit
Om de snelheid van een algoritme te berekenen, gebruiken we de big-O notatie, wat de bovengrens van de orde van toename is. Dit maakt het relatief makkelijk om de algoritmesnelheid in te schatten en te vergelijken. Je kan schatten hoe groot een verzameling mag zijn.
## TijdsComplexiteit
Stel we hebben een running time functie van:
	T(n)=10n^3+n^2+40n+80
	Voor n=1000 is T(n)=10 001 040 080
	Waarvan 10 000 000 000 komt door de 10n^3
We zijn vaak alleen geïntereseerd in ***de hoogste macht van n***, omdat voor een hogere n deze vaak de volledige running time bepaalt. In dit geval:
> T(n) = O(n3)
		
### Big-O notatie in de praktijk
![[Pasted image 20210604153105.png]]
#### Wat betekend de big-O notatie?
> Als inputverzameling n groter wordt, dan duurt het runnen van een O(n2) algoritme n2 keer zo lang. 


> Voorbeeld: als n 10x zo veel wordt duurt het uitvoeren van een O(n2) algoritme 100x zo lang
#### Rekenen met Big-O Notatie
![[Pasted image 20210604153251.png]]
![[Pasted image 20210604153338.png]]

#### Hoe bereken je de complexiteit van Lineair zoeken?
![[Pasted image 20210604150138.png]]

![[Pasted image 20210604150205.png]]

![[Pasted image 20210604150237.png]]

## GeheugenComplexiteit
>    G(n)=O(n)

Als we een array van n getallen willen bijhouden dan is ons geheugengebruik O(n)

![[Pasted image 20210604150800.png]]


## Symbolen
O -> Bovengrens van de orde van toename (Worst Case)
Ω -> Ondergrens van de orde van toename (Best case)
Θ -> Boven en ondergrens van de orde van toename (Average case)
