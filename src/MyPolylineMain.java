import javax.swing.*;

public class MyPolylineMain {
    public MyPolylineMain(String msg){
        JFrame f = new JFrame(msg);
        MyPolylinePanel mypolyPanel1 = new MyPolylinePanel();//그리기 위한 Panel 생성
        f.add(mypolyPanel1);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new MyPolylineMain("Poly Test1");
    }
}
