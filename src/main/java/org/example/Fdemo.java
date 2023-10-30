package org.example;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Fdemo extends Frame implements ActionListener {
        Font font = new Font("", Font.BOLD, 20);
        Button[] b = new Button[9];
        Button newGame;
        int playerOScore = 0;
        int playerXscore = 0;

        int k = 0;
        int x = 8;
        int y = 28;
        int a = 0;

        int z = 0;
        int z1 = 0;
        int z2 = 0;
        int z3 = 0;
        int z4 = 0;
        int z5 = 0;
        int z6 = 0;
        int z7 = 0;
        int z8 = 0;

    protected void fdemo() {
            setLayout(null);
            setVisible(true);
            setSize(325, 400);
            setLocation(400, 100);
            setBackground(Color.YELLOW);
            setForeground(Color.DARK_GRAY);

            newGame = new Button("New Game");
            newGame.setSize(150, 40);
            newGame.setLocation(90, 350);
            newGame.setFont(font);
            newGame.setForeground(Color.BLACK);
            add(newGame);
            newGame.addActionListener(this);


            for (int i = 1; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                    b[k] = new Button();
                    b[k].setSize(100, 100);
                    b[k].setLocation(x, y);
                    b[k].setFont(font);
                    add(b[k]);
                    b[k].addActionListener(this);
                    b[k].setBackground(Color.ORANGE);
                    k++;
                    x = x + 105;
                }
                x = 8;
                y = y + 105;
            }
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == newGame) {
                newGameButtonAction();
            }
            if (e.getSource() == b[0] && z == 0) {
                    if (a % 2 == 0) {
                        b[0].setLabel("O");
                    } else {
                        b[0].setLabel("X");
                    }
                    z++;
                    a++;
                }
            if (e.getSource() == b[1] && z1 == 0) {
                    if (a % 2 == 0) {
                        b[1].setLabel("O");
                    } else {
                        b[1].setLabel("X");
                    }
                    z1++;
                    a++;
                }
            if (e.getSource() == b[2] && z2 == 0) {
                    if (a % 2 == 0) {
                        b[2].setLabel("O");
                    } else {
                        b[2].setLabel("X");
                    }
                    z2++;
                    a++;
            }
            if (e.getSource() == b[3] && z3 == 0) {
                    if (a % 2 == 0) {
                        b[3].setLabel("O");
                    } else {
                        b[3].setLabel("X");
                    }
                    z3++;
                    a++;
                }
            if (e.getSource() == b[4] && z4 == 0) {
                    if (a % 2 == 0) {
                        b[4].setLabel("O");
                    } else {
                        b[4].setLabel("X");
                    }
                    z4++;
                    a++;
                }
            if (e.getSource() == b[5] && z5 == 0) {
                    if (a % 2 == 0) {
                        b[5].setLabel("O");
                    } else {
                        b[5].setLabel("X");
                    }
                    z5++;
                    a++;
                }
            if (e.getSource() == b[6] && z6 == 0) {
                    if (a % 2 == 0) {
                        b[6].setLabel("O");
                    } else {
                        b[6].setLabel("X");
                    }
                    z6++;
                    a++;
                }
            if (e.getSource() == b[7] && z7 == 0) {
                    if (a % 2 == 0) {
                        b[7].setLabel("O");
                    } else {
                        b[7].setLabel("X");
                    }
                    z7++;
                    a++;
                }
            if (e.getSource() == b[8] && z8 == 0) {
                    if (a % 2 == 0) {
                        b[8].setLabel("O");
                    } else {
                        b[8].setLabel("X");
                    }
                    z8++;
                    a++;
                }

                //Winning conditions

                String player1Wins = "Player O wins";
                String player2Wins = "Player X wins";
                if (b[0].getLabel().equals(b[1].getLabel()) && b[0].getLabel().equals(b[2].getLabel())) {
                    if (b[0].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[0].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
                if (b[3].getLabel().equals(b[4].getLabel()) && b[3].getLabel().equals(b[5].getLabel())) {
                    if (b[3].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[3].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
                if (b[0].getLabel().equals(b[3].getLabel()) && b[0].getLabel().equals(b[6].getLabel())) {
                    if (b[6].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[6].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
                if (b[1].getLabel().equals(b[4].getLabel()) && b[1].getLabel().equals(b[7].getLabel())) {
                    if (b[1].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[1].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
                if (b[2].getLabel().equals(b[5].getLabel()) && b[2].getLabel().equals(b[8].getLabel())) {
                    if (b[2].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[2].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
                if (b[0].getLabel().equals(b[4].getLabel()) && b[0].getLabel().equals(b[8].getLabel())) {
                    if (b[0].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[0].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player x: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
                if (b[2].getLabel().equals(b[4].getLabel()) && b[2].getLabel().equals(b[6].getLabel())) {
                    if (b[2].getLabel().equals("O")) {
                        playerOScore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player1Wins);
                        newGameButtonAction();
                    } else if (b[2].getLabel().equals("X")) {
                        playerXscore++;
                        infoBox(("Player O: " + playerOScore + "\r\n" + "Player X: " + playerXscore), player2Wins);
                        newGameButtonAction();
                    }
                }
            }
            private void newGameButtonAction(){
                for (int i = 0; i < 9; i++) {
                    b[i].setLabel("");
                }
                z = 0;
                z1 = 0;
                z2 = 0;
                z3 = 0;
                z4 = 0;
                z5 = 0;
                z6 = 0;
                z7 = 0;
                z8 = 0;
            }
            
    public static void infoBox(String totalScoreString, String titleBar)
    {
        JOptionPane.showMessageDialog(null,
                totalScoreString,
                titleBar,
                JOptionPane.WARNING_MESSAGE);
    }
}
