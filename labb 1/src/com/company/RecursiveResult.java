package com.company;

public class RecursiveResult<T> {
    public final T result;
    public final int depth;

    public RecursiveResult(T result, int depth) {
        this.result = result;
        this.depth = depth;
    }
}
