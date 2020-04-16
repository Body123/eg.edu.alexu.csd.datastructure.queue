package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class queueLinkedListImplementationTest {

	@Test
	void test() {
		queueLinkedListImplementation obj=new queueLinkedListImplementation();
		assertThrows(RuntimeException.class,() ->obj.dequeue(),"Empty queue ");
		assertTrue(obj.isEmpty());
		obj.enqueue(5);
		assertTrue(!obj.isEmpty());
		obj.enqueue(4);
		obj.enqueue(3);
		assertEquals(3, obj.size());
		assertEquals(5,obj.dequeue());
		assertEquals(2, obj.size());
		assertEquals(4,obj.dequeue());
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		assertEquals(3,obj.dequeue());
		assertEquals(3, obj.size());
		assertEquals(7,obj.dequeue());
		assertEquals(8,obj.dequeue());
		assertEquals(9,obj.dequeue());
		assertEquals(0, obj.size());
		assertTrue(obj.isEmpty());
		
		
	}
	
	
	
	
}
