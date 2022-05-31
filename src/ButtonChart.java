import javax.swing.*;
import java.awt.*;

public class ButtonChart extends JPanel {
    JButton button1,button2;
    JPanel jp = new JPanel();

    public ButtonChart(){
        //버튼 생성
        setLayout(new BorderLayout());
        button1 = new JButton("Open. txt file");
        button2 = new JButton("Apply");

        jp.add(button1);
        jp.add(button2);
        jp.setLayout(new FlowLayout());

        add(jp,BorderLayout.CENTER);
    }

}
