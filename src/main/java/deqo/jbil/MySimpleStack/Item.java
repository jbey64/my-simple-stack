package deqo.jbil.MySimpleStack;

/**
 * Created by 21202655 on 21/10/2016.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
