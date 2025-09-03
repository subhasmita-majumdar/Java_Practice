import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String args[]){
        String count_chars = stringCompression("AABBBCCCCaaaa");
        System.out.println("Compressed String: " +count_chars);
    }
    public static String stringCompression(String input_str)
    {
        String compressed_str = "";
        char chArr[]=input_str.toCharArray();
        HashMap<Character,Integer>hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
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
        for(Map.Entry<Character,Integer>e:hm.entrySet())
        {
            sb.append(e.getKey());
            sb.append(e.getValue());
        }
        compressed_str = sb.toString();
        return compressed_str;
    }
}
