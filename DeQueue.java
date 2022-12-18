public class DeQueue {
    int front, rear, arr[], cap;

    public DeQueue(int limit) {
        front = -1;
        rear = -1;
        cap = limit;
        arr = new int[limit];
    }

    public void addfront(int n) {
        if (front == -1) {
            front = rear = 0;
            arr[front] = n;
        } else if (front > 0) {
            front--;
            arr[front] = n;
        } else
            System.out.println("Front Full");
    }

    public void addrear(int n) {
        if (rear == -1) {
            front = rear = 0;
            arr[rear] = n;
        } else if (rear < cap - 1 && rear >= front) {
            arr[++rear] = n;
        } else
            System.out.println("Rear Full");
    }

    public int popfront() {
        if (front <= cap && front <= rear)
            return arr[front++];
        else
            return -9999;

    }

    public int poprear() {
        if (rear >= 0 && rear >= front)
            return arr[rear--];
        else
            return -9999;
    }

    public void display() {
        System.out.println("**********Queue*************");
        int i = front;
        while (i <= rear) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        DeQueue obj = new DeQueue(5);
        obj.addfront(1);
        obj.display();
        obj.addfront(2);
        obj.display();
        obj.addrear(8);
        obj.display();
        obj.addrear(7);
        obj.display();
        obj.addrear(6);
        obj.display();
        obj.addrear(5);
        obj.display();
        obj.addrear(4);
        obj.display();

        System.out.println("Pop Front: " + obj.popfront());
        obj.display();
        System.out.println("Pop Rear" + obj.poprear());
        obj.display();
    }
}