package doubly;

/** An item in a doubly linked list. */
public class ListItem {
  public int value; // the data stored in this item
  public ListItem next; // reference to the next item in the list
  public ListItem prev; // reference to the previous item in the list

  // constructor to initialize the value
  public ListItem(int value) {
    this.value = value;
    this.next = null; // next is initialized to null by default
    this.prev = null; // prev is initialized to null by default
  }
}
