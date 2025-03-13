package at.nihat.games.Figures;

import org.newdawn.slick.Graphics;

public class Circle {
    private float x;
    private float y;
    private float speed;
    private float cx, cy;

    public Circle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;

        this.cx = Math.random() > 0.5 ? 1 : -1;
        this.cy = Math.random() > 0.5 ? 1 : -1;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 50);
    }

    public void update(int delta) {
        this.x += cx * (float) delta /this.speed;
        this.y += cy * (float) delta / this.speed;

        if (this.x <= 0 || this.x > 800){
            cx *= -1;
        }
        if (this.y <= 0 || this.y > 600){
            cy *= -1;
        }
    }
}
