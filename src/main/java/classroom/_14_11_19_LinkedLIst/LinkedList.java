package classroom._14_11_19_LinkedLIst;

import javax.xml.stream.events.NotationDeclaration;
import java.io.*;
// Java program to implement
// a Singly Linked List
public class LinkedList {
    Node head; // head of list
    Node last;

    class Node {
        int data;
        Node next;
        Node previous;
        Node(int d)
        {
            data = d;
        }
    }
    // Method to insert a new node
    public void insert(int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = new_node;
            last = head;
        }
        else {
            //Node current =
            Node current = last;
           new_node.previous=current;
            System.out.println(current.data);
/*            while (current.next != null) {
                current = current.next;

            }*/

            //new_node.previous=last;
            current.next = new_node;
        //    new_node.previous = last;
            last = new_node;
        }

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }
    public  void remove(){
        //previous=last;
        last =null;
    }
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        // Insert the values
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Print the LinkedList
        printList(list);
        System.out.println();
        list.remove();
        //System.out.println(list.last.data);
       // System.out.println(list.head.previous.data);
       System.out.println(list.last.previous.data);
    }
}