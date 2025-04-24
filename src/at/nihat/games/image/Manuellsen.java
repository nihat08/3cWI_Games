package at.nihat.games.image;

import at.nihat.games.Figures.Actor;
import org.newdawn.slick.*;

public class Manuellsen implements Actor {
    private Image manuellsenImg;
    private float x,y;


    public Manuellsen() throws SlickException{
        Image tmp = new Image("testdata/manu.jpg");
        this.manuellsenImg = tmp.getScaledCopy(100, 100);
        this.x = 100;
        this.y = 100;
    }


    @Override
    public void render(Graphics graphics) {
        manuellsenImg.draw(this.x,this.y);
    }

    @Override
    public void update(int render) {
        this.x++;
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer((Game) new Manuellsen());
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
