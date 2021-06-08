package ads_week2;

import java.util.Objects;

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