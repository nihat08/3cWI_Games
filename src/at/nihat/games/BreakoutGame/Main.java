package at.nihat.games.BreakoutGame;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame {
    private Ball ball;
    public Main(String title) {
        super(title);
    }

    public static void main(String[] args) {

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
      Ball ball1 = new Ball(400,500);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        ball.update(gameContainer, delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        ball.render(graphics);
    }
}
