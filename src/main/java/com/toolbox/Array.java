package com.toolbox;

public class Array {

    /**
     * Grows the existing cache array by the specified growth limit .
     *
     * @param arrayToGrow : The array to which to grow .
     * @param growth      : How many elements by which it should grow .
     * @return : A new array that has the elements of the old array
     * with the size specified .
     */

    public static <T> T[] grow(T[] arrayToGrow, int growth) {
        T[] newArray = (T[]) new Object[arrayToGrow.length + growth];
        for (int indexOfOldArray = 0; indexOfOldArray < arrayToGrow.length; indexOfOldArray++) {
            newArray[indexOfOldArray] = arrayToGrow[indexOfOldArray];
        }
        return newArray;
    }
}
