import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class lineChartPanel extends JPanel implements ActionListener {
    ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();

    JButton button;
    Color color1 = new Color(0,0,0);
    Color color2 = new Color(0,0,0);
    public lineChartPanel(){
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
        g.drawLine(70,60,110,60); //세로 숫자 줄 4
        g.drawLine(70,120,110,120); //세로 숫자 줄 3
        g.drawLine(70,180,110,180); //세로 숫자 줄 2
        g.drawLine(70,240,110,240); //세로 숫자 줄 1
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



        //2022현재
        g2.setPaint(color1);
        g.drawString("2022", 380, 30);//년도
        g2.fill(new Ellipse2D.Float(105,115,15,15)); //원 이과
        g.drawLine(110,120,190,180); //이과 -> 문과
        g2.fill(new Ellipse2D.Float(185,175,15,15)); //원 문과
        g.drawLine(190,180,270,60); //문과 -> 예체능
        g2.fill(new Ellipse2D.Float(265,55,15,15)); //원 예체능
        g.drawLine(270,60,350,240); //예체능 -> 기타
        g2.fill(new Ellipse2D.Float(345,235,15,15)); //원 기타

        //2021과거
        g2.setPaint(color2);
        g.drawString("2021", 380, 45);//년도
        g2.fill(new Ellipse2D.Float(105,55,15,15)); //원 이과
        g.drawLine(110,60,190,180); //이과4 -> 문과2
        g2.fill(new Ellipse2D.Float(185,175,15,15)); //원 문과
        g.drawLine(190,180,270,240); //문과2 -> 예체능1
        g2.fill(new Ellipse2D.Float(265,235,15,15)); //원 예체능
        g.drawLine(270,240,350,120); //예체능1 -> 기타3
        g2.fill(new Ellipse2D.Float(345,115,15,15)); //원 기타
    }
    public void actionPerformed(ActionEvent e){
        color1 = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        color2 = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        repaint(); //event 에 대한 paint 합수 다시 호출함
    }
}