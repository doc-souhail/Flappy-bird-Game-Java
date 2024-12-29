import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;


public class FlappyBird extends JPanel implements ActionListener {
    int boardWith = 360;
    int boardHeight = 640;

    //Images
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    //Bird
    int birdX = boardWith / 8;
    int birdY = boardHeight / 2;
    int birdWidth = 34;
    int birdHeight = 24;

    class Bird {
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    //Game logic
    Bird bird;

    Timer gameLoop;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWith, boardHeight));
//        setBackground(Color.blue);

        //Load images
        backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        bird = new Bird(birdImg);

        //Game timer
        gameLoop = new Timer(1000 / 60, this);
        gameLoop.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
//        System.out.println("draw");
        //background
        g.drawImage(backgroundImg, 0, 0, boardWith, boardHeight, null);

        //bird
        g.drawImage(birdImg, birdX, birdY, birdWidth, birdHeight, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
