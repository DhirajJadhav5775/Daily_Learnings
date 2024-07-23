import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsFramework 
{
    public static void main(String args[])
    {
        //Sets
        //Hashset
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        System.out.println(set);

        //LinkedHashSet
        LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();
        lhset.add(100);
        lhset.add(200);
        System.out.println(lhset);

        //TreeSet
        TreeSet<Integer> tSet = new TreeSet<Integer>(); 

        //Map
        HashMap<Integer, Integer> hmap = new HashMap<Integer>();
        hmap.put(1,10);
        hmap.put(2,20);
        hmap.put(3,30);
    }    
}
