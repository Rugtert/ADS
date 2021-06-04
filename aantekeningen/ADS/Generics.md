# Generics
Je kunt generics op twee plekken gebruiken
1. Generic methods en wildcards
2. Generic classes
3. 
## Generic Methods
Generic methods zijn handig om algemenere objecten mee te geven aan functies.
Een generic method gebruikt een algemene \<T> om een bepaalde Type aan te duiden zoals Strings, integers of classes.

## Wildcards
Soms is het makkelijker en overzichterlijk om Wildcards te gebruiken:
```java
public <T, U> Set<T> getKeyset(Map<T, U> map)
```
Wordt dan:
```java
public Set<?> getKeyset(Map<?, ?> map)
```
De wildcard kan je alleen gebruiken als het Collections of andere generic classes betreft. Het moet tussen <> zitten. 
```java
public void print(? param)
```
werkt dus niet. Daar hebben we Object voor:
```java
public void print(Object param)
```
### Example Code
```java
    public void printer(List<? extends Zoogdier> zoogdierList) {
        for (Zoogdier zoogdier : zoogdierList) {
            System.out.println(zoogdier);
        }
    }
	
    public <T extends Zoogdier> void printer(List<T> zoogdierList) {
        for (Zoogdier zoogdier : zoogdierList) {
            System.out.println(zoogdier);
        }
    }


```