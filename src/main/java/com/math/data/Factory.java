package com.math.data;

public interface Factory {


    /**
     * Unbounded stack.
     */
    Stack newStack();

    /**
     * Bounded stack.
     */
    Stack newStack(int capacity);

    /**
     * Unbounded queue.
     */
    Queue newQueue();

    /**
     * Bounded queue.
     */
    Queue newQueue(int capacity);


    /**
     * Unbounded deque.
     */
    Deque newDeque();

    /**
     * Bounded deque.
     */
    Deque newDeque(int capacity);

}