package uas;

import mavenselfdrivingcar.MyFrame;


public class MyApp extends MyFrame{

    public MyApp(MyAlgorithm myalgorithm){
        super(myalgorithm);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MyApp(new MyAlgorithm());
        });

    }
}