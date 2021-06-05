package ads_week4_antwoorden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    
    
    public static void main(String[] args) {
        Integer [] intArray = {3, 2, 6, 7};
        String[] stringArray = {"hallo", "hoi", "hey", "hi", "hiya"};

        ArrayList<Integer> intArrayList = arrayToList(intArray);
        ArrayList<String> stringArrayList = arrayToList(stringArray);

        printer(intArrayList);
        printer(stringArrayList);
    }

    public static <T> ArrayList<T> arrayToList(T[] inputArray) {
        return new ArrayList<>(Arrays.asList(inputArray));
    }

    public static <T> void printer(List<T> list) {
        for (T elem : list)
            System.out.println(elem); 
    }


}
