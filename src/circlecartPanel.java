import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class circlecartPanel extends JPanel implements ActionListener {
    int num1 =3; // 이과의 수
    int num2 =2; // 문과의 수
    int num3 =4; // 예체능의 수
    int num4 =1; // 기타의 수

    JButton button;
    Color color1 = new Color(0,0,0);
    Color color2 = new Color(0,0,0);
    Color color3 = new Color(0,0,0);
    Color color4 = new Color(0,0,0);
    public circlecartPanel(){
        setLayout(new BorderLayout());
        //버튼 생성
        button = new JButton("Color Change");
        button.addActionListener(this); //이벤트 발생
        add(button,BorderLayout.SOUTH);
    }

    public void paintComponent (Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0,10,Color.white,0,70,Color.RED);

        //전체 합을 구한다
        int total = num1 + num2 + num3 + num4;
        if (total == 0)
            return;
        // 전체에서의 비중을 구함.
        //arc4 = 전체 - (arc1+arc2+arc3)로 구함

        int arc1 = (int) 360.0 * num1 / total;
        int arc2 = (int) 360.0 * num2 / total;
        int arc3 = (int) 360.0 * num3 / total;
        g.setColor(color1);//색상지정
        g.fillArc(50, 20, 200, 200, 0, arc1);//(x축,y축,반지름,반지름,시작각,끝각) - 원호를 그림
        g.setColor(color2);//색상지정
        g.fillArc(50, 20, 200, 200, arc1,arc2);//(x축,y축,반지름,반지름,시작각,끝각) - 원호를 그림
        g.setColor(color3);//색상지정
        g.fillArc(50, 20, 200, 200, arc1 + arc2, arc3);//(x축,y축,반지름,반지름,시작각,끝각) - 원호를 그림
        g.setColor(color4);//색상지정
        g.fillArc(50, 20, 200, 200, arc1 + arc2 + arc3, 360 - (arc1 + arc2 + arc3));//(x축,y축,반지름,반지름,시작각,끝각) - 원호를 그림
        g.setColor(Color.BLACK);//색상지정
        g.setFont(new Font("굴림체", Font.PLAIN, 12));//폰트 지정
        g.drawString(" 이과 비율", 300, 150);//범례(legend)
        g.drawString(" 문과 비율", 300, 170);//범례(legend)
        g.drawString(" 예체능 비율", 300, 190);//범례(legend)
        g.drawString(" 기타 비율", 300, 210);//범례(legend)
        g2.setPaint(color1);
        g2.fill(new Ellipse2D.Float(290,140,10,10)); //원
        g2.setPaint(color2);
        g2.fill(new Ellipse2D.Float(290,160,10,10)); //원
        g2.setPaint(color3);
        g2.fill(new Ellipse2D.Float(290,180,10,10)); //원
        g2.setPaint(color4);
        g2.fill(new Ellipse2D.Float(290,200,10,10)); //원

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
