package deqo.jbil.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by 21202655 on 03/11/2016.
 */
public interface SimpleStack {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;
}
