package konrad.lubaski.client;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ChessGame extends Game {

    private BitmapFont font;
    private SpriteBatch batch;
    private GameScreen gameScreen;

    @Override
    public void create() {
        font = new BitmapFont();
        batch = new SpriteBatch();
        gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }

    public SpriteBatch getBatch() {
        return batch;
    }
}
