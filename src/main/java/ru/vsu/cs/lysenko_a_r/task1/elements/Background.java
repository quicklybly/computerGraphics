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
        drawStone(g, 30 ,10, 200, 400);
        drawStone(g, 30, 10, 670, 430);
        drawStone(g, 40, 12, 100, 470);
        drawRoad(g);
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
    private void drawStone(Graphics2D g, int length, int width, int startX, int startY) {
        Color oldColor = g.getColor();
        g.setColor(new Color(70, 70, 70));
        g.fillOval(startX, startY, length, width);
        g.setColor(oldColor);
    }
    private void drawRoad(Graphics2D g) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        g.setStroke(new BasicStroke(3));
        g.setColor(new Color(70, 74, 69));
        g.fillRect(0, 500, 800, 100);
        g.fillRect(470, 460, 60, 100);
        g.setColor(Color.BLACK);
        g.drawLine(0, 500, 470, 500);
        g.drawLine(470, 500, 470, 460);
        g.drawLine(470, 460, 530, 460);
        g.drawLine(530, 460, 530, 500);
        g.drawLine(530, 500, 800, 500);
        g.setColor(Color.WHITE);
        g.fillRect(100, 530, 150, 10);
        g.fillRect(350, 530, 150, 10);
        g.fillRect(600, 530, 150, 10);
        g.setStroke(oldStroke);
        g.setColor(oldColor);
    }
}
