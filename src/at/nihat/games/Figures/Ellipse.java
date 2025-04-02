package at.nihat.games.Figures;

import org.newdawn.slick.Graphics;

public class Ellipse implements Actor{
    private float x,y;
    private float speed;
    private int direction;

    public Ellipse(float x, float y, float speed, boolean TrueOrFalse) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = TrueOrFalse ? 1 : -1;

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 20);
    }

    @Override
    public void update(int delta) {
        this.x += direction * (float) delta / this.speed;
        if (this.x>800){
            this.x=0;
        }
    }
}
