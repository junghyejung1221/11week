import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorPanel extends JPanel implements ActionListener {
    JButton button;
    Color color = new Color(0,0,0);

    public ColorPanel(){
        setLayout(new BorderLayout());
        //버튼 생성
        button = new JButton("Color Change");
        button.addActionListener(this); //이벤트 발생
        add(button,BorderLayout.SOUTH);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(50,50,300,300);
    }
    public void actionPerformed(ActionEvent e){
        color = new Color((int)(Math.random()*255.0),
                (int)(Math.random()*255.0),
                (int)(Math.random()*255.0));
        repaint(); //event 에 대한 paint 합수 다시 호출함
    }
}
