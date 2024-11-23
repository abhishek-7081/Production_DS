# DSA

Array
Arraylist
Linked List
Recursion 


# DSA

## Array
- A collection of elements stored in contiguous memory locations.
- Fixed size and allows random access using indices.
- **Advantages**:
  - Fast access (O(1)) for reading elements.
  - Simple implementation.
- **Disadvantages**:
  - Fixed size limits flexibility.
  - Insertion and deletion are costly (O(n)).

## ArrayList
- A resizable array implementation in Java (or similar in other languages).
- Dynamically adjusts its size when elements are added or removed.
- **Advantages**:
  - Flexible size.
  - Provides built-in methods for operations (like `add`, `remove`, `size`).
- **Disadvantages**:
  - Slightly slower than arrays due to resizing overhead.
  - Requires extra memory for resizing.

## Linked List
- A collection of nodes where each node contains data and a reference to the next node.
- Can be **singly linked** (one direction) or **doubly linked** (both directions).
- **Advantages**:
  - Dynamic size; efficient insertion and deletion (O(1) at the head).
  - No need for contiguous memory.
- **Disadvantages**:
  - Sequential access (O(n)).
  - Overhead due to pointers/reference storage.

## Recursion
- A method where a function calls itself to solve smaller instances of a problem.
- Consists of a **base case** (stopping condition) and a **recursive case**.
- **Advantages**:
  - Simplifies code for problems like tree traversal, backtracking, and divide-and-conquer.
- **Disadvantages**:
  - Risk of stack overflow for deep recursions.
  - Can be less efficient than iterative approaches in some cases due to overhead.
