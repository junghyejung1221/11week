import javax.swing.*;

public class circlecartPanelMain extends JFrame {
    public circlecartPanelMain(){
        setTitle("JHJ 2D Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new circlecartPanel();
        add(panel);
        setSize(500,300);
        setVisible(true);
    }
    public static void main(String [] args){
        new circlecartPanelMain();
    }
}