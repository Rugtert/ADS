package ads_week3;

import java.util.ArrayDeque;

public class Kassa {
    private String name;
    private ArrayDeque<String> queue = new ArrayDeque<>();

    public Kassa(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void enterQueue(String person) {
        queue.addFirst(person);
    }

    public String leaveQueue() {
        return queue.removeLast();
    }

    public int getQueueLength() {
        return queue.size();
    }
}
