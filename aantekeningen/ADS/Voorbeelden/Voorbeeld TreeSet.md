```java
    public static void boomVogels(Vogelbekdier[] vogelbekdieren){
        TreeSet<Vogelbekdier> boomvogels = new TreeSet<>();
        // OF met lambda: TreeSet<Vogelbekdier> boomvogels = new TreeSet<>((e1,e2) -> e1.lengte - e2.lengte);
        for (Vogelbekdier vogelbekdier : vogelbekdieren) {
            boomvogels.add(vogelbekdier);
        }
        for (Vogelbekdier boomvogel : boomvogels) {
            System.out.println(boomvogel.naam);
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