import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int boardWidth = 360;
        int bordHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");

        frame.setSize(boardWidth, bordHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}