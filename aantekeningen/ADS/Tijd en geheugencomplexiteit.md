# Tijds en geheugencomplexiteit
## TijdsComplexiteit
Stel we hebben een running time functie van:
	T(n)=10n^3+n^2+40n+80
	Voor n=1000 is T(n)=10 001 040 080
	Waarvan 10 000 000 000 komt door de 10n^3
We zijn vaak alleen geïntereseerd in ***de hoogste macht van n***, omdat voor een hogere n deze vaak de volledige running time bepaalt. In dit geval:
> T(n) = O(n3)
		
### Big-O notatie in de praktijk
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
