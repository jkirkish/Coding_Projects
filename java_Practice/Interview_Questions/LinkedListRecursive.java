
class LinkedListRecursive {

    Node head;

    // Append a new node to the list
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

    // Reverse the list recursively
    public Node reverseRecursive(Node current, Node prev) {
        if (current == null) {  // Base case: reached the end
            return prev;
        }
        Node nextNode = current.next;  // Store the next node
        current.next = prev;          // Reverse the link
        return reverseRecursive(nextNode, current);  // Recurse
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

    public static void main(String[] args) {
        LinkedListRecursive ll = new LinkedListRecursive();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        System.out.println("Original List:");
        ll.printList();

        ll.head = ll.reverseRecursive(ll.head, null);

        System.out.println("Reversed List:");
        ll.printList();
    }
}

class Node {

    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
