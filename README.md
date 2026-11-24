# List Item

The companion code for the List Item chapter: two parallel packages, `singly` and `doubly`, each with a public `ListItem` node and a `ListOps` class holding the chapter's operations as public static methods. Each `ListOps` has a demo you can run.

## Prerequisites

- JDK 17+

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  src/
    main/
      singly/
        ListItem.java    # value, next
        ListOps.java     # the chapter's operations on a singly linked chain
      doubly/
        ListItem.java    # value, next, prev
        ListOps.java     # the same operations, plus the item-based O(1) overloads
      demo/              # one demo per ListOps class
        SinglyListOpsDemo.java
        DoublyListOpsDemo.java
  scripts/
    run.sh               # compile everything and run one demo
```

## How to compile and run

- `scripts/run.sh demo.SinglyListOpsDemo` — compiles everything and runs that one demo. Every class you implement has its own demo; the two `ListOps` demos start with their package name, `SinglyListOpsDemo` and `DoublyListOpsDemo`.

There is no build tool and no test suite: testing is introduced later in the course. The script(s) above are all you need.

## Contents

- `singly.ListItem` / `doubly.ListItem` — public classes with public fields. Plain data, no behavior. `doubly.ListItem` adds `prev` on top of `singly.ListItem`'s `value`/`next`.
- `singly.ListOps` — traversal (`printAll`), `size`, `get`/`set`/`getListItem` by index, `contains`, `addFirst`, `addLast`, index-based `insertAfter`/`insertBefore`/`remove`, and the O(1) `insertAfter(item, value)` overload. There is no `insertBefore(item, value)` or `remove(item)` overload here — a singly linked item has no reference back to its predecessor.
- `doubly.ListOps` — the same operations, all keeping `next` and `prev` consistent, plus the O(1) `insertAfter`/`insertBefore`/`remove` overloads that take the item itself, made possible by `prev`.
- `demo.SinglyListOpsDemo` / `demo.DoublyListOpsDemo` — one demo per `ListOps` class; each builds a list, traverses it, looks items up, and mutates it with both the index-based and item-based operations.
