import javax.swing.*;
import java.awt.*;

public class SnowManPanel extends JPanel {
    public SnowManPanel(){
        //초기화
    }
    public void paintComponent(Graphics g) {
        final int MID = 150;
        final int TOP = 50;
        setBackground (Color.cyan);
        g.setColor (Color.blue);
        g.fillRect (0, 175, 300, 50);  // 바닥

        g.setColor (Color.yellow);
        g.fillOval (-40, -40, 80, 80);  // 해

        g.setColor (Color.white);
        g.fillOval (MID-20, TOP, 40, 40);      // 모자
        g.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
        g.fillOval (MID-50, TOP+80, 100, 60);  // lower torso

        g.setColor (Color.black);
        g.fillOval (MID-10, TOP+10, 5, 5);   // 왼쪽 눈
        g.fillOval (MID+5, TOP+10, 5, 5);    // 오른쪽 눈

        g.drawArc (MID-10, TOP+20, 20, 10, 190, 160);   // 입

        g.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // 왼팔
        g.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // 오른팔

        g.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // 모자
        g.fillRect (MID-15, TOP-20, 30, 25);
    }
}

