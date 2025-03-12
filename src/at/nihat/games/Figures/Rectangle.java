package at.nihat.games.Figures;

import org.newdawn.slick.Graphics;

public class Rectangle {
    private float x, y;
    private float speed;
    private float dx, dy; // Richtung (1 = vorwärts, -1 = rückwärts)

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;

        // Zufällige Start-Richtung für X und Y
        this.dx = Math.random() > 0.5 ? 1 : -1;
        this.dy = Math.random() > 0.5 ? 1 : -1;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    public void update(int delta) {
        // Bewegung in X- und Y-Richtung
        this.x += dx * (float) delta / this.speed;
        this.y += dy * (float) delta / this.speed;

        // Wenn das Rechteck die Wand erreicht, Richtung umkehren
        if (this.x <= 0 || this.x >= 800 - 10) {
            dx *= -1; // Richtung umkehren
        }
        if (this.y <= 0 || this.y >= 600 - 10) {
            dy *= -1; // Richtung umkehren
        }
    }
}
