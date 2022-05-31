import javax.swing.*;
public class TreeMain extends JFrame{
    public TreeMain (String msg){
        setTitle(msg);
        add(new TreePanel());
        setSize(600,600);
        setVisible(true);
    }
    public static void main(String [] args){
        new TreeMain("treeTest");
    }
}
