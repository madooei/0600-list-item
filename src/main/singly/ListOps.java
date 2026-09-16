package singly;

/** The chapter's operations on chains of singly linked ListItems. */
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

  // Assumes index is valid.
  public static ListItem getListItem(ListItem head, int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes index is valid.
  public static int get(ListItem head, int index) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes index is valid.
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

  // Returns the new head, which changes only when the list was empty; the
  // caller must reassign head = addLast(head, value).
  public static ListItem addLast(ListItem head, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes index is valid; never changes head.
  public static ListItem insertAfter(ListItem head, int index, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes index is valid. Returns the new head, which changes only when
  // index is 0.
  public static ListItem insertBefore(ListItem head, int index, int value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes index is valid. Returns the new head, which changes only when
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

  // There is no insertBefore(item, value) or remove(item) overload here: a
  // singly linked item has no reference back to its predecessor, so finding
  // it means traversing from the head, which the doubly linked package avoids.
}
