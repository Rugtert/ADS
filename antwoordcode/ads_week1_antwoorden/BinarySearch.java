package ads_week1_antwoorden;

public class BinarySearch {

    /**
     * Performs binary search on the input array.
     * @return Index of number in array if found, else -1.
     */
    public static int binarySearch(int [] array, int number) {
        int low = 0;
        int mid;
        int high = array.length;

        while (high - low >= 0) {
            mid = (high + low) / 2;
            if (number == array[mid])       // Number found
                return mid;
            else if (number < array[mid])   // Check the lower half.
                high = mid - 1;
            else                            // Check the upper half.
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] numberArray = {18, 19, 25, 28, 29, 44, 44, 72, 93};
        
        int index = binarySearch(numberArray, 93);
        System.out.println("Index of 93: " + index);

        // Make sure to check each index for validity! 
        // Sometimes it can go wrong at index 0 or length - 1
        System.out.println("Testing all numbers: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(binarySearch(numberArray, numberArray[i]) + " ");
        }

    }
}
