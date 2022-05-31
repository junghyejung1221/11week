import javax.swing.*;

public class ColorChooserMain extends JFrame {
    public ColorChooserMain(){
        super();
        ColorChooser colorChooser = new ColorChooser();//내가 만든 colorchooser 생성
        add(colorChooser);
        setSize(300,300);
        setVisible(true);
    }
    public static void main (String [] args){
        new ColorChooserMain();
    }
}
