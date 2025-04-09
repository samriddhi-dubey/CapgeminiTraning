package queueUsingArray;

public class Queue {

    int queueArray[];
    int front;
    int rear;
    int size;

     Queue(int size) {
        this.size = size;
        queueArray = new int[size];
        rear = -1;
        front = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        queueArray[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removed = queueArray[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return removed;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }
}
