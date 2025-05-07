package konrad.lubaski.client;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class FigureActor extends Actor {

    private Texture figureTexture;

    public FigureActor() {
        this.figureTexture = new Texture(Gdx.files.internal("chess_pieces/b_Bishop.png"));
        setBounds(0, 0, 50, 50);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(figureTexture, getX(), getY(), getHeight(), getWidth());
    }
}
