package at.nihat.games.Figures;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface Actor {
    public void render(Graphics graphics);
    public void update(int render);
}
