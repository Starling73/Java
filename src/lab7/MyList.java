package lab7;

import lab6.SortOfCoffee;

import javax.swing.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<SortOfCoffee> {
    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }

    public MyList(SortOfCoffee sortOfCoffee) {
        add(sortOfCoffee);
    }

    public MyList(Collection<? extends SortOfCoffee> collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (SortOfCoffee sortOfCoffee : this) {
            if (sortOfCoffee.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<SortOfCoffee> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<SortOfCoffee> {
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public SortOfCoffee next() {
            SortOfCoffee sortOfCoffee = currentNode.getSortOfCoffee();
            currentNode = currentNode.getNext();
            return sortOfCoffee;
        }

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(SortOfCoffee sortOfCoffee) {
        Node node = new Node(sortOfCoffee, null);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends SortOfCoffee> collection) {
        boolean isCollectionChanged = false;
        for (SortOfCoffee sortOfCoffee : collection) {
            isCollectionChanged = add(sortOfCoffee);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int i, Collection<? extends SortOfCoffee> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public SortOfCoffee get(int i) {
        return null;
    }

    @Override
    public SortOfCoffee set(int i, SortOfCoffee sortOfCoffee) {
        return null;
    }

    @Override
    public void add(int i, SortOfCoffee sortOfCoffee) {

    }

    @Override
    public SortOfCoffee remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<SortOfCoffee> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<SortOfCoffee> {
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//
//        @Override
//        public SortOfCoffee next() {
//            return null;
//        }

        @Override
        public boolean hasPrevious() {
            return currentNode != head;
        }

        //todo
        @Override
        public SortOfCoffee previous() {
            SortOfCoffee sortOfCoffee = currentNode.getSortOfCoffee();
            currentNode = currentNode.getNext();
            return sortOfCoffee;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(SortOfCoffee sortOfCoffee) {

        }

        @Override
        public void add(SortOfCoffee sortOfCoffee) {

        }

    }

    @Override
    public ListIterator<SortOfCoffee> listIterator(int i) {
        return null;
    }

    @Override
    public List<SortOfCoffee> subList(int i, int i1) {
        return null;
    }
}
