import java.awt.*;
import javax.swing.*;

public class Cell {

    public static final int SIZE = 180;
    public static final int PADDING = SIZE / 3;
    public static final int SEED_SIZE = SIZE - PADDING * 2;
    public static final int SEED_STROKE_WIDTH = 8;
    private Image xImage = new ImageIcon("src/angry.png").getImage();
    private Image oImage = new ImageIcon("src/marah.png").getImage();

    Seed content;
    int row, col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        content = Seed.NO_SEED;
    }

    public void newGame() {
        content = Seed.NO_SEED;
    }

    public void paint(Graphics g) {
        int x = col * SIZE;
        int y = row * SIZE;

        if (content == Seed.CROSS) {
            g.drawImage(xImage, x, y, SIZE, SIZE, null);
        } else if (content == Seed.NOUGHT) {
            g.drawImage(oImage, x, y, SIZE, SIZE, null);
        }
        g.setColor(Color.BLACK);
        g.drawRect(x, y, SIZE, SIZE);
    }
}