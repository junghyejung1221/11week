import javax.swing.*;
import java.awt.event.*;

public class ColorMain extends JFrame {
    public ColorMain(String msg){

        super(msg);
        JPanel panel = new ColorPanel();
        add(panel);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String [] args){
        new ColorMain("JHJ Color Test");
    }
}
