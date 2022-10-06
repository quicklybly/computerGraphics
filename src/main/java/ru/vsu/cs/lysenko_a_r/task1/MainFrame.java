package ru.vsu.cs.lysenko_a_r.task1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final DrawPanel dp;

    public MainFrame() throws HeadlessException {
        dp = new DrawPanel();
        this.add(dp);
    }



}
