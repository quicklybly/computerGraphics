package ru.vsu.cs.lysenko_a_r.task1;

import ru.vsu.cs.lysenko_a_r.task1.elements.Background;
import ru.vsu.cs.lysenko_a_r.task1.elements.Bubble;
import ru.vsu.cs.lysenko_a_r.task1.elements.House;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {

    Background bg;
    House hs;

    ArrayList<Bubble> bubbles;

    private int t = 0;

    public DrawPanel() {
        bg = new Background();
        hs = new House();
        bubbles = new ArrayList<>();
        bubbles.add(new Bubble(605, 200, 30, 30, 30, new Color(236, 7, 91, 100)));
        bubbles.add(new Bubble(605, 130, 30, 30, 30, new Color(68, 155, 222, 100)));
        bubbles.add(new Bubble(605, 50, 30, 30, 30, new Color(53, 216, 113, 100)));

        int delay = 300;
        Timer timer = new Timer(delay, listener -> {
            t = (t + delay) % Integer.MAX_VALUE;
            if (bubbles.stream().allMatch(elem -> elem.getUpperBound() <= 0)) {
                bubbles.forEach((bubble -> {
                    bubble.reset();
                    repaint();
                }));
            }
            bubbles.forEach((bubble -> {
                bubble.move();
                repaint();
            }));
        });
        timer.start();


    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        bg.draw(g);
        hs.draw(g);

        bubbles.forEach((bubble) -> bubble.draw(g));
    }
}
