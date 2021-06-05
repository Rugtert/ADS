package ads_week1_antwoorden;

public class LinearStringSearch {
    /**
     * Finds a number in an unordered array.
     * Returns index or -1 if not found.
     */
    public static int findString(String[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Piet", "Jan", "Katja", "Annabel", "Frans", "Lieke"};

        System.out.println("Index of Patrick: " + findString(stringArray, "Patrick"));
    }
}