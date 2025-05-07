package konrad.lubaski.client;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameScreen implements Screen {

    private OrthographicCamera camera;
    private Stage stage;
    private Texture boardTexture;
    private final ChessGame chessGame;
    private FigureActor figureActor;

    public GameScreen(ChessGame chessGame) {
        this.chessGame = chessGame;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Dimensions.WINDOW_WIDTH, Dimensions.WINDOW_HEIGHT);
        stage = new Stage(new ScreenViewport(), chessGame.getBatch());
        figureActor = new FigureActor();
        stage.addActor(figureActor);
        Gdx.input.setInputProcessor(stage);
        boardTexture = new Texture("chessboard.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        camera.update();

        chessGame.getBatch().setProjectionMatrix(camera.combined);
        chessGame.getBatch().begin();
        chessGame.getBatch().draw(boardTexture, 0, 0, Dimensions.WINDOW_WIDTH, Dimensions.WINDOW_HEIGHT);
        chessGame.getBatch().end();

        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        boardTexture.dispose();
    }
}
