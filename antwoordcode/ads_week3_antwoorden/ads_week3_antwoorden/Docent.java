package ads_week3_antwoorden;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Docent)) return false;
        if (getClass() != obj.getClass()) return false;

        Docent b = (Docent) obj;

        return this.id == b.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
