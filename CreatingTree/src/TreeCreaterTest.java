import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreeCreaterTest {
	
	@Test
	public void testTreeCreater() {
		
		String tree = TreeCreater.createTree("*", 2);
		assertEquals("*\n***\n", tree);
	}
}
