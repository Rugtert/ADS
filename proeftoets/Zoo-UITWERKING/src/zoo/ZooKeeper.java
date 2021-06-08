package zoo;

import java.util.TreeMap;

public class ZooKeeper {

    private String name;
    private TreeMap<String, AnimalFeeding> feedings;
    private TreeMap<String, AnimalFeeding> feedingsByTime;

    public ZooKeeper(String name) {
        this.name = name;
        this.feedings = new TreeMap<>();
        this.feedingsByTime = new TreeMap<>();
    }

    public void addAnimalFeeding(AnimalFeeding feeding) {
        feedings.put(feeding.getName() + feeding.getFeedingTime(), feeding);
        AnimalFeeding oldFeeding =  feedingsByTime.put(feeding.getFeedingTime(), feeding);
        if(oldFeeding != null) {
            System.out.println("LET OP: Om " + feeding.getFeedingTime() + " zouden de " + oldFeeding.getName() + " al gevoerd worden");
        }
    }

    public void printSchedule() {
        System.out.println("Werkschema voor " + name);

        for (AnimalFeeding feeding : feedingsByTime.values()) {
            feeding.printSchedule();
        }
        System.out.println();
    }

    public void printAnimals() {
        System.out.println("Dieren gevoerd door " + name);
        
        for (AnimalFeeding feeding : feedings.values()) {
            feeding.printAnimals();
        }
        System.out.println();
    }
}
