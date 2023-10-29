class Queue{
    static private int front, rear, capacity;
    static private int queue[];
    
    Queue(int c){
        front = rear = 0;
        this.capacity = c;
        this.queue = new int[capacity];
    }

    static void queueEnqueue(int data)
    {
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }
 
        else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static int queueDequeue()
    {   int res = -1;
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return res;
        }
        else {
            res = queue[0];
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            } 
            rear--;
        }
        return res;
    }

    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
 
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }
 
    static void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d",
                          queue[front]);
        return;
    }
}

public class StaticQueue {
    public static void main(String[] args) {
        // Create a queue of capacity 4
        Queue q = new Queue(4);
 
        // print Queue elements
        q.queueDisplay();
 
        // inserting elements in the queue
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
 
        // print Queue elements
        q.queueDisplay();
 
        // insert element in the queue
        q.queueEnqueue(60);
 
        // print Queue elements
        q.queueDisplay();
 
        q.queueDequeue();
        q.queueDequeue();
        System.out.printf(
            "\n\nafter two node deletion\n\n");
 
        // print Queue elements
        q.queueDisplay();
 
        // print front of the queue
        q.queueFront();
        System.out.println("\nD:"+q.queueDequeue());
    }
}
