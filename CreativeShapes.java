import javax.swing.*;
import java.awt.*;

public class CreativeShapes extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

        // Rectangle
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 150, 100);

        // Circle
        g.setColor(Color.RED);
        g.fillOval(300, 100, 100, 100);

        // Line
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 200, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Creative Shapes");

        CreativeShapes panel = new CreativeShapes();
        frame.add(panel);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}