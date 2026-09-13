package doubly;

/** A small demo of ListOps's operations on a doubly linked list. */
final class ListDemo {

  private ListDemo() {
    // Entry-point holder — not instantiated.
  }

  public static void main(String[] args) {
    ListItem head = null;
    int[] seed = {3, 5, 7};
    for (int i = seed.length - 1; i >= 0; i--) {
      head = ListOps.addFirst(head, seed[i]);
    }
    System.out.println("after addFirst(3), addFirst(5), addFirst(7):");
    ListOps.printAll(head);

    head = ListOps.addLast(head, 9);
    System.out.println("after addLast(9):");
    ListOps.printAll(head);

    System.out.println("size: " + ListOps.size(head));
    System.out.println("get(1): " + ListOps.get(head, 1));
    System.out.println("contains(7)? " + ListOps.contains(head, 7));

    ListOps.set(head, 0, 30);
    System.out.println("after set(0, 30):");
    ListOps.printAll(head);

    head = ListOps.insertAfter(head, 0, 99);
    System.out.println("after insertAfter(head, 0, 99):");
    ListOps.printAll(head);

    head = ListOps.insertBefore(head, 0, -1);
    System.out.println("after insertBefore(head, 0, -1):");
    ListOps.printAll(head);

    head = ListOps.remove(head, 2);
    System.out.println("after remove(head, 2):");
    ListOps.printAll(head);

    // These overloads work directly on an item, not an index, using prev to
    // avoid the traversal the singly linked package needs for the same job.
    ListItem second = head.next;
    ListOps.insertAfter(second, 42);
    System.out.println("after insertAfter(second, 42):");
    ListOps.printAll(head);

    ListOps.remove(second);
    System.out.println("after remove(second) — note remove(item) cannot fix head on its own:");
    ListOps.printAll(head);

    ListItem third = head.next;
    ListOps.insertBefore(third, 7);
    System.out.println("after insertBefore(third, 7):");
    ListOps.printAll(head);
  }
}
