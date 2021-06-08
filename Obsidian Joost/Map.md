---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# MapJAVA heeft 2 implementaties voor MAP
---
created: 2021-05-22T10:09:37 (UTC +02:00)
tags: [C,C++,Python,Java,HTML,CSS,JavaScript,SQL,PHP,jQuery,XML,DOM,Bootstrap,Tutorials,Articles,Programming,training,learning,quiz,preferences,examples,code]
source: file:///Users/joostoomen/Downloads/Java%20-%20The%20Map%20Interface%20-%20Tutorialspoint.html

> ## Excerpt
> Java - The Map Interface - The Map interface maps unique keys to values. A key is an object that you use to retrieve a value at a later date.

___

The Map interface maps unique keys to values. A key is an object that you use to retrieve a value at a later date.

-   Given a key and a value, you can store the value in a Map object. After the value is stored, you can retrieve it by using its key.
    
-   Several methods throw a NoSuchElementException when no items exist in the invoking map.
    
-   A ClassCastException is thrown when an object is incompatible with the elements in a map.
    
-   A NullPointerException is thrown if an attempt is made to use a null object and null is not allowed in the map.
    
-   An UnsupportedOperationException is thrown when an attempt is made to change an unmodifiable map.
    

Sr.No.

### Method & Description

**void clear( )** Removes all key/value pairs from the invoking map.
**boolean containsKey(Object k)** Returns true if the invoking map contains **k** as a key. Otherwise, returns false.
**boolean containsValue(Object v)** Returns true if the map contains **v** as a value. Otherwise, returns false.
**Set entrySet( )** Returns a Set that contains the entries in the map. The set contains objects of type Map.Entry. This method provides a set-view of the invoking map.
**boolean equals(Object obj)** Returns true if obj is a Map and contains the same entries. Otherwise, returns false.
**Object get(Object k)** Returns the value associated with the key **k**.
**int hashCode( )** Returns the hash code for the invoking map.
**boolean isEmpty( )** Returns true if the invoking map is empty. Otherwise, returns false.
**Set keySet( )** Returns a Set that contains the keys in the invoking map. This method provides a set-view of the keys in the invoking map.
**Object put(Object k, Object v)** Puts an entry in the invoking map, overwriting any previous value associated with the key. The key and value are k and v, respectively. Returns null if the key did not already exist. Otherwise, the previous value linked to the key is returned.
**void putAll(Map m)** Puts all the entries from **m** into this map.
**Object remove(Object k)** Removes the entry whose key equals **k**.
**int size( )** Returns the number of key/value pairs in the map.
**Collection values( )** Returns a collection containing the values in the map. This method provides a collection-view of the values in the map.

## Example

Map has its implementation in various classes like HashMap. Following is an example to explain map functionality −
- [[HashMap]]
- [[TreeMap]]

```js
import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      Map cars = new HashMap(); 
      Map fruit = new HashMap(); 
      cars.put("Car1", 1);
      fruit.put("Fruit1", 2);
      cars.put("Car2",3);
      fruit.put("Fruit2", 4);
      Map everything = new HashMap();
      everything.putAll(cars);
      everything.putAll(fruit);
      
      

      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + everything);
   }
}
```

This will produce the following result −

## Output

Map Elements
{Daisy = 14, Ayan = 12, Zara = 8, Mahnaz = 31}

java\_collections.htm

