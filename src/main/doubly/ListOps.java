package doubly;

/** The chapter's operations on chains of doubly linked ListItems. */
public final class ListOps {

  private ListOps() {
    // This class should not be instantiated!
  }

  // Prints each item's value, in order, one per line. No-op on an empty list.
  public static void printAll(ListItem head) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public static int size(ListItem head) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Throws IndexOutOfBoundsException for a negative index or an index that is
  // not less than size(head).
  public static ListItem getListItem(ListItem head, int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Same bounds contract as getListItem.
  public static int get(ListItem head, int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Same bounds contract as getListItem.
  public static void set(ListItem head, int index, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  public static boolean contains(ListItem head, int target) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the new head; the caller must reassign head = addFirst(head, value).
  public static ListItem addFirst(ListItem head, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes head is not null.
  public static ListItem getLast(ListItem head) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the new head, which changes only when the list was empty; the
  // caller must reassign head = addLast(head, value).
  public static ListItem addLast(ListItem head, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Same bounds contract as getListItem; never changes head.
  public static ListItem insertAfter(ListItem head, int index, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Same bounds contract as getListItem; returns the new head, which changes
  // only when index is 0.
  public static ListItem insertBefore(ListItem head, int index, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Throws IndexOutOfBoundsException for a negative index or an index that is
  // not less than size(head). Returns the new head, which changes only when
  // index is 0.
  public static ListItem remove(ListItem head, int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Overload: inserts after the item itself instead of an index. Assumes
  // item is not null. Does not change head.
  public static void insertAfter(ListItem item, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Overload: inserts before the item itself instead of an index. Assumes
  // item is not null and has a predecessor (item.prev != null); throws
  // NullPointerException otherwise, since there is no head reference here to
  // become the new head. Does not change head.
  public static void insertBefore(ListItem item, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Overload: removes the item itself instead of an index. Assumes item is
  // not null. Does not update an external head reference; the caller must
  // handle the case where item was the first or only item.
  public static void remove(ListItem item) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }
}
