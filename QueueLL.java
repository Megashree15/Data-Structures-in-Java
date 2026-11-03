import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next= null;
    }
}
public class QueueLL{
    Node front= null;
    Node rear =null;
    void enqueue(int value){
        Node a =new Node(value);
        if(front== null){
            front= a;
            rear= a;
            System.out.println("inserted"+value);
            return;
        }
        rear.next =a;
        rear =a;
        System.out.println("inserted"+value);
    }
    void dequeue(){
        if(front== null){
            System.out.println("Empty queue");
            return;
        }
        System.out.println("deleted"+front.data);
        front= front.next;
        if(front== null){
            rear= null;
        }
    }
    void peek(){
        if(front== null){
            System.out.println("empty queue");
            return;
        }
        System.out.println("peek"+front.data);
    }
    int size(){
        int count= 0;
        Node temp =front;
        while(temp!=null){
            count++;
            temp =temp.next;
        }
        return count;
    }
    boolean isEmpty(){
        return front== null;
    }
    void display(){
        if (front== null){
            System.out.println("empty queue");
            return;
        }
        Node temp= front ;
        System.out.println("front->");
        while(temp!=null){
            System.out.println(temp.data+"->");
        temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        QueueLL q =new QueueLL();
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.peek();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        q.display();


    }
}