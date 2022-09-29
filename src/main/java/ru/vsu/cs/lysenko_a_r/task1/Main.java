package ru.vsu.cs.lysenko_a_r.task1;

import javax.swing.*;

public class Main {
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 800;

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        mf.setVisible(true);
    }
}