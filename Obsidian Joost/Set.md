---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# Set
---
created: 2021-05-22T10:06:23 (UTC +02:00)
tags: [C,C++,Python,Java,HTML,CSS,JavaScript,SQL,PHP,jQuery,XML,DOM,Bootstrap,Tutorials,Articles,Programming,training,learning,quiz,preferences,examples,code]
source: https://www.tutorialspoint.com/java/java_set_interface.htm

> ## Excerpt
> Java - The Set Interface - A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.

---
A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.

The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.

Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ.

The methods declared by Set are summarized in the following table −

Sr.No.

### Method & Description

**add( )** Adds an object to the collection.
**clear( )** Removes all objects from the collection.
**contains( )** Returns true if a specified object is an element within the collection.
**isEmpty( )** Returns true if the collection has no elements.
**iterator( )** Returns an Iterator object for the collection, which may be used to retrieve an object.
**remove( )** Removes a specified object from the collection.
**size( )** Returns the number of elements in the collection.

## Example

Set has its implementation in various classes like HashSet, TreeSet, LinkedHashSet. Following is an example to explain Set functionality −
```js
import java.util.*;
public class SetDemo {

  public static void main(String args[]) { 
      int count[] = {34, 22,10,60,30,22};
      Set<Integer> set = new HashSet<Integer>();
      try {
         for(int i = 0; i < 5; i++) {
            set.add(count[i]);
         }
         System.out.println(set);

         TreeSet sortedSet = new TreeSet<Integer>(set);
         System.out.println("The sorted list is:");
         System.out.println(sortedSet);

         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
      }
      catch(Exception e) {}
   }
}
```