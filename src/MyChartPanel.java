import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;

public class MyChartPanel extends JPanel implements ActionListener {
    ArrayList<Shape> shapeArrayList = new ArrayList<Shape>();

    JButton button;

    Color color1 = new Color(0,0,0);
    Color color2 = new Color(0,0,0);
    public MyChartPanel(){
        setLayout(new BorderLayout());
        //버튼 생성
        button = new JButton("Color Change");
        button.addActionListener(this); //이벤트 발생
        add(button,BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);

        Graphics2D g2 = (Graphics2D) graphics;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5)); //선두께


        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 370, 450);
        Color blue = new Color(0,100,255);
        graphics.setColor(blue);
        graphics.fillOval(65,60,240,230);
        graphics.fillRect(109, 290, 150, 120);

        int xValues[] = {109,70,63,109};
        int yValues[] = {290, 278, 308, 321};

        graphics.fillPolygon(xValues,yValues,4);

        int xValues2[] = {259,305, 295, 259};
        int yValues2[] = {290, 308, 332, 321};

        graphics.fillPolygon(xValues2,yValues2,4);

        graphics.setColor(Color.white);
        graphics.fillOval(41,271,40,40);
        graphics.fillOval(292, 305, 40, 40);
        graphics.fillOval(73, 402, 20, 20);
        graphics.fillOval(90, 405, 90, 25);
        graphics.fillOval(186, 405, 90, 25);
        graphics.setColor(Color.black);
        graphics.drawOval(41,271,40,40);
        graphics.drawOval(292, 305, 40, 40);
        graphics.drawOval(90, 405, 90, 35);
        graphics.drawOval(186, 405, 90, 35);


        graphics.setColor(Color.white);
        graphics.fillOval(85, 100, 200, 180);
        graphics.fillOval(123, 280, 120, 112);
        graphics.setColor(Color.red);
        graphics.fillRoundRect(103, 275, 166, 16, 15, 15);
        graphics.setColor(new Color(204,204,0));
        graphics.fillOval(169, 278, 30, 30);
        graphics.setColor(Color.black);
        graphics.drawLine(171, 285, 197, 285);
        graphics.drawLine(169,290,200, 290);
        graphics.fillOval(179, 293, 10, 10);
        graphics.drawLine(184, 300, 184, 307);


        graphics.drawArc(148, 290, 70, 70, 0, -180);
        graphics.drawLine(148, 325, 218, 325);
        graphics.setColor(Color.white);
        graphics.fillOval(123,	80, 60, 70);
        graphics.fillOval(183, 80, 60, 70);
        graphics.setColor(color1);
        graphics.drawOval(123,80,60,70);
        graphics.drawOval(183,80,60,70);
        graphics.fillOval(160, 108, 20 ,20);
        graphics.fillOval(186, 108, 20, 20);
        graphics.setColor(Color.white);
        graphics.fillOval(167, 114, 6 ,6);
        graphics.fillOval(190, 114, 6, 6);
        graphics.setColor(Color.red);
        graphics.fillOval(169, 158, 27, 27);
        graphics.setColor(color1);
        graphics.drawOval(169,158,27,27);
        graphics.setColor(Color.white);
        graphics.fillOval(184, 161, 10, 13);



        graphics.setColor(color1);
        graphics.drawArc(90, 60, 190, 190, -45,-90);
        graphics.drawLine(183, 185, 183, 250);
        graphics.drawLine(100,182,148, 189);
        graphics.drawLine(93, 200, 148, 200);
        graphics.drawLine(98, 217, 148, 211);

        graphics.drawLine(219, 189, 268, 182);
        graphics.drawLine(219,200, 272, 200);
        graphics.drawLine(219, 211, 269, 218);

        graphics.setFont(new Font("kai body",Font.PLAIN,24));





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
