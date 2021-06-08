package ads_week3;

public class Vogelbekdier {
    int lengte;
    String naam;

    public Vogelbekdier(int lengte, String naam) {
        this.lengte = lengte;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Vogelbekdier " + this.naam + " met lengte " + this.lengte;
    }
}