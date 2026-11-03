import java.util.*;
class Node{////creating stack using linked list using nodes
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next= null;
    }
}
public class StackLL{
    Node top= null;//creating empty stack top=head in stack
void push(int value){//inserting an element at top
Node a= new Node(value);
a.next= top;//inserting before top
top =a;//now a becomes top
System.out.println("inserted"+value);

}
void pop(){//deleting element ;from top
    if(top== null){
        System.out.println("Empty Stack");
        return;
    }
    System.out.println("deleted "+top.data);
    top =top.next;
}
void peek(){//display top element
    if(top== null){
        System.out.println("Empty Stack");
        return;
    }
    System.out.println("top element"+top.data);
}
int size(){//count elements
    Node temp= top;
    int count =0;
    while(temp!=null){
        count++;
        temp =temp.next;
    }
    return count;
}
void Display(){//displaying all elements
    if(top ==null){
        System.out.println("Empty Stcak");
        return;
    }
    Node temp =top;
    System.out.println("top->");
   while(temp!=null){
    System.out.println(""+temp.data);
    temp =temp.next;
    
   }
   System.out.println("NULL");
}
boolean isEmpty(){//to check stack is empty
    return top==null;
}
public static void main(String args[]){
StackLL S=new StackLL();
S.push(0);
S.push(1);
S.push(2);
S.push(3);
S.push(4);
S.push(5);
S.pop();
S.peek();
S.Display();
System.out.println(S.isEmpty());
System.out.println(S.size());


}
}
//push,pop,peek,count,display,isEmpty