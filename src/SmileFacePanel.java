import java.awt.*;
import javax.swing.*;
public class SmileFacePanel extends JPanel{
    public SmileFacePanel(){
        //초기화
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.pink);
        g.fillOval(20,30,200,200);
        g.setColor(Color.black);
        g.drawArc(60,80,50,50,180,-180);//왼쪽 눈
        g.drawArc(150,80,50,50,180,-180);//오른쪽 눈
        g.drawArc(70,130,100,70,180,180);//입



    }
}
