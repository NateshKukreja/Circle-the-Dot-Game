
public interface Stack<E> {


    public abstract boolean isEmpty(); //checks if its empty

    public abstract E peek(); //returns top element without removing it

    public abstract E pop(); //returns top element and removes it

    public abstract void push( E element ); //adds new element to stack
}
