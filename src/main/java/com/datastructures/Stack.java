package com.datastructures;

import com.toolbox.Array;

/**
 * Just for fun and self practice some cool basic things .
 */
public class Stack {
    /**
     * 'Grow' the existing array by 1 element if it is full.
     */
    private static final int GROWTH_FACTOR = 1;
    private Integer[] innerCache;
    private int pointer = -1;

    public Stack() {
        innerCache = new Integer[1];
        pointer = pointer + 1;
    }

    public void push(int number) {
        if (innerCache.length == pointer) {
            innerCache = Array.grow(innerCache, GROWTH_FACTOR);
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
