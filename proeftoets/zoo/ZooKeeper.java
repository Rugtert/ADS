package zoo;

import java.util.ArrayList;

public class ZooKeeper {

    private String name;
    private ArrayList<AnimalFeeding> feedings;

    public ZooKeeper(String name) {
        this.name = name;
        this.feedings = new ArrayList<>();
    }

    public void addAnimalFeeding(AnimalFeeding feeding) {
        feedings.add(feeding);
    }

    public void printSchedule() {
        System.out.println("Werkschema voor " + name);

        for (AnimalFeeding feeding : feedings) {
            feeding.printSchedule();
        }
        System.out.println();
    }

    public void printAnimals() {
        System.out.println("Dieren gevoerd door " + name);
        
        for (AnimalFeeding feeding : feedings) {
            feeding.printAnimals();
        }
        System.out.println();
    }
}
