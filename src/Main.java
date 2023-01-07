import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class Main {
    public static void main(String[] args){
        try {
            Robot robot = new Robot();
            int i =0,x=220,y=100; //x，y为初始坐标，采用截图工具，找到对应起始点即可
            while(i++<6){

                robot.mouseMove(x,y);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(1000);

                /*输入*/
                robot.keyPress(KeyEvent.VK_A);//A是对应的字节码
                robot.keyRelease(KeyEvent.VK_A);
                robot.delay(1000);

                /*敲下回车即可发出a */
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                //y为块的自增量
                y =y +64;
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}