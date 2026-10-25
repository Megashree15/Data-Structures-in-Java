import java.util.*;
public class List2{
    public static void main(String args[]){
        //creating list of different data types
        List<Integer> a= new ArrayList<>();//integer list
a.add(1);
a.add(1,2);
System.out.println(a);

List<Float> b= new ArrayList<>();//float list
b.add(3.00f);
b.add(4.000f);
System.out.println(b);

List<Double> c= new ArrayList<>();//double list
c.add(5.0000);
c.add(1,6.000);
System.out.println(c);

List<Boolean> d=new ArrayList<>();//boolean list
d.add(true);
d.add(false);
System.out.println(d);

List<Character> e=new ArrayList<>();//character list
e.add('@');
e.add('A');
e.add(2,'a');
System.out.println(e);

List<String> f=new ArrayList<>();//String list 
f.add("Abe");
f.add("mega");
System.out.println(f);

List<Object> g= new ArrayList<>();//list contains all data types
g.add(1);
g.add("Two");
g.add(3.00f);
g.add(4.0004);
g.add(true);
g.add('#');
g.add("Hi");
System.out.println(g);


    }
}