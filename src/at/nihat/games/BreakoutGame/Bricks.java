package at.nihat.games.BreakoutGame;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Bricks implements BGameActor{
    private float x,y;
    private boolean destroyed;
    private Color color;


    public Bricks(float x, float y, Color color) {
        this.x = x;
        this.y = y;
        this.color=color;
    }

    @Override
    public void render(Graphics graphics) {
        if(!destroyed){
        graphics.setColor(Color.green);
        graphics.drawRect(x, y, 60, 20);
    }}

    @Override
    public void update(GameContainer gameContainer, int delta) {

    }
}
