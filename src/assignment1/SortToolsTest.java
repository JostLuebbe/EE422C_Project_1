package assignment1;

//import org.testng.annotations.Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortToolsTest {

    @Test
    public void isSorted() {
        int[] x = {-1000, -749, -300, -300, -100, -56, -2, -1, 0, 1, 2, 3, 5, 7, 74569, 100000};

        assertTrue(SortTools.isSorted(x, 13));

        int[] k = {1, 2, 3, 7, 4, 5};

        assertTrue(SortTools.isSorted(k, 3));

        int[] z = {1};

        assertTrue(SortTools.isSorted(z, 1));

        assertFalse(SortTools.isSorted(z, 0));

        int[] j = {};

        assertFalse(SortTools.isSorted(j, 0));

    }

    @Test
    public void find() {
        int[] x = {1, 1, 2, 3, 4};

        assertEquals(-1, SortTools.find(x, 1, 3));

        assertEquals(0, SortTools.find(x, 1, 1));

        int[] z = {1};

        assertEquals(0, SortTools.find(z, 1, 1));

    }

    @Test
    public void insertGeneral() {

        // Test Case 0: Checks that inserting an already present value does not change array
        int[] x = {1, 1, 2, 3, 4};

        int[] expected = {1, 1, 2, 3, 4};

        assertArrayEquals(expected, SortTools.insertGeneral(x, 5, 2));

        //Test Case 1: General case of inserting a value at the end of the array
        int[] x_1 = {1, 2, 3, 4};

        int[] expected_1 = {1, 2, 3, 4, 5};

        assertArrayEquals(expected_1, SortTools.insertGeneral(x_1, 4, 5));

        //Test Case 1.5: Inserting value at beginning of array
        int[] x_1_5 = {1, 2, 3, 4, 5};

        int[] expected_1_5 = {0, 1, 2, 3, 4, 5};

        assertArrayEquals(expected_1_5, SortTools.insertGeneral(x_1_5, 5, 0));

        // Test Case 2: Inserting a negative value

        int[] x_2 = {-1000, -749, -300, -300, -100, -56, -2, -1, 0, 1, 2, 3, 5, 7, 74569, 100000};

        int[] expected_2 = {-1000, -749, -300, -300, -200, -100, -56, -2, -1, 0, 1, 2, 3, 5, 7, 74569, 100000};

        assertArrayEquals(expected_2, SortTools.insertGeneral(x_2, 16, -200));

        //Test Case 3: x of length 1

        int[] x_3 = {0};

        int[] expected_3 = {-1000, 0};

        assertArrayEquals(expected_3, SortTools.insertGeneral(x_3, 1, -1000));


    }

    @Test
    public void insertInPlace() {
        int[] a = {-1, -1, 2, 3, 5, 8, 13, 900, 901, 902, 903, 904};

        int[] expected = {-1, -1, 2, 3, 5, 8, 13, 40, 901, 902, 903, 904};

        SortTools.insertInPlace(a, 7, 40);

        assertArrayEquals(expected, a);

    }

    @Test
    public void insertSort() {
        int[] x = {6, 3, 5, 9, -1, 0, 13, 20, 1000, -769, 1};

        SortTools.insertSort(x, 4);

        assertTrue(SortTools.isSorted(x, 4));

    }


}