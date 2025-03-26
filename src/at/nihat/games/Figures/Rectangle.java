package at.nihat.games.Figures;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Rectangle {
    private float x, y;
    private float speed;
    private float rx, ry;

    public Rectangle(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;

        // Zufällige Start-Richtung für X und Y
        this.rx = Math.random() > 0.5 ? 1 : -1;
        this.ry = Math.random() > 0.5 ? 1 : -1;
    }

    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 50, 50);
        graphics.setColor(new Color(144, 224, 239));

    }

    public void update(int delta) {
        // Bewegung in X- und Y-Richtung
        this.x += rx * (float) delta / this.speed;
        this.y += ry * (float) delta / this.speed;

        // Wenn das Rechteck die Wand erreicht, Richtung umkehren
        if (this.x <= 0 || this.x >= 800 - 10) {
            rx *= -1; // Richtung umkehren
        }
        if (this.y <= 0 || this.y >= 600 - 10) {
            ry *= -1; // Richtung umkehren
        }
    }
}
