package at.nihat.games.Figures;

import at.nihat.games.image.Manuellsen;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectsGame extends BasicGame {
    private List<Actor> actors;
    //private Circle circle;
    private int scrWidth = 800, scrHeight = 600;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600), random.nextInt(600), random.nextInt(50));
            actors.add(rectangle);
        }
        for (int i = 0; i < 10; i++) {
            Circle circle = new Circle(random.nextInt(800), random.nextInt(600), 10 + random.nextInt(40), 20 + random.nextInt(20));
            this.actors.add(circle);
        }
        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(random.nextInt(800), random.nextInt(600), 1 + random.nextInt(50), true);
            this.actors.add(ellipse);
        }

        Manuellsen manuellsen = new Manuellsen();
        this.actors.add(manuellsen);

    }

    

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor:this.actors){
            actor.update(gameContainer,delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor :this.actors){
            actor.render(graphics);
        }
        //this.circle.render(graphics);
        graphics.drawString("!MY GAME!", (float) (scrWidth - graphics.getFont().getWidth("MY GAME!")) / 2, 50);


        graphics.setColor(new Color(3, 4, 94));

    }

    @Override
    public void keyPressed(int key, char c) {
        System.out.println(key);
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

