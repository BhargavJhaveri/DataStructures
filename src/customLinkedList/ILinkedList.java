package customLinkedList;

/**
 * Created by Bhargav Jhaveri on 02-Nov-15.
 */
public interface ILinkedList {

    int ELEMENT_NOT_FOUND = -1;

    void add(Object object);

    void add(Object object, int index);

    void remove(Object object);

    void remove(int index);

    int get(Object object);

    Object get(int index);

    boolean contains(Object object);

    int size();

}
