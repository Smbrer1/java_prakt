package football;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballManager {
    private int MilanScore = 0;
    private int MadridScore = 0;
    private Boolean Flag;

    public void setMilanScore() {
        Flag = false;
        MilanScore = MilanScore + 1;
    }

    public void setMadridScore() {
        Flag = true;
        MadridScore = MadridScore + 1;
    }

    public String LastScorer() {
        if (Flag) return "Last Scorer Real Madrid";
        else return "Last Scorer AC Milan";
    }

    public String Winner() {
        if (MadridScore == MilanScore) return "Winner: DRAW";
        else {
            if (MadridScore > MilanScore) return "Winner: Real Madrid";
            else return "Winner: AC Milan";
        }
    }

    public String Score() {
        return MadridScore + "X" + MilanScore;
    }

    FootballManager() {
        JFrame Manager = new JFrame("Football Manager");
        Manager.setSize(250, 200);
        Manager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel LWinner = new JLabel("Winner: DRAW");
        JLabel LScorer = new JLabel("Last Scorer: N/A");
        JLabel LScore = new JLabel("0X0");

        Manager.add(LScore, BorderLayout.CENTER);
        Manager.add(LScorer, BorderLayout.SOUTH);
        Manager.add(LWinner, BorderLayout.NORTH);

        JButton MadridButton = new JButton("Real Madrid");
        JButton MilanButton = new JButton("AC Milan");
        Manager.add(MadridButton, BorderLayout.WEST);
        Manager.add(MilanButton, BorderLayout.EAST);

        Manager.setVisible(true);

        MadridButton.addActionListener(e -> {
            setMadridScore();
            LScore.setText(Score());
            LScorer.setText(LastScorer());
            LWinner.setText(Winner());
        });

        MilanButton.addActionListener(e -> {
            setMilanScore();
            LScore.setText(Score());
            LScorer.setText(LastScorer());
            LWinner.setText(Winner());
        });
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(FootballManager::new);
    }

}
