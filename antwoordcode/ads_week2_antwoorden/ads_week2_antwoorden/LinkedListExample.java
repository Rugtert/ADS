package ads_week2_antwoorden;

public class LinkedListExample {
    public static void main(String[] args) {
        IntLinkedList linky = new IntLinkedList();
        // Test element adding.
        linky.add(3);
        System.out.println(linky);

        linky.add(77);
        System.out.println(linky);

        linky.add(72);
        System.out.println(linky);

        // Test element insertion.
        linky.insert(1, 368);
        System.out.println(linky);

        // Test end-of-list removal.
        linky.remove();
        System.out.println(linky);

        // Test the update operation.
        linky.set(0, 18);
        System.out.println(linky);

        // Test the remove operation.
        linky.remove(1);
        System.out.println(linky);
        
        // Test the get operation.
        System.out.println(linky.get(1));

    }
}
