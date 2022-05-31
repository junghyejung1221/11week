import javax.swing.*;

public class SnowManMain {
    public SnowManMain(String msg){
        JFrame f = new JFrame(msg);
        SnowManPanel snowman = new SnowManPanel();//그리기 위한 Panel 생성
        f.add(snowman);
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String [] args){
        new SnowManMain("hjsnowman");
    }
}
