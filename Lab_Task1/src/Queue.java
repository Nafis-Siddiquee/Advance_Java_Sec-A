import java.io.*;
import java.util.*;

public class Queue<T> {

    private int size;
    private T[] queueAr;
    private int front = -1, rear = -1;

    public Queue(int size) {
        this.size = size;
        queueAr = (T[])new Object[size]; //Creation of Generic Stack Array
    }

    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }

    public boolean isFull(){
        return (front == size - 1);
    }

    T front()
    {
        // If it is not pointing to any element in Queue
        if (front == -1){
            return null;
        }
        else{
            // else return the front element
            return queueAr[front];
        }
    }

    // Returns value of element at rear
    T rear()
    {
        // If it is not pointing to any element in Queue
        if (rear == -1){
            return null;
        }
        else{
            // else return the front element
            return queueAr[rear];
        }
    }

    // Inserts element at the front of Queue
    void enQueue(T value)
    {
        // If Queue is empty
        if (this.isEmpty()) {
            front = 0;
            rear = 0;
            queueAr[front] = value;
        }

        // If Queue is not empty
        else {
            front++;
            if (!isFull()) {
                queueAr[front] = value;
            }
            else{
                System.out.println("Queue is already full, Cannot insert");
            }
        }
    }

    // Deletes elements from the rear from Queue
    T deQueue()
    {
        // if Queue doesn't have any elements
        if (isEmpty()){
            System.out.println("Queue is already empty");
        }
        // If Queue has only one element
        else if (front == rear) {
            front = rear = -1;
        }
        return queueAr[rear++];


    }

    // Method 6
    // Print the Queue

    // @Override
    public String toString()
    {
        if (isEmpty())
            return "";

        String Ans = "";

        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(queueAr[front]) + "->";
        }

        Ans += String.valueOf(queueAr[front]);

        return Ans;
    }
}
