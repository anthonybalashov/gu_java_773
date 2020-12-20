package ru.ipbalashov.lesson8;

import javax.swing.*;
import java.awt.*;

public class WinWindow extends JFrame {
    private static final int WINDOW_X = GameWindow.WINDOW_X + 50;
    private static final int WINDOW_Y = GameWindow.WINDOW_Y + 50;
    private static final int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH - 100;
    private static final int WINDOW_HEIGHT = 400;


    private JLabel winner = new JLabel("", SwingConstants.CENTER);

    private GameWindow gameWindow;
    public WinWindow() {
        this.gameWindow = gameWindow;
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("WINNER");
        setLayout(new GridLayout(2, 1));
        winner.setFont(new Font("Serif", Font.PLAIN, 32));
        add(winner);
        setVisible(false);

    }

    public void setWinner(String text) {
        this.winner.setText(text);
    }


}
