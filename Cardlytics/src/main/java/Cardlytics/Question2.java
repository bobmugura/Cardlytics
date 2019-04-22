package Cardlytics;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Return the 5th element from the end of a singly linked list of integers. Do
 * not iterate the list more than once. Assume the list size cannot be known
 * without traversing the list.
 */
public class Question2 {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        CardlyticsLinkedList q2 = new CardlyticsLinkedList(values);
        System.out.println("What is the 5th element from back of the linked list? " + q2.get5thElementFromEnd());
    }
}

class CardlyticsLinkedList {
    LinkedList<Integer> cardLL;

    CardlyticsLinkedList(int[] values) {
        cardLL = new LinkedList<Integer>();
        for (int value : values) {
            cardLL.add(value);
        }
    }

    int get5thElementFromEnd() {
        // Assumption: values in the linked list are positive integers only, therefore,
        // -1 means there is no 5th element from the back
        if (cardLL.size() < 5) {
            return -1;
        }

        int node1 = cardLL.getFirst();
        Iterator<Integer> node1Iterator = cardLL.iterator();
        Iterator<Integer> node2Iterator = cardLL.iterator();

        // Setting up node2 apart from node1 with (5-1) spaces
        for (int i = 1; i < 5; i++) {
            node2Iterator.next();
        }
        // Move iterator pointers to the end of the list, then, node1 will be 5th
        // element from the back
        while (node2Iterator.hasNext()) {
            node2Iterator.next();
            node1 = node1Iterator.next();
        }

        return node1;
    }
}