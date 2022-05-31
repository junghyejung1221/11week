import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(){
        //필요한 초기화 기능 설정
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    //그리기 함수 정의
    public void paintComponent(Graphics g){
        //여기에 그림을 그리는 코드를 구현함
        g.drawRect(50,50,50,50);
        g.drawOval(200,50,50,50);
    }
}
