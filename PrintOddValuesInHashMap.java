import java.util.*;
public class PrintOddValuesInHashMap {
        public static void main(String[] args) {
            HashMap<Integer,String>hm = new HashMap<>();
            hm.put(1,"one");
            hm.put(2,"two");
            hm.put(3,"three");
            hm.put(4,"four");
            hm.put(5,"five");
            for(Map.Entry<Integer,String>e:hm.entrySet())
            {
                if(e.getKey()%2!=0)
                {
                    System.out.println(e.getKey()+" : "+e.getValue());
                }
            }
        }
}
