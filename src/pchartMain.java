import javax.swing.*;

public class pchartMain extends JFrame {
    public pchartMain(){
        setTitle("JHJ 막대 Chart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new pchartPanel();
        add(panel);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String [] args){
        new pchartMain();
    }
}
