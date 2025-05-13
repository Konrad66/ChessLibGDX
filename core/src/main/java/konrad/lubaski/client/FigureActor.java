package konrad.lubaski.client;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class FigureActor extends Actor {

    private static final String PIECES_PATH = "chess_pieces/";
    private Texture figureTexture;

    public FigureActor(Piece piece, Color color) {
        String path = filesPath(piece, color);
        this.figureTexture = new Texture(Gdx.files.internal(path));
        setBounds(0, 0, 127, 128);
    }

    private String filesPath(Piece piece, Color color){
        return PIECES_PATH + color.getFilePath() + piece.getName() + ".png";
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(figureTexture, getX(), getY(), getHeight(), getWidth());
    }
}
