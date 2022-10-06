package ru.vsu.cs.lysenko_a_r.task1.elements;

import ru.vsu.cs.lysenko_a_r.task1.Main;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Background {
    private final int x, y, width, height;

    public Background() {
        x = 0;
        y = 0;
        width = Main.WINDOW_WIDTH;
        height = Main.WINDOW_HEIGHT;
    }

    public void draw(Graphics2D g) {
        Color oldColor = g.getColor();
        drawSky(g);
        drawSand(g);
        g.setColor(oldColor);
    }

    private void drawSky(Graphics2D g) {
        Color oldColor = g.getColor();
        g.setPaint(new LinearGradientPaint(x, y, width, height / 3,
                new float[]{0f, 0.5f, 1.0f},
                new Color[]{new Color(13, 109, 253), new Color(13, 149, 253), new Color(0, 179, 255)}));
        g.fillRect(0, 0, width, height);
        g.setColor(oldColor);
    }

    private void drawSand(Graphics2D g) {
        Color oldColor = g.getColor();
        g.setColor(new Color(229, 214, 0));
        GeneralPath path = new GeneralPath();
        path.moveTo(0, 2 * height / 3);
        path.curveTo(0, 2 * height / 3, width / 4,  2 * height / 3 - 20, width / 2, 2 * height / 3 + 20);
        path.curveTo(width / 2, 2 * height / 3 + 20, 3 * width / 4,  2 * height / 3 - 20, width, 2 * height / 3);
        path.lineTo(width, height);
        path.lineTo(0, height);
        path.lineTo(0, 2 * height / 3);
        g.fill(path);
        g.setColor(oldColor);
    }
    private void drawStone(Graphics2D g, int size, int startX, int startY) {
        Color oldColor = g.getColor();
        g.setColor(new Color(70, 70, 70));
        GeneralPath path = new GeneralPath();
        if (startX == 0) {
            startX = 1;
        }
        path.moveTo(startX, startY);
        path.curveTo(startX, startY, size * startX / 3, startY, size * startX, startY);
        path.lineTo(startX, startY);
        g.fill(path);
        g.setColor(oldColor);
    }
}
