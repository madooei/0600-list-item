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

  // Throws IndexOutOfBoundsException for a negative index or an index that is
  // not less than size(head).
  public static ListItem getListItem(ListItem head, int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index: " + index);
    }
    ListItem current = head;
    for (int i = 0; i < index && current != null; i++) {
      current = current.next;
    }
    if (current == null) {
      throw new IndexOutOfBoundsException("Index: " + index);
    }
    return current;
  }

  // Same bounds contract as getListItem.
  public static int get(ListItem head, int index) {
    return getListItem(head, index).value;
  }

  // Same bounds contract as getListItem.
  public static void set(ListItem head, int index, int value) {
    getListItem(head, index).value = value;
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

  // Assumes head is not null.
  public static ListItem getLast(ListItem head) {
    ListItem current = head;
    while (current.next != null) {
      current = current.next;
    }
    return current;
  }

  // Returns the new head, which changes only when the list was empty; the
  // caller must reassign head = addLast(head, value).
  public static ListItem addLast(ListItem head, int value) {
    if (head == null) {
      return addFirst(head, value);
    }
    ListItem tail = getLast(head);
    tail.next = new ListItem(value);
    return head;
  }

  // Same bounds contract as getListItem; never changes head.
  public static ListItem insertAfter(ListItem head, int index, int value) {
    ListItem current = getListItem(head, index);
    ListItem newItem = new ListItem(value);
    newItem.next = current.next;
    current.next = newItem;
    return head;
  }

  // Same bounds contract as getListItem; returns the new head, which changes
  // only when index is 0.
  public static ListItem insertBefore(ListItem head, int index, int value) {
    if (index == 0) {
      return addFirst(head, value);
    }
    return insertAfter(head, index - 1, value);
  }

  // Throws IndexOutOfBoundsException for a negative index or an index that is
  // not less than size(head). Returns the new head, which changes only when
  // index is 0.
  public static ListItem remove(ListItem head, int index) {
    if (index < 0 || head == null) {
      throw new IndexOutOfBoundsException("Index: " + index);
    }
    if (index == 0) {
      return head.next;
    }
    ListItem previous = head;
    for (int i = 0; i < index - 1 && previous.next != null; i++) {
      previous = previous.next;
    }
    if (previous.next == null) {
      throw new IndexOutOfBoundsException("Index: " + index);
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
