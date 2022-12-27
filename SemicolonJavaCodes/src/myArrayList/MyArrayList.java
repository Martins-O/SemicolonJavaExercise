package myArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class MyArrayList implements List {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] array = new Object[DEFAULT_CAPACITY];
	private int size;
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for (Object element : this) {
			if (element.equals(o)) {
				return true;
			}
		}
		return false;
	}


	@NotNull
	@Override
	public Iterator iterator() {
		return null;
	}

	@NotNull
	@Override
	public Object[] toArray() {
		Object[] array = new Object[size()];
		int i = 0;
		for (Object element : this) {
			array[i++] = element;
		}
		return array;
	}


	@Override
	public boolean add(Object o) {
		array[size++] = o;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if(array[i].equals(o)){
				count++;
			}
		}
		int newLength = size - count;
		Object[] newArray = new Object[newLength];
		int index = 0;
		for(int i = 0; i < newLength; i++) {
			if(!array[i].equals(o)){
				newArray[index] = o;
				index++;
			}
		}
		array = newArray;
		size = newArray.length;
		return true;
	}

	@Override
	public boolean addAll(@NotNull Collection c) {
		boolean modified = false;
		for (Object element : c) {
			modified |= add(element);
		}
		return modified;
	}

	@Override
	public boolean addAll(int index, @NotNull Collection c) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Index out of range: " + index);
		}
		if (c.isEmpty()) {
			return false;
		}
		boolean modified = false;
		for (Object element : c) {
			add(index++, element);
			modified = true;
		}
		return modified;
	}


	@Override
	public void clear() {

	}

	@Override
	public Object get(int index) {
		if (index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		return array[index];
	}

	@Override
	public Object set(int index, Object element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Object oldElement = array[index];
		array[index] = element;
		return oldElement;
	}

	@Override
	public void add(int index, Object element) {


	}

	@Override
	public Object remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++) {
				if (array[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (o.equals(array[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		if (o == null) {
			for (int i = size - 1; i >= 0; i--) {
				if (get(i) == null) {
					return i;
				}
			}
		} else {
			for (int i = size - 1; i >= 0; i--) {
				if (o.equals(get(i))) {
					return i;
				}
			}
		}
		return -1;
	}

	@NotNull
	@Override
	public ListIterator listIterator() {
		return null;
	}

	@NotNull
	@Override
	public ListIterator listIterator(int index) {
		return null;
	}

	@NotNull
	@Override
	public List subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public boolean retainAll(@NotNull Collection c) {
		return false;
	}

	@Override
	public boolean removeAll(@NotNull Collection c) {
		return false;
	}

	@Override
	public boolean containsAll(@NotNull Collection c) {
		return false;
	}

	@NotNull
	@Override
	public Object[] toArray(@NotNull Object[] a) {
		return new Object[0];
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
