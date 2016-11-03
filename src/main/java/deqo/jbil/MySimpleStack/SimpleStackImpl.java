package deqo.jbil.MySimpleStack;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21202655 on 03/11/2016.
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push(Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException{
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return (Item) wrappedStack.pop();
    }
}
