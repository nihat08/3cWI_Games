package at.nihat.games.Figures;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangle rectangle;
    private int scrWidth = 800, scrHeight = 600;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100, 100, 5);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangle.update(delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
        graphics.drawString("MY GAME!", (float) (scrWidth - graphics.getFont().getWidth("MY GAME!")) / 2, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Objects"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
