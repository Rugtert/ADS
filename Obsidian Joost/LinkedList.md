---
tags: 📥️/🗄 
aliases:
  - 
cssclass: 
type: "documentation"
---
# LinkedList
---

Slaat de leementen op in een zogenaamde geschakelde lijst, een voorstelling die in bepaalde situaties voordelen heeft tegenover een array-voorstelling. Zo vraagt het tussenvoegen van een elmeent in een geschakelde  lijst slechts constante tijd, omdat hierbij geen lijstelementen moeten worden opgeschoven. Daarentegen vraagt de toegang op positie tot de elmenten dan weer lineaire tijd. 
Omdat een geschakelde lijst de componenten niet in een aangrenzende geheugenplaatsen gestcokeerd zijn, vereist het toevoegen van een nieuw elkement in het midden van de geschakelde lijst geen verplaatsing van de rest van de componenten.

---


created: 2021-05-22T10:37:16 (UTC +02:00)  
tags: \[C,C++,Python,Java,HTML,CSS,JavaScript,SQL,PHP,jQuery,XML,DOM,Bootstrap,Tutorials,Articles,Programming,training,learning,quiz,preferences,examples,code\]  
source: 
file:///Users/joostoomen/Downloads/Data%20Structure%20and%20Algorithms%20-%20Linked%20List%20-%20Tutorialspoint.html
author:

---

# 

Data Structure and Algorithms - Linked List - Tutorialspoint

> ## Excerpt
> 
> Data Structure and Algorithms - Linked List - A linked list is a sequence of data structures, which are connected together via links.

---

---

A linked list is a sequence of data structures, which are connected together via links.

Linked List is a sequence of links which contains items. Each link contains a connection to another link. Linked list is the second most-used data structure after array. Following are the important terms to understand the concept of Linked List.

-   **Link** − Each link of a linked list can store a data called an element.
-   **Next** − Each link of a linked list contains a link to the next link called Next.
-   **LinkedList** − A Linked List contains the connection link to the first link called First.

## 

Linked List Representation

Linked list can be visualized as a chain of nodes, where every node points to the next node.

![Linked List](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list.jpg)

As per the above illustration, following are the important points to be considered.

-   Linked List contains a link element called first.
-   Each link carries a data field(s) and a link field called next.
-   Each link is linked with its next link using its next link.
-   Last link carries a link as null to mark the end of the list.

## 

Types of Linked List

Following are the various types of linked list.

-   **Simple Linked List** − Item navigation is forward only.
-   **Doubly Linked List** − Items can be navigated forward and backward.
-   **Circular Linked List** − Last item contains link of the first element as next and the first element has a link to the last element as previous.

## 

Basic Operations

Following are the basic operations supported by a list.

-   **Insertion** − Adds an element at the beginning of the list.
-   **Deletion** − Deletes an element at the beginning of the list.
-   **Display** − Displays the complete list.
-   **Search** − Searches an element using the given key.
-   **Delete** − Deletes an element using the given key.

## 

Insertion Operation

Adding a new node in linked list is a more than one step activity. We shall learn this with diagrams here. First, create a node using the same structure and find the location where it has to be inserted.

![Linked List Insertion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_insertion_0.jpg)

Imagine that we are inserting a node **B** (NewNode), between **A** (LeftNode) and **C** (RightNode). Then point B.next to C −

NewNode.next −> RightNode;

It should look like this −

![Linked List Insertion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_insertion_1.jpg)

Now, the next node at the left should point to the new node.

LeftNode.next −> NewNode;

![Linked List Insertion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_insertion_2.jpg)

This will put the new node in the middle of the two. The new list should look like this −

![Linked List Insertion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_insertion_3.jpg)

Similar steps should be taken if the node is being inserted at the beginning of the list. While inserting it at the end, the second last node of the list should point to the new node and the new node will point to NULL.

## 

Deletion Operation

Deletion is also a more than one step process. We shall learn with pictorial representation. First, locate the target node to be removed, by using searching algorithms.

![Linked List Deletion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_deletion_0.jpg)

The left (previous) node of the target node now should point to the next node of the target node −

LeftNode.next −> TargetNode.next;

![Linked List Deletion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_deletion_1.jpg)

This will remove the link that was pointing to the target node. Now, using the following code, we will remove what the target node is pointing at.

TargetNode.next −> NULL;

![Linked List Deletion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_deletion_2.jpg)

We need to use the deleted node. We can keep that in memory otherwise we can simply deallocate memory and wipe off the target node completely.

![Linked List Deletion](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_deletion_3.jpg)

## 

Reverse Operation

This operation is a thorough one. We need to make the last node to be pointed by the head node and reverse the whole linked list.

![Linked List Reverse Operation](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_reverse_0.jpg)

First, we traverse to the end of the list. It should be pointing to NULL. Now, we shall make it point to its previous node −

![Linked List Reverse Operation](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_reverse_1.jpg)

We have to make sure that the last node is not the last node. So we'll have some temp node, which looks like the head node pointing to the last node. Now, we shall make all left side nodes point to their previous nodes one by one.

![Linked List Reverse Operation](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_reverse_2.jpg)

Except the node (first node) pointed by the head node, all nodes should point to their predecessor, making them their new successor. The first node will point to NULL.

![Linked List Reverse Operation](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_reverse_3.jpg)

We'll make the head node point to the new first node by using the temp node.

![Linked List Reverse Operation](https://www.tutorialspoint.com/data_structures_algorithms/images/linked_list_reverse_4.jpg)

The linked list is now reversed. To see linked list implementation in C programming language, please [click here](https://www.tutorialspoint.com/data_structures_algorithms/linked_list_program_in_c.htm).