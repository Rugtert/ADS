package zoo;

import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        System.out.println("\n=========================");
        System.out.println("Eerste schema");
        System.out.println("=========================");

        ZooKeeper john = new ZooKeeper("John");
        john.addAnimalFeeding(new AnimalFeeding("Leeuwen", "07:30"));
        john.addAnimalFeeding(new AnimalFeeding("IJsberen", "07:50"));
        john.addAnimalFeeding(new AnimalFeeding("Panda's", "08:35"));

        john.printAnimals();
        john.printSchedule();

        System.out.println("\n=========================");
        System.out.println("Uitgebreid schema");
        System.out.println("=========================");

        john.addAnimalFeeding(new AnimalFeeding("Zeehonden", "07:10"));
        john.addAnimalFeeding(new AnimalFeeding("Konijnen", "08:35"));
        john.addAnimalFeeding(new AnimalFeeding("Kolibries", "08:30"));
        john.addAnimalFeeding(new AnimalFeeding("IJsberen", "12:50"));

        john.printAnimals();
        john.printSchedule();
    }
}
