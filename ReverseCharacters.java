//Reverse characters in a string with the special characters in place

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReverseCharacters {
    public static void main(String[] args){
        String new_str = removeSpecialChars("a#D!e*F");
        System.out.println(new_str);
    }

    public static String removeSpecialChars(String input_str){
        String new_str = "";
        HashMap<Integer,Character>hm = new HashMap<>();
        ArrayList<Character>chars = new ArrayList<>();
        ArrayList<Character>rev_arr=new ArrayList<>();
        char ch_arr[]=input_str.toCharArray();
        for(int i=0;i<ch_arr.length;i++)
        {
            if(Character.isLetterOrDigit(ch_arr[i]))
            {
                chars.add(ch_arr[i]);
            }
            else
            {
                hm.put(i,ch_arr[i]);
            }
        }
        for(int i=chars.size()-1;i>=0;i--)
        {
            rev_arr.add(chars.get(i));
        }
        for(Map.Entry<Integer,Character> e:hm.entrySet())
        {
            int index = e.getKey();
            char val = e.getValue();
            rev_arr.add(index,val);
        }
       for(char ch:rev_arr)
       {
           new_str=new_str+ch;
       }
       return new_str;
    }
}
