/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPAA;

import matulatan.mavenselfdrivingcar.MyFrame;

/**
 *
 * @author tekad_000
 */
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
