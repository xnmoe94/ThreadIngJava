package com.ShowProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Showprogress extends JPanel {

    private JButton SearchBar;
    private JProgressBar progressBar;
    private Runnable runWorkRunnable;
    private Runnable enableSearchButtonTask;
    private ProgressTask progressTask;

    public Showprogress(){
       runWorkRunnable = new Runnable() {
           @Override
           public void run() {

               runWork();

           }
       };



       enableSearchButtonTask = new Runnable() {
           @Override
           public void run() {
               SearchBar.setEnabled(true);
           }
       };

       SearchBar = new JButton("Search");
       SearchBar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               SearchBar.setEnabled(false);
               launchHelper();
           }
       });

        progressBar = new JProgressBar(0,100);
        progressTask = new ProgressTask(progressBar);

        setLayout(new BorderLayout(3,3));
        add(SearchBar, BorderLayout.WEST);
        add(progressBar, BorderLayout.CENTER);

    }


    private void launchHelper(){
        Thread thread = new Thread(runWorkRunnable, "ShowProgress helper");
        thread.start();

    }


    private void runWork(){
        for (int i =0; i<20; i++){
            progressTask.setProgressValue((i+1) * 5);
            SwingUtilities.invokeLater(progressTask);

            try{
                Thread.sleep(200);

            }catch (InterruptedException e){
                return;
            }

        }

        SwingUtilities.invokeLater(enableSearchButtonTask);
    }


}
