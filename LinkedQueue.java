import java.util.EmptyStackException;


public class LinkedQueue<E> implements Queue<E> {

    private static class Elem<T> {

        private T value;
        private Elem<T> next;

        private Elem( T value, Elem<T> next ) {
            this.value = value;
            this.next = next;
        }
    }

    private Elem<E> front;
    private Elem<E> rear;

    public E peek() {
    	if(isEmpty()){   
    		try {
    			throw new Exception("EmptyQueueException: Queue is empty");
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	return front.value;
    }

    public void enqueue( E o ) {
        Elem<E> newElem;
        newElem = new Elem<E>( o, null );
        
        if ( rear == null ) {
            front = rear = newElem;
        } else {
            rear.next = newElem;
            rear = newElem;
        }
        if (o == null){
        	throw new NullPointerException();
        }
    }

    public E dequeue() {
    	if(isEmpty()){   
    		try {
    			throw new Exception("EmptyQueueException: Queue is empty");
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
        
        E result = front.value;
        if ( front != null & front.next == null ) {
            front = rear = null;
        } else {
            front = front.next;
        }
        return result;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

