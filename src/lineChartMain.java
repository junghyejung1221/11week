import javax.swing.*;

public class lineChartMain extends JFrame {
    public lineChartMain() {
        setTitle("JHJ 선형 Chart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new lineChartPanel();
        add(panel);
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new lineChartMain();
    }
}