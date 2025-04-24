package konrad.lubaski;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import konrad.lubaski.client.ChessGame;
import konrad.lubaski.client.Dimensions;

public class DesktopLauncher {
    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(60);
        config.setTitle("chess");
        config.setWindowedMode(Dimensions.WINDOW_WIDTH, Dimensions.WINDOW_HEIGHT);
        new Lwjgl3Application(new ChessGame(), config);
    }
}
