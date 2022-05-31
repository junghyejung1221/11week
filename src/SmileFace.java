import javax.swing.*;
import java.awt.*;

public class SmileFace {
    public SmileFace(String msg){
        JFrame f = new JFrame(msg);
        SmileFacePanel smileface = new SmileFacePanel();//그리기 위한 Panel 생성
        f.add(smileface);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new SmileFace("smile test");
    }
}
