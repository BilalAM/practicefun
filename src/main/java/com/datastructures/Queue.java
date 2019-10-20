package com.datastructures;

public class Queue {

    private static final int GROWTH_FACTOR = 1;
    private int[] innerCache;
    private int pointer = -1;
    private int head;

    public Queue() {
        innerCache = new int[1];
        pointer++;
        head = 0;
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

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


    }

    public void enqueue(int value) {
        if (innerCache.length == pointer) {
            // we are at the end
            // we need to grow moooaaree !
            innerCache = grow(innerCache, GROWTH_FACTOR);
        }
        innerCache[pointer] = value;
        pointer++;
    }

    public void dequeue() {
        if (head == pointer) {
            // we are at the end of the queue
            // we dont want to remove from
            // an already empty queue !
        }
        innerCache[head] = Integer.MIN_VALUE;
        head++;
    }

    public int peek() {
        int peekValue = Integer.MIN_VALUE;
        if (head == pointer) {
            // we are the end !
            return peekValue;
        }
        return innerCache[head];
    }
}
