package ru.vsu.cs.lysenko_a_r.task1.elements;

import ru.vsu.cs.lysenko_a_r.task1.Main;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class House {
    private final int x, y, width, height;

    public House() {
        x = 0;
        y = 0;
        width = Main.WINDOW_WIDTH;
        height = Main.WINDOW_HEIGHT;
    }

    public void draw(Graphics2D g) {
        drawSilhouette(g);
        drawGrid(g);
        drawDoor(g);
        drawWindow(g, 450, 300, 30);
        drawWindow(g, 540, 380, 30);
        drawChimney(g);
        drawTop(g);
    }

    private void drawSilhouette(Graphics2D g) {
        Color oldColor = g.getColor();
        g.setColor(new Color(255, 128, 0));
        GeneralPath path = new GeneralPath();
        path.moveTo(width / 2, 2 * height / 3 + 50);
        path.curveTo(width / 2, 2 * height / 3 + 50, 375, 250, 450, 200);
        path.curveTo(450, 200, 500, 180, 550, 200);
        path.curveTo(550, 200, 625, 250, 600, 450);
        path.curveTo(600, 450, 500, 460, 400, 450);
        g.fill(path);
        Stroke oldStroke = g.getStroke();
        g.setStroke(new BasicStroke(5));
        g.setColor(new Color(153, 76, 0));
        g.draw(path);
        g.setStroke(oldStroke);
        g.setColor(oldColor);
    }

    private void drawGrid(Graphics2D g) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        g.setColor(new Color(153, 76, 0));
        g.setStroke(new BasicStroke(4));
        g.drawLine(455, 200, 580, 250);
        g.drawLine(415, 250, 600, 330);
        g.drawLine(400, 320, 600, 400);
        g.drawLine(545, 200, 415, 250);
        g.drawLine(580, 250, 400, 320);
        g.drawLine(600, 330, 400, 410);
        g.setStroke(new BasicStroke(3));
        g.drawLine(500, 205, 500, 210);
        g.drawLine(505, 250, 507, 258);
        g.drawLine(500, 320, 500, 327);
        g.drawLine(450, 220, 450, 224);
        g.drawLine(430, 290, 430, 295);
        g.drawLine(430, 370, 433, 376);
        g.drawLine(550, 220, 550, 224);
        g.drawLine(550, 290, 550, 295);
        g.drawLine(570, 370, 570, 375);
        g.setStroke(oldStroke);
        g.setColor(oldColor);
    }

    private void drawDoor(Graphics2D g) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        g.setStroke(new BasicStroke(4));
        g.setColor(new Color(54, 135, 189));
        GeneralPath path = new GeneralPath();
        path.moveTo(475, 455);
        path.lineTo(480, 360);
        path.curveTo(480, 360, 500, 340, 520, 360);
        path.lineTo(525, 455);
        g.fill(path);
        Color darkBlue = new Color(0, 74, 124);
        g.setColor(darkBlue);
        g.draw(path);
        path.reset();
        g.setStroke(new BasicStroke(2));
        g.fillOval(490, 410, 20, 20);
        g.drawLine(485, 420, 500, 420);
        g.drawLine(500, 420, 500, 400);
        g.drawLine(500, 430, 500, 440);
        g.drawLine(500, 420, 515, 420);
        g.setColor(oldColor);
        g.setStroke(oldStroke);
    }

    void drawWindow(Graphics2D g, int startX, int startY, int size) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        g.setColor(new Color(54, 135, 189));
        g.fillOval(startX, startY, size, size);
        g.setColor(Color.BLACK);
        g.drawOval(startX, startY, size, size);
        g.setColor(new Color(0, 74, 124));
        g.fillOval(startX + size / 4, startY + size / 4, size / 2, size / 2);
        g.setColor(oldColor);
        g.setStroke(oldStroke);
    }

    void drawChimney(Graphics2D g) {
        Color oldColor = g.getColor();
        g.setColor(new Color(0, 74, 124));
        g.fillRect(580, 270, 40, 10);
        g.setColor(Color.BLACK);
        g.drawRect(580, 270, 40, 10);
        g.setColor(new Color(0, 74, 124));
        g.fillRect(610, 250, 20, 30);
        g.setColor(Color.BLACK);
        g.drawRect(610, 250, 20, 30);
        g.setColor(new Color(0, 74, 124));
        g.fillRect(605, 240, 30, 20);
        g.setColor(Color.BLACK);
        g.drawRect(605, 240, 30, 20);
        g.setColor(oldColor);
    }

    void drawTop(Graphics2D g) {
        Color oldColor = g.getColor();
        Stroke oldStroke = g.getStroke();
        Color green = new Color(0, 204, 0);
        g.setColor(green);
        g.setStroke(new BasicStroke(2));
        GeneralPath p = new GeneralPath();
        p.moveTo(450, 200);
        p.curveTo(450, 200, 400, 150, 460, 90);
        p.curveTo(460, 90, 510, 150, 480, 190);
        g.fill(p);
        g.setColor(Color.BLACK);
        g.draw(p);
        g.setColor(green);
        p.reset();
        p.moveTo(520, 190);
        p.curveTo(520, 190, 470, 150, 530, 90);
        p.curveTo(530, 90, 580, 150, 550, 200);
        g.fill(p);
        g.setColor(Color.black);
        g.draw(p);
        g.setColor(green);
        p.reset();
        p.moveTo(480, 190);
        p.curveTo(480, 190, 455, 140, 490, 70);
        p.curveTo(490, 70, 535, 140, 520, 190);
        g.fill(p);
        g.setColor(Color.black);
        g.draw(p);
        g.setColor(oldColor);
        g.setStroke(oldStroke);
    }
}
