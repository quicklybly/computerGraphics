package ru.vsu.cs.lysenko_a_r.task1;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    public static final int ANIMATION_DELAY = 5000;
    public static final int ANIMATION_GAP = 5000;
    private int time;

    public Draw() {
        this.time = 0;
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        setBackground(Color.blue);

    }
}
