package at.nihat.games.image;

import at.nihat.games.Figures.Actor;
import at.nihat.games.Figures.ObjectsGame;
import org.newdawn.slick.*;

public class Manuellsen extends BasicGame implements Actor {
    private Image manuellsenImg;

    public Manuellsen() {
        super("Manuellsen Game");
    }

    @Override
    public void init(GameContainer container) throws SlickException {
        this.manuellsenImg = new Image("testdata/manu.jpg");
        Image test = manuellsenImg.getSubImage(50, 50, 50, 50);
        System.out.println(test.getColor(49, 49)); // Index beachten!
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        manuellsenImg.draw(100, 100);
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        // Game logic here
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Manuellsen());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(int render) {

    }
}
