package ru.vsu.cs.lysenko_a_r.task1.elements;


import java.awt.*;
import java.util.Random;

public class Bubble {
    int x, y, shiftY, returnY, shiftX, returnX, size;
    Color color;

    Random rnd = new Random();

    public Bubble(int x, int y, int shiftY, int shiftX, int size, Color color) {
        this.x = x;
        this.y = y;
        this.shiftY = shiftY;
        this.shiftX = shiftX;
        this.size = size;
        this.color = color;
        returnY = this.y;
        returnX = this.x;
    }

    public int getUpperBound() {
        return y;
    }

    public void move() {
        this.shiftY += Math.abs(rnd.nextInt() % 2);
        this.shiftY %= 10;
        this.shiftX += Math.abs(rnd.nextInt() % 2);
        this.shiftX %= 5;
    }

    public void reset() {
        this.y = returnY;
        this.x = returnX;
    }

    public void draw(Graphics2D g) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        y -= shiftY;
        if (x < returnX - 15) {
            x += shiftX;
        } else if (x > returnX + 15){
            x -= shiftX;
        } else {
            if (rnd.nextInt() % 2 == 0) {
                x += shiftX;
            } else {
                x -= shiftX;
            }
        }
        g.drawOval(x, y, size, size);
        g.setColor(color);
        g.fillOval(x, y, size, size);
        g.setColor(new Color(255, 255, 255, 50));
        g.fillOval(x, y + size / 3, size / 3, size / 3);
        g.setColor(oldColor);
        g.setStroke(oldStroke);
    }


}
