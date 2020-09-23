package com.ShowProgressBar;

import javax.swing.*;

public class ProgressTask extends Object implements Runnable {
    private JProgressBar bar;
    private int progressValue;

    public ProgressTask(JProgressBar bar) {
        this.bar = bar;
        this.progressValue = 0;
    }

    public synchronized int getProgressValue() {
        return progressValue;
    }

    public synchronized void setProgressValue(int newVal) {
        this.progressValue = newVal;
    }

    @Override
    public void run() {

        bar.setValue(getProgressValue());

    }
}
