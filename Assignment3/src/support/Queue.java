package support;
import java.util.Iterator;


public interface Queue<T> extends Iterator<T> {
	public void enqueue(T element);
	public T dequeue() throws QueueUnderflowException;
	public int size();
	public boolean hasnext();
}
