package doubly;

/** The chapter's operations on chains of doubly linked ListItems. */
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
    if (head != null) {
      head.prev = newItem;
    }
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
    ListItem newItem = new ListItem(value);
    newItem.prev = current;
    current.next = newItem;
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
    newItem.prev = current;
    if (current.next != null) {
      current.next.prev = newItem;
    }
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
      ListItem newHead = head.next;
      if (newHead != null) {
        newHead.prev = null;
      }
      return newHead;
    }
    ListItem previous = head;
    for (int i = 0; i < index - 1; i++) {
      previous = previous.next;
    }
    previous.next = previous.next.next;
    if (previous.next != null) {
      previous.next.prev = previous;
    }
    return head;
  }

  // Overload: inserts after the item itself instead of an index. Assumes
  // item is not null. Does not change head.
  public static void insertAfter(ListItem item, int value) {
    ListItem newItem = new ListItem(value);
    newItem.next = item.next;
    newItem.prev = item;
    if (item.next != null) {
      item.next.prev = newItem;
    }
    item.next = newItem;
  }

  // Overload: inserts before the item itself instead of an index. Assumes
  // item is not null and has a predecessor (item.prev != null); throws
  // NullPointerException otherwise, since there is no head reference here to
  // become the new head. Does not change head.
  public static void insertBefore(ListItem item, int value) {
    ListItem newItem = new ListItem(value);
    newItem.next = item;
    newItem.prev = item.prev;
    item.prev.next = newItem;
    item.prev = newItem;
  }

  // Overload: removes the item itself instead of an index. Assumes item is
  // not null. Does not update an external head reference; the caller must
  // handle the case where item was the first or only item.
  public static void remove(ListItem item) {
    if (item.prev != null) {
      item.prev.next = item.next;
    }
    if (item.next != null) {
      item.next.prev = item.prev;
    }
  }
}
