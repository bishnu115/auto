

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class robott {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
