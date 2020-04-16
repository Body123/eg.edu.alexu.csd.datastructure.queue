package eg.edu.alexu.csd.datastructure.queue;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	queueArrayImplementation obj=new queueArrayImplementation(5);
		System.out.println(obj.isEmpty());
		obj.enqueue(5);
		obj.enqueue(4);
		obj.enqueue(3);
		obj.enqueue(2);
		obj.enqueue(1);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		System.out.println(obj.dequeue());
		System.out.println(obj.size());
		obj.enqueue(10);
		System.out.println(obj.dequeue());
		System.out.println(obj.size());
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		System.out.println(obj.size());
		obj.enqueue(15);
		System.out.println(obj.size());
		System.out.println(obj.dequeue());*/
		queueLinkedListImplementation obj=new queueLinkedListImplementation();
		System.out.println(obj.isEmpty());
		obj.enqueue(5);
		obj.enqueue(4);
		obj.enqueue(3);
		obj.enqueue(2);
		obj.enqueue(1);
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		System.out.println(obj.dequeue());
		System.out.println(obj.size());
		obj.enqueue(10);
		System.out.println(obj.size());
		
	}

}
