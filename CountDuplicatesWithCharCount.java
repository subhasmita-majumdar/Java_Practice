import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesWithCharCount {
    public static void main(String args[]){
        HashMap count_dupl = countCharOccurrencesWithDuplicates("GeeksForgeeks");
        System.out.println("Duplicate Characters: " +count_dupl);
    }
    public static HashMap countCharOccurrencesWithDuplicates(String input_str)
    {
        String lower_input_str=input_str.toLowerCase();
        char chArr[] = lower_input_str.toCharArray();
        HashMap<Character,Integer>hm = new HashMap<>();
        HashMap<Character,Integer>dupl_count=new HashMap<>();
        for(char chKey:chArr)
        {
            if(hm.containsKey(chKey))
            {
                hm.put(chKey,hm.get(chKey)+1);
            }
            else {
                hm.put(chKey,1);
            }
        }
        System.out.println("Character Occurrences: "+hm);
        for(Map.Entry<Character,Integer> e:hm.entrySet())
        {
            if(e.getValue()>1)
            {
                dupl_count.put(e.getKey(),e.getValue());
            }
        }
        return dupl_count;
    }
}
