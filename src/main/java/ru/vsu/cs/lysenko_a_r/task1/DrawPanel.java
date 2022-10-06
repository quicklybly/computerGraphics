package ru.vsu.cs.lysenko_a_r.task1;

import ru.vsu.cs.lysenko_a_r.task1.elements.Background;
import ru.vsu.cs.lysenko_a_r.task1.elements.House;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        Background bg = new Background();
        bg.draw(g);
        House hs = new House();
        hs.draw(g);

    }
}
