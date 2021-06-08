---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
###### 🔗 Linked to this page
[[Documentatie voor de toets]]
# Informatie over les 4 Algoritmen
Sheets van de les
[[ADS-4 v1.0.pdf]]
Eigen Notities
[[Les 4 Algoritmes en datastructuren]]

---

## Opdracht in de les:
### [[Array to list]]
#### Uitwerking
``` java
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


```

### [[Binary Tree]]
#### Uitwerking
```java
package ads_week4_antwoorden;

public class BinaryTree {
 
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(3);
        tree.add(77);
        tree.add(-2);
        tree.add(4);
        tree.add(-72);

        System.out.println("------------------------");
        System.out.println("Printing the tree sorted");
        tree.printSorted();
        System.out.println("------------------------");
        System.out.println("Tree contains -2? " + tree.contains(-2));
        System.out.println("Tree contains 34? " + tree.contains(34));
        System.out.println("Maximum value of the tree: " + tree.max());
        System.out.println("Minimum value of the tree: " + tree.min());
        System.out.println("Removing 4 and 77");
        tree.remove(4);
        tree.remove(77);

        System.out.println("------------------------");
        System.out.println("Printing the tree sorted");
        tree.printSorted();
        System.out.println("------------------------");


    }


    public static class Tree {
        Node root;

        public Tree () {
            this.root = null;
        }

        public void add(int number) {
            if (root == null) {
                root = new Node(number);
            } else {
                root.add(number);
            }
        }

        public boolean contains(int number) {
            return root.contains(number);
        }

        public int max() {
            return root.max();
        }

        public int min() {
            return root.min();
        }

        public void remove(int number) {
            Node potentialNewNode = root.remove(number);
            // Update the root if necessary
            // This happens either when the root has no right children.
            // Or the root has no children at all.
            if (potentialNewNode == null || potentialNewNode.data != root.data)
                root = potentialNewNode;
        }

        public void printSorted() {
            root.printSorted();
        }
    }

    public static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }

        public void add(int number) {
            if (number < data) {
                if (left == null)
                    left = new Node(number);
                else
                    left.add(number);
            } else {
                if (right == null)
                    right = new Node(number);
                else
                    right.add(number);
            }
        }

        public boolean contains(int number) {
            if (number == this.data) 
                return true;
            else if (number > this.data) {
                if (right == null) 
                    return false;
                else
                    return right.contains(number);
            } else {
                if (left == null)
                    return false;
                else
                    return left.contains(number);
            }
        }

        public Node remove(int number) {
            if (number == data) {
                if (right == null) {
                    return left;
                } else {
                    this.data = right.pollNextNumber(this);
                }
            } else if (number < data) {
                if (left == null)
                    System.out.println("ERROR: Number " + number + " not found!");
                else {
                    // Potential new node if the left has no right children.
                    Node potentialNewNode = left.remove(number);
                    if (potentialNewNode == null || potentialNewNode.data != left.data)
                        left = potentialNewNode;
                }
            } else {
                if (right == null)
                    System.out.println("ERROR: Number " + number + " not found!");
                else {
                    Node potentialNewNode = right.remove(number);
                    if (potentialNewNode == null || potentialNewNode.data != right.data)
                        right = potentialNewNode;
                }
            }
            return this;
        }

        public int pollNextNumber(Node parent) {
            // The lowest number to the right.
            if (left == null) {
                // Update the parent's node, either with null or the correct node.
                updateParentNode(parent, right);
                return data; 
            } else {
                return left.pollNextNumber(this);
            }
        }

        /**
         * Updates the parent node's left or right node from this node to newNode.
         */
        private void updateParentNode(Node parent, Node newNode) {
            if (parent.left.data == data) 
                parent.left = newNode;
            else
                parent.right = newNode;
        }

        public int max() {
            if (right == null)
                return data;
            else
                return right.max();
        }

        public int min() {
            if (left == null)
                return data;
            else
                return left.min();
        }

        public void printSorted() {
            if (!(left == null)) 
                left.printSorted();
            System.out.println(data);
            if (!(right == null))
                right.printSorted();
        }
    }
}

```

### [[Generic Pair]]
#### Uitwerking
```java
package ads_week4_antwoorden;

import java.util.ArrayList;

public class GenericPair {
    public static void main(String[] args) {
        Pair<Integer, String> myPair = new Pair<>(3, "drie");
        Pair<Integer, String> myPair2 = new Pair<>(7, "zeven");
        Pair<Integer, String> myPair3 = new Pair<>(5, "vijf");

        ArrayList<Pair<Integer, String>> pairList = new ArrayList<>();

        pairList.add(myPair);
        pairList.add(myPair2);
        pairList.add(myPair3);

        for (Pair<?, ?> pair : pairList)
            System.out.println(pair);

    }

    public static class Pair<T, U> {
        T t;
        U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        @Override
        public String toString() {
            return "Een paar van '" + t + "' en '" + u + "'";
        }
    }
}

```

