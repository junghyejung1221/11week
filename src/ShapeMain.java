import javax.swing.*;

public class ShapeMain extends JFrame {
    public ShapeMain(){
        setTitle("JHJ 2D Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ShapePanel();
        add(panel);
        setSize(600,150);
        setVisible(true);
    }
    public static void main(String [] args){
        new ShapeMain();
    }
}
