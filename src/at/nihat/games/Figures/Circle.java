package at.nihat.games.Figures;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{
    private float x;
    private float y;
    private float speed;
    private float diameter;

    public Circle(float x, float y, float speed, float diameter){
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = random.nextInt(20) + 20;

    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
        graphics.setColor(new Color(144, 224, 239));

    }

    public void update(GameContainer gameContainer, int delta) {
        this.diameter += 0.05f * delta;
        this.y += (float)delta/this.speed;
        if (this.y>600){
            this.y=0;
        }
    }
}
