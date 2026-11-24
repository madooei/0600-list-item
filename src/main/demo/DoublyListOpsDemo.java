package demo;

import doubly.ListItem;
import doubly.ListOps;

/** A demo of the chapter's operations on a doubly linked list. */
public final class DoublyListOpsDemo {

  private DoublyListOpsDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    ListItem head = null;
    int[] seed = {3, 5, 7};
    for (int i = seed.length - 1; i >= 0; i--) {
      head = ListOps.addFirst(head, seed[i]);
    }
    // Adding 7, then 5, then 3 at the front gives 3 5 7.
    System.out.println("after addFirst(7), addFirst(5), addFirst(3):");
    ListOps.printAll(head);

    // Expect 3 5 7 9.
    head = ListOps.addLast(head, 9);
    System.out.println("after addLast(9):");
    ListOps.printAll(head);

    // Expect size 4, get(1) is 5, and contains(7) is true.
    System.out.println("size: " + ListOps.size(head));
    System.out.println("get(1): " + ListOps.get(head, 1));
    System.out.println("contains(7)? " + ListOps.contains(head, 7));

    // Expect 30 5 7 9.
    ListOps.set(head, 0, 30);
    System.out.println("after set(0, 30):");
    ListOps.printAll(head);

    // Expect 30 99 5 7 9.
    head = ListOps.insertAfter(head, 0, 99);
    System.out.println("after insertAfter(head, 0, 99):");
    ListOps.printAll(head);

    // Expect -1 30 99 5 7 9.
    head = ListOps.insertBefore(head, 0, -1);
    System.out.println("after insertBefore(head, 0, -1):");
    ListOps.printAll(head);

    // Removing index 2 drops 99. Expect -1 30 5 7 9.
    head = ListOps.remove(head, 2);
    System.out.println("after remove(head, 2):");
    ListOps.printAll(head);

    // The item-based overloads work on an item, not an index, and use prev
    // to avoid a traversal. second holds 30. Expect -1 30 42 5 7 9.
    ListItem second = head.next;
    ListOps.insertAfter(second, 42);
    System.out.println("after insertAfter(second, 42):");
    ListOps.printAll(head);

    // Removing the item that holds 30. Expect -1 42 5 7 9.
    ListOps.remove(second);
    System.out.println("after remove(second):");
    ListOps.printAll(head);

    // third now holds 42. Expect -1 7 42 5 7 9.
    ListItem third = head.next;
    ListOps.insertBefore(third, 7);
    System.out.println("after insertBefore(third, 7):");
    ListOps.printAll(head);
  }
}
