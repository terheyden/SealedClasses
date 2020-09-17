package org.example;

import org.example.shape.MyCircle;

/**
 * A simple sealed class that permits extension by one subclass.
 * Note that this compiles when {@link MyCircle} is in the same package.
 */
public sealed class MyShape permits MyCircle {

    private final int width;
    private final int height;

    public MyShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }
}
