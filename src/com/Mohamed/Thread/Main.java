package com.Mohamed.Thread;

public class Main {

    public static void main(String[] args) {

        ClassB b = new ClassB();
        synchronized (b) {
            // We need to use synchronized block so that the calling thread holds the
            //Lock the whole time that it is inside the block not just while inside the methods
            if (b.getValue() < 10) {
                b.setValue(50.0);
            }
        }

        System.out.println(b);
    }
}
