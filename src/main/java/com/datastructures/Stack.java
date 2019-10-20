package com.datastructures;

/**
 * Just for fun and self practice some cool basic things .
 */
public class Stack {
    /**
     * 'Grow' the existing array by 1 element if it is full.
     */
    private static final int GROWTH_FACTOR = 1;
    private int[] innerCache;
    private int pointer = -1;

    public Stack() {
        innerCache = new int[1];
        pointer = pointer + 1;
    }

    /**
     * Grows the existing cache array by the specified growth limit .
     *
     * @param arrayToGrow : The array to which to grow .
     * @param growth      : How many elements by which it should grow .
     * @return : A new array that has the elements of the old array
     * with the size specified .
     */
    private static int[] grow(int[] arrayToGrow, int growth) {
        int[] newArray = new int[arrayToGrow.length + growth];
        for (int indexOfOldArray = 0; indexOfOldArray < arrayToGrow.length; indexOfOldArray++) {
            newArray[indexOfOldArray] = arrayToGrow[indexOfOldArray];
        }
        return newArray;
    }

    public void push(int number) {
        if (innerCache.length == pointer) {
            innerCache = grow(innerCache, GROWTH_FACTOR);
        }
        innerCache[pointer] = number;
        pointer++;
    }

    public int peek() {
        int peekValue = -1;
        if (pointer == 0) {
            // the stack is already empty
        } else {
            peekValue = innerCache[pointer - 1];
        }
        return peekValue;
    }

    public void pop() {
        if (pointer == 0) {
            // we are at the end
        } else {
            innerCache[pointer - 1] = 0;
            pointer--;
        }
    }
}
