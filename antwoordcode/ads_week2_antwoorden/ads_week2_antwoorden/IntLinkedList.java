package ads_week2_antwoorden;

public class IntLinkedList {

    public Node head;
    private int length;

    public IntLinkedList() {
        head = null;
        length = 0;
    }

    /**
     * Not mandatory, but this constructor allows to create a new linkedlist from an
     * intArray. It does so by iterating over the ints in a reverse manner.
     */
    public IntLinkedList(int[] intArray) {
        Node[] nodeList = new Node[intArray.length];
        Node prevNode = null;
        for (int i = intArray.length - 1; i >= 0; i--) {
            nodeList[i] = new Node(prevNode, intArray[i]);
            prevNode = nodeList[i];
        }
        head = nodeList[0];
        this.length = intArray.length;
    }

    /**
     * Add data at the end of the LinkedList. O(n)
     * 
     * Since it's a single LinkedList, this add method would take O(n) if we didn't
     * store the final node. One way to improve this function to O(1) is by storing
     * and updating the final node.
     */
    public void add(int data) {
        if (length == 0) {
            head = new Node(null, data);
        } else {
            Node curNode = head;
            while (curNode.next != null)
                curNode = curNode.next;
            curNode.next = new Node(null, data);
        }
        length++;
    }

    /**
     * Inserts data at index i. O(n)
     */
    public void insert(int i, int data) {
        // Update head.
        if (i == 0) {
            head = new Node(head, data);
        } else {
            Node curNode = head;
            // Skip to the correct node.
            while (i > 1) {
                curNode = curNode.next;
                i--;
            }

            // Update the references and add the new node.
            Node newNode = new Node(curNode.next, data);
            curNode.next = newNode;
        }
        length++;
    }

    /**
     * Removes the final node of the LinkedList. O(n)
     * 
     * Takes O(n) as we need to locate the second-to-final node. Could be improved
     * to O(1) if we implement a double linked list. Or by storing the
     * second-to-final node.
     */
    public void remove() {
        Node curNode = head;
        if (length == 1) {
            curNode = null;
        } else {
            while (curNode.next.next != null)
                curNode = curNode.next;
            curNode.next = null;
        }

        length--;
    }

    /**
     * Removes data at index i. O(n)
     */
    public void remove(int i) {
        Node curNode = head;
        if (i == 0) {
            head = head.next;
        }
        while (i > 1) {
            curNode = curNode.next;
            i--;
        }
        curNode.next = curNode.next.next;

        length--;
    }

    /**
     * Gets data at index i. O(n)
     */
    public int get(int i) {
        Node curNode = head;
        while (i > 0) {
            curNode = curNode.next;
            i--;
        }
        return curNode.data;
    }

    /**
     * Updates data at index 1. O(n)
     */
    public void set(int i, int data) {
        Node curNode = head;
        while (i > 0) {
            curNode = curNode.next;
            i--;
        }
        curNode.data = data;
    }

    public int size() {
        return this.length;
    }

    @Override
    public String toString() {
        if (length == 0)
            return "[]";

        String finalString = "[";
        Node curNode = head;
        while (curNode.next != null) {
            finalString += curNode.data + ", ";
            curNode = curNode.next;
        }
        finalString += curNode.data + "]";
        return finalString;

    }

    public class Node {
        Node next;
        int data;

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        @Override
        public String toString() {
            return Integer.toString(data);
        }
    }
}
