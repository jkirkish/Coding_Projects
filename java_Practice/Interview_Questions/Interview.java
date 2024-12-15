

//How would you reverse a linked list?
/* 1. Initialize Three Pointers
 * prev start as none (to represent the new tail)
 * 
 * current starts as the head of the linkedlist. 
 * 
 * next_node will store the next node temporarily during iteration
 * 
 * next_node will store the next node temporarily during iteration
 * 
 * 2. Traverse the list:
 *    For each node, change its next pointer to point to the previous node (prev)
 * 
 *    More prev to the current node.
 * 
 *    Move current to the next node (next_node).
 * 
 * 3. Set the New Head:
 *    At the end of the loop, prev will point to the new head of the reversed linkedlist
 * 
 * 
 *   Time Complexity O(n)
 *   where n is the number of nodes in the linkedlist (we traverse each node once)
 *   
 *   Space Complexity O(1)
 *   as we only use a constant amount of extra space
 * 
 *   the recursive approach works similarly but uses the call stack to reverse teh pointers. However, 
 *   it has O(n) space complexity due to recursion depth.
 * 
 *   
 */
public class Interview {

    private class Node {

        int value;
        Node next;

        Node(int value) {

            this.value = value;
            this.next = null;
        }
    }

    class LinkedList {

        Node head;

        public void append(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void reverse() {
            Node prev = null;
            Node current = head;
            Node nextNode;

            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            head = prev;

        }
        // Print the list

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Interview interview = new Interview();
        LinkedList ll = interview.new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        System.out.println("Original List:");
        ll.printList();

        ll.reverse();

        System.out.println("Reversed List:");
        ll.printList();
    }
}
