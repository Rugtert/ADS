package ads_week3;

public class Vak {
    String naam;
    int id;

    public Vak(String naam, int id) {
        this.naam = naam;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vak " + id + ": " + naam;
    }
}
