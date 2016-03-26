import java.util.EmptyStackException;

public interface Stack<E> {


    public abstract boolean isEmpty(); //checks if its empty

    public abstract E peek() throws EmptyStackException; //returns top element without removing it

    public abstract E pop() throws EmptyStackException; //returns top element and removes it

    public abstract void push( E element ) throws NullPointerException;//adds new element to stack

}
