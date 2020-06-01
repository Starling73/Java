package lab7;

import lab6.SortOfCoffee;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList implements List<SortOfCoffee> {

    public MyList() {

    }

    public MyList(SortOfCoffee sortOfCoffee) {

        add(sortOfCoffee);
    }

    public MyList(Collection collection) {

        addAll(collection);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<SortOfCoffee> iterator() {
        return null;
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
        return false;
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
        return false;
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
        return null;
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
