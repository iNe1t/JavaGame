import javax.swing.JFrame;
import java.awt.Canvas;

public class Window extends Canvas{

    private static final long serialVersionUID = -240840600533728354L;
        
    public Window(int height, int width, String name, Game game){
        JFrame window = new JFrame(name);
        window.setSize(width, height);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.add(game);
        game.start();
    }
 
}
