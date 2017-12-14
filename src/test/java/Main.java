import java.util.Properties;

import com.codingame.gameengine.runner.GameRunner;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("seed", "42");
        
        GameRunner gameRunner = new GameRunner(properties);
        gameRunner.addAgent(Player1.class);
        gameRunner.addAgent(Player2.class);

        // gameRunner.addAgent("python3 /home/user/player.py");
        
        gameRunner.start();
    }
}
