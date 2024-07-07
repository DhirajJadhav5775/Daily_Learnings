import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class list1
{
    public static void main(String[] args) throws Exception
    {   
        //lists
        ArrayList<String> list = new ArrayList<>();
        list.add("Dhiraj");
        list.add("Roshan");
        list.add("pankaj");
        System.out.println("ArrayList: " + list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(2,25);
        boolean bret = list2.contains(4);
        list2.remove(2);

        System.out.println("LinkedList: " + list2);
        System.out.println(bret);
        
        Vector<Integer> vector = new Vector<>();
        vector.add(11);
        vector.add(21);
        vector.add(31);

        System.out.println("Vector: " + vector);
        vector.clone();
        System.out.println("Vector: " + vector);
        vector.clear();
        System.out.println("vector: " + vector);

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(30);

        System.out.println("Stack: " + stack);

        stack.pop();
        System.out.println("Stack: " + stack);

        System.out.println(stack.peek());

        //sets
        //hashset
        HashSet<ArrayList> hSet = new HashSet<ArrayList>();
        hSet.add(list);
        System.out.println(hSet);

        //treeset
        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(20);
        tset.add(10);
        tset.add(25);
        tset.add(30);
        tset.add(4);

        System.out.println(tset);
    }
}