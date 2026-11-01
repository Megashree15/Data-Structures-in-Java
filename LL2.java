class Node{//describes how a node should be
    int data;
    Node next;//here we use node as datatype because next refers to a complete node 
    Node(int data){//to reuse node code
        this.data  =data;//data entered will be taken by node
        this.next  =null;//pushes the next to null automatically
    }
}
public class LL2{
    Node head =null;//creates empty one first
    void IatB(int value){//insert node at beginning
        Node a  =new Node(value);//obj for class Node
        a.next =head;
        head =a;//Why this order? First connect the new node to the existing list, then update head. If you change head first, you can lose your reference to the old first node.
    }
    void IatE(int value){//insert node at end
        Node a =new Node(value);
        if(head ==null){//if empty
            head =a;
return;//if this condition istrue method stops executing till here , return is used to stop executing
        }
        Node temp =head;
        while(temp.next!=null){//reaching the lqst node
            temp =temp.next;//looping

        }
        temp.next =a;//insert at end
    }
    void IatPosition(int value,int position){
    if(position<1){
        System.out.println("invalid position");
        return;
    }
    if(position ==1){
        IatB(value);
        return;
    }
    Node temp =head;
    for(int i =1;i<position-1&&temp!=null;i++){//iterates till the before position
        temp =temp.next;
    }
    if(temp ==null){
        System.out.println("invalid position");
        return;
    }
    Node a =new Node(value);
    a.next =temp.next;
    temp.next =a;//This is the main idea of inserting in the middle: connect the new node to the next node first, then connect the previous node to the new node.

    }

    void DatBeg(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
       head =head.next;

    }

    void DatEnd(){
        if(head ==null){
            System.out.println("empty");
            return;
        }
        if(head.next== null){
            head= null;
        return;        }
Node temp =head;
while(temp.next.next!= null){
    temp= temp.next;
}
temp.next= null;
    }

    void DValue(int value){
        if(head== null){
            System.out.println("empty");
            return;
        }
        if(head.data== value){
            head= head.next;
            return;
        }
        Node temp =head;
        while(temp.next!= null&&temp.next.data!=value){
            temp= temp.next;
        }
        if(temp.next== null){
            System.out.println("not found");
            return;
        }
temp.next= temp.next.next;

    }
    int Search(int value){
        int position =1;
        Node temp =head;
        while(temp!=null ){
            if(temp.data ==value){
                return position;
            }
            temp= temp.next;
            position++ ;
        }
        return -1;
    }

    int count(){
        int count= 0;
        Node temp= head;
            while(temp!=null){
                temp =temp.next;
                count++;
            }
            return count;
    }
    void Display(){
        Node temp =head;
        while(temp !=null){
            System.out.println(temp.data+"->");
            temp =temp.next;
        }
        System.out.println("null");
        
    }
    public static void main(String args[]){
        LL2 Sll =new LL2();
        Sll.IatB(1);
        Sll.IatB(2);
        Sll.IatPosition(6,6);
        Sll.IatPosition(0,1);
Sll.Display();
Sll.DatBeg();
Sll.Display();
Sll.DatEnd();
Sll.Display();
Sll.DValue(7);
System.out.println(Sll.Search(100));
System.out.println(Sll.count());


    }
}