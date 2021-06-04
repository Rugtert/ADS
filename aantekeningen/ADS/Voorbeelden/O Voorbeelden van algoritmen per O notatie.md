## O(n)
```c
void printAllElementOfArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}
```
## O(n2)
```c
void printAllPossibleOrderedPairs(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("%d = %d\n", arr[i], arr[j]);
        }
     }
}
```
## O(2n)

```c
int fibonacci(int num)
{
    if (num <= 1) return num;
    return fibonacci(num - 2) + fibonacci(num - 1);
}
```

An example of an O(2n) function is the recursive calculation of Fibonacci numbers. O(2n) denotes an algorithm whose growth doubles with each addition to the input data set. The growth curve of an O(2n) function is exponential - starting off very shallow, then rising meteorically.

## O(log n)
What is important here is that the **running time grows in proportion to the logarithm of the input (in this case, log to the base 2):**
```java
for (int i = 1; i < n; i = i * 2){
    System.out.println("Hey - I'm busy looking at: " + i);
}
```

```java
public int runBinarySearchIteratively(
  int[] sortedArray, int key, int low, int high) {
    int index = Integer.MAX_VALUE;
    
    while (low <= high) {
        int mid = (low + high) / 2;
        if (sortedArray[mid] < key) {
            low = mid + 1;
        } else if (sortedArray[mid] > key) {
            high = mid - 1;
        } else if (sortedArray[mid] == key) {
            index = mid;
            break;
        }
    }
    return index;
}
```