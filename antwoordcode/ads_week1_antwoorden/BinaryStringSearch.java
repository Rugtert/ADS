package ads_week1_antwoorden;

public class BinaryStringSearch {
    public static int binarySearch(String[] array, String name) {
        int low = 0;
        int mid;
        int high = array.length;

        while (high - low >= 0) {
            mid = (high + low) / 2;
            int stringComparison = name.compareTo(array[mid]);

            if (stringComparison == 0)      // Number found
                return mid;
            else if (stringComparison < 0)  // Check the lower half.
                high = mid - 1;
            else                            // Check the upper half.
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Annabel", "Franks", "Jan", "Katja", "Lieke", "Piet"};

        int index = binarySearch(stringArray, "Piet");
        System.out.println("Index of Piet: " + index);

        // Make sure to check each index for validity! 
        // Sometimes it can go wrong at index 0 or length - 1
        System.out.println("Testing all names: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(binarySearch(stringArray, stringArray[i]) + " ");
        }
    }
}
