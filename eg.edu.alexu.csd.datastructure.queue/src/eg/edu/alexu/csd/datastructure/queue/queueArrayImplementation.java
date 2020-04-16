package eg.edu.alexu.csd.datastructure.queue;

public class queueArrayImplementation implements IQueue,IArrayBased {
	private int sizeOfArray; //sizeOfArray
	private int front=-1;	//index of front element
	private int rear=-1; //index of last element
	private int count=0; //size of queue
	private Object arr[]; //array of queueu elemnt
	/**
	* constructor to set max size
	* @author team
	*/

	public queueArrayImplementation(int n) {
		this.sizeOfArray=n;  //set max size
	}

	/**
	* Inserts an item at the queue front
	* @param item
	* @throws if full queue
	* @author team
	* @return void
	*/
	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		if((rear+1)%sizeOfArray==front) throw new RuntimeException("Full queue");
		if(front==-1) {
			arr=new Object[sizeOfArray]; //special case if the first element added
			front=rear=0;
		}else {
			rear=(rear+1)%sizeOfArray;
		}
		arr[rear]=item;
		count++;
		
	}

	/**
	* Removes the object at the queue rear and returns it.
	* @throws if empty queue
	* @author team
	* @return dequeued element
	*/
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		Object temp;
		if(isEmpty()) throw new RuntimeException("Empty queue");//Exception if empty
		else if(front==rear){
			temp=arr[front];  //special case if we deleted last element
			front=rear=-1;
		}else {
			temp=arr[front];
			front=(front+1)%sizeOfArray;
		}
		count--;
		return temp;
	}

	/**
	* Tests if this queue is empty.
	* author team
	* @return boolean true if empty false if non empty
	*/

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front==-1&&rear==-1)return true; //FUNCTION TO KNOW IF EMPTY
		else
		return false;
	}

	/**
	* Returns the number of elements in the queue
	* author team
	* @return size of queue
	*/

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.count; //return size of queue
	}




}
