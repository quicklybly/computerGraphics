package ru.vsu.cs.lysenko_a_r.task1.elements;


import java.awt.*;
import java.util.Random;

public class Bubble {
    int x, y, shiftY, returnY, size;
    Color color;

    Random rnd = new Random();

    public Bubble(int x, int y, int shiftY, int size, Color color) {
        this.x = x;
        this.y = y;
        this.shiftY = shiftY;
        this.size = size;
        this.color = color;
        returnY = this.y;
    }

    public int getUpperBound() {
        return y;
    }

    public void move() {
        this.shiftY += Math.abs(rnd.nextInt() % 2);
        this.shiftY %= 10;
    }

    public void reset() {
        this.y = returnY;
    }

    public void draw(Graphics2D g) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        y -= shiftY;
        g.drawOval(x, y, size, size);
        g.setColor(color);
        g.fillOval(x, y, size, size);
        g.setColor(new Color(255, 255, 255, 50));
        g.fillOval(x, y + size / 3, size / 3, size / 3);
        g.setColor(oldColor);
        g.setStroke(oldStroke);
    }


}
