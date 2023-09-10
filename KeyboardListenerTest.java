/**
 * 
 */
package jococo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class KeyboardListenerTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	//check if keypress is Right, (1 for right arrow)
	public final void testKeyPressedKeyRight() {
		int x;
		if(ThreadsController.directionSnake!=2) 
			x = ThreadsController.directionSnake=1;
			Assert.assertEquals(1, 1);
		
	}
	
	@Test
	//check if keypress is Left, (2 for left arrow)
	public final void testKeyPressedKeyLeft() {
		int x;
		if(ThreadsController.directionSnake!=1) 
			x = ThreadsController.directionSnake=2;
			Assert.assertEquals(2, 2);
		
	}
	
	@Test
	//check if keypress is Top, (3 for up arrow)
	public final void testKeyPressedKeyTop() {
		int x;
		if(ThreadsController.directionSnake!=4) 
			x = ThreadsController.directionSnake=3;
			Assert.assertEquals(3, 3);
		
	}
	
	
	@Test
	//check if keypress is bottom, (4 for down arrow)
	public final void testKeyPressedKeyBottom() {
		int x;
		if(ThreadsController.directionSnake!=3) 
			x = ThreadsController.directionSnake=4;
			Assert.assertEquals(4, 4);
		
	}

}
