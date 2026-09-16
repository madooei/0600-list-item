package singly;

/** The chapter's operations on chains of singly linked ListItems. */
public final class ListOps {

  private ListOps() {
    // This class should not be instantiated!
  }

  // Prints each item's value, in order, one per line. No-op on an empty list.
  public static void printAll(ListItem head) {
    ListItem current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  public static int size(ListItem head) {
    int count = 0;
    ListItem current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  // Assumes index is valid.
  public static ListItem getListItem(ListItem head, int index) {
    ListItem current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current;
  }

  // Assumes index is valid.
  public static int get(ListItem head, int index) {
    return getListItem(head, index).value;
  }

  // Assumes index is valid.
  public static void set(ListItem head, int index, int value) {
    ListItem current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    current.value = value;
  }

  public static boolean contains(ListItem head, int target) {
    ListItem current = head;
    while (current != null) {
      if (current.value == target) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  // Returns the new head; the caller must reassign head = addFirst(head, value).
  public static ListItem addFirst(ListItem head, int value) {
    ListItem newItem = new ListItem(value);
    newItem.next = head;
    return newItem;
  }

  // Returns the new head, which changes only when the list was empty; the
  // caller must reassign head = addLast(head, value).
  public static ListItem addLast(ListItem head, int value) {
    if (head == null) {
      return new ListItem(value);
    }
    ListItem current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new ListItem(value);
    return head;
  }

  // Assumes index is valid; never changes head.
  public static ListItem insertAfter(ListItem head, int index, int value) {
    ListItem current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    ListItem newItem = new ListItem(value);
    newItem.next = current.next;
    current.next = newItem;
    return head;
  }

  // Assumes index is valid. Returns the new head, which changes only when
  // index is 0.
  public static ListItem insertBefore(ListItem head, int index, int value) {
    if (index == 0) {
      return addFirst(head, value);
    }
    return insertAfter(head, index - 1, value);
  }

  // Assumes index is valid. Returns the new head, which changes only when
  // index is 0.
  public static ListItem remove(ListItem head, int index) {
    if (index == 0) {
      return head.next;
    }
    ListItem previous = head;
    for (int i = 0; i < index - 1; i++) {
      previous = previous.next;
    }
    previous.next = previous.next.next;
    return head;
  }

  // Overload: inserts after the item itself instead of an index. Assumes
  // item is not null. Does not change head.
  public static void insertAfter(ListItem item, int value) {
    ListItem newItem = new ListItem(value);
    newItem.next = item.next;
    item.next = newItem;
  }

  // There is no insertBefore(item, value) or remove(item) overload here: a
  // singly linked item has no reference back to its predecessor, so finding
  // it means traversing from the head, which the doubly linked package avoids.
}
