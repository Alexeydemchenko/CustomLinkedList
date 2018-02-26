import java.util.Collection;

public interface CustomLinkedList <T> extends Iterable<T> {

    public boolean add(T t);

    public boolean addAll(Collection<? extends T> c);

    public void clear();

    public T get(int index);

    public T set(int index, T element);

    public T remove(int index);

    public int indexOf(Object obj);
}
