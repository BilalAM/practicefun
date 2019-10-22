package com.datastructures;

import com.toolbox.Array;


public class GenericQueue<T> {

    private static final int GROWTH_FACTOR = 1;
    private T[] innerCache;
    private int pointer = -1;
    private int head;

    public GenericQueue() {
        innerCache = (T[]) new Object[1];
        pointer++;
        head = 0;
    }

    public void enqueue(T value) {
        if (innerCache.length == pointer) {
            // we are at the end
            // we need to grow moooaaree !
            innerCache = Array.grow(innerCache, GROWTH_FACTOR);
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
        innerCache[head] = null;
        head++;
    }

    public T peek() {
        int peekValue = Integer.MIN_VALUE;
        if (head == pointer) {
            // we are the end !
            return null;
        }
        return innerCache[head];
    }
}
