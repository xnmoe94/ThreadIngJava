package com.ShowProgressBar;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Showprogress showprogress = new Showprogress();

        JFrame jFrame = new JFrame("ShowProgress");
        jFrame.setContentPane(showprogress);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
