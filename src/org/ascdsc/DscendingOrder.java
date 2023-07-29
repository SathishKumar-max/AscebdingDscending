package org.ascdsc;

import java.util.Arrays;
import java.util.Collections;

public class DscendingOrder {

	public static void main(String[] args) {
 
        Integer array[] = { 1, 2, 3, 4, 5 };
 
        Arrays.sort(array, Collections.reverseOrder());
 
        System.out.println(Arrays.toString(array));
    }
}
