package zoo;

public class AnimalFeeding {
    private final String animals;
    private final String feedingTime; 
    
    public AnimalFeeding(String animals, String feedingTime) {
        this.animals = animals;
        this.feedingTime = feedingTime;
    }
    
    public String getName() {
        return animals;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

    public void printSchedule() {
        System.out.println(feedingTime + " - " + animals);
    }

    public void printAnimals() {
        System.out.println(animals + " - " + feedingTime);
    }
    
}
