import javax.swing.*;

public class ShapeFillMain extends JFrame {
    public ShapeFillMain(){
        setTitle("JHJ Fill Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new ShapeFillPanel();
        add(panel);
        setSize(600,200);
        setVisible(true);
    }
    public static void main(String [] args){
        new ShapeFillMain();
    }
}
