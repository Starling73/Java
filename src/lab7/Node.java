package lab7;

import lab6.SortOfCoffee;

public class Node {
    private SortOfCoffee sortOfCoffee;
    private Node next;

    public Node(SortOfCoffee sortOfCoffee, Node next) {
        this.sortOfCoffee = sortOfCoffee;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public SortOfCoffee getSortOfCoffee() {
        return sortOfCoffee;
    }
}
