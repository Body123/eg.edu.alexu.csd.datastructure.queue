package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class queueArrayImplementationTest {

	@Test
	void test() {
		queueArrayImplementation obj=new queueArrayImplementation(5);
		assertThrows(RuntimeException.class,() ->obj.dequeue(),"Empty queue ");
		assertTrue(obj.isEmpty());
		obj.enqueue(5);
		obj.enqueue(4);
		obj.enqueue(3);
		obj.enqueue(2);
		obj.enqueue(1);
		assertThrows(RuntimeException.class,() ->obj.enqueue(6),"Full queue");
		assertEquals(5,obj.dequeue());
		assertEquals(4,obj.dequeue());
		assertEquals(3,obj.dequeue());
		obj.enqueue(5);
		assertTrue(!obj.isEmpty());
		obj.enqueue(4);
		obj.enqueue(3);
		assertEquals(5, obj.size());
		assertThrows(RuntimeException.class,() ->obj.enqueue(9),"Full queue");
		assertEquals(2,obj.dequeue());
		assertEquals(4, obj.size());
		assertEquals(1,obj.dequeue());
		obj.enqueue(7);
		obj.enqueue(8);
		assertEquals(5,obj.dequeue());
		assertEquals(4, obj.size());
		assertEquals(4,obj.dequeue());
		assertEquals(3,obj.dequeue());
		assertEquals(7,obj.dequeue());
		assertEquals(8,obj.dequeue());
		assertEquals(0, obj.size());
		assertTrue(obj.isEmpty());
		assertThrows(RuntimeException.class,() ->obj.dequeue(),"Empty queue ");
	}
	
	
	//Exceptions tests
	@Test
	public void test1() {
		queueArrayImplementation obj= new queueArrayImplementation(5);
		assertThrows(RuntimeException.class,() ->obj.dequeue(),"Empty queue ");
		obj.enqueue(1);
		assertEquals(1, obj.dequeue());
		assertThrows(RuntimeException.class,() ->obj.dequeue(),"Empty queue ");
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		obj.enqueue(9);
		assertThrows(RuntimeException.class,() ->obj.enqueue(9),"Full queue");
		assertEquals(5, obj.dequeue());
		assertEquals(4, obj.size());
		obj.enqueue(10);
		assertThrows(RuntimeException.class,() ->obj.enqueue(7),"Full queue");
		
	}
	
}
