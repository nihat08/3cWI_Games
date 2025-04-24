package at.nihat.games.Figures;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Ellipse implements Actor{
    private float x,y;
    private float speed;
    private int direction;
    private float ex, ey;


    public Ellipse(float x, float y, float speed, boolean TrueOrFalse) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = TrueOrFalse ? 1 : -1;

        this.ex = Math.random() > 0.5 ? 1 : -1;
        this.ey = Math.random() > 0.5 ? 1 : -1;

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 20);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        /*this.x += direction * (float) delta / this.speed;
        if (this.x>800){
            this.x=0;
        }
         */
        this.x += ex * (float) delta / this.speed;

        // Wenn das Rechteck die Wand erreicht, Richtung umkehren
        if (this.x <= 0 || this.x >= 800 - 10) {
            ex *= -1; // Richtung umkehren
        }

    }
}
