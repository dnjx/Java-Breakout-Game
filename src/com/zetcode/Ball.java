package com.zetcode;

import javax.swing.ImageIcon;

public class Ball extends Sprite implements Commons {

    private int xdir;
    private int ydir;

    public Ball() {

        initBall();
    }

    private void initBall() {
        
        xdir = 1;
        ydir = -1;

        loadImage();
        getImageDimensions();
        resetState();
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/resources/ball.png");
        image = ii.getImage();
    }

    void move() {

        x += xdir;
        y += ydir;

        if (x == 0) {
            setXDir(1);
        }

        if (x == WIDTH - imageWidth) {
            setXDir(-1);
        }

        if (y == 0) {
            setYDir(1);
        }
    }

    private void resetState() {

        x = INIT_BALL_X;
        y = INIT_BALL_Y;
    }

    void setXDir(int x) {

        xdir = x;
    }

    void setYDir(int y) {

        ydir = y;
    }

    int getYDir() {

        return ydir;
    }
}
