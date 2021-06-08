package ads_week3;

import java.util.ArrayDeque;

public class Kassa {
    private String name;

    public Kassa(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayDeque<Persoon> queue = new ArrayDeque<>();
}
