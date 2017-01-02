package foo.bar.flyweight;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeforeFlyweight extends JFrame {
    private static final Color colors[] = { Color.red, Color.blue,
            Color.yellow, Color.orange, Color.black, Color.white };
    private static final int WIDTH = 400, HEIGHT = 400,
            NUMBER_OF_CIRCLES = 1000;

    public BeforeFlyweight() {
        Container contentPane = getContentPane();

        JButton button = new JButton("Draw Circle");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();

                Circle circle = null;
                for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
                    circle = new Circle(getRandomColor());
                    circle.draw(g, getRandomX(), getRandomY(), getRandomR());
                }
            }
        });
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomR() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        BeforeFlyweight test = new BeforeFlyweight();
    }

}
