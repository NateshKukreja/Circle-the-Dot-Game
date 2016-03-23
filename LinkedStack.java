import java.util.EmptyStackException;

public class LinkedStack<E> implements Stack<E>{
	
	private int linkedSize;
	
    private static class Elem<T>{
    	int linkedSize = 0;
        private T info;
        private Elem<T> next;
        private Elem( T info, Elem<T> next) {
            this.info = info;
            this.next = next;
        }
    }

    private Elem<E> top; // instance variable

    public LinkedStack() throws EmptyStackException{
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(E info) {
    	linkedSize++;
    	top = new Elem<E>( info, top );
        if (top == null){
     	   throw new EmptyStackException();
        }
        if (info == null){
        	throw new NullPointerException();
        }
    }

    public E peek() {
    	linkedSize++;
        return top.info;
    }

    public E pop() {
       linkedSize--;
       if (top == null){
    	   throw new EmptyStackException();
       }
       
    	
        E savedInfo = top.info;

        Elem<E> oldTop = top;
        Elem<E> newTop = top.next;

        top = newTop;

        oldTop.info = null; // scrubbing the memory
        oldTop.next = null; // scrubbing the memory

        return savedInfo;
    }
    
    public int getLinkedSize(){
    	return linkedSize;
    }
    
    public void resetLinkedSize(){
    	linkedSize = 0;
    }
    
}
