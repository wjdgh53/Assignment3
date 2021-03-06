package support;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;


public class CirQueue<T> implements Queue<T> {

	Node rear, current, previous;
	
	
	public CirQueue() {
		rear = null;
	}
	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	public boolean hasNext() {
		Node next = null;

		if(isEmpty()) {
			return next == rear;
		} 
			return next!=rear;
	}
	
	public void reset()
	  // Initializes current position for an iteration through this list,
	  // to the first element on this list.
	  {
	    if (rear != null)
	      current = rear.getLink();
	  }
	public T next(){	    
	    if(!isEmpty()){
			boolean found=false;
			current = rear.getLink();
			previous = rear;
			do {
				T next = (T) current.getData();
				rear = current;
				current = current.getLink();
				return next;
			} while(current!=rear.getLink());
			
			}
		return null;
	}
	public void dequeue(){
		if(!isEmpty()){
			if(rear.getLink() == rear){
				rear = null;
			}else{
			current = rear.getLink();
			rear.setLink(current.getLink());
			}
		}
	}
	public String[] read(){
		if(!isEmpty()){
			String [] list = new String[size()] ;
			for (int i =0; i < size(); i++ )
			{
				list[i] = current.getData().toString();
				//next();
				//previous = current;
				rear = current;
				current = current.getLink();
				
				
			}
		//System.out.println(list);	
		return list;	
		}
		return null;
	}
	public boolean check(Object element) 
	{
		if(contains(element))
		{
			return true;
		}
		return false;
		
	}
	public boolean check(Object seat, int hour)
	{
		if(!isEmpty()){
		boolean found=false;
		current = rear.getLink();
		previous = rear;
		do {
			if ( ((Customer) current.getData()).getSeat().equals(seat)) {
				if ( ((Customer) current.getData()).getHour()==hour) {
				found = true;
				break;
				}else{
					found = false;
				}
				
			} else if (current==rear) {
				found = false;
			}
			previous = current;
			current = current.getLink();
		} while(current!=rear.getLink());
		return found;
		}else{
			return false;
		}
	

	}
	public boolean contains(Object name, Object password) {
		if(!isEmpty()){
		boolean found=false;
		current = rear.getLink();
		previous = rear;
		do {
			if ( ((Customer) current.getData()).getName().equals(name)) {
				if ( ((Customer) current.getData()).getPassword().equals(password)) {
				found = true;
				break;
				}else{
					found = false;
				}
				
			} else if (current==rear) {
				found = false;
			}
			previous = current;
			current = current.getLink();
		} while(current!=rear.getLink());
		return found;
		}else{
			return false;
		}
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return rear==null;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object element) {
	boolean found = true;
	    
	    if (contains(element))
	    {
	      if (rear == rear.getLink()) {     // if single-element list    
	        rear = null;  
	      }
	      if (previous.getLink() == rear) { // if removing last node
	        rear = previous;        
	       }
	      previous.setLink(current.getLink());  // remove node 
	     // numElements--;
	    }else{
	    	found = false;
	    }
	    return found;
	  }
	@Override
	public int size() {		
		if(isEmpty()){
			return 0;
		}else{
			current = rear.getLink();
			int size = 0;
			do{
				current = current.getLink();
				size++;
			}while(current!=rear.getLink());
			return size;
		}
		
	}

	@Override
	public boolean offer(T element) {
		
		Node newNode = new Node(element, null);
		if(isEmpty()) {
			rear = newNode;
		} else {
			newNode.setLink(rear.getLink());
		}
		rear.setLink(newNode);
		rear = newNode;

		return true;
	}
	public boolean offerfirst(T element){
		Node newNode = new Node(element, null);
		if(isEmpty()) {
			rear = newNode;
		} else {
			newNode.setLink(rear.getLink());
		}
		rear.setLink(newNode);
		current = newNode;

		return true;
	
	}
	public String toString() {
		if(!isEmpty()){
		String list = "[";
		current = rear.getLink();
		do {
			if (current==rear) {
				list += current.getData() + "]";
			} else {
				list += current.getData() + ", ";	
			}
			current = current.getLink();
		} while(current!=rear.getLink());

		return list;
		}else{
			return "Empty";
		}
	}
	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(T arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T element() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
}
