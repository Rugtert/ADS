import java.util.ArrayList;

public class binarysearch {

    public static void main(String[] args) {
        int bier = 1;

        // Array Version
        ArrayList<Integer> arrayinput = new ArrayList<Integer>();
        for (int i = 0; i <= 30000; i++) {
            arrayinput.add(i);
        }

        int resultarray = BinarySearch(arrayinput, bier);
        if (resultarray > -1) {
            System.out.println("found element at: " + resultarray);
        } else {
            System.out.println("element not found");
        }

        //List version
        int[] listinput = {18, 19, 25, 30, 44, 44, 72, 93, 100, 150, 230, 330, 532, 705, 821, 999, 1000};
        int resultlist = BinarySearch(listinput, bier);
        if (resultlist > -1) {
            System.out.println("found element at: " + resultlist);
        } else {
            System.out.println("element not found");
        }

        int linearresult = linearsearch(listinput, bier);
        if (linearresult > -1) {
            System.out.println("found element at: " + linearresult);
        } else System.out.println("element not found");

    }

    public static int BinarySearch(ArrayList<Integer> input, int bier) {
        int low = 0;
        int high = input.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(mid);

            if (input.get(mid) < bier) {
                low = mid + 1;
            }

            if (input.get(mid) > bier) {
                high = mid - 1;
            }

            if (input.get(mid) == bier) {
                return mid;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] input, int bier) {

        int low = 0;
        int high = input.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(mid);

            if (input[mid] < bier) {
                low = mid + 1;
            }

            if (input[mid] > bier) {
                high = mid - 1;
            }

            if (input[mid] == bier) {
                return mid;
            }
        }
        return -1;
    }

    public static int linearsearch(int[] input, int bier) {
        for (int i = 0; i < bier; i++) {
            System.out.println(i);
            if (bier == input[i]) {
                return i;
            }
        }
        return -1;
    }
}