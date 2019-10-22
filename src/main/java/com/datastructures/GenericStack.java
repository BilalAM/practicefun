package com.datastructures;

import com.toolbox.Array;

public class GenericStack<T> {
    private static final int GROWTH_FACTOR = 10;
    private T[] innerCache;
    private int pointer = -1;

    public GenericStack() {
        innerCache = (T[]) new Object[1];
        pointer++;
    }


    public void push(T object) {
        if (pointer == innerCache.length) {
            innerCache = Array.grow(innerCache, GROWTH_FACTOR);
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

}
