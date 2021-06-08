```java
    public static void hashVogels(Vogelbekdier[] vogelbekdieren){
        HashSet<Vogelbekdier> vogelhash = new HashSet<>();
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            vogelhash.add(vogelbekdier);
        }

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            System.out.println(vogelhash.contains(vogelbekdier));
        }

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            vogelhash.remove(vogelbekdier);
        }

        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            System.out.println(vogelhash.contains(vogelbekdier));
        }
    }
```

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