import java.util.*;
class Node{//we create a class named Node. It describes how every node should look
    int data;//his stores the number inside the node.
    Node next;//This stores a reference to the next node.
//Why is the type Node and not int? Because next must refer to another complete node, which contains both data and a next reference.
    Node(int data){//This is a constructor. When we create a new node, it puts the supplied value into data and initially sets next to null
        this.data =data;
        this.next =null;
    }//Why a separate class? Because we need a reusable design for every node. Instead of writing the same two variables repeatedly, we define the structure once and create as many nodes as we need.
}
    public class LL1{
        public static void main(String args[]){
            Node a= new Node(1);
            Node b =new Node(2);
            Node c =new Node(3);
            Node d =new Node(4);
            a.next =b;//However, manually creating variables for every node is inconvenient. That's why we write methods to insert nodes automatically
            b.next =c;
            c.next =d;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        }
    }
