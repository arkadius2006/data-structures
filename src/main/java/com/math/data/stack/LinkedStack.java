package com.math.data.stack;

import java.util.Objects;

public class LinkedStack implements Stack {
    private Item top;

    public LinkedStack() {
        this.top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(Object o) throws StackOverflowException {
        Objects.requireNonNull(o);
        Item newTop = new Item();
        newTop.data = o;
        newTop.prev = this.top;
        this.top = newTop;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException(this);
        }

        Object popped = top.data;
        top = top.prev;
        return popped;
    }

    @Override
    public Object top() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException(this);
        }

        return top.data;
    }

    private class Item {
        Object data;
        Item prev;
    }
}