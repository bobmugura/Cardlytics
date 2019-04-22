package Cardlytics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for Questions 2
 */
public class Question2Test {
    /**
     * Helper method to get 5th element from list for assertion purpose
     */
    private int get5thElementFromArrayEnd(int[] values) {
        return values[values.length - 5];
    }

    @Test
    public void get5thElementFromEndTest() {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        CardlyticsLinkedList q2 = new CardlyticsLinkedList(values);
        assertEquals(get5thElementFromArrayEnd(values), q2.get5thElementFromEnd());

        values = new int[] { 1, 2, 3, 4, 5 };
        q2 = new CardlyticsLinkedList(values);
        assertEquals(get5thElementFromArrayEnd(values), q2.get5thElementFromEnd());
    }

    @Test
    public void NotEnoughGet5thElementFromEndTest() {
        int[] values = { 1, 2, 3 };
        CardlyticsLinkedList q2 = new CardlyticsLinkedList(values);
        assertEquals(-1, q2.get5thElementFromEnd());
    }

}
