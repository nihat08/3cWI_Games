package at.nihat.games.BreakoutGame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface BGameActor {
    public void render(Graphics graphics);
    public void update(GameContainer gameContainer, int delta);
}

