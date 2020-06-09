/*

Зачетка №9124

C2 = 0    List
C3 = 1    Односвязный список

*/

package lab7;

import lab6.Arabica;
import lab6.Liberica;
import lab6.Robusta;
import lab6.SortOfCoffee;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList myList1 = new MyList(new Arabica());
        myList1.add(new Robusta());
        myList1.add(new Liberica());

        MyList emptyList = new MyList();
//        emptyList.add(new Arabica());
//        System.out.println(emptyList.isEmpty());

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Robusta());
        arrayList.add(new Arabica());
        MyList myList2 = new MyList(arrayList);

        Iterator iterator = myList2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        myList2.clear();

        System.out.println(myList1.contains(new Arabica()));
    }
}
