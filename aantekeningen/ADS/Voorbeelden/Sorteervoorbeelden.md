# Sorteren op integers
```java
    public static void sortByLength(Vogelbekdier[] vogelbekdieren) {
        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length -1; i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogelbekdieren.length; j++) {
                if (vogelbekdieren[j].lengte < min.lengte){
                    min = vogelbekdieren[j];
                    vogelbekdieren[j] = vogelbekdieren[i];
                    vogelbekdieren[i] = min;
                }
            }
        }
        for (int i = 0; i < vogelbekdieren.length; i++) {
            System.out.println(vogelbekdieren[i].lengte);
        }
    }
```
# Sorteren op Strings

```java
public static void sortByName(Vogelbekdier[] vogelbekdieren) {
        Vogelbekdier min;
        for (int i = 0; i < vogelbekdieren.length -1; i++) {
            min = vogelbekdieren[i];
            for (int j = i; j < vogelbekdieren.length; j++) {
                System.out.println(vogelbekdieren[j].naam.compareTo(min.naam));
                if (vogelbekdieren[j].naam.compareTo(min.naam) < 0){
                    min = vogelbekdieren[j];
                    vogelbekdieren[j] = vogelbekdieren[i];
                    vogelbekdieren[i] = min;
                }
            }
        }
        for (int i = 0; i < vogelbekdieren.length; i++) {
            System.out.println(vogelbekdieren[i].naam);
        }
    }
```
# Objectklasse...
```java
public class Vogelbekdier implements Comparable<Vogelbekdier> {
    int lengte;
    String naam;

    public Vogelbekdier(int lengte, String naam) {
        this.lengte = lengte;
        this.naam = naam;
    }

    @Override
    public int compareTo(Vogelbekdier o) {
        return this.naam.compareTo(o.naam);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vogelbekdier that = (Vogelbekdier) o;
        return lengte == that.lengte && Objects.equals(naam, that.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengte, naam);
    }
}
```