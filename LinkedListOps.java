import java.util.Scanner;

public class LinkedListOps {

    Node head;
    Scanner sc;

    void insertAtStart(int number) {

        // Intantiate a new temporary node with the data
        Node temp = new Node();
        temp.data = number;

        if (head == null) { // When list is empty
            // Assign temp as the starting node
            head = temp;
        } else { // When list is not empty
            // Assign head node as the temp's next node
            temp.next = head;
            // Assign temp as the starting node
            head = temp;
        }
    }

    void insertatlast(int number) {
        Node start = head;

        // Intantiate a new temporary node with the data
        Node temp = new Node();
        temp.data = number;

        if (start == null) { // When list is empty

            // Assign temp as the starting node
            head = temp;

        } else { // When list is not empty

            while (start.next != null) {// Traverse to the end of the list
                start = start.next;
            }

            // Insert new Node at the end of the list
            start.next = temp;

        }
    }

    void insertAfterTarget(int target, int number) {
        Node start = head;
        while (start != null && start.data != target) { // Traverse to the node having the value same as target value
            start = start.next;
        }
        if (start == null) { // Target value not present in the list
            System.out.println("Target not found");
        } else {
            // Intantiate a new temporary node with the data
            Node temp = new Node();
            temp.data = number;

            // Logic to place the node next to target node
            temp.next = start.next;
            start.next = temp;
        }
    }

    // TO display the list
    void display() {
        System.out.println("Linked List:-");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListOps ob = new LinkedListOps();

        System.out.println("==============================================");
        System.out.println("Enter an element to be inserted at last:");
        int n = sc.nextInt();
        ob.insertatlast(n);
        ob.display();

        System.out.println("==============================================");
        System.out.println("Enter an element to be inserted at start:");
        int s = sc.nextInt();
        ob.insertAtStart(s);
        ob.display();

        System.out.println("=================================================");
        System.out.println("Enter target after which new number has to be inserted:");
        int target = sc.nextInt();
        System.out.println("Enter the new number to be inserted after " + target);
        int newn = sc.nextInt();
        ob.insertAfterTarget(target, newn);
        ob.display();

        sc.close();
    }
}
