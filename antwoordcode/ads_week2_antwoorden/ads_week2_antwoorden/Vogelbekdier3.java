package ads_week2_antwoorden;

import java.util.Objects;

public class Vogelbekdier3 {
    int lengte;
    String naam;

    public Vogelbekdier3(int lengte, String naam) {
        this.lengte = lengte;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Vogelbekdier " + this.naam + " met lengte " + this.lengte;
    }

    // Aanname: Als vogelbekdieren gelijke namen en lengtes hebben, 
    //  dan is het dezelfde vogelbekdier.
    // Je zou dit kunnen voorkomen door met ids te werken, e.g. this.id=3.
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Vogelbekdier3))
            return false;

        if(getClass() != obj.getClass())
            return false;

        Vogelbekdier3 andereDier = (Vogelbekdier3) obj;

        if(naam.equals(andereDier.naam) && lengte == andereDier.lengte)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, lengte);
    }
    
}