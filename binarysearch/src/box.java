abstract class SquareThing{
    public void openit(){

    }
}
public class box<T extends SquareThing> {
    // T stands for "Type"
    private T item;

    public void set(T item) { this.item = item; }
    public T get() { return item; }
    public void openthebox() {item.openit();}
}