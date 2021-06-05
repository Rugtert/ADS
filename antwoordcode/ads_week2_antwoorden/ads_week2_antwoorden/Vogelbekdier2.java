package ads_week2_antwoorden;

public class Vogelbekdier2 implements Comparable<Vogelbekdier2> {
    int lengte;
    String naam;

    public Vogelbekdier2(int lengte, String naam) {
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
        if (! (obj instanceof Vogelbekdier2))
            return false;

        if(getClass() != obj.getClass())
            return false;

        Vogelbekdier2 andereDier = (Vogelbekdier2) obj;

        if(naam.equals(andereDier.naam) && lengte == andereDier.lengte)
            return true;

        return false;
    }

    // Sorteer ze automatisch op naam.
    @Override
    public int compareTo(Vogelbekdier2 o) {
        return naam.compareTo(o.naam);
    }
    
}