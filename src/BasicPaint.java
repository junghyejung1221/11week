import javax.swing.*;

public class BasicPaint {
    public BasicPaint(String msg){
        JFrame f = new JFrame(msg);
        MyPanel myPanel1 = new MyPanel();//그리기 위한 Panel 생성
        f.add(myPanel1);  //mypanel붙이기
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new BasicPaint("Basic Paint Test1");
    }
}
