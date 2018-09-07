// SortTools.java 
/*
 * EE422C Project 1 submission by
 * Replace <...> with your actual data.
 * Jost Luebbe
 * jl64249
 * 16370
 * Fall 2018
 * Slip days used: 0
 */

package assignment1;

import java.util.Arrays;

public class SortTools {
    /**
     * This method tests to see if the given array is sorted.
     *
     * @param x is the array
     * @param n is the size of the input to be checked
     * @return true if array is sorted
     */
    public static boolean isSorted(int[] x, int n) {

        if (x.length == 0 || n == 0)
            return false;

        for (int i = 0; i < n - 1; i++) {
            if (x[i] > x[i + 1])
                return false;
        }

        return true;
    }

    private static int binary_find(int[] x, int low, int high, int v) {
        if (low < high) {
            int mid = (low + high) / 2;

            if (v < x[mid]) {
                return binary_find(x, low, mid, v);
            } else if (v > x[mid]) {
                return binary_find(x, mid + 1, high, v);
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * This method returns the index of value v within array x.
     *
     * @param x is the array
     * @param n is the size of the input to be checked
     * @param v is the value to be searched for within x
     * @return index of v if v is contained within x. -1 if v is not contained within x
     */
    public static int find(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it

        return binary_find(x, 0, n, v);
    }

    /**
     * This method returns a newly created array containing the first n elements of x, and v.
     *
     * @param x is the array
     * @param n is the number of elements to be copied from x
     * @param v is the value to be added to the new array
     * @return a new array containing the first n elements of x, and v
     */
    public static int[] insertGeneral(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it

        int found_place = find(x, n, v);

        if (found_place > -1) {
            return Arrays.copyOf(x, n);
        } else {
            int[] new_array = new int[n + 1];

            int i;

            for (i = 0; i < n; i++) {
                if (v > x[i])
                    new_array[i] = x[i];
                else
                    break;
            }

            new_array[i] = v;


            for (int j = i; j < n; j++) {
                new_array[j + 1] = x[j];
            }

            return new_array;
        }
    }

    /**
     * This method inserts a value into the array and ensures it's still sorted
     *
     * @param x is the array
     * @param n is the number of elements in the array
     * @param v is the value to be added
     * @return n if v is already in x, otherwise returns n+1
     */
    public static int insertInPlace(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it

        int found_place = find(x, n, v);

        if (found_place > -1) {
            return n;
        } else {
            int i;

            for (i = 0; i < n; i++) {
                if (v < x[i])
                    break;

            }

            x[i] = v;
        }

        return -1;
    }

    /**
     * This method sorts a given array using insertion sort
     *
     * @param x is the array to be sorted
     * @param n is the number of elements of the array to be sorted
     */
    public static void insertSort(int[] x, int n) {

        // Loops through each item in the list
        for (int i = 1; i < n; i++) {

            // selects a focus to compare to range below focus value
            int focus = x[i];

            // set range of comparable values to all values before focus variable
            int j = i - 1;

            // loops while not at the beginning of the array and the focus is less than then current comparator
            while ((j > -1) && (focus < x[j])) {
                x[j + 1] = x[j]; // moves current item into next slot in the array (spot is freed up by focus being saved)
                j--;
            }

            x[j + 1] = focus; // finally slots focus back into array before all items that are greater than it
        }
    }
}
