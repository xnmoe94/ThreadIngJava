package com.Mohamed.Thread;

public class ClassB extends Object {
    public double value;

    public synchronized double getValue(){
        return value;
    }

    public synchronized void setValue(double x){
        value = x;
    }
}
