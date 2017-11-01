
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Queue<Vertex> implements Iterable<Vertex> {
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    
    private class Node {
        private Vertex item;
        private Node next;
    }

   
    public Queue() {
        first = null;
        last  = null;
        n = 0;
    }

    
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int size() {
        return n;     
    }

    /**
     * Returns the number of items in this queue.
     *
     * @return the number of items in this queue
     */
    public int length() {
        return n;     
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return (int) first.item;
    }

   /**
     * Add the item to the queue.
     */
    public void enqueue(Vertex item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
    }

    
    public Vertex dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        Vertex item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   // to avoid loitering
        return item;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Vertex item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    } 
 

   
    public Iterator<Vertex> iterator()  {
        return new ListIterator();  
    }

    
    private class ListIterator implements Iterator<Vertex> {
        private Node current = first;

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Vertex next() {
            if (!hasNext()) throw new NoSuchElementException();
            Vertex item = current.item;
            current = current.next; 
            return item;
        }
    }
}
