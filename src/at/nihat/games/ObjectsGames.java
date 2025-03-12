package at.nihat.games;

import org.newdawn.slick.*;

public class ObjectsGames extends BasicGame {
    private float speed;
    private int scrWidth = 800, scrHeight = 600;

    private float rect = 100;
    private float rectX;
    private float rectY;
    private float rectCollX;
    private float rectCollY;

    private float crcl = 50;
    private float crclX;
    private float crclY;
    private float crclCollX;
    private float crclCollY;

    public ObjectsGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.speed = 0.3f;//f für float

        this.rectX = 100;
        this.rectY = 100;
        this.rectCollX = 1.5F;
        this.rectCollY = 1.5F;

        this.crclX = 50;
        this.crclY = 50;
        this.crclCollX = -1.5F;
        this.crclCollY = -1.5F;
    }


    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectX += rectCollX * delta * speed;
        this.rectY += rectCollY * delta * speed;

        if (rectX <= 0 || rectX + rect >= scrWidth) {
            rectCollX = -rectCollX;
        }
        if (rectY <= 0 || rectY + rect >= scrHeight) {
            rectCollY = -rectCollY;
        }

        this.crclX += crclCollX * delta * speed;
        this.crclY += crclCollY * delta * speed;

        if (crclX <= 0 || crclX + crcl >= scrWidth) {
            crclCollX = -crclCollX;
        }
        if (crclY <= 0 || crclY + crcl >= scrHeight) {
            crclCollY = -crclCollY;
        }

        if (checkCollision()) {
            rectCollX = -rectCollX;
            rectCollY = -rectCollY;
            crclCollX = -crclCollX;
            crclCollY = -crclCollY;
        }

    }


    private boolean checkCollision(){
            return (rectX < crclX + crcl && rectX + rect > crclX &&
                    rectY < crclY + crcl && rectY + rect > crclY);
            }






    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.setColor(new Color(255, 16, 240));
        graphics.drawRect(this.rectX, this.rectY, rect, rect);
        graphics.drawOval(this.crclX, this.crclY, rect, rect);

        graphics.setColor(Color.white);
        graphics.drawString("MY GAME!", (float) (scrWidth - graphics.getFont().getWidth("MY GAME!")) / 2, 50);
    }
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGames("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
