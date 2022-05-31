import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class pchartPanel extends JPanel implements ActionListener{
    ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();
    JButton button;
    Color color1 = new Color(0,0,0);
    Color color2 = new Color(0,0,0);
    Color color3 = new Color(0,0,0);
    Color color4 = new Color(0,0,0);
    public pchartPanel(){
        setLayout(new BorderLayout());
        //버튼 생성
        button = new JButton("Color Change");
        button.addActionListener(this); //이벤트 발생
        add(button,BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5)); //선두께


        g.drawLine(90,10,90,300); //세로
        g.drawLine(70,60,110,60); //세로 숫자 줄
        g.drawLine(70,120,110,120); //세로 숫자 줄
        g.drawLine(70,180,110,180); //세로 숫자 줄
        g.drawLine(70,240,110,240); //세로 숫자 줄
        g.drawLine(90,300,400,300); //가로
        g.setFont(new Font("굴림체", Font.PLAIN, 20));//폰트 지정
        g.drawString("4", 45, 60);//범례(legend)
        g.drawString("3", 45, 120);//범례(legend)
        g.drawString("2", 45, 180);//범례(legend)
        g.drawString("1", 45, 240);//범례(legend)

        g.drawString("이과", 102, 320);//이과
        g.drawString("문과", 182, 320);//문과
        g.drawString("예체능", 260, 320);//예체능
        g.drawString("기타", 342, 320);//기타



        g2.setPaint(color1);
        g2.fill(new Rectangle2D.Float(110,120,30,180)); //사각형

        g2.setPaint(color2);
        g2.fill(new Rectangle2D.Float(190,180,30,120)); //사각형

        g2.setPaint(color3);
        g2.fill(new Rectangle2D.Float(270,60,30,240)); //사각형

        g2.setPaint(color4);
        g2.fill(new Rectangle2D.Float(350,240,30,60)); //사각형
    }
    public void actionPerformed(ActionEvent e){
        color1 = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        color2 = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        color3 = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        color4 = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        repaint(); //event 에 대한 paint 합수 다시 호출함
    }
}