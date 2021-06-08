package ads_week3;

public class Docent {
    int id;
    String naam;
    int werkErvaring;

    public Docent(int id, String naam, int werkErvaring) {
        this.id = id;
        this.naam = naam;
        this.werkErvaring = werkErvaring;
    }

    @Override
    public String toString() {
        return "Docent " + id + ": " + naam + " met " + werkErvaring + "jaar werkervaring";
    }
}
