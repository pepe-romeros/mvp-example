package com.example.mvpexample;

/**
 * Created by admin on 10/31/17.
 */

public class MathModel {

    private int count;

    public MathModel() {
    }

    public String increment() {
        count++;
        return String.valueOf(count);
    }
}
