import java.util.*;
public class List1{
    public static void main(String args[]){
List<Integer>list= new ArrayList<>();
list.add(1);//1 adds value at last
list.add(2);
list.add(100);
list.add(3,4);//2 adds a valu at specific index
list.add(5);
list.add(6);
list.add(0);
list.add(1);
System.out.println(list);
list.set(6,7);//3 updates a specific index valus
System.out.println(list);
list.remove(6);//4 deletes this index value
System.out.println(list);
list.remove(Integer.valueOf(6));//5   remmoves this value
System.out.println(list);
System.out.println(list.get(0));//6  access using index
System.out.println(list.size());//7    returns list size
list.sort(null);//14     sorts in ascending order
System.out.println(list.contains(99));//9    checks for presence
for(int n:list){//10        displays each element in list
    System.out.println(n);
}
System.out.println(list.indexOf(2));//11    gives index of elemet
System.out.println(list.lastIndexOf(1));//12   gives last index of the value
list.replaceAll(n->n*2);//13     replaces each element in list
System.out.println(list);
List<Integer>lists= new ArrayList<>(Arrays.asList(1,2,3,4,1,1,1,1));//2nd list   creating new list by directly declaring values
list.addAll(lists);//16 adds another list at the end of old one or list.addAll(Arrays.asList(1,2,3))
System.out.println(list);
list.retainAll(Arrays.asList(1));//17  retains only these values
System.out.println(list);
list.removeAll(Arrays.asList(1));//18  removes the matching values from the list
System.out.println(list);


list.clear();//15   clears the list completely
System.out.println(list);
System.out.println(list.isEmpty());//8   checks whether the list is empty








    }
}