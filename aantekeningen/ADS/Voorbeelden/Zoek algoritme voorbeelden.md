# Binary search
Strings zoeken?  Gebruik string1.compareTo(string2)
```java 
import java.util.ArrayList;  
  
public class binarysearch {  
  
 public static void main(String[] args) {  
   int bier = 330;  
  
   // Array Version  
   ArrayList<Integer> arrayinput = new ArrayList<Integer>();  
   for (int i = 0; i <= 30000; i++) {  
     arrayinput.add(i);  
   }  
  
   int resultarray = search(arrayinput, bier);  
   if (resultarray > -1) {  
     System.out.println("found element at: " + resultarray);  
   } else {
     System.out.println("element not found");  
   }  
  
    //List version  
    int[] listinput = {18, 19, 25, 30, 44, 44, 72, 93, 100, 150, 230, 330, 532, 705, 821, 999, 1000};  
    int resultlist = search(listinput, bier);  
    if (resultlist > -1) {  
      System.out.println("found element at: " \+ resultlist);  
    } else {  
      System.out.println("element not found");  
    }  
  }  
  
  public static int search(ArrayList<Integer> input, int bier) {  
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
  
 public static int search(int[] input, int bier) {  
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
}
```

# Linear search
```java
public static int linearsearch(int[] input, int bier) {  
    for (int i = 0; i < bier; i++) {  
      System.out.println(i);  
      if (bier == input[i]) {  
         return i;  
       }  
     }  
    return -1;  
}
```

