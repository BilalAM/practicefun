package com.datastructures;

public class GenericStack<T> {
    private static final int GROWTH_FACTOR = 10;
    private T[] innerCache;
    private int pointer = -1;

    public GenericStack() {
        innerCache = (T[]) new Object[1];
        pointer++;
    }

    public static void main(String[] args) {
        GenericStack<String> stringGenericStack = new GenericStack<>();
        stringGenericStack.peek();
    }

    public void push(T object) {
        if (pointer == innerCache.length) {
            innerCache = grow(innerCache, GROWTH_FACTOR);
        }
        innerCache[pointer] = object;
        pointer++;
    }

    public T peek() {
        int peekValue = Integer.MIN_VALUE;
        if (pointer == 0) {
            return (T) new Object();
        } else {
            return innerCache[pointer];
        }
    }

    public void pop() {
        if (pointer == 0) {

        } else {
            innerCache[pointer] = null;
            pointer--;
        }
    }

    /**
     * Grows the existing cache array by the specified growth limit .
     *
     * @param arrayToGrow : The array to which to grow .
     * @param growth      : How many elements by which it should grow .
     * @return : A new array that has the elements of the old array
     * with the size specified .
     */
    private T[] grow(T[] arrayToGrow, int growth) {
        T[] newArray = (T[]) new Object[arrayToGrow.length + growth];
        for (int indexOfOldArray = 0; indexOfOldArray < arrayToGrow.length; indexOfOldArray++) {
            newArray[indexOfOldArray] = arrayToGrow[indexOfOldArray];
        }
        return newArray;
    }
}
