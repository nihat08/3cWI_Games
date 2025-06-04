package at.nihat.games.BreakoutGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


public class Ball implements BGameActor{
    private float x,y;
    private float speed;
    private float dia;
    private float dx,dy;

    public Ball(float startX, float startY) {
        this.x = startX;
        this.y = startY;
        this.speed = 5;
        this.dia = 20;
        this.dx = 0.5f;
        this.dy = -1;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,this.dia,this.dia);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.x+=dx*speed;
        this.y+=dy*speed;

        if (x<=0 || x>=gameContainer.getWidth()-dia){
            dx*=-1;
        }
        if (y<=0){
            dy*=-1;
        }
        if (y>=gameContainer.getHeight()-dia){
            System.out.println("Game Over!");
        }
    }
    public float getX() { return x; }
    public float getY() { return y; }
    public float getDia() { return dia; }
}
