import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("나만의 차트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3)); //가로 2줄, 세로 3줄로 layout을 만듦
        JPanel panel1 = new lineChartPanel();
        panel.add(panel1);
        JPanel panel2 = new pchartPanel();
        panel.add(panel2);
        JPanel panel3 = new circlecartPanel();
        panel.add(panel3);
        JPanel panel4 = new MyChartPanel();
        panel.add(panel4);
        JPanel panel5 = new ButtonChart();
        panel.add(panel5);
        add(panel);
        setSize(1500, 1000);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();
    }
}