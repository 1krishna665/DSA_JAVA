import java.util.Scanner;

// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main class
public class CustomLinkedList {
    private Node head = null;

    // Method to add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // First node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Move to the last node
            }
            current.next = newNode; // Link new node at the end
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        System.out.print("Linked List: ");

        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // New line after printing list
    }

    // Main method to accept user input and build the list
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomLinkedList list = new CustomLinkedList();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        list.display();
        scanner.close();
    }
}
