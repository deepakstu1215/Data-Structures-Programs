import java.util.Scanner;

public class LinkedListOps {

    Node head;
    Scanner sc = new Scanner(System.in);

    void insertAtStart() {
        if (head == null) { // When list is empty
            head = new Node();
            head.data = sc.nextInt();
        } else { // When list is not empty
            Node n1 = new Node();
            n1.data = sc.nextInt();
            n1.next = head;
            head = n1;
        }
    }

    void insertatlast(int n) {
        Node start = head;
        while (start != null) {
            start = start.next;
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            Node temp = new Node();
            temp.data = sc.nextInt();
            if (start != null) { // When list is not empty
                start.next = temp;
                start = temp;
            } else { // When list is empty
                start = temp;
                head = temp;
            }
        }

    }

    void insertAfterTarget(int target) {
        Node temp = head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        if (temp != null) {
            Node n1 = new Node();
            System.out.println("Enter an element:-");
            n1.data = sc.nextInt();
            n1.next = temp.next;
            temp.next = n1;
        } else {
            System.out.println("Target not found");
        }
    }

    void display() { // TO display the list
        System.out.println("Linked List:-");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListOps ob = new LinkedListOps();
        System.out.println("Enter 3 elements:");
        ob.insertatlast(4);
        ob.display();
        System.out.println("Enter starting element:");
        ob.insertAtStart();
        System.out.println("After insertion at start========");
        ob.display();
        ob.insertAfterTarget(3);
        System.out.println("After target insertion=========");
        ob.display();
    }
}
