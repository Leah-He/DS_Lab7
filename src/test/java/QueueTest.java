import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
	//Queue<T> queue;
	Queue<String> queue;
	
	@BeforeEach
	void setUp() throws Exception {
		queue = new Queue<>();
		
		
	}

	@Test
	void testQueue() {
		//test push and pop
		queue.push("1");
		queue.push("two");
		queue.push("3");
		
		assertEquals("1", queue.pop());
		assertEquals("two", queue.pop());
		assertEquals("3", queue.pop());
		
		//pop when empty:
		assertThrows(QueueUnderFlowException.class, () -> queue.pop());
		assertTrue(queue.isEmpty());
		
		//test empty
		assertTrue(queue.isEmpty());
		queue.push("8");
		assertFalse(queue.isEmpty());
		
		
		/*assertTrue(queue.isEmpty());
		queue.push("four");
		assertFalse(queue.isEmpty());
		
		//test 
		//assertThrows(QueueUnderFlowException.class, () -> queue.pop());
		*/
		
	}

}
