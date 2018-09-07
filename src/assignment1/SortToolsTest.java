package assignment1;

//import org.testng.annotations.Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortToolsTest {

    @Test
    public void isSorted() {
        int[] x = {1, 2, 3, 7, 5};

        assertFalse(SortTools.isSorted(x, 5));

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
        int[] x = {1, 2, 3, 4};

        assertEquals(-1, SortTools.find(x, 1, 3));

        assertEquals(0, SortTools.find(x, 1, 1));

        int[] z = {1};

        assertEquals(0, SortTools.find(z, 1, 1));

    }

    @Test
    public void insertGeneral() {
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
    }


}