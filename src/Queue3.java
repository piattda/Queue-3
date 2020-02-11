

import java.util.Iterator;

import components.queue.Queue;
import components.queue.QueueSecondary;
import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.set.Set;
import components.set.Set1L;

/**
 * {@code Queue} represented as a {@code Sequence} of entries, with
 * implementations of primary methods.
 * 
 * @param <T>
 *            type of {@code Queue} entries
 * @correspondence this = $this.entries
 */
public class Queue3<T> extends QueueSecondary<T> {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Entries included in {@code this}.
     */
    private Sequence<T> entries;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.entries = new Sequence1L<T>();
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Queue3() {
        this.createNewRep();
    }

    /*
     * Standard methods removed to reduce clutter...
     */

    /*
     * Kernel methods ---------------------------------------------------------
     */

    /**
     * Adds {@code x} to the end of {@code this}.
     *
     * @param x
     *            the entry to be added
     * @aliases reference {@code x}
     * @updates this
     * @ensures this = #this * <x>
     */
    
    @Override
    public final void enqueue(T x) {
        assert x != null : "Violation of: x is not null";

        this.entries.add(this.length(),x);
        

    }

    /**
     * Removes and returns the entry at the front of {@code this}.
     *
     * @return the entry removed
     * @updates this
     * @requires this /= <>
     * @ensures #this = <dequeue> * this
     */
    
    @Override
    public final T dequeue() {
        assert this.length() > 0 : "Violation of: this /= <>";
        
        return this.entries.length();
        
    }

    @Override
    public final int length() {
        int lengthToReturn = 0;
        //we can't iterate over the queue because we don't have a length method yet so 
        //we don't know how big it is and I just don't know which way is up anymore
        //rip life
       
        return this.entries.length();
       
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Queue<T> newInstance() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void transferFrom(Queue<T> source) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * Iterator removed to reduce clutter...
     */
    
    /**
     * Reports the front of {@code this}.
     * 
     * @return the front entry of {@code this}
     * @aliases reference returned by {@code front}
     * @requires this /= <>
     * @ensures <front> is prefix of this
     */
    @Override
    public T front() {
        assert this.length() > 0 : "Violation of: this /= <>";
        T front = this.dequeue();
     
        return front;
     
    }
    

}