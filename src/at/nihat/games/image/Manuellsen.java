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
    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;}
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;}
        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y--;}
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y++;}



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
