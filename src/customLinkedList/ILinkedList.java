package customLinkedList;

/**
 * Created by Bhargav Jhaveri on 02-Nov-15.
 */
public interface ILinkedList {

    void add(Object object);

    void add(Object object, int index);

    void remove(Object object);

    void remove(int index);

    void get(Object object);

    void get(int index);

    boolean contains(Object object);

    int size();

}
