/*
 * This file is how you might test out your code.  Don't submit this, and don't
 * have a main method in SortTools.java.
 */

package assignment1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // call your test methods here
        // SortTools.isSorted() etc.

        int x[] = {1, 10, 20, 30, 50};

//        System.out.println(assignment1.SortTools.isSorted(x, 5));

        System.out.println(assignment1.SortTools.find(x, 3, 2));


        System.out.println(Arrays.toString(assignment1.SortTools.insertGeneral(x, 0, 34)));
    }
}
