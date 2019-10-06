import static org.junit.jupiter.api.Assumptions.assumingThat;
import java.util.Iterator;

import java.util.Collection;

public interface MyList<E> extends Collection<E> {
  /** Add a new element at the specified index in this list */
  public void add(int index, E e);

  /** Return the element from this list at the specified index */
  public E get(int index);

  /** Return the index of the first matching element in this list.
   *  Return -1 if no match. */
  public int indexOf(Object e);

  /** Return the index of the last matching element in this list
   *  Return -1 if no match. */
  public int lastIndexOf(E e);

  /** Remove the element at the specified position in this list
   *  Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index);

  /** Replace the element at the specified position in this list
   *  with the specified element and returns the new set. */
  public E set(int index, E e);
  
  @Override /** Add a new element at the end of this list */
  public default boolean add(E e) {
    add(size(), e);
    return true;
  }

  @Override /** Return true if this list contains no elements */
  public default boolean isEmpty() {
    return size() == 0;
  }

  @Override /** Remove the first occurrence of the element e 
   *  from this list. Shift any subsequent elements to the left.
   *  Return true if the element is removed. */
  public default boolean remove(Object e) {
    if (indexOf(e) >= 0) {
      remove(indexOf(e));
      return true;
    }
    else
      return false;
  }

  @Override
  public default boolean containsAll(Collection<?> c) {
    // Left as an exercise
	Iterator it = c.iterator();
	while (it.hasNext()) {
		E current = (E)it.next();
		if (this.contains(current) == false) {
			return false;
		}
	}
    return true;
  }

  @Override
  public default boolean addAll(Collection<? extends E> c) {
    // Left as an exercise
	E[] newData = (E[])new Object[c.size()];
	Iterator it = c.iterator();
	while (it.hasNext()) {
		E current = (E)it.next();
		this.add(current);
	}
    return true;
  }

  @Override
  public default boolean removeAll(Collection<?> c) {
    // Left as an exercise
	  Iterator it = c.iterator();
		while (it.hasNext()) {
			E current = (E)it.next();
			if (this.contains(current)) {
				this.remove(current);
			}
		}
	  
		return true;

  }

  @Override
  public default boolean retainAll(Collection<?> c) {
    // Left as an exercise
		for (int i = 0; i < this.size(); i++) {
			if (c.contains(this.get(i)) == false) {
				this.remove(i);
			}
		}
    return true;
  }

  @Override
  public default Object[] toArray() {
    // Left as an exercise
	  Object[] data = new Object[this.size()];
	  for (int i = 0; i < this.size(); i++) {
		  data[i] = this.get(i);
	  }
    return data;
  }

  @Override
  public default <T> T[] toArray(T[] array) {
    // Left as an exercise
	  T[] data = (T[])new Object[array.length];
	  for (int i = 0; i < array.length; i++) {
		  data[i] = array[i];
	  }
    return data;
  }
}