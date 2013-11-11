package support;
import java.util.Iterator;


public class LinkedList<T> implements Iterator<T>  {
	Node front,rear;
	
	public LinkedList() {
		front = null;
		rear = null;
	}

	@Override
	public boolean hasNext() {
		Node next = null;

		if(!isEmpty()) {
			return next == rear;
		} 
			return next!=rear;
		
		
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isEmpty() {
		return front==null;
	}
}
